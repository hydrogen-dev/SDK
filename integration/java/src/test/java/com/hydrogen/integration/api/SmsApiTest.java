/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.api;

import com.hydrogen.integration.ApiException;
import com.hydrogen.integration.model.SMS;
import com.hydrogen.integration.model.SMSResponseVO;
import com.hydrogen.integration.model.SMSVO;
import org.junit.Ignore;
import org.junit.Test;

import java.util.UUID;

/**
 * API tests for SmsApi
 */
@Ignore
public class SmsApiTest {

    private final SmsApi api = new SmsApi();

    
    /**
     * Fetch details for corresponding sms_id
     *
     * Fetch details for corresponding sms_id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSmsStatusTest() throws ApiException {
        UUID smsId = null;
        SMS response = api.getSmsStatus(smsId);

        // TODO: test validations
    }
    
    /**
     * Send SMS to recipient
     *
     * Send SMS to recipient
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendMailTest() throws ApiException {
        SMSVO smsVO = null;
        SMSResponseVO response = api.sendMail(smsVO);

        // TODO: test validations
    }
    
}
