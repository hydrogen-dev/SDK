/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.api;

import com.hydrogen.integration.model.CardAutoReloadResponseVO;
import com.hydrogen.integration.model.CardBalanceResponseVO;
import com.hydrogen.integration.model.CardBusinessRequestCO;
import com.hydrogen.integration.model.CardClientRequestCO;
import com.hydrogen.integration.model.CardLoadUnloadResponseVO;
import com.hydrogen.integration.model.CardPinRequestCO;
import com.hydrogen.integration.model.CardReserveAccountResponseVO;
import com.hydrogen.integration.model.CardReserveTransferRequestCO;
import com.hydrogen.integration.model.CardReserveTransferResponseVO;
import com.hydrogen.integration.model.CardSpendingControlResponseVO;
import com.hydrogen.integration.model.CardTokenResponseVO;
import com.hydrogen.integration.model.CardTransactionResponseVO;
import com.hydrogen.integration.model.CardUnloadRequestCO;
import com.hydrogen.integration.model.CardUpdatePinRequestCO;
import com.hydrogen.integration.model.CreateBusinessResponseVO;
import com.hydrogen.integration.model.GetCardImageResponseVO;
import com.hydrogen.integration.model.GetCardPciDetailsResponseVO;
import com.hydrogen.integration.model.GetCardStatementResponseVO;
import com.hydrogen.integration.model.GetCardTokenResponseVO;
import com.hydrogen.integration.model.UpdateCardClientResponseVO;
import com.hydrogen.integration.ApiException;
import com.hydrogen.integration.model.BaseResponseVO;
import com.hydrogen.integration.model.CardAutoReloadRequestCO;
import com.hydrogen.integration.model.CardBaseRequestCO;
import com.hydrogen.integration.model.CardLoadRequestCO;
import com.hydrogen.integration.model.CardReplaceResponseVO;
import com.hydrogen.integration.model.CardSpendingControlRequestCO;
import com.hydrogen.integration.model.CardTokenRequestCO;
import com.hydrogen.integration.model.CreateCardClientResponseVO;
import org.threeten.bp.LocalDate;
import java.util.UUID;
import com.hydrogen.integration.model.UpdateBusinessResponseVO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for CardApi
 */
@Ignore
public class CardApiTest {

