/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.model.PageWebhook;
import java.util.UUID;
import com.hydrogen.nucleus.model.Webhook;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhookApi
 */
@Ignore
public class WebhookApiTest {

    private final WebhookApi api = new WebhookApi();

    
    /**
     * Create a webhook
     *
     * One active webhook service is allowed at all times.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createWebhookUsingPostTest() throws ApiException {
        Webhook webhookRequest = null;
        Webhook response = api.createWebhookUsingPost(webhookRequest);

        // TODO: test validations
    }
    
    /**
     * Delete a webhook
     *
     * Permanently delete a webhook for your firm. The webhook_id must be provided.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWebhookUsingDeleteTest() throws ApiException {
        UUID webhookId = null;
        api.deleteWebhookUsingDelete(webhookId);

        // TODO: test validations
    }
    
    /**
     * List all webhooks
     *
     * Get information for all webhooks defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageWebhook response = api.getWebhookAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a webhook
     *
     * Retrieve the information for a specific webhook. The webhook_id must be provided.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWebhookUsingGetTest() throws ApiException {
        UUID webhookId = null;
        Webhook response = api.getWebhookUsingGet(webhookId);

        // TODO: test validations
    }
    
    /**
     * Update a webhook
     *
     * Update a webhook for your firm. The webhook_id must be provided
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWebhookUsingPutTest() throws ApiException {
        Object webhook = null;
        UUID webhookId = null;
        Webhook response = api.updateWebhookUsingPut(webhook, webhookId);

        // TODO: test validations
    }
    
}
