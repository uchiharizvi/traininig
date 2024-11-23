package org.kavish.training.business.bank.cards.objectbuilder;

public class CardDetailsResponseMapper {
    //Assume some fields here

    //copy constructor
    public CardDetailsResponseMapper(CardDetailsResponseMapper other) {
        //Initialize fields based on 'other'
    }

    public CardDetailsResponseTO populateResponse(String message) {
        CardDetailsResponseTO responseTO = new CardDetailsResponseTO();
        responseTO.setMessage(message);
        return responseTO;
    }
}