    private final CardApi api = new CardApi();

    
    /**
     * Card auto reload
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAutoReloadUsingPostTest() throws ApiException {
        CardAutoReloadRequestCO request = null;
        CardAutoReloadResponseVO response = api.createAutoReloadUsingPost(request);

        // TODO: test validations
    }
    
    /**
     * Activate card
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardActivateUsingPostTest() throws ApiException {
        CardBaseRequestCO activateRequest = null;
        BaseResponseVO response = api.createCardActivateUsingPost(activateRequest);

        // TODO: test validations
    }
    
    /**
     * Create a card business
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardBusinessUsingPostTest() throws ApiException {
        CardBusinessRequestCO cardBusinessRequestCO = null;
        CreateBusinessResponseVO response = api.createCardBusinessUsingPost(cardBusinessRequestCO);

        // TODO: test validations
    }
    
    /**
     * close a card
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardCloseUsingPostTest() throws ApiException {
        CardBaseRequestCO closeRequest = null;
        BaseResponseVO response = api.createCardCloseUsingPost(closeRequest);

        // TODO: test validations
    }
    
    /**
     * issue a card
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardIssueUsingPostTest() throws ApiException {
        CardBaseRequestCO issueRequest = null;
        BaseResponseVO response = api.createCardIssueUsingPost(issueRequest);

        // TODO: test validations
    }
    
    /**
     * Create a card load
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardLoadUsingPostTest() throws ApiException {
        CardLoadRequestCO loadRequest = null;
        CardLoadUnloadResponseVO response = api.createCardLoadUsingPost(loadRequest);

        // TODO: test validations
    }
    
    /**
     * pin card
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardPinUsingPostTest() throws ApiException {
        CardPinRequestCO cardPinRequestCO = null;
        BaseResponseVO response = api.createCardPinUsingPost(cardPinRequestCO);

        // TODO: test validations
    }
    
    /**
     * reactivate card
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardReactivateUsingPostTest() throws ApiException {
        CardBaseRequestCO reactivateRequest = null;
        BaseResponseVO response = api.createCardReactivateUsingPost(reactivateRequest);

        // TODO: test validations
    }
    
    /**
     * Reissue a card
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardReissueUsingPostTest() throws ApiException {
        CardBaseRequestCO request = null;
        BaseResponseVO response = api.createCardReissueUsingPost(request);

        // TODO: test validations
    }
    
    /**
     * Create card replace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardReplaceUsingPostTest() throws ApiException {
        CardBaseRequestCO request = null;
        CardReplaceResponseVO response = api.createCardReplaceUsingPost(request);

        // TODO: test validations
    }
    
    /**
     * Card reserve transfer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardReserveTransferUsingPostTest() throws ApiException {
        CardReserveTransferRequestCO request = null;
        CardReserveTransferResponseVO response = api.createCardReserveTransferUsingPost(request);

        // TODO: test validations
    }
    
    /**
     * Create card spending control
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardSpendingControlUsingPostTest() throws ApiException {
        CardSpendingControlRequestCO request = null;
        CardSpendingControlResponseVO response = api.createCardSpendingControlUsingPost(request);

        // TODO: test validations
    }
    
    /**
     * suspend card
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardSuspendUsingPostTest() throws ApiException {
        CardBaseRequestCO suspendRequest = null;
        BaseResponseVO response = api.createCardSuspendUsingPost(suspendRequest);

        // TODO: test validations
    }
    
    /**
     * token card
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardTokenUsingPostTest() throws ApiException {
        CardTokenRequestCO tokenizeRequest = null;
        CardTokenResponseVO response = api.createCardTokenUsingPost(tokenizeRequest);

        // TODO: test validations
    }
    
    /**
     * Create a card upload
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCardUnloadUsingPostTest() throws ApiException {
        CardUnloadRequestCO reloadRequest = null;
        CardLoadUnloadResponseVO response = api.createCardUnloadUsingPost(reloadRequest);

        // TODO: test validations
    }
    
    /**
     * Create a card client
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createClientCardUsingPostTest() throws ApiException {
        CardClientRequestCO cardClientRequestCO = null;
        CreateCardClientResponseVO response = api.createClientCardUsingPost(cardClientRequestCO);

        // TODO: test validations
    }
    
    /**
     * Get a business status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBusinessStatusUsingGetTest() throws ApiException {
        UUID nucleusBusinessId = null;
        BaseResponseVO response = api.getBusinessStatusUsingGet(nucleusBusinessId);

        // TODO: test validations
    }
    
    /**
     * Get a Card Balance
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCardBalanceUsingGetTest() throws ApiException {
        UUID id = null;
        LocalDate endDate = null;
        LocalDate startDate = null;
        CardBalanceResponseVO response = api.getCardBalanceUsingGet(id, endDate, startDate);

        // TODO: test validations
    }
    
    /**
     * Get card image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCardImageTest() throws ApiException {
        UUID cardId = null;
        GetCardImageResponseVO response = api.getCardImage(cardId);

        // TODO: test validations
    }
    
    /**
     * Get card pci details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCardPciDetailsTest() throws ApiException {
        UUID cardId = null;
        GetCardPciDetailsResponseVO response = api.getCardPciDetails(cardId);

        // TODO: test validations
    }
    
    /**
     * Card reserve account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCardReserveAccountDetailsUsingGetTest() throws ApiException {
        CardReserveAccountResponseVO response = api.getCardReserveAccountDetailsUsingGet();

        // TODO: test validations
    }
    
    /**
     * Get card statement
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCardStatementUsingGetTest() throws ApiException {
        UUID cardId = null;
        LocalDate endDate = null;
        LocalDate startDate = null;
        GetCardStatementResponseVO response = api.getCardStatementUsingGet(cardId, endDate, startDate);

        // TODO: test validations
    }
    
    /**
     * Get a card token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCardTokenUsingTokenTest() throws ApiException {
        UUID id = null;
        String deviceId = null;
        String deviceType = null;
        String wallet = null;
        List<GetCardTokenResponseVO> response = api.getCardTokenUsingToken(id, deviceId, deviceType, wallet);

        // TODO: test validations
    }
    
    /**
     * Get a card transaction
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCardTransactionUsingGetTest() throws ApiException {
        UUID id = null;
        LocalDate endDate = null;
        LocalDate startDate = null;
        CardTransactionResponseVO response = api.getCardTransactionUsingGet(id, endDate, startDate);

        // TODO: test validations
    }
    
    /**
     * Get a card information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCardUsingGetTest() throws ApiException {
        UUID id = null;
        BaseResponseVO response = api.getCardUsingGet(id);

        // TODO: test validations
    }
    
    /**
     * Update a card business
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCardBusinessUsingPutTest() throws ApiException {
        UUID nucleusBusinessId = null;
        UpdateBusinessResponseVO response = api.updateCardBusinessUsingPut(nucleusBusinessId);

        // TODO: test validations
    }
    
    /**
     * update a pin card
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCardPinUsingPostTest() throws ApiException {
        CardUpdatePinRequestCO cardPinRequestCO = null;
        UUID id = null;
        BaseResponseVO response = api.updateCardPinUsingPost(cardPinRequestCO, id);

        // TODO: test validations
    }
    
    /**
     * Update a card spending control
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCardSpendingControlUsingPutTest() throws ApiException {
        UUID nucleusSpendingControlId = null;
        CardSpendingControlResponseVO response = api.updateCardSpendingControlUsingPut(nucleusSpendingControlId);

        // TODO: test validations
    }
    
    /**
     * Update a card information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCardUsingPutTest() throws ApiException {
        UUID id = null;
        BaseResponseVO response = api.updateCardUsingPut(id);

        // TODO: test validations
    }
    
    /**
     * Update a card client
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateClientCardUsingPutTest() throws ApiException {
        UUID id = null;
        UpdateCardClientResponseVO response = api.updateClientCardUsingPut(id);

        // TODO: test validations
    }
    
    /**
     * verify card pin
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyCardPinUsingPostTest() throws ApiException {
        CardPinRequestCO cardPinRequestCO = null;
        BaseResponseVO response = api.verifyCardPinUsingPost(cardPinRequestCO);

        // TODO: test validations
    }
    
}
