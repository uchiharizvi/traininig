package org.kavish.training.practice.nov092024.multiplecards;

public class LinkedCardInfo {

    private String cardType;
    private String cardNumber;
    private String expiryDate;
    private BillingAddress billingAddress;

    public LinkedCardInfo(String cardType, String cardNumber, String expiryDate, BillingAddress billingAddress) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.billingAddress = billingAddress;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }
}
