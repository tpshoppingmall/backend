package com.spring.shoppingmall.vo;

//기획전 정보
public class ProductGroupInfoVo {

    private Long prdgridx;        // 기회전 ID
    private String prdgrbr;       // 기회전 브랜드
    private String prdgrtm;       // 기회전 시간
    private String prdgrname;     // 기회전 이름
    private String prdgrimg;      // 기회전 이미지
    private String prdgrview;     // 기회전 노출여부
    private String prdgrprriod;   // 기회전 기간
    private String prdgrsale;     // 기회전 판매상태

    public Long getPrdgridx() {
        return prdgridx;
    }

    public void setPrdgridx(Long prdgridx) {
        this.prdgridx = prdgridx;
    }

    public String getPrdgrbr() {
        return prdgrbr;
    }

    public void setPrdgrbr(String prdgrbr) {
        this.prdgrbr = prdgrbr;
    }

    public String getPrdgrtm() {
        return prdgrtm;
    }

    public void setPrdgrtm(String prdgrtm) {
        this.prdgrtm = prdgrtm;
    }

    public String getPrdgrname() {
        return prdgrname;
    }

    public void setPrdgrname(String prdgrname) {
        this.prdgrname = prdgrname;
    }

    public String getPrdgrimg() {
        return prdgrimg;
    }

    public void setPrdgrimg(String prdgrimg) {
        this.prdgrimg = prdgrimg;
    }

    public String getPrdgrview() {
        return prdgrview;
    }

    public void setPrdgrview(String prdgrview) {
        this.prdgrview = prdgrview;
    }

    public String getPrdgrprriod() {
        return prdgrprriod;
    }

    public void setPrdgrprriod(String prdgrprriod) {
        this.prdgrprriod = prdgrprriod;
    }

    public String getPrdgrsale() {
        return prdgrsale;
    }

    public void setPrdgrsale(String prdgrsale) {
        this.prdgrsale = prdgrsale;
    }

    // 기본 생성자
    public ProductGroupInfoVo() {}

    // 전체 필드 생성자
    public ProductGroupInfoVo(Long prdgridx, String prdgrbr, String prdgrtm, String prdgrname,
                              String prdgrimg, String prdgrview, String prdgrprriod, String prdgrsale) {
        this.prdgridx = prdgridx;
        this.prdgrbr = prdgrbr;
        this.prdgrtm = prdgrtm;
        this.prdgrname = prdgrname;
        this.prdgrimg = prdgrimg;
        this.prdgrview = prdgrview;
        this.prdgrprriod = prdgrprriod;
        this.prdgrsale = prdgrsale;
    }

}
