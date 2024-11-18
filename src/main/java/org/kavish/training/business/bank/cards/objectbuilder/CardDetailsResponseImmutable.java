package org.kavish.training.usecase.business.bank.cards.objectbuilder;

public class CardDetailsResponseImmutable {
    //Assume some fields here
    private final String field1;
    private final int field2;
    //copy constructor
    public CardDetailsResponseImmutable(String field1, int field2) {
        //Initialize fields based on 'other'
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public int getField2() {
        return field2;
    }
}
