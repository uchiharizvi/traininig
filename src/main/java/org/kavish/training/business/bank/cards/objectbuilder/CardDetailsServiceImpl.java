package org.kavish.training.business.bank.cards.objectbuilder;

import org.kavish.training.business.bank.cards.common.WalletName;
import org.kavish.training.business.bank.cards.digitalwallets.caller.walletsdk.apple.model.request.AppleCardDetailsRequest;
import org.kavish.training.business.bank.cards.digitalwallets.service.carddetails.CardDetailsService;

/**
 * Solution for
 * Sonar error “may expose internal representation by storing externally mutable object”
 *
 */
public class CardDetailsServiceImpl implements CardDetailsService {
    private final CardDetailsResponseMapper cardDetailsResponseMapper;

    public CardDetailsServiceImpl(CardDetailsResponseMapper cardDetailsResponseMapper) {
        //Option 1 : create a defensive copy
        this.cardDetailsResponseMapper = new CardDetailsResponseMapper(cardDetailsResponseMapper);
        //option 2 : make CardDetailsResponse Immutable
    }

    @Override
    public CardDetailsResponseTO getCardDetails(AppleCardDetailsRequest cardDetailsRequest) throws Exception {
        CardDetailsResponseTO responseTO = null;
        try {
            //rest call
            responseTO = cardDetailsResponseMapper
                    .populateResponse("backendResponse");
        } catch (Exception e) {
            throw new RuntimeException("Error while changing card payment token for wallet:");
        }
        return responseTO;
    }
}
