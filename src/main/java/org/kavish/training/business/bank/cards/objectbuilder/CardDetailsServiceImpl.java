package org.kavish.training.usecase.business.bank.cards.objectbuilder;

import org.kavish.training.usecase.business.bank.cards.common.WalletName;

/**
 * Solution for
 * Sonar error “may expose internal representation by storing externally mutable object”
 *
 */
public class CardDetailsServiceImpl implements CardDetails {
    private final CardDetailsResponseMapper cardDetailsResponseMapper;

    public CardDetailsServiceImpl(CardDetailsResponseMapper cardDetailsResponseMapper) {
        //Option 1 : create a defensive copy
        this.cardDetailsResponseMapper = new CardDetailsResponseMapper(cardDetailsResponseMapper);
        //option 2 : make CardDetailsResponse Immutable
    }

    @Override
    public CardDetailsResponseTO listCardDetails(WalletName walletName, String customerNumber, String companyNumber) throws Exception {
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
