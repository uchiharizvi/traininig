package org.kavish.training.business.bank.cards.digitalwallets.service.carddetails;

import org.kavish.training.business.bank.cards.common.WalletName;
import org.kavish.training.business.bank.cards.objectbuilder.CardDetailsResponseTO;

public interface CardDetailsService {
    CardDetailsResponseTO listCardDetails(WalletName walletName, String customerNumber, String companyNumber) throws Exception;
}
