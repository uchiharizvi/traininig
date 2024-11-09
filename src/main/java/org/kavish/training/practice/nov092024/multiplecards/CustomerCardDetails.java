package org.kavish.training.practice.nov092024.multiplecards;

public class CustomerCardDetails {
    private LinkedCardInfo linkedCardInfo;

    public CustomerCardDetails(LinkedCardInfo linkedCardInfo) {
        this.linkedCardInfo = linkedCardInfo;
    }

    public LinkedCardInfo getLinkedCardInfo() {
        return linkedCardInfo;
    }
}