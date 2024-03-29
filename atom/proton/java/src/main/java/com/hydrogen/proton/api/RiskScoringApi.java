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

import com.hydrogen.proton.ApiCallback;
import com.hydrogen.proton.ApiResponse;
import com.hydrogen.proton.Configuration;
import com.hydrogen.proton.model.DimensionalRiskScoreRequest;
import com.hydrogen.proton.model.RiskAllocationRequest;
import com.hydrogen.proton.model.RiskScoreRequest;
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

public class RiskScoringApi {
    private ApiClient apiClient;

    public RiskScoringApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RiskScoringApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for dimensionalRiskScore
     * @param dimensionalRiskScoreRequest Request payload for Dimensional Risk Score (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dimensionalRiskScoreCall(DimensionalRiskScoreRequest dimensionalRiskScoreRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = dimensionalRiskScoreRequest;

        // create path and map variables
        String localVarPath = "/dimensional_risk_score";

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
    private com.squareup.okhttp.Call dimensionalRiskScoreValidateBeforeCall(DimensionalRiskScoreRequest dimensionalRiskScoreRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dimensionalRiskScoreRequest' is set
        if (dimensionalRiskScoreRequest == null) {
            throw new ApiException("Missing the required parameter 'dimensionalRiskScoreRequest' when calling dimensionalRiskScore(Async)");
        }
        

        com.squareup.okhttp.Call call = dimensionalRiskScoreCall(dimensionalRiskScoreRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Dimensional Risk Score
     * Calculate a dimensional risk score based on questionnaire responses
     * @param dimensionalRiskScoreRequest Request payload for Dimensional Risk Score (required)
     * @return Map&lt;String, Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Map<String, Object> dimensionalRiskScore(DimensionalRiskScoreRequest dimensionalRiskScoreRequest) throws ApiException {
        ApiResponse<Map<String, Object>> resp = dimensionalRiskScoreWithHttpInfo(dimensionalRiskScoreRequest);
        return resp.getData();
    }

    /**
     * Dimensional Risk Score
     * Calculate a dimensional risk score based on questionnaire responses
     * @param dimensionalRiskScoreRequest Request payload for Dimensional Risk Score (required)
     * @return ApiResponse&lt;Map&lt;String, Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Map<String, Object>> dimensionalRiskScoreWithHttpInfo(DimensionalRiskScoreRequest dimensionalRiskScoreRequest) throws ApiException {
        com.squareup.okhttp.Call call = dimensionalRiskScoreValidateBeforeCall(dimensionalRiskScoreRequest, null, null);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Dimensional Risk Score (asynchronously)
     * Calculate a dimensional risk score based on questionnaire responses
     * @param dimensionalRiskScoreRequest Request payload for Dimensional Risk Score (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dimensionalRiskScoreAsync(DimensionalRiskScoreRequest dimensionalRiskScoreRequest, final ApiCallback<Map<String, Object>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dimensionalRiskScoreValidateBeforeCall(dimensionalRiskScoreRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for riskAllocation
     * @param riskAllocationRequest Request payload for Risk Allocation (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call riskAllocationCall(RiskAllocationRequest riskAllocationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = riskAllocationRequest;

        // create path and map variables
        String localVarPath = "/risk_allocation";

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
    private com.squareup.okhttp.Call riskAllocationValidateBeforeCall(RiskAllocationRequest riskAllocationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'riskAllocationRequest' is set
        if (riskAllocationRequest == null) {
            throw new ApiException("Missing the required parameter 'riskAllocationRequest' when calling riskAllocation(Async)");
        }
        

        com.squareup.okhttp.Call call = riskAllocationCall(riskAllocationRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Risk Allocation
     * Allocate based on a risk score
     * @param riskAllocationRequest Request payload for Risk Allocation (required)
     * @return Map&lt;String, Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Map<String, Object> riskAllocation(RiskAllocationRequest riskAllocationRequest) throws ApiException {
        ApiResponse<Map<String, Object>> resp = riskAllocationWithHttpInfo(riskAllocationRequest);
        return resp.getData();
    }

    /**
     * Risk Allocation
     * Allocate based on a risk score
     * @param riskAllocationRequest Request payload for Risk Allocation (required)
     * @return ApiResponse&lt;Map&lt;String, Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Map<String, Object>> riskAllocationWithHttpInfo(RiskAllocationRequest riskAllocationRequest) throws ApiException {
        com.squareup.okhttp.Call call = riskAllocationValidateBeforeCall(riskAllocationRequest, null, null);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Risk Allocation (asynchronously)
     * Allocate based on a risk score
     * @param riskAllocationRequest Request payload for Risk Allocation (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call riskAllocationAsync(RiskAllocationRequest riskAllocationRequest, final ApiCallback<Map<String, Object>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = riskAllocationValidateBeforeCall(riskAllocationRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for riskScore
     * @param riskScoreRequest Request payload for Risk Score (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call riskScoreCall(RiskScoreRequest riskScoreRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = riskScoreRequest;

        // create path and map variables
        String localVarPath = "/risk_score";

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
    private com.squareup.okhttp.Call riskScoreValidateBeforeCall(RiskScoreRequest riskScoreRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'riskScoreRequest' is set
        if (riskScoreRequest == null) {
            throw new ApiException("Missing the required parameter 'riskScoreRequest' when calling riskScore(Async)");
        }
        

        com.squareup.okhttp.Call call = riskScoreCall(riskScoreRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Risk Score
     * Calculate a risk score based on questionnaire responses
     * @param riskScoreRequest Request payload for Risk Score (required)
     * @return Map&lt;String, Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Map<String, Object> riskScore(RiskScoreRequest riskScoreRequest) throws ApiException {
        ApiResponse<Map<String, Object>> resp = riskScoreWithHttpInfo(riskScoreRequest);
        return resp.getData();
    }

    /**
     * Risk Score
     * Calculate a risk score based on questionnaire responses
     * @param riskScoreRequest Request payload for Risk Score (required)
     * @return ApiResponse&lt;Map&lt;String, Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Map<String, Object>> riskScoreWithHttpInfo(RiskScoreRequest riskScoreRequest) throws ApiException {
        com.squareup.okhttp.Call call = riskScoreValidateBeforeCall(riskScoreRequest, null, null);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Risk Score (asynchronously)
     * Calculate a risk score based on questionnaire responses
     * @param riskScoreRequest Request payload for Risk Score (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call riskScoreAsync(RiskScoreRequest riskScoreRequest, final ApiCallback<Map<String, Object>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = riskScoreValidateBeforeCall(riskScoreRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Map<String, Object>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
