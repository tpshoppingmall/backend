package com.spring.shoppingmall.service;

import com.spring.shoppingmall.dao.ProductPatternDetailDao;
import com.spring.shoppingmall.dto.PatternDetailRegistRequestDto;
import com.spring.shoppingmall.vo.ProductPatternDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PatternDetailService { //패턴 상세 서비스

    @Autowired
    private ProductPatternDetailDao productPatternDetailDao;


    //패턴 상세 등록
    public boolean registPatternDetail(PatternDetailRegistRequestDto requestDTO) {
        try {
            // DTO → VO 변환
            ProductPatternDetailVo vo = new ProductPatternDetailVo();

            // 시퀀스 값 조회 및 설정
            Long nextSeq = productPatternDetailDao.selectNextSequence();
            vo.setPtdetailidx(nextSeq);

            vo.setPrdgridx(requestDTO.getExhibitionId());
            vo.setPrdptidx(requestDTO.getPatternId());
            vo.setPtdetailtype(requestDTO.getDetailType());
            vo.setPtdetailimg(requestDTO.getDetailImage());
            vo.setPtdetaildesc(requestDTO.getDetailDescription());
            vo.setPtdetailmv(requestDTO.getDetailMovie());
            vo.setPrdidx(requestDTO.getProductId());
            vo.setPtdetailview("Y"); // 기본값: 노출

            int result = productPatternDetailDao.insertProductPatternDetail(vo);
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    //패턴별 상세 목록 조회
    public List<ProductPatternDetailVo> getPatternDetailListByPattern(Long patternId) {
        try {
            return productPatternDetailDao.selectProductPatternDetailListByPatternId(patternId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    //기회전별 패턴 상세 목록 조회
    public List<ProductPatternDetailVo> getPatternDetailListByExhibition(Long exhibitionId) {
        try {
            return productPatternDetailDao.selectProductPatternDetailListByGroupId(exhibitionId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    //패턴 상세 삭제
    public boolean deletePatternDetail(Long patternDetailId) {
        try {
            int result = productPatternDetailDao.deleteProductPatternDetail(patternDetailId);
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    //패턴별 상세 개수 조회
    public int getPatternDetailCountByPattern(Long patternId) {
        try {
            return productPatternDetailDao.selectProductPatternDetailCountByPatternId(patternId);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
