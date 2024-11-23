package org.kavish.training.business.bank.cards.common;

import org.kavish.training.business.bank.cards.digitalwallets.caller.walletsdk.apple.model.request.AppleCardDetailsRequest;
import org.kavish.training.business.bank.cards.filtercards.CardDetailsRequest;
import org.kavish.training.business.bank.cards.digitalwallets.caller.walletsdk.apple.model.request.CardTokenDetails;
import org.kavish.training.business.bank.cards.filtercards.TokenStatus;

import java.util.ArrayList;
import java.util.List;

public class RequestBuilder {
    public static AppleCardDetailsRequest buildCardDetailsRequest() {
        AppleCardDetailsRequest request = new AppleCardDetailsRequest();
        request.setLanguage("English");
        request.setWalletName(WalletName.APPLE_PAY);
        request.setCardTokenDetails(buildCardTokens());
        return request;
    }

    private static List<CardTokenDetails> buildCardTokens() {
        List<CardTokenDetails> cardTokenDetailsList = new ArrayList<>();
        CardTokenDetails cardTokenDetails = new CardTokenDetails();
        cardTokenDetails.setLastFourCardNumber("4321");
        cardTokenDetails.setLastFourTokenNumber("9876");
        cardTokenDetails.setTokenStatus(TokenStatus.Requires_Activation);
        cardTokenDetails.setTokenReferenceId("DR565656IUY76767");

        CardTokenDetails cardTokenDetails1 = new CardTokenDetails();
        cardTokenDetails1.setLastFourCardNumber("1234");
        cardTokenDetails1.setLastFourTokenNumber("6789");
        cardTokenDetails1.setTokenStatus(TokenStatus.Activated);
        cardTokenDetails1.setTokenReferenceId("DR98766BVF10543");

        CardTokenDetails cardTokenDetails2 = new CardTokenDetails();
        cardTokenDetails2.setLastFourCardNumber("0987");
        cardTokenDetails2.setLastFourTokenNumber("7432");
        cardTokenDetails2.setTokenStatus(TokenStatus.Requires_Activation);
        cardTokenDetails2.setTokenReferenceId("DRY6543BVF10543");

        cardTokenDetailsList.add(cardTokenDetails);
        cardTokenDetailsList.add(cardTokenDetails1);
        cardTokenDetailsList.add(cardTokenDetails2);

        return cardTokenDetailsList;

    }
}
