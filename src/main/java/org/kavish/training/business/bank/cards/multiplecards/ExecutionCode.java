package org.kavish.training.business.bank.cards.multiplecards;

import java.util.List;

public class ExecutionCode {
    public static void main(String[] args) throws Exception {
        //call backend Service
        ListBankCardsResponseTO responseTO = BackendSystem.getListBankCards();
        CardDetailsTO response = processResponse(responseTO);
        System.out.println(response.toString());
    }

    private static CardDetailsTO processResponse(ListBankCardsResponseTO responseTO) throws Exception{
    CardDetailsTO frontEndResponseTO = new CardDetailsTO();
    try {
        List<CardDetails> cardDetailsList = responseTO.getListBankCardsResponse()
                .getCustomerCardDetailsList()
                .stream()
                .filter(customerCardDetail -> customerCardDetail.getLinkedCardInfo() != null)
                .map(customerCardDetail -> {
                    CardDetails cardDetails = new CardDetails();
                    cardDetails.setCardNumber(customerCardDetail.getLinkedCardInfo().getCardNumber());
                    return cardDetails;
                })
                .toList();


        frontEndResponseTO.setCardDetails(cardDetailsList);
    } catch (Exception e) {
        e.printStackTrace();
        throw new RuntimeException(e.getMessage());
    }
        return frontEndResponseTO;
    }
}
