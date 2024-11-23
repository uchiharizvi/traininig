package org.kavish.training.business.bank.cards.common;


public class BackendService {
    public <T> T executeCall(String serviceName, Class<T> responseType) {
        try {
            switch (serviceName) {
                case "listbankcards":
                    ResponseBuilder.buildListBankCardsResponse();
                case "listcardpaymenttokens":
                    return responseType.cast(new ListCardPaymentToken());

                default:
                    return responseType.getDeclaredConstructor().newInstance();
            }
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
