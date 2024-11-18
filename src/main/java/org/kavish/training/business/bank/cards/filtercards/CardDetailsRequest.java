package org.kavish.training.usecase.business.bank.cards.filtercards;

import org.kavish.training.usecase.business.bank.cards.common.WalletName;

import java.util.List;

public class CardDetailsRequest {
    private WalletName walletName;
    private String language;
    private List<CardTokenDetails> cardTokenDetails;

    public WalletName getWalletName() {
        return walletName;
    }

    public void setWalletName(WalletName walletName) {
        this.walletName = walletName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<CardTokenDetails> getCardTokenDetails() {
        return cardTokenDetails;
    }

    public void setCardTokenDetails(List<CardTokenDetails> cardTokenDetails) {
        this.cardTokenDetails = cardTokenDetails;
    }
}
