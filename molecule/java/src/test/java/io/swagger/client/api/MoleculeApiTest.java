/*
 * Hydrogen Molecule API
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import molecule_api.ApiException;
import io.swagger.client.model.AsyncOperationResponse;
import io.swagger.client.model.CrowdsaleDeployPayload;
import io.swagger.client.model.CrowdsaleFundPayload;
import io.swagger.client.model.CrowdsalePurchasePayload;
import io.swagger.client.model.CurrencyBalanceGetResponse;
import io.swagger.client.model.CurrencyBalanceSpecificResponse;
import io.swagger.client.model.CurrencyTransferGetResponse;
import io.swagger.client.model.CurrencyTransferPayload;
import io.swagger.client.model.CurrencyTransferSpecificResponse;
import io.swagger.client.model.TokenBalanceGetResponse;
import io.swagger.client.model.TokenBalanceSpecificResponse;
import io.swagger.client.model.TokenCreatePayload;
import io.swagger.client.model.TokenCreateResponse;
import io.swagger.client.model.TokenDeployPayload;
import io.swagger.client.model.TokenGetResponse;
import io.swagger.client.model.TokenSpecificResponse;
import io.swagger.client.model.TokenSupplyGetResponse;
import io.swagger.client.model.TokenSupplySpecificResponse;
import io.swagger.client.model.TokenTransferGetResponse;
import io.swagger.client.model.TokenTransferPayload;
import io.swagger.client.model.TokenTransferSpecificResponse;
import io.swagger.client.model.TokenUpdatePayload;
import io.swagger.client.model.TokenWhitelistPayload;
import io.swagger.client.model.TransactionStatusGetResponse;
import io.swagger.client.model.TransactionStatusSpecificResponse;
import java.util.UUID;
import io.swagger.client.model.WalletCreatePayload;
import io.swagger.client.model.WalletCreateResponse;
import io.swagger.client.model.WalletGetResponse;
import io.swagger.client.model.WalletKeyCreatePayload;
import io.swagger.client.model.WalletKeyCreateResponse;
import io.swagger.client.model.WalletKeyGeneratorPayload;
import io.swagger.client.model.WalletKeyGetResponse;
import io.swagger.client.model.WalletKeySpecificResponse;
import io.swagger.client.model.WalletSpecificResponse;
import io.swagger.client.model.WalletUpdatePayload;
import io.swagger.client.model.WebhookCreatePayload;
import io.swagger.client.model.WebhookCreateResponse;
import io.swagger.client.model.WebhookGetResponse;
import io.swagger.client.model.WebhookSpecificResponse;
import io.swagger.client.model.WebhookUpdatePayload;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MoleculeApi
 */
@Ignore
public class MoleculeApiTest {

