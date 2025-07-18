package com.spring.shoppingmall.dao;

import com.spring.shoppingmall.vo.ProductGroupInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductGroupInfoDao {

    // 기획전 등록
    int insertProductGroupInfo(ProductGroupInfoVo productGroupInfo);

    // 기획전 수정
    int updateProductGroupInfo(ProductGroupInfoVo productGroupInfo);

    // 기획전 삭제
    int deleteProductGroupInfo(@Param("prdgridx") Long prdgridx);

    // 기획전 단건 조회
    ProductGroupInfoVo selectProductGroupInfo(@Param("prdgridx") Long prdgridx);

    // 기획전 목록 조회 (전체)
    List<ProductGroupInfoVo> selectProductGroupInfoList();

    // 기획전 목록 조회 (노출 중인 것만)
    List<ProductGroupInfoVo> selectActiveProductGroupInfoList();

    // 기획전 총 개수 조회
    int selectProductGroupInfoCount();

    // 다음 시퀀스 값 조회
    Long selectNextSequence();

}
