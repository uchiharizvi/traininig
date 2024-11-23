package org.kavish.training.business.bank.cards.multiplecards;

public class CustomerCardDetails {
    private LinkedCardInfo linkedCardInfo;

    public CustomerCardDetails(LinkedCardInfo linkedCardInfo) {
        this.linkedCardInfo = linkedCardInfo;
    }

    public LinkedCardInfo getLinkedCardInfo() {
        return linkedCardInfo;
    }
}