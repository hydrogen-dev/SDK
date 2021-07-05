/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.proton.api;

import com.hydrogen.proton.ApiCallback;
import com.hydrogen.proton.ApiResponse;
import com.hydrogen.proton.Configuration;
import com.hydrogen.proton.model.LifeInsuranceNeedsCalculatorRequest;
import com.hydrogen.proton.ApiClient;
import com.hydrogen.proton.ApiException;
import com.hydrogen.proton.Pair;
import com.hydrogen.proton.ProgressRequestBody;
import com.hydrogen.proton.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LifeInsuranceApi {
    private ApiClient apiClient;

    public LifeInsuranceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LifeInsuranceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for lifeInsuranceNeedsCalculator
     * @param lifeInsuranceNeedsCalculatorRequest Request payload for Life Insurance Needs Calculator (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call lifeInsuranceNeedsCalculatorCall(LifeInsuranceNeedsCalculatorRequest lifeInsuranceNeedsCalculatorRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = lifeInsuranceNeedsCalculatorRequest;

        // create path and map variables
        String localVarPath = "/life_insurance/needs_calculator";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call lifeInsuranceNeedsCalculatorValidateBeforeCall(LifeInsuranceNeedsCalculatorRequest lifeInsuranceNeedsCalculatorRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'lifeInsuranceNeedsCalculatorRequest' is set
        if (lifeInsuranceNeedsCalculatorRequest == null) {
            throw new ApiException("Missing the required parameter 'lifeInsuranceNeedsCalculatorRequest' when calling lifeInsuranceNeedsCalculator(Async)");
        }
        

        com.squareup.okhttp.Call call = lifeInsuranceNeedsCalculatorCall(lifeInsuranceNeedsCalculatorRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Life Insurance Needs Calculator
     * Calculate life insurance needs based on existing asset and liability data
     * @param lifeInsuranceNeedsCalculatorRequest Request payload for Life Insurance Needs Calculator (required)
     * @return Map&lt;String, Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Map<String, Object> lifeInsuranceNeedsCalculator(LifeInsuranceNeedsCalculatorRequest lifeInsuranceNeedsCalculatorRequest) throws ApiException {
        ApiResponse<Map<String, Object>> resp = lifeInsuranceNeedsCalculatorWithHttpInfo(lifeInsuranceNeedsCalculatorRequest);
        return resp.getData();
    }

    /**
     * Life Insurance Needs Calculator
     * Calculate life insurance needs based on existing asset and liability data
     * @param lifeInsuranceNeedsCalculatorRequest Request payload for Life Insurance Needs Calculator (required)
     * @return ApiResponse&lt;Map&lt;String, Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Map<String, Object>> lifeInsuranceNeedsCalculatorWithHttpInfo(LifeInsuranceNeedsCalculatorRequest lifeInsuranceNeedsCalculatorRequest) throws ApiException {
        com.squareup.okhttp.Call call = lifeInsuranceNeedsCalculatorValidateBeforeCall(lifeInsuranceNeedsCalculatorRequest, null, null);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Life Insurance Needs Calculator (asynchronously)
     * Calculate life insurance needs based on existing asset and liability data
     * @param lifeInsuranceNeedsCalculatorRequest Request payload for Life Insurance Needs Calculator (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call lifeInsuranceNeedsCalculatorAsync(LifeInsuranceNeedsCalculatorRequest lifeInsuranceNeedsCalculatorRequest, final ApiCallback<Map<String, Object>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = lifeInsuranceNeedsCalculatorValidateBeforeCall(lifeInsuranceNeedsCalculatorRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
