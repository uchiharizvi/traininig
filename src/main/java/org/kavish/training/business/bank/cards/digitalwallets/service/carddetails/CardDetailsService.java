package org.kavish.training.business.bank.cards.digitalwallets.service.carddetails;

import org.kavish.training.business.bank.cards.objectbuilder.CardDetailsResponseTO;
import org.kavish.training.business.bank.cards.digitalwallets.caller.walletsdk.apple.model.request.AppleCardDetailsRequest;

public interface CardDetailsService {
    CardDetailsResponseTO getCardDetails(AppleCardDetailsRequest cardDetailsRequest) throws Exception;
}
