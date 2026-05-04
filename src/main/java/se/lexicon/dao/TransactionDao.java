package se.lexicon.dao;

import se.lexicon.model.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionDao {

    /**
     * Saves a transaction to the data store.
     *
     * @param transaction the transaction to save
     * @return the Transaction object that was saved
     */
    Transaction save(Transaction transaction);

    /**
     * Finds a transaction by its ID.
     *
     * @param id the transaction ID to search for
     * @return an Optional containing the transaction if found, or empty if not found
     */
    Optional<Transaction> findById(String id);

    /**
     * Finds all transactions associated with a specific wallet.
     *
     * @param id the wallet ID to search for
     * @return a list of transactions for the specified wallet
     */
    List<Transaction> findByWalletId(String id);
}