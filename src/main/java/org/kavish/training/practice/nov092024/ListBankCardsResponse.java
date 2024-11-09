package org.kavish.training.practice.nov092024;

import java.util.List;

public class ListBankCardsResponse {
    private CustomerInformation customerInformation;
    private List<CustomerCardDetails> customerCardDetailsList;

    public CustomerInformation getCustomerInformation() {
        return customerInformation;
    }

    public void setCustomerInformation(CustomerInformation customerInformation) {
        this.customerInformation = customerInformation;
    }

    public List<CustomerCardDetails> getCustomerCardDetailsList() {
        return customerCardDetailsList;
    }

    public void setCustomerCardDetailsList(List<CustomerCardDetails> customerCardDetailsList) {
        this.customerCardDetailsList = customerCardDetailsList;
    }
}
