package com.example.shffarms.Domain;

public class Category_Activity_Domain {
    private int productImage1;
    private String productName1;
    private String shortDesc1;
    private String price1;
    private int addBtn1;
    private int productImage2;
    private String productName2;
    private String shortDesc2;
    private String price2;
    private int addBtn2;

    public Category_Activity_Domain(int productImage1, String productName1, String shortDesc1, String price1, int addBtn1,int productImage2, String productName2, String shortDesc2, String price2, int addBtn2) {
        this.productImage1 = productImage1;
        this.productName1 = productName1;
        this.shortDesc1 = shortDesc1;
        this.price1 = price1;
        this.addBtn1 = addBtn1;
        this.productImage2 = productImage2;
        this.productName2 = productName2;
        this.shortDesc2 = shortDesc2;
        this.price2 = price2;
        this.addBtn2 = addBtn2;
    }

    public int getProductImage1() {
        return productImage1;
    }

    public String getProductName1() {
        return productName1;
    }

    public String getShortDesc1() {
        return shortDesc1;
    }

    public String getPrice1() {
        return price1;
    }

    public int getAddBtn1() {
        return addBtn1;
    }

    public int getProductImage2() {
        return productImage2;
    }

    public String getProductName2() {
        return productName2;
    }

    public String getShortDesc2() {
        return shortDesc2;
    }

    public String getPrice2() {
        return price2;
    }

    public int getAddBtn2() {
        return addBtn2;
    }
}
