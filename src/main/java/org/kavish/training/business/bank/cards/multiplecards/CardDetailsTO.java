package org.kavish.training.business.bank.cards.multiplecards;

import java.util.List;

public class CardDetailsTO {

    private List<CardDetails> cardDetails;

    public List<CardDetails> getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(List<CardDetails> cardDetails) {
        this.cardDetails = cardDetails;
    }

    @Override
    public String toString() {
        return "CardDetailsTO{" +
                "cardDetails=" + cardDetails +
                '}';
    }
}
