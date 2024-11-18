package org.kavish.training.business.bank.cards.walletsdk.apple.model.request;

import org.kavish.training.business.bank.cards.common.WalletName;
import org.kavish.training.business.bank.cards.filtercards.CardTokenDetails;

import java.util.List;

public class AppleCardDetailsRequest {
    private WalletName walletName;
    private String language;
    private List<CardTokenDetails> cardTokenDetails;
}
