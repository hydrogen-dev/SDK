/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.model.Model;
import com.hydrogen.nucleus.model.ModelAssetSize;
import com.hydrogen.nucleus.model.ModelComment;
import com.hydrogen.nucleus.model.ModelHolding;
import com.hydrogen.nucleus.model.ModelTransaction;
import com.hydrogen.nucleus.model.OrderReconcileRequest;
import com.hydrogen.nucleus.model.PageModel;
import com.hydrogen.nucleus.model.PageModelAssetSize;
import com.hydrogen.nucleus.model.PageModelComment;
import com.hydrogen.nucleus.model.PageModelHolding;
import com.hydrogen.nucleus.model.PageModelTransaction;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModelApi
 */
@Ignore
public class ModelApiTest {

    private final ModelApi api = new ModelApi();

    
    /**
     * Create a model asset size
     *
     * Create a new asset size record for a model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createModelAssetSizeUsingPostTest() throws ApiException {
        ModelAssetSize req = null;
        ModelAssetSize response = api.createModelAssetSizeUsingPost(req);

        // TODO: test validations
    }
    
    /**
     * Change a model composition
     *
     * Model composition changes represent a change in a model’s holdings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createModelChangeUsingPostTest() throws ApiException {
        OrderReconcileRequest changeRequest = null;
        UUID modelId = null;
        List<ModelTransaction> response = api.createModelChangeUsingPost(changeRequest, modelId);

        // TODO: test validations
    }
    
    /**
     * Create a model commentary
     *
     * Create a new comment for a model available for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createModelCommentUsingPostTest() throws ApiException {
        ModelComment modelCommentRequest = null;
        ModelComment response = api.createModelCommentUsingPost(modelCommentRequest);

        // TODO: test validations
    }
    
    /**
     * Create a model holding
     *
     * Create a new model holding record for a specific model and date.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createModelHoldingUsingPostTest() throws ApiException {
        ModelHolding modelHoldingRequest = null;
        ModelHolding response = api.createModelHoldingUsingPost(modelHoldingRequest);

        // TODO: test validations
    }
    
    /**
     * Create a model transaction
     *
     * Create a new transaction record for a security under a model for a specific date.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createModelTransactionUsingPostTest() throws ApiException {
        ModelTransaction modelTransactionRequest = null;
        ModelTransaction response = api.createModelTransactionUsingPost(modelTransactionRequest);

        // TODO: test validations
    }
    
    /**
     * Create a model
     *
     * Create a new model for your firm to which a portfolios can later subscribe.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createModelUsingPostTest() throws ApiException {
        Model modelInfoRequest = null;
        Model response = api.createModelUsingPost(modelInfoRequest);

        // TODO: test validations
    }
    
    /**
     * Delete a model asset size
     *
     * Permanently delete a model asset size record for a model. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteModelAssetSizeUsingDeleteTest() throws ApiException {
        UUID modelAssetSizeId = null;
        api.deleteModelAssetSizeUsingDelete(modelAssetSizeId);

        // TODO: test validations
    }
    
    /**
     * Delete a model commentary
     *
     * Permanently delete a model comment for a model
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteModelCommentUsingDeleteTest() throws ApiException {
        UUID modelCommentId = null;
        api.deleteModelCommentUsingDelete(modelCommentId);

        // TODO: test validations
    }
    
    /**
     * Delete a model holding
     *
     * Permanently delete a model holding record for a model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteModelHoldingUsingDeleteTest() throws ApiException {
        UUID modelHoldingId = null;
        api.deleteModelHoldingUsingDelete(modelHoldingId);

        // TODO: test validations
    }
    
    /**
     * Delete a model transaction
     *
     * Permanently delete a model transaction for a model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteModelTransactionUsingDeleteTest() throws ApiException {
        UUID modelTransactionId = null;
        api.deleteModelTransactionUsingDelete(modelTransactionId);

        // TODO: test validations
    }
    
    /**
     * Delete a model
     *
     * Permanently delete a model for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteModelUsingDeleteTest() throws ApiException {
        UUID modelId = null;
        api.deleteModelUsingDelete(modelId);

        // TODO: test validations
    }
    
    /**
     * List all models
     *
     * Get details for all models defined for your firm to which portfolios can subscribe.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageModel response = api.getModelAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * List all model asset sizes
     *
     * Get a list of asset sizes per date for all models defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelAssetSizeAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String currencyConversion = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageModelAssetSize response = api.getModelAssetSizeAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a model asset size
     *
     * Retrieve the information for a model asset size record for a model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelAssetSizeUsingGetTest() throws ApiException {
        UUID modelAssetSizeId = null;
        String currencyConversion = null;
        ModelAssetSize response = api.getModelAssetSizeUsingGet(modelAssetSizeId, currencyConversion);

        // TODO: test validations
    }
    
    /**
     * List all model commentaries
     *
     * List all comments for all models defined by your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelCommentAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageModelComment response = api.getModelCommentAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a model commentary
     *
     * Retrieve the information for a model comment for a model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelCommentUsingGetTest() throws ApiException {
        UUID modelCommentId = null;
        ModelComment response = api.getModelCommentUsingGet(modelCommentId);

        // TODO: test validations
    }
    
    /**
     * List all model holdings
     *
     * Get all model holding records for all models defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelHoldingAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageModelHolding response = api.getModelHoldingAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a model holding
     *
     * Retrieve the information for a model holding record for a model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelHoldingUsingGetTest() throws ApiException {
        UUID modelHoldingId = null;
        ModelHolding response = api.getModelHoldingUsingGet(modelHoldingId);

        // TODO: test validations
    }
    
    /**
     * List all model transactions
     *
     * Get details for all transaction records for all models defined by your firm. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelTransactionAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageModelTransaction response = api.getModelTransactionAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a model transaction
     *
     * Retrieve the information for a model transaction for a model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelTransactionUsingGetTest() throws ApiException {
        UUID modelTransactionId = null;
        ModelTransaction response = api.getModelTransactionUsingGet(modelTransactionId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a model
     *
     * Get the information for a model for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelUsingGetTest() throws ApiException {
        UUID modelId = null;
        Model response = api.getModelUsingGet(modelId);

        // TODO: test validations
    }
    
    /**
     * Update a model asset size
     *
     * Update a model asset size record for a model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateModelAssetSizeUsingPutTest() throws ApiException {
        Object modelAssetSize = null;
        UUID modelAssetSizeId = null;
        ModelAssetSize response = api.updateModelAssetSizeUsingPut(modelAssetSize, modelAssetSizeId);

        // TODO: test validations
    }
    
    /**
     * Update a model commentary
     *
     * Update a model comment for a model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateModelCommentUsingPutTest() throws ApiException {
        Object modelComment = null;
        UUID modelCommentId = null;
        ModelComment response = api.updateModelCommentUsingPut(modelComment, modelCommentId);

        // TODO: test validations
    }
    
    /**
     * Update a model holding
     *
     * Update a model holding record for a model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateModelHoldingUsingPutTest() throws ApiException {
        Object modelHolding = null;
        UUID modelHoldingId = null;
        ModelHolding response = api.updateModelHoldingUsingPut(modelHolding, modelHoldingId);

        // TODO: test validations
    }
    
    /**
     * Update a model transaction
     *
     * Update a model transaction for a model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateModelTransactionUsingPutTest() throws ApiException {
        Object modelTransaction = null;
        UUID modelTransactionId = null;
        ModelTransaction response = api.updateModelTransactionUsingPut(modelTransaction, modelTransactionId);

        // TODO: test validations
    }
    
    /**
     * Update a model
     *
     * Update a model for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateModelUsingPutTest() throws ApiException {
        Object model = null;
        UUID modelId = null;
        Model response = api.updateModelUsingPut(model, modelId);

        // TODO: test validations
    }
    
}
