package org.kavish.training.practice.nov092024;

public class CardDetails {
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "CardDetails{" +
                "cardNumber='" + cardNumber + '\'' +
                '}';
    }
}