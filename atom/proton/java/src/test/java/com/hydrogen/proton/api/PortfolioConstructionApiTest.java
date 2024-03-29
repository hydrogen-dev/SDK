/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.proton.api;

import com.hydrogen.proton.ApiException;
import com.hydrogen.proton.model.MvoRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.Map;

/**
 * API tests for PortfolioConstructionApi
 */
@Ignore
public class PortfolioConstructionApiTest {

    private final PortfolioConstructionApi api = new PortfolioConstructionApi();

    
    /**
     * MVO
     *
     * Run a mean-variance optimization for a group of potential investments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mvoTest() throws ApiException {
        MvoRequest mvoRequest = null;
        Map<String, Object> response = api.mvo(mvoRequest);

        // TODO: test validations
    }
    
}
