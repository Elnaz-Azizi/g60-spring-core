package se.lexicon.dao;

import se.lexicon.model.Wallet;

import java.util.Optional;

public interface WalletDao {
    /**
     * Saves a wallet to the data store.
     *
     * @param wallet the wallet to save
     * @return theWallet object that was saved
     */
    Wallet save(Wallet wallet);

    /**
     * Finds a wallet by its ID.
     *
     * @param id the wallet ID to search for
     * @return an Optional containing the wallet if found, or empty if not found
     */
    Optional<Wallet> findById(String id);

    /**
     * Updates an existing wallet in the data store.
     *
     * @param wallet the wallet with updated information
     */
    void update(Wallet wallet);
}
