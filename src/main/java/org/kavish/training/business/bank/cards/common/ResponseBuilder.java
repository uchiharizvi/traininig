package org.kavish.training.business.bank.cards.common;

public class ResponseBuilder {
    public static ListBankCardsResponseTO buildListBankCardsResponse() {
       ListBankCardsResponseTO responseTO = new ListBankCardsResponseTO();
        return responseTO;
    }

    public static ListCardPaymentTokenReposneTO buildListCardPaymentTokensResponse() {
        ListCardPaymentTokenReposneTO responseTO = new ListCardPaymentTokenReposneTO();
        return responseTO;
    }

}
