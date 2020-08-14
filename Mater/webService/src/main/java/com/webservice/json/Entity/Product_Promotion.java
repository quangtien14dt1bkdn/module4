package com.webservice.json.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Product_Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;

    private Integer discount_id;
    private String image;
    private String content;
    private Date saleDate;
    private Date endOfEvent;
    private Integer salePercent;
    private Double price;
    private Integer amount;
    private Boolean flag = true;



    @Override
    public String toString() {
        return "Product_Promotion{" +
                "product_id=" + product_id +
                ", image='" + image + '\'' +
                ", content='" + content + '\'' +
                ", saleDate=" + saleDate +
                ", endOfEvent=" + endOfEvent +
                ", salePercent=" + salePercent +
                ", price=" + price +
                '}';
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Date getEndOfEvent() {
        return endOfEvent;
    }

    public void setEndOfEvent(Date endOfEvent) {
        this.endOfEvent = endOfEvent;
    }

    public Integer getSalePercent() {
        return salePercent;
    }

    public void setSalePercent(Integer salePercent) {
        this.salePercent = salePercent;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Integer getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(Integer discount_id) {
        this.discount_id = discount_id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
