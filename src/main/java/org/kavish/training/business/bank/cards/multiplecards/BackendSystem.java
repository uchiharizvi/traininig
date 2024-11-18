package org.kavish.training.usecase.business.bank.cards.multiplecards;

import java.util.List;

public class BackendSystem {

    public static ListBankCardsResponseTO getListBankCards() {
        return buildBackendResponse();
    }

    private static ListBankCardsResponseTO buildBackendResponse() {
    ListBankCardsResponseTO responseTO = new ListBankCardsResponseTO();
    ListBankCardsResponse response = new ListBankCardsResponse();
    response.setCustomerInformation(buildCustomerInformation());
    response.setCustomerCardDetailsList(buildCustomerCardDetails());
    responseTO.setListBankCardsResponse(response);
    return responseTO;
    }

    private static List<CustomerCardDetails> buildCustomerCardDetails() {
        return List.of(
                new CustomerCardDetails(
                new LinkedCardInfo("Visa", "4111111111111111","12/2025",
                        new BillingAddress("123 Main St","Anytown","CA","12345")
                )
                ),
                new CustomerCardDetails(
                        new LinkedCardInfo("MasterCard", "5500000000000004","11/2024",
                                new BillingAddress("456 Maple Ave","Othertown","NY","67890")
                        )
                ),
                new CustomerCardDetails( null)
        );
    }

    private static CustomerInformation buildCustomerInformation() {
        return new CustomerInformation("12345",
                "John", "Doe", "john.doe@example.com", "+1234567890");
    }



}
