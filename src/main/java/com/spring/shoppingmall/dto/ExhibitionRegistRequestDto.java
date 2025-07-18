package com.spring.shoppingmall.dto;

//기획전 등록 요청
public class ExhibitionRegistRequestDto {

    private String exhibitionBrand;      // 기회전 브랜드
    private String exhibitionTime;       // 기회전 시간
    private String exhibitionName;       // 기회전 이름
    private String exhibitionImage;      // 기회전 이미지
    private String exhibitionPeriod;     // 기회전 기간
    private String saleStatus;           // 판매상태

    public String getExhibitionBrand() {
        return exhibitionBrand;
    }

    public void setExhibitionBrand(String exhibitionBrand) {
        this.exhibitionBrand = exhibitionBrand;
    }

    public String getExhibitionTime() {
        return exhibitionTime;
    }

    public void setExhibitionTime(String exhibitionTime) {
        this.exhibitionTime = exhibitionTime;
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

    // 기본 생성자
    public ExhibitionRegistRequestDto() {}

    // 전체 필드 생성자
    public ExhibitionRegistRequestDto(String exhibitionBrand, String exhibitionTime, String exhibitionName,
                                      String exhibitionImage, String exhibitionPeriod, String saleStatus) {
        this.exhibitionBrand = exhibitionBrand;
        this.exhibitionTime = exhibitionTime;
        this.exhibitionName = exhibitionName;
        this.exhibitionImage = exhibitionImage;
        this.exhibitionPeriod = exhibitionPeriod;
        this.saleStatus = saleStatus;
    }

}
