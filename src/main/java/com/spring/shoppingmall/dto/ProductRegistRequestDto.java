package com.spring.shoppingmall.dto;

//상품 등록 요청
public class ProductRegistRequestDto {

    private String productBrand;         // 상품 브랜드
    private String productCategory;      // 상품 카테고리
    private String productName;          // 상품 이름
    private String productPrice;         // 상품 가격
    private String productImage;         // 상품 이미지

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

    // 기본 생성자
    public ProductRegistRequestDto() {}

    // 전체 필드 생성자
    public ProductRegistRequestDto(String productBrand, String productCategory, String productName,
                                   String productPrice, String productImage) {
        this.productBrand = productBrand;
        this.productCategory = productCategory;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }

}
