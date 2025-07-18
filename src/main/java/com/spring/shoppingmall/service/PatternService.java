package com.spring.shoppingmall.service;


import com.spring.shoppingmall.dao.ProductPatternInfoDao;
import com.spring.shoppingmall.dto.PatternRegistRequestDto;
import com.spring.shoppingmall.vo.ProductPatternInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PatternService { //패턴 서비스

    @Autowired
    private ProductPatternInfoDao productPatternInfoDao;

    //패턴 등록
    public boolean registPattern(PatternRegistRequestDto requestDTO) {
        try {
            // DTO → VO 변환
            ProductPatternInfoVo vo = new ProductPatternInfoVo();

            // 시퀀스 값 조회 및 설정
            Long nextSeq = productPatternInfoDao.selectNextSequence();
            vo.setPrdptidx(nextSeq);

            vo.setPrdgridx(requestDTO.getExhibitionId());
            vo.setPrdpttype(requestDTO.getPatternType());
            vo.setPrdptsort(requestDTO.getPatternSort());
            vo.setPrdptview("Y"); // 기본값: 노출

            int result = productPatternInfoDao.insertProductPatternInfo(vo);
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //기획전별 패턴 목록 조회
    public List<ProductPatternInfoVo> getPatternListByExhibition(Long exhibitionId) {
        try {
            return productPatternInfoDao.selectProductPatternInfoListByGroupId(exhibitionId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //기회전별 노출중인 패턴 목록 조회
    public List<ProductPatternInfoVo> getActivePatternListByExhibition(Long exhibitionId) {
        try {
            return productPatternInfoDao.selectActiveProductPatternInfoListByGroupId(exhibitionId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //패턴 상세 조회
    public ProductPatternInfoVo getPatternDetail(Long patternId) {
        try {
            return productPatternInfoDao.selectProductPatternInfo(patternId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    //패턴 수정
    public boolean updatePattern(Long patternId, PatternRegistRequestDto requestDTO) {
        try {
            ProductPatternInfoVo vo = new ProductPatternInfoVo();
            vo.setPrdptidx(patternId);
            vo.setPrdgridx(requestDTO.getExhibitionId());
            vo.setPrdpttype(requestDTO.getPatternType());
            vo.setPrdptsort(requestDTO.getPatternSort());

            int result = productPatternInfoDao.updateProductPatternInfo(vo);
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //패턴 삭제
    public boolean deletePattern(Long patternId) {
        try {
            int result = productPatternInfoDao.deleteProductPatternInfo(patternId);
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //기획전별 패턴 개수 조회
    public int getPatternCountByExhibition(Long exhibitionId) {
        try {
            return productPatternInfoDao.selectProductPatternInfoCountByGroupId(exhibitionId);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }


}
