package com.spring.shoppingmall.service;

import com.spring.shoppingmall.dao.ProductGroupInfoDao;
import com.spring.shoppingmall.dto.ExhibitionListResponseDto;
import com.spring.shoppingmall.dto.ExhibitionRegistRequestDto;
import com.spring.shoppingmall.vo.ProductGroupInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ExhibitionService { //기획전 서비스

    @Autowired
    private ProductGroupInfoDao productGroupInfoDao;

    //기획전 등록
    public boolean registExhibition(ExhibitionRegistRequestDto requestDto) {

        try {
            //dto -> vo 변환
            ProductGroupInfoVo vo = new ProductGroupInfoVo();

            // 시퀀스 값 조회 및 설정
            Long nextSeq = productGroupInfoDao.selectNextSequence();
            vo.setPrdgridx(nextSeq);

            vo.setPrdgrbr(requestDto.getExhibitionBrand());
            vo.setPrdgrtm(requestDto.getExhibitionTime());
            vo.setPrdgrname(requestDto.getExhibitionName());
            vo.setPrdgrimg(requestDto.getExhibitionImage());
            vo.setPrdgrprriod(requestDto.getExhibitionPeriod());
            vo.setPrdgrsale(requestDto.getSaleStatus());
            vo.setPrdgrview("Y"); // 기본값: 노출

            int result = productGroupInfoDao.insertProductGroupInfo(vo);
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //기획전 목록 조회
    public List<ExhibitionListResponseDto> getExhibitionList() {
        try {
            List<ProductGroupInfoVo> voList = productGroupInfoDao.selectProductGroupInfoList();

            // VO → DTO 변환
            return voList.stream()
                    .map(ExhibitionListResponseDto::new)
                    .collect(Collectors.toList());

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //노출중인 기획전 목록 조회
    public List<ExhibitionListResponseDto> getActiveExhibitionList() {
        try {
            List<ProductGroupInfoVo> voList = productGroupInfoDao.selectActiveProductGroupInfoList();

            return voList.stream()
                    .map(ExhibitionListResponseDto::new)
                    .collect(Collectors.toList());

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //기획전 상세 조회
    public ExhibitionListResponseDto getExhibitionDetail(Long exhibitionId) {
        try {
            ProductGroupInfoVo vo = productGroupInfoDao.selectProductGroupInfo(exhibitionId);

            if (vo != null) {
                return new ExhibitionListResponseDto(vo);
            }
            return null;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //기획전 수정
    public boolean updateExhibition(Long exhibitionId, ExhibitionRegistRequestDto requestDTO) {
        try {
            ProductGroupInfoVo vo = new ProductGroupInfoVo();
            vo.setPrdgridx(exhibitionId);
            vo.setPrdgrbr(requestDTO.getExhibitionBrand());
            vo.setPrdgrtm(requestDTO.getExhibitionTime());
            vo.setPrdgrname(requestDTO.getExhibitionName());
            vo.setPrdgrimg(requestDTO.getExhibitionImage());
            vo.setPrdgrprriod(requestDTO.getExhibitionPeriod());
            vo.setPrdgrsale(requestDTO.getSaleStatus());

            int result = productGroupInfoDao.updateProductGroupInfo(vo);
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //기획전 삭제
    public boolean deleteExhibition(Long exhibitionId) {
        try {
            int result = productGroupInfoDao.deleteProductGroupInfo(exhibitionId);
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //기획전 총 개수 조회
    public int getExhibitionCount() {
        try {
            return productGroupInfoDao.selectProductGroupInfoCount();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
