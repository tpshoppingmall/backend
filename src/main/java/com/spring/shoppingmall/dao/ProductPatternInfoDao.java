package com.spring.shoppingmall.dao;

import com.spring.shoppingmall.vo.ProductPatternInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductPatternInfoDao {

    // 패턴 등록
    int insertProductPatternInfo(ProductPatternInfoVo productPatternInfo);

    // 패턴 수정
    int updateProductPatternInfo(ProductPatternInfoVo productPatternInfo);

    // 패턴 삭제
    int deleteProductPatternInfo(@Param("prdptidx") Long prdptidx);

    // 패턴 단건 조회
    ProductPatternInfoVo selectProductPatternInfo(@Param("prdptidx") Long prdptidx);

    // 기획전별 패턴 목록 조회
    List<ProductPatternInfoVo> selectProductPatternInfoListByGroupId(@Param("prdgridx") Long prdgridx);

    // 기획전별 노출중인 패턴 목록 조회
    List<ProductPatternInfoVo> selectActiveProductPatternInfoListByGroupId(@Param("prdgridx") Long prdgridx);

    // 패턴 총 개수 조회 (기획전별)
    int selectProductPatternInfoCountByGroupId(@Param("prdgridx") Long prdgridx);

    // 다음 시퀀스 값 조회
    Long selectNextSequence();
}
