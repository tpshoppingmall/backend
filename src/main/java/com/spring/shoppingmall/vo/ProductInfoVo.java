package com.spring.shoppingmall.vo;

//상품정보
public class ProductInfoVo {

    private Long prdidx;          // 상품 ID
    private String prdbr;         // 상품 브랜드
    private String prdctgr;       // 상품 카테고리
    private String prdname;       // 상품 이름
    private String prdprc;        // 상품 가격
    private String prdview;       // 상품 노출여부
    private String prdimg;        // 상품 이미지

    public Long getPrdidx() {
        return prdidx;
    }

    public void setPrdidx(Long prdidx) {
        this.prdidx = prdidx;
    }

    public String getPrdbr() {
        return prdbr;
    }

    public void setPrdbr(String prdbr) {
        this.prdbr = prdbr;
    }

    public String getPrdctgr() {
        return prdctgr;
    }

    public void setPrdctgr(String prdctgr) {
        this.prdctgr = prdctgr;
    }

    public String getPrdname() {
        return prdname;
    }

    public void setPrdname(String prdname) {
        this.prdname = prdname;
    }

    public String getPrdprc() {
        return prdprc;
    }

    public void setPrdprc(String prdprc) {
        this.prdprc = prdprc;
    }

    public String getPrdview() {
        return prdview;
    }

    public void setPrdview(String prdview) {
        this.prdview = prdview;
    }

    public String getPrdimg() {
        return prdimg;
    }

    public void setPrdimg(String prdimg) {
        this.prdimg = prdimg;
    }

    // 기본 생성자
    public ProductInfoVo() {}

    // 전체 필드 생성자
    public ProductInfoVo(Long prdidx, String prdbr, String prdctgr, String prdname,
                         String prdprc, String prdview, String prdimg) {
        this.prdidx = prdidx;
        this.prdbr = prdbr;
        this.prdctgr = prdctgr;
        this.prdname = prdname;
        this.prdprc = prdprc;
        this.prdview = prdview;
        this.prdimg = prdimg;
    }


}
