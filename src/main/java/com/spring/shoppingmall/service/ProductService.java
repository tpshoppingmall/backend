package com.spring.shoppingmall.service;

import com.spring.shoppingmall.dao.ProductInfoDao;
import com.spring.shoppingmall.dto.ProductListResponseDto;
import com.spring.shoppingmall.dto.ProductRegistRequestDto;
import com.spring.shoppingmall.vo.ProductInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductService { //상품서비스

    @Autowired
    private ProductInfoDao productInfoDAO;

    //상품 등록
    public boolean registProduct(ProductRegistRequestDto requestDTO) {
        try {
            // DTO → VO 변환
            ProductInfoVo vo = new ProductInfoVo();

            vo.setPrdbr(requestDTO.getProductBrand());
            vo.setPrdctgr(requestDTO.getProductCategory());
            vo.setPrdname(requestDTO.getProductName());
            vo.setPrdprc(requestDTO.getProductPrice());
            vo.setPrdimg(requestDTO.getProductImage());
            vo.setPrdview("Y"); // 기본값: 노출

            int result = productInfoDAO.insertProductInfo(vo);
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //상품 목록 조회
    public List<ProductListResponseDto> getProductList() {
        try {
            List<ProductInfoVo> voList = productInfoDAO.selectProductInfoList();

            // VO → DTO 변환
            return voList.stream()
                    .map(ProductListResponseDto::new)
                    .collect(Collectors.toList());

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //노출중인 상품 목록 조회
    public List<ProductListResponseDto> getActiveProductList() {
        try {
            List<ProductInfoVo> voList = productInfoDAO.selectActiveProductInfoList();

            return voList.stream()
                    .map(ProductListResponseDto::new)
                    .collect(Collectors.toList());

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //카테고리별 상품 목록 조회
    public List<ProductListResponseDto> getProductListByCategory(String category) {
        try {
            List<ProductInfoVo> voList = productInfoDAO.selectProductInfoListByCategory(category);

            return voList.stream()
                    .map(ProductListResponseDto::new)
                    .collect(Collectors.toList());

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    //상품 상세 조회
    public ProductListResponseDto getProductDetail(Long productId) {
        try {
            ProductInfoVo vo = productInfoDAO.selectProductInfo(productId);

            if (vo != null) {
                return new ProductListResponseDto(vo);
            }
            return null;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //상품 삭제
    public boolean deleteProduct(Long productId) {
        try {
            int result = productInfoDAO.deleteProductInfo(productId);
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //상품 총 개수 조회
    public int getProductCount() {
        try {
            return productInfoDAO.selectProductInfoCount();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
