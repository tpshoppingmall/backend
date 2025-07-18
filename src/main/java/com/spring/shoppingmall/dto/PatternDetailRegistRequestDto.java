package com.spring.shoppingmall.dto;

//패턴 상세 등록 요청
public class PatternDetailRegistRequestDto {

    private Long exhibitionId;           // 기회전 ID
    private Long patternId;              // 패턴 ID
    private String detailType;           // 패턴상세 타입
    private String detailImage;          // 패턴상세 이미지
    private String detailDescription;    // 패턴상세 설명
    private String detailMovie;          // 패턴상세 동영상
    private String productId;            // 상품 ID


    public Long getExhibitionId() {
        return exhibitionId;
    }

    public void setExhibitionId(Long exhibitionId) {
        this.exhibitionId = exhibitionId;
    }

    public Long getPatternId() {
        return patternId;
    }

    public void setPatternId(Long patternId) {
        this.patternId = patternId;
    }

    public String getDetailType() {
        return detailType;
    }

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    public String getDetailImage() {
        return detailImage;
    }

    public void setDetailImage(String detailImage) {
        this.detailImage = detailImage;
    }

    public String getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    public String getDetailMovie() {
        return detailMovie;
    }

    public void setDetailMovie(String detailMovie) {
        this.detailMovie = detailMovie;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    // 기본 생성자
    public PatternDetailRegistRequestDto() {}

    // 전체 필드 생성자
    public PatternDetailRegistRequestDto(Long exhibitionId, Long patternId, String detailType,
                                         String detailImage, String detailDescription,
                                         String detailMovie, String productId) {
        this.exhibitionId = exhibitionId;
        this.patternId = patternId;
        this.detailType = detailType;
        this.detailImage = detailImage;
        this.detailDescription = detailDescription;
        this.detailMovie = detailMovie;
        this.productId = productId;
    }

}