    private final MoleculeApi api = new MoleculeApi();

    
    /**
     * Delete a token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTokenTest() throws ApiException {
        UUID tokenId = null;
        api.deleteToken(tokenId);

        // TODO: test validations
    }
    
    /**
     * Delete a webhook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWebhookTest() throws ApiException {
        UUID webhookId = null;
        api.deleteWebhook(webhookId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a currency balance
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrencyBalanceTest() throws ApiException {
        UUID currencyBalanceId = null;
        CurrencyBalanceSpecificResponse response = api.getCurrencyBalance(currencyBalanceId);

        // TODO: test validations
    }
    
    /**
     * Get information for all currency balances recorded in your application.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrencyBalancesTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String orderBy = null;
        Boolean ascending = null;
        String filter = null;
        CurrencyBalanceGetResponse response = api.getCurrencyBalances(page, size, orderBy, ascending, filter);

        // TODO: test validations
    }
    
    /**
     * Retrieve a currency transfer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrencyTransferTest() throws ApiException {
        UUID currencyTransferId = null;
        CurrencyTransferSpecificResponse response = api.getCurrencyTransfer(currencyTransferId);

        // TODO: test validations
    }
    
    /**
     * Get information for all currency transfers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrencyTransfersTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String orderBy = null;
        Boolean ascending = null;
        CurrencyTransferGetResponse response = api.getCurrencyTransfers(page, size, orderBy, ascending);

        // TODO: test validations
    }
    
    /**
     * Retrieve a token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenTest() throws ApiException {
        UUID tokenId = null;
        TokenSpecificResponse response = api.getToken(tokenId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a token balance
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenBalanceTest() throws ApiException {
        UUID tokenBalanceId = null;
        TokenBalanceSpecificResponse response = api.getTokenBalance(tokenBalanceId);

        // TODO: test validations
    }
    
    /**
     * Get information for all token balances defined for your application.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenBalancesTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String orderBy = null;
        Boolean ascending = null;
        String filter = null;
        TokenBalanceGetResponse response = api.getTokenBalances(page, size, orderBy, ascending, filter);

        // TODO: test validations
    }
    
    /**
     * Get information for all token supplies defined for your application.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenSuppliesTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String orderBy = null;
        Boolean ascending = null;
        String filter = null;
        TokenSupplyGetResponse response = api.getTokenSupplies(page, size, orderBy, ascending, filter);

        // TODO: test validations
    }
    
    /**
     * Retrieve a token supply
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenSupplyTest() throws ApiException {
        UUID tokenSupplyId = null;
        TokenSupplySpecificResponse response = api.getTokenSupply(tokenSupplyId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a token transfer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenTransferTest() throws ApiException {
        UUID tokenTransferId = null;
        TokenTransferSpecificResponse response = api.getTokenTransfer(tokenTransferId);

        // TODO: test validations
    }
    
    /**
     * Get information for all token transfers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenTransfersTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String orderBy = null;
        Boolean ascending = null;
        TokenTransferGetResponse response = api.getTokenTransfers(page, size, orderBy, ascending);

        // TODO: test validations
    }
    
    /**
     * Get information for all tokens defined for your firm
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokensTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String orderBy = null;
        Boolean ascending = null;
        TokenGetResponse response = api.getTokens(page, size, orderBy, ascending);

        // TODO: test validations
    }
    
    /**
     * Retrieve status information for a specific transaction
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionStatusTest() throws ApiException {
        UUID transactionStatusId = null;
        TransactionStatusSpecificResponse response = api.getTransactionStatus(transactionStatusId);

        // TODO: test validations
    }
    
    /**
     * Get status information for all transactions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionStatusesTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String orderBy = null;
        Boolean ascending = null;
        String filter = null;
        TransactionStatusGetResponse response = api.getTransactionStatuses(page, size, orderBy, ascending, filter);

        // TODO: test validations
    }
    
    /**
     * Retrieve a wallet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletTest() throws ApiException {
        UUID walletId = null;
        WalletSpecificResponse response = api.getWallet(walletId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a wallet key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletKeyTest() throws ApiException {
        UUID walletKeyId = null;
        WalletKeySpecificResponse response = api.getWalletKey(walletKeyId);

        // TODO: test validations
    }
    
    /**
     * Get all wallet keys associated with wallets defined for your firm.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletKeysTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String orderBy = null;
        Boolean ascending = null;
        WalletKeyGetResponse response = api.getWalletKeys(page, size, orderBy, ascending);

        // TODO: test validations
    }
    
    /**
     * Get information for all wallets defined for your firm
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletsTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String orderBy = null;
        Boolean ascending = null;
        WalletGetResponse response = api.getWallets(page, size, orderBy, ascending);

        // TODO: test validations
    }
    
    /**
     * Retrieve a webhook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookTest() throws ApiException {
        UUID webhookId = null;
        WebhookSpecificResponse response = api.getWebhook(webhookId);

        // TODO: test validations
    }
    
    /**
     * Get information for all webhooks defined for your firm
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhooksTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String orderBy = null;
        Boolean ascending = null;
        WebhookGetResponse response = api.getWebhooks(page, size, orderBy, ascending);

        // TODO: test validations
    }
    
    /**
     * Deploy a token&#39;s crowdsale contract.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCrowdsaleDeployTest() throws ApiException {
        CrowdsaleDeployPayload payload = null;
        AsyncOperationResponse response = api.postCrowdsaleDeploy(payload);

        // TODO: test validations
    }
    
    /**
     * Transfer tokens to a token&#39;s crowdsale address.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCrowdsaleFundTest() throws ApiException {
        CrowdsaleFundPayload payload = null;
        AsyncOperationResponse response = api.postCrowdsaleFund(payload);

        // TODO: test validations
    }
    
    /**
     * Purchase tokens from a crowdsale contract
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCrowdsalePurchaseTest() throws ApiException {
        CrowdsalePurchasePayload payload = null;
        AsyncOperationResponse response = api.postCrowdsalePurchase(payload);

        // TODO: test validations
    }
    
    /**
     * Transfer currency between wallets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCurrencyTransferTest() throws ApiException {
        CurrencyTransferPayload payload = null;
        AsyncOperationResponse response = api.postCurrencyTransfer(payload);

        // TODO: test validations
    }
    
    /**
     * Create a token under your firm.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTokenTest() throws ApiException {
        TokenCreatePayload payload = null;
        TokenCreateResponse response = api.postToken(payload);

        // TODO: test validations
    }
    
    /**
     * Deploy a security token contract to blockchain.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTokenDeployTest() throws ApiException {
        TokenDeployPayload payload = null;
        AsyncOperationResponse response = api.postTokenDeploy(payload);

        // TODO: test validations
    }
    
    /**
     * Transfer tokens between wallets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTokenTransferTest() throws ApiException {
        TokenTransferPayload payload = null;
        AsyncOperationResponse response = api.postTokenTransfer(payload);

        // TODO: test validations
    }
    
    /**
     * Add an investor to a token&#39;s whitelist
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTokenWhitelistTest() throws ApiException {
        TokenWhitelistPayload payload = null;
        AsyncOperationResponse response = api.postTokenWhitelist(payload);

        // TODO: test validations
    }
    
    /**
     * Create a wallet under your firm.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postWalletTest() throws ApiException {
        WalletCreatePayload payload = null;
        WalletCreateResponse response = api.postWallet(payload);

        // TODO: test validations
    }
    
    /**
     * Associate an existing key pair with a wallet defined for your firm.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postWalletKeyTest() throws ApiException {
        WalletKeyCreatePayload payload = null;
        WalletKeyCreateResponse response = api.postWalletKey(payload);

        // TODO: test validations
    }
    
    /**
     * Generate a wallet key using the Key Service and associate with a wallet defined for your firm.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postWalletKeyGeneratorTest() throws ApiException {
        WalletKeyGeneratorPayload payload = null;
        WalletKeyCreateResponse response = api.postWalletKeyGenerator(payload);

        // TODO: test validations
    }
    
    /**
     * Create a webhook under your firm.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postWebhookTest() throws ApiException {
        WebhookCreatePayload payload = null;
        WebhookCreateResponse response = api.postWebhook(payload);

        // TODO: test validations
    }
    
    /**
     * Update a token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTokenTest() throws ApiException {
        UUID tokenId = null;
        TokenUpdatePayload payload = null;
        TokenSpecificResponse response = api.updateToken(tokenId, payload);

        // TODO: test validations
    }
    
    /**
     * Update a wallet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWalletTest() throws ApiException {
        UUID walletId = null;
        WalletUpdatePayload payload = null;
        WalletSpecificResponse response = api.updateWallet(walletId, payload);

        // TODO: test validations
    }
    
    /**
     * Update a webhook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWebhookTest() throws ApiException {
        UUID webhookId = null;
        WebhookUpdatePayload payload = null;
        WebhookSpecificResponse response = api.updateWebhook(webhookId, payload);

        // TODO: test validations
    }
    
}
