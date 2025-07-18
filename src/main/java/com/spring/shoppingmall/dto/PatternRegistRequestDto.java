package com.spring.shoppingmall.dto;


//패턴 등록 요청
public class PatternRegistRequestDto {

    private Long exhibitionId;           // 기회전 ID
    private String patternType;          // 패턴 타입
    private String patternSort;          // 패턴 정렬


    public Long getExhibitionId() {
        return exhibitionId;
    }

    public void setExhibitionId(Long exhibitionId) {
        this.exhibitionId = exhibitionId;
    }

    public String getPatternType() {
        return patternType;
    }

    public void setPatternType(String patternType) {
        this.patternType = patternType;
    }

    public String getPatternSort() {
        return patternSort;
    }

    public void setPatternSort(String patternSort) {
        this.patternSort = patternSort;
    }

    // 기본 생성자
    public PatternRegistRequestDto() {}

    // 전체 필드 생성자
    public PatternRegistRequestDto(Long exhibitionId, String patternType, String patternSort) {
        this.exhibitionId = exhibitionId;
        this.patternType = patternType;
        this.patternSort = patternSort;
    }

}
