package com.redhat.training.payments;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "payments" )
public class Payment {

    @Id
    private Long id;
    private Long userId;
    private Long orderId;
    private Double amount;
    private String currency;
    private String email;
    private Double fraudScore;

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId( Long userId ) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId( Long orderId ) {
        this.orderId = orderId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount( Double amount ) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency( String currency ) {
        this.currency = currency;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public Double getFraudScore() {
        return fraudScore;
    }

    public void setFraudScore( Double fraudScore ) {
        this.fraudScore = fraudScore;
    }

    @Override
    public String toString() {
        return "Coupon [id=" + id + ", userId=" + userId + ", amount=" +
                amount + ", currency=" + currency + ", fraudScore=" + fraudScore + "]";
    }
}
