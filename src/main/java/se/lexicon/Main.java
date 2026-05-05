package se.lexicon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.ModernWalletAppConfig;
import se.lexicon.dao.TransactionDao;
import se.lexicon.dao.WalletDao;
import se.lexicon.dao.impl.InMemoryTransactionDao;
import se.lexicon.dao.impl.InMemoryWalletDao;
import se.lexicon.model.Wallet;
import se.lexicon.service.WalletService;
import se.lexicon.service.impl.WalletServiceImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ModernWalletAppConfig.class);
        WalletService walletService = context.getBean(WalletService.class);

        Wallet wallet = walletService.create(new Wallet(new BigDecimal("500.00")));
        System.out.println("Created Wallet: " + wallet);

        // Perform a deposit transaction on the created wallet.
        walletService.depositTransaction(wallet.getWalletId(), new BigDecimal("1000.00"));

        // Fetch the wallet again to verify the updated state.
        Wallet foundWallet = walletService.findWalletInfoById(wallet.getWalletId());
        System.out.println("Found Wallet: " + foundWallet);

       /* WalletDao walletDao = new InMemoryWalletDao();
        TransactionDao transactionDao = new InMemoryTransactionDao();
        WalletService walletService = new WalletServiceImpl(walletDao, transactionDao);

        Wallet createdWallet = walletService.create(new Wallet(new BigDecimal("500.00")));

        // Make a deposit
        System.out.println("Before Deposit: " + createdWallet);

        System.out.println(walletService.depositTransaction(
                createdWallet.getWalletId(),
                new BigDecimal("10000.00")
        ));*/


    }
}
