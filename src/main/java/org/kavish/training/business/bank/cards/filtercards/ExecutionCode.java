package org.kavish.training.business.bank.cards.filtercards;

import org.kavish.training.business.bank.cards.common.BackendService;
import org.kavish.training.business.bank.cards.common.ListBankCardsResponseTO;
import org.kavish.training.business.bank.cards.common.RequestBuilder;
import org.kavish.training.business.bank.cards.digitalwallets.caller.walletsdk.apple.model.request.AppleCardDetailsRequest;

public class ExecutionCode {
    public static void main(String[] args) {
        AppleCardDetailsRequest cardDetailsRequest = RequestBuilder.buildCardDetailsRequest();
        BackendService service = new BackendService();
        ListBankCardsResponseTO listBankCardsResponseTO = service
                .executeCall("listbankcards", ListBankCardsResponseTO.class);


    }
}
