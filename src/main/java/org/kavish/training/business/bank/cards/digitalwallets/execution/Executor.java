package org.kavish.training.business.bank.cards.digitalwallets.execution;

import org.kavish.training.business.bank.cards.common.RequestBuilder;
import org.kavish.training.business.bank.cards.digitalwallets.service.carddetails.CardDetailsService;
import org.kavish.training.business.bank.cards.digitalwallets.service.carddetails.CardDetailsServiceImpl;

public class Executor {
    public static void main(String[] args) throws Exception {
        CardDetailsService service = new CardDetailsServiceImpl();
        service.getCardDetails(RequestBuilder.buildCardDetailsRequest());
    }
}

