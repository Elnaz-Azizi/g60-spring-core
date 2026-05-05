package se.lexicon.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import se.lexicon.dao.TransactionDao;
import se.lexicon.dao.WalletDao;
import se.lexicon.dao.impl.InMemoryTransactionDao;
import se.lexicon.dao.impl.InMemoryWalletDao;
import se.lexicon.service.WalletService;
import se.lexicon.service.impl.WalletServiceImpl;

@Configuration
@PropertySource( "classpath:application.properties")
public class ModernWalletAppConfig {

    @Bean
    public WalletDao walletDao() {
        return new InMemoryWalletDao();
    }

    @Bean
    public TransactionDao transactionDao() {
        return new InMemoryTransactionDao();
    }

    @Bean
    public WalletLimitConfig walletLimitConfig() {
        return new WalletLimitConfig();
    }

    @Bean
    public WalletService walletService(WalletDao walletDao, TransactionDao transactionDao, WalletLimitConfig walletLimitConfig) {
        return new WalletServiceImpl(walletDao, transactionDao, walletLimitConfig);
    }
}
