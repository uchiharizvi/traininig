package org.kavish.training.usecase.business.bank.cards.filtercards;

import org.kavish.training.usecase.business.bank.cards.common.BackendService;
import org.kavish.training.usecase.business.bank.cards.common.ListBankCardsResponseTO;
import org.kavish.training.usecase.business.bank.cards.common.RequestBuilder;

public class ExecutionCode {
    public static void main(String[] args) {
        CardDetailsRequest cardDetailsRequest = RequestBuilder.buildCardDetailsRequest();
        BackendService service = new BackendService();
        ListBankCardsResponseTO listBankCardsResponseTO = service
                .executeCall("listbankcards", ListBankCardsResponseTO.class);


    }
}
