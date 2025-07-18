package com.spring.shoppingmall.dto;

//상품 목록 응답
import com.spring.shoppingmall.vo.ProductInfoVo;

public class ProductListResponseDto {


    private Long productId;              // 상품 ID
    private String productBrand;         // 상품 브랜드
    private String productCategory;      // 상품 카테고리
    private String productName;          // 상품 이름
    private String productPrice;         // 상품 가격
    private String productImage;         // 상품 이미지
    private boolean isActive;            // 노출여부

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    // 기본 생성자
    public ProductListResponseDto() {}

    // VO로부터 변환하는 생성자
    public ProductListResponseDto(ProductInfoVo vo) {
        this.productId = vo.getPrdidx();
        this.productBrand = vo.getPrdbr();
        this.productCategory = vo.getPrdctgr();
        this.productName = vo.getPrdname();
        this.productPrice = vo.getPrdprc();
        this.productImage = vo.getPrdimg();
        this.isActive = "Y".equals(vo.getPrdview());
    }
}
