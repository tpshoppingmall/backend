package com.spring.shoppingmall.dao;


import com.spring.shoppingmall.vo.ProductPatternDetailVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductPatternDetailDao {

    // 패턴 상세 등록
    int insertProductPatternDetail(ProductPatternDetailVo productPatternDetail);

    // 패턴 상세 수정
    int updateProductPatternDetail(ProductPatternDetailVo productPatternDetail);

    // 패턴 상세 삭제
    int deleteProductPatternDetail(@Param("ptdetailidx") Long ptdetailidx);

    // 패턴 상세 단건 조회
    ProductPatternDetailVo selectProductPatternDetail(@Param("ptdetailidx") Long ptdetailidx);

    // 패턴별 상세 목록 조회
    List<ProductPatternDetailVo> selectProductPatternDetailListByPatternId(@Param("prdptidx") Long prdptidx);

    // 기회전별 패턴 상세 목록 조회
    List<ProductPatternDetailVo> selectProductPatternDetailListByGroupId(@Param("prdgridx") Long prdgridx);

    // 패턴별 노출중인 상세 목록 조회
    List<ProductPatternDetailVo> selectActiveProductPatternDetailListByPatternId(@Param("prdptidx") Long prdptidx);

    // 패턴 상세 총 개수 조회 (패턴별)
    int selectProductPatternDetailCountByPatternId(@Param("prdptidx") Long prdptidx);

    // 다음 시퀀스 값 조회
    Long selectNextSequence();
}

