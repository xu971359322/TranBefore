package org.java.entity;

import java.util.Date;

public class TranOrder {
    private String orderId;

    private String orderName;

    private String orderTel;

    private String orderPlace;

    private String orderType;

    private Date orderInTime;

    private String orderGetstyle;

    private String orderReceiveName;

    private String orderReceiveTel;

    private String orderReceivePlace;

    private Date orderOutTime;

    private String orderPay;

    private String orderWeight;

    private String orderRemark;

    private String orderPack;

    private String orderCar;

    private String orderSmr;

    private Double orderMonry;

    private Integer orderPayFlag;

    private String bId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getOrderTel() {
        return orderTel;
    }

    public void setOrderTel(String orderTel) {
        this.orderTel = orderTel == null ? null : orderTel.trim();
    }

    public String getOrderPlace() {
        return orderPlace;
    }

    public void setOrderPlace(String orderPlace) {
        this.orderPlace = orderPlace == null ? null : orderPlace.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Date getOrderInTime() {
        return orderInTime;
    }

    public void setOrderInTime(Date orderInTime) {
        this.orderInTime = orderInTime;
    }

    public String getOrderGetstyle() {
        return orderGetstyle;
    }

    public void setOrderGetstyle(String orderGetstyle) {
        this.orderGetstyle = orderGetstyle == null ? null : orderGetstyle.trim();
    }

    public String getOrderReceiveName() {
        return orderReceiveName;
    }

    public void setOrderReceiveName(String orderReceiveName) {
        this.orderReceiveName = orderReceiveName == null ? null : orderReceiveName.trim();
    }

    public String getOrderReceiveTel() {
        return orderReceiveTel;
    }

    public void setOrderReceiveTel(String orderReceiveTel) {
        this.orderReceiveTel = orderReceiveTel == null ? null : orderReceiveTel.trim();
    }

    public String getOrderReceivePlace() {
        return orderReceivePlace;
    }

    public void setOrderReceivePlace(String orderReceivePlace) {
        this.orderReceivePlace = orderReceivePlace == null ? null : orderReceivePlace.trim();
    }

    public Date getOrderOutTime() {
        return orderOutTime;
    }

    public void setOrderOutTime(Date orderOutTime) {
        this.orderOutTime = orderOutTime;
    }

    public String getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(String orderPay) {
        this.orderPay = orderPay == null ? null : orderPay.trim();
    }

    public String getOrderWeight() {
        return orderWeight;
    }

    public void setOrderWeight(String orderWeight) {
        this.orderWeight = orderWeight == null ? null : orderWeight.trim();
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    public String getOrderPack() {
        return orderPack;
    }

    public void setOrderPack(String orderPack) {
        this.orderPack = orderPack == null ? null : orderPack.trim();
    }

    public String getOrderCar() {
        return orderCar;
    }

    public void setOrderCar(String orderCar) {
        this.orderCar = orderCar == null ? null : orderCar.trim();
    }

    public String getOrderSmr() {
        return orderSmr;
    }

    public void setOrderSmr(String orderSmr) {
        this.orderSmr = orderSmr == null ? null : orderSmr.trim();
    }

    public Double getOrderMonry() {
        return orderMonry;
    }

    public void setOrderMonry(Double orderMonry) {
        this.orderMonry = orderMonry;
    }

    public Integer getOrderPayFlag() {
        return orderPayFlag;
    }

    public void setOrderPayFlag(Integer orderPayFlag) {
        this.orderPayFlag = orderPayFlag;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    @Override
    public String toString() {
        return "TranOrder{" +
                "orderId='" + orderId + '\'' +
                ", orderName='" + orderName + '\'' +
                ", orderTel='" + orderTel + '\'' +
                ", orderPlace='" + orderPlace + '\'' +
                ", orderType='" + orderType + '\'' +
                ", orderInTime=" + orderInTime +
                ", orderGetstyle='" + orderGetstyle + '\'' +
                ", orderReceiveName='" + orderReceiveName + '\'' +
                ", orderReceiveTel='" + orderReceiveTel + '\'' +
                ", orderReceivePlace='" + orderReceivePlace + '\'' +
                ", orderOutTime=" + orderOutTime +
                ", orderPay='" + orderPay + '\'' +
                ", orderWeight='" + orderWeight + '\'' +
                ", orderRemark='" + orderRemark + '\'' +
                ", orderPack='" + orderPack + '\'' +
                ", orderCar='" + orderCar + '\'' +
                ", orderSmr='" + orderSmr + '\'' +
                ", orderMonry=" + orderMonry +
                ", orderPayFlag=" + orderPayFlag +
                ", bId='" + bId + '\'' +
                '}';
    }
}