package com.spring.shoppingmall.vo;

//패턴 정보
public class ProductPatternInfoVo {

    private Long prdptidx;        // 패턴 ID
    private Long prdgridx;        // 기회전 ID
    private String prdpttype;     // 패턴 타입
    private String prdptsort;     // 패턴 정렬
    private String prdptview;     // 패턴 노출여부

    public Long getPrdptidx() {
        return prdptidx;
    }

    public void setPrdptidx(Long prdptidx) {
        this.prdptidx = prdptidx;
    }

    public Long getPrdgridx() {
        return prdgridx;
    }

    public void setPrdgridx(Long prdgridx) {
        this.prdgridx = prdgridx;
    }

    public String getPrdpttype() {
        return prdpttype;
    }

    public void setPrdpttype(String prdpttype) {
        this.prdpttype = prdpttype;
    }

    public String getPrdptsort() {
        return prdptsort;
    }

    public void setPrdptsort(String prdptsort) {
        this.prdptsort = prdptsort;
    }

    public String getPrdptview() {
        return prdptview;
    }

    public void setPrdptview(String prdptview) {
        this.prdptview = prdptview;
    }

    // 기본 생성자
    public ProductPatternInfoVo() {}

    // 전체 필드 생성자
    public ProductPatternInfoVo(Long prdptidx, Long prdgridx, String prdpttype, String prdptsort, String prdptview) {
        this.prdptidx = prdptidx;
        this.prdgridx = prdgridx;
        this.prdpttype = prdpttype;
        this.prdptsort = prdptsort;
        this.prdptview = prdptview;
    }


    /*@Override
    public String toString() {
        return "ProductPatternInfoVO{" +
                "prdptidx=" + prdptidx +
                ", prdgridx=" + prdgridx +
                ", prdpttype='" + prdpttype + '\'' +
                ", prdptsort='" + prdptsort + '\'' +
                ", prdptview='" + prdptview + '\'' +
                '}';
    }*/

}
