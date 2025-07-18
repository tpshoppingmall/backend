package com.spring.shoppingmall.vo;

//패턴 상세정보
public class ProductPatternDetailVo {

    private Long ptdetailidx;     // 패턴상세 ID
    private Long prdgridx;        // 기회전 ID
    private Long prdptidx;        // 패턴 ID
    private String ptdetailtype;  // 패턴상세 타입
    private String ptdetailimg;   // 패턴상세 이미지
    private String ptdetaildesc;  // 패턴상세 설명
    private String ptdetailmv;    // 패턴상세 동영상
    private String prdidx;        // 상품 ID
    private String ptdetailview;  // 패턴상세 노출여부

    public Long getPtdetailidx() {
        return ptdetailidx;
    }

    public void setPtdetailidx(Long ptdetailidx) {
        this.ptdetailidx = ptdetailidx;
    }

    public Long getPrdgridx() {
        return prdgridx;
    }

    public void setPrdgridx(Long prdgridx) {
        this.prdgridx = prdgridx;
    }

    public Long getPrdptidx() {
        return prdptidx;
    }

    public void setPrdptidx(Long prdptidx) {
        this.prdptidx = prdptidx;
    }

    public String getPtdetailtype() {
        return ptdetailtype;
    }

    public void setPtdetailtype(String ptdetailtype) {
        this.ptdetailtype = ptdetailtype;
    }

    public String getPtdetailimg() {
        return ptdetailimg;
    }

    public void setPtdetailimg(String ptdetailimg) {
        this.ptdetailimg = ptdetailimg;
    }

    public String getPtdetaildesc() {
        return ptdetaildesc;
    }

    public void setPtdetaildesc(String ptdetaildesc) {
        this.ptdetaildesc = ptdetaildesc;
    }

    public String getPtdetailmv() {
        return ptdetailmv;
    }

    public void setPtdetailmv(String ptdetailmv) {
        this.ptdetailmv = ptdetailmv;
    }

    public String getPrdidx() {
        return prdidx;
    }

    public void setPrdidx(String prdidx) {
        this.prdidx = prdidx;
    }

    public String getPtdetailview() {
        return ptdetailview;
    }

    public void setPtdetailview(String ptdetailview) {
        this.ptdetailview = ptdetailview;
    }

    // 기본 생성자
    public ProductPatternDetailVo() {}

    // 전체 필드 생성자
    public ProductPatternDetailVo(Long ptdetailidx, Long prdgridx, Long prdptidx, String ptdetailtype,
                                  String ptdetailimg, String ptdetaildesc, String ptdetailmv,
                                  String prdidx, String ptdetailview) {
        this.ptdetailidx = ptdetailidx;
        this.prdgridx = prdgridx;
        this.prdptidx = prdptidx;
        this.ptdetailtype = ptdetailtype;
        this.ptdetailimg = ptdetailimg;
        this.ptdetaildesc = ptdetaildesc;
        this.ptdetailmv = ptdetailmv;
        this.prdidx = prdidx;
        this.ptdetailview = ptdetailview;
    }

}
