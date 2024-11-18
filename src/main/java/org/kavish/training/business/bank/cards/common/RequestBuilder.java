package org.kavish.training.usecase.business.bank.cards.common;

import org.kavish.training.usecase.business.bank.cards.filtercards.CardDetailsRequest;
import org.kavish.training.usecase.business.bank.cards.filtercards.CardTokenDetails;
import org.kavish.training.usecase.business.bank.cards.filtercards.TokenStatus;

import java.util.ArrayList;
import java.util.List;

public class RequestBuilder {
    public static CardDetailsRequest buildCardDetailsRequest() {
        CardDetailsRequest request = new CardDetailsRequest();
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
        cardTokenDetails.setTokenStatus(TokenStatus.P);
        cardTokenDetails.setTokenReferenceId("DR565656IUY76767");

        CardTokenDetails cardTokenDetails1 = new CardTokenDetails();
        cardTokenDetails.setLastFourCardNumber("1234");
        cardTokenDetails.setLastFourTokenNumber("6789");
        cardTokenDetails.setTokenStatus(TokenStatus.A);
        cardTokenDetails.setTokenReferenceId("DR98766BVF10543");


        cardTokenDetailsList.add(cardTokenDetails);
        cardTokenDetailsList.add(cardTokenDetails1);

        return cardTokenDetailsList;

    }
}
