package com.shubhamwithcode.mymall.Models;

import java.util.Date;

public class MyOrderItemModel {
    private String productId;
    private String productTitle;
    private String productImage;
    private String orderStatus;

    private String address;
    private String coupenId;
    private String cuttedPrice;
    private Date orderdDate;
    private Date packedDate;
    private Date shippedDate;
    private Date deliveredDate;
    private Date cancelledDate;
    private String discountedPrice;
    private Long freeCoupens;
    private String fullName;
    private String orderID;
    private String paymentMethod;
    private String pincode;
    private String productPrice;
    private Long productQuantity;
    private String userId;
    private String deliveryPrice;
    private boolean cancellationRequested;

    private int rating = 0;

    public MyOrderItemModel(String productId, String orderStatus, String address, String coupenId, String cuttedPrice, Date orderdDate, Date packedDate, Date shippedDate, Date deliveredDate, Date cancelledDate, String discountedPrice, Long freeCoupens, String fullName, String orderID, String paymentMethod, String pincode, String productPrice, Long productQuantity, String userId,String productImage,String productTitle,String deliveryPrice,boolean cancellationRequested) {
        this.productImage = productImage;
        this.productTitle = productTitle;
        this.productId = productId;
        this.orderStatus = orderStatus;
        this.address = address;
        this.coupenId = coupenId;
        this.cuttedPrice = cuttedPrice;
        this.orderdDate = orderdDate;
        this.packedDate = packedDate;
        this.shippedDate = shippedDate;
        this.deliveredDate = deliveredDate;
        this.cancelledDate = cancelledDate;
        this.discountedPrice = discountedPrice;
        this.freeCoupens = freeCoupens;
        this.fullName = fullName;
        this.orderID = orderID;
        this.paymentMethod = paymentMethod;
        this.pincode = pincode;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.userId = userId;
        this.deliveryPrice = deliveryPrice;
        this.cancellationRequested = cancellationRequested;
    }

    public boolean isCancellationRequested() {
        return cancellationRequested;
    }
    public void setCancellationRequested(boolean cancellationRequested) {
        this.cancellationRequested = cancellationRequested;
    }
    public String getDeliveryPrice() {
        return deliveryPrice;
    }
    public void setDeliveryPrice(String deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId){
           this.productId = productId;
    }
    public String getProductTitle() {
        return productTitle;
    }
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }
    public String getProductImage() {
        return productImage;
    }
    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCoupenId() {
        return coupenId;
    }
    public void setCoupenId(String coupenId) {
        this.coupenId = coupenId;
    }
    public String getCuttedPrice() {
        return cuttedPrice;
    }
    public void setCuttedPrice(String cuttedPrice) {
        this.cuttedPrice = cuttedPrice;
    }
    public Date getOrderdDate() {
        return orderdDate;
    }
    public void setOrderdDate(Date orderdDate) {
        this.orderdDate = orderdDate;
    }
    public Date getPackedDate() {
        return packedDate;
    }
    public void setPackedDate(Date packedDate) {
        this.packedDate = packedDate;
    }
    public Date getShippedDate() {
        return shippedDate;
    }
    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }
    public Date getDeliveredDate() {
        return deliveredDate;
    }
    public void setDeliveredDate(Date deliveredDate) {
        this.deliveredDate = deliveredDate;
    }
    public Date getCancelledDate() {
        return cancelledDate;
    }
    public void setCancelledDate(Date cancelledDate) {
        this.cancelledDate = cancelledDate;
    }
    public String getDiscountedPrice() {
        return discountedPrice;
    }
    public void setDiscountedPrice(String discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
    public Long getFreeCoupens() {
        return freeCoupens;
    }
    public void setFreeCoupens(Long freeCoupens) {
        this.freeCoupens = freeCoupens;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getOrderID() {
        return orderID;
    }
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    public String getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
    public Long getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(Long productQuantity) {
        this.productQuantity = productQuantity;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
