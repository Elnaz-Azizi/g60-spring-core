package se.lexicon.config;

import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

public class WalletLimitConfig {

    @Value("${wallet.min.balance}")
    private BigDecimal minBalance;

    @Value("${wallet.max.deposit}")
    private BigDecimal maxDeposit;

    public BigDecimal getMinBalance() {
        return minBalance;
    }

    public BigDecimal getMaxDeposit() {
        return maxDeposit;
    }
}
