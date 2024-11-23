package org.kavish.training.business.bank.cards.digitalwallets.service.carddetails;

import org.kavish.training.business.bank.cards.digitalwallets.caller.walletsdk.apple.model.request.CardTokenDetails;
import org.kavish.training.business.bank.cards.digitalwallets.delegate.DelegateExecutor;
import org.kavish.training.business.bank.cards.filtercards.TokenStatus;
import org.kavish.training.business.bank.cards.objectbuilder.CardDetailsResponseTO;
import org.kavish.training.business.bank.cards.digitalwallets.caller.walletsdk.apple.model.request.AppleCardDetailsRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CardDetailsServiceImpl implements CardDetailsService {

    private static final String CARD_NUMBERS_KEY = "lastFourDigitCardNumbers";
    private static final String TOKEN_NUMBERS_KEY = "lastFourDigitTokenNumbers";

    @Override
    public CardDetailsResponseTO getCardDetails(AppleCardDetailsRequest cardDetailsRequest) throws Exception {
        Map<String, List<String>> filteredTokenRequest = new HashMap<>();
        filteredTokenRequest = filterTokenRequest(cardDetailsRequest);
        DelegateExecutor.execute(() -> "Hello World");
        return new CardDetailsResponseTO();
    }

    private Map<String, List<String>> filterTokenRequest(AppleCardDetailsRequest cardDetailsRequest) {
        Map<String, List<String>> requestDataMap = new HashMap<>();

        // Process the card token details
        List<CardTokenDetails> filteredDetails = cardDetailsRequest.getCardTokenDetails()
                .stream()
                .filter(details -> details.getTokenStatus().equals(TokenStatus.Requires_Activation))
                .toList(); // Use `toList()` for clarity (Java 16+)
        // Populate the map
        requestDataMap.put(
                CARD_NUMBERS_KEY,
                filteredDetails.stream()
                        .map(CardTokenDetails::getLastFourCardNumber)
                        .toList()
        );
        requestDataMap.put(
                TOKEN_NUMBERS_KEY,
                filteredDetails.stream()
                        .map(CardTokenDetails::getLastFourTokenNumber)
                        .toList()
        );

        return requestDataMap;
    }
}
