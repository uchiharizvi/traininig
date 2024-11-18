package org.kavish.training.usecase.business.bank.cards.filtercards;

public class CardTokenDetails {
    private String lastFourCardNumber;
    private String lastFourTokenNumber;
    private TokenStatus tokenStatus;
    private String tokenReferenceId;

    public String getLastFourCardNumber() {
        return lastFourCardNumber;
    }

    public void setLastFourCardNumber(String lastFourCardNumber) {
        this.lastFourCardNumber = lastFourCardNumber;
    }

    public String getLastFourTokenNumber() {
        return lastFourTokenNumber;
    }

    public void setLastFourTokenNumber(String lastFourTokenNumber) {
        this.lastFourTokenNumber = lastFourTokenNumber;
    }

    public TokenStatus getTokenStatus() {
        return tokenStatus;
    }

    public void setTokenStatus(TokenStatus tokenStatus) {
        this.tokenStatus = tokenStatus;
    }

    public String getTokenReferenceId() {
        return tokenReferenceId;
    }

    public void setTokenReferenceId(String tokenReferenceId) {
        this.tokenReferenceId = tokenReferenceId;
    }
}
