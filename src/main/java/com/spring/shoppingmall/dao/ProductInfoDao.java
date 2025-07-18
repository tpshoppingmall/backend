package com.spring.shoppingmall.dao;

import com.spring.shoppingmall.vo.ProductInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductInfoDao {

    // 상품 등록
    int insertProductInfo(ProductInfoVo productInfo);

    // 상품 수정
    int updateProductInfo(ProductInfoVo productInfo);

    // 상품 삭제
    int deleteProductInfo(@Param("prdidx") Long prdidx);

    // 상품 단건 조회
    ProductInfoVo selectProductInfo(@Param("prdidx") Long prdidx);

    // 상품 목록 조회 (전체)
    List<ProductInfoVo> selectProductInfoList();

    // 상품 목록 조회 (노출 중인 것만)
    List<ProductInfoVo> selectActiveProductInfoList();

    // 카테고리별 상품 목록 조회
    List<ProductInfoVo> selectProductInfoListByCategory(@Param("prdctgr") String prdctgr);

    // 브랜드별 상품 목록 조회
    List<ProductInfoVo> selectProductInfoListByBrand(@Param("prdbr") String prdbr);

    // 상품명으로 검색
    List<ProductInfoVo> selectProductInfoListByName(@Param("prdname") String prdname);

    // 상품 총 개수 조회
    int selectProductInfoCount();

    // 카테고리별 상품 개수 조회
    int selectProductInfoCountByCategory(@Param("prdctgr") String prdctgr);

}
