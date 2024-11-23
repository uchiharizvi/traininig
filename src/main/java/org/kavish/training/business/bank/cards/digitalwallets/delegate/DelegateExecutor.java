package org.kavish.training.business.bank.cards.digitalwallets.delegate;

import java.util.function.Supplier;

public class DelegateExecutor {
    public static <T> T execute(Supplier<T> supplier) {
        return supplier.get();
    }
}
