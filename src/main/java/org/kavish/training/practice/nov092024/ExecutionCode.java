package org.kavish.training.practice.nov092024;

import java.util.List;
import java.util.stream.Collectors;

public class ExecutionCode {
    public static void main(String[] args) {
        //call backend Service
        ListBankCardsResponseTO responseTO = BackendSystem.getListBankCards();
        CardDetailsTO response = processResponse(responseTO);
        System.out.println(response.toString());
    }

    private static CardDetailsTO processResponse(ListBankCardsResponseTO responseTO) {
    CardDetailsTO frontEndResponseTO = new CardDetailsTO();
        List<CardDetails> cardDetailsList = responseTO.getListBankCardsResponse()
                .getCustomerCardDetailsList()
                .stream()
                .map(customerCardDetail -> {
                    CardDetails cardDetails = new CardDetails();
                    cardDetails.setCardNumber(customerCardDetail.getLinkedCardInfo().getCardNumber());
                    return cardDetails;
                })
                .toList();

        frontEndResponseTO.setCardDetails(cardDetailsList);
        return frontEndResponseTO;
    }
}
