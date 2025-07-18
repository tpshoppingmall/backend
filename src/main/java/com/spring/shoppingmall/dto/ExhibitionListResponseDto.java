package com.spring.shoppingmall.dto;

//기획전 목록 응답
import com.spring.shoppingmall.vo.ProductGroupInfoVo;

public class ExhibitionListResponseDto {

    private Long exhibitionId;           // 기회전 ID
    private String exhibitionBrand;      // 기회전 브랜드
    private String exhibitionName;       // 기회전 이름
    private String exhibitionImage;      // 기회전 이미지
    private String exhibitionPeriod;     // 기회전 기간
    private String saleStatus;           // 판매상태
    private boolean isActive;            // 노출여부 (Y/N → true/false)

    public Long getExhibitionId() {
        return exhibitionId;
    }

    public void setExhibitionId(Long exhibitionId) {
        this.exhibitionId = exhibitionId;
    }

    public String getExhibitionBrand() {
        return exhibitionBrand;
    }

    public void setExhibitionBrand(String exhibitionBrand) {
        this.exhibitionBrand = exhibitionBrand;
    }

    public String getExhibitionName() {
        return exhibitionName;
    }

    public void setExhibitionName(String exhibitionName) {
        this.exhibitionName = exhibitionName;
    }

    public String getExhibitionImage() {
        return exhibitionImage;
    }

    public void setExhibitionImage(String exhibitionImage) {
        this.exhibitionImage = exhibitionImage;
    }

    public String getExhibitionPeriod() {
        return exhibitionPeriod;
    }

    public void setExhibitionPeriod(String exhibitionPeriod) {
        this.exhibitionPeriod = exhibitionPeriod;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    // 기본 생성자
    public ExhibitionListResponseDto() {}

    // VO로부터 변환하는 생성자
    public ExhibitionListResponseDto(ProductGroupInfoVo vo) {
        this.exhibitionId = vo.getPrdgridx();
        this.exhibitionBrand = vo.getPrdgrbr();
        this.exhibitionName = vo.getPrdgrname();
        this.exhibitionImage = vo.getPrdgrimg();
        this.exhibitionPeriod = vo.getPrdgrprriod();
        this.saleStatus = vo.getPrdgrsale();
        this.isActive = "Y".equals(vo.getPrdgrview());
    }

}
