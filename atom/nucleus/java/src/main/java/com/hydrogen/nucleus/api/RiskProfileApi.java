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

import com.hydrogen.nucleus.ApiCallback;
import com.hydrogen.nucleus.ApiClient;
import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.ApiResponse;
import com.hydrogen.nucleus.Configuration;
import com.hydrogen.nucleus.Pair;
import com.hydrogen.nucleus.ProgressRequestBody;
import com.hydrogen.nucleus.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.hydrogen.nucleus.model.PageRiskProfile;
import com.hydrogen.nucleus.model.RiskProfile;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RiskProfileApi {
    private ApiClient apiClient;

    public RiskProfileApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RiskProfileApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createRiskProfileUsingPost
     * @param riskProfile riskProfile (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createRiskProfileUsingPostCall(RiskProfile riskProfile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = riskProfile;

        // create path and map variables
        String localVarPath = "/nucleus/v1/risk_profile";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call createRiskProfileUsingPostValidateBeforeCall(RiskProfile riskProfile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'riskProfile' is set
        if (riskProfile == null) {
            throw new ApiException("Missing the required parameter 'riskProfile' when calling createRiskProfileUsingPost(Async)");
        }
        

        com.squareup.okhttp.Call call = createRiskProfileUsingPostCall(riskProfile, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a Risk Profile
     * Create a new Risk Profile. 
     * @param riskProfile riskProfile (required)
     * @return RiskProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RiskProfile createRiskProfileUsingPost(RiskProfile riskProfile) throws ApiException {
        ApiResponse<RiskProfile> resp = createRiskProfileUsingPostWithHttpInfo(riskProfile);
        return resp.getData();
    }

    /**
     * Create a Risk Profile
     * Create a new Risk Profile. 
     * @param riskProfile riskProfile (required)
     * @return ApiResponse&lt;RiskProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RiskProfile> createRiskProfileUsingPostWithHttpInfo(RiskProfile riskProfile) throws ApiException {
        com.squareup.okhttp.Call call = createRiskProfileUsingPostValidateBeforeCall(riskProfile, null, null);
        Type localVarReturnType = new TypeToken<RiskProfile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a Risk Profile (asynchronously)
     * Create a new Risk Profile. 
     * @param riskProfile riskProfile (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createRiskProfileUsingPostAsync(RiskProfile riskProfile, final ApiCallback<RiskProfile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createRiskProfileUsingPostValidateBeforeCall(riskProfile, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RiskProfile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteRiskProfileUsingDelete
     * @param riskProfileId UUID risk_profile_id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteRiskProfileUsingDeleteCall(UUID riskProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/nucleus/v1/risk_profile/{risk_profile_id}"
            .replaceAll("\\{" + "risk_profile_id" + "\\}", apiClient.escapeString(riskProfileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteRiskProfileUsingDeleteValidateBeforeCall(UUID riskProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'riskProfileId' is set
        if (riskProfileId == null) {
            throw new ApiException("Missing the required parameter 'riskProfileId' when calling deleteRiskProfileUsingDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteRiskProfileUsingDeleteCall(riskProfileId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a Risk Profile
     * Permanently Delete a Risk Profile.
     * @param riskProfileId UUID risk_profile_id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteRiskProfileUsingDelete(UUID riskProfileId) throws ApiException {
        deleteRiskProfileUsingDeleteWithHttpInfo(riskProfileId);
    }

    /**
     * Delete a Risk Profile
     * Permanently Delete a Risk Profile.
     * @param riskProfileId UUID risk_profile_id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteRiskProfileUsingDeleteWithHttpInfo(UUID riskProfileId) throws ApiException {
        com.squareup.okhttp.Call call = deleteRiskProfileUsingDeleteValidateBeforeCall(riskProfileId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a Risk Profile (asynchronously)
     * Permanently Delete a Risk Profile.
     * @param riskProfileId UUID risk_profile_id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteRiskProfileUsingDeleteAsync(UUID riskProfileId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteRiskProfileUsingDeleteValidateBeforeCall(riskProfileId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getRiskProfileAllUsingGet
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to update_date)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRiskProfileAllUsingGetCall(Boolean ascending, String filter, String orderBy, Integer page, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/nucleus/v1/risk_profile";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ascending != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ascending", ascending));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_by", orderBy));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRiskProfileAllUsingGetValidateBeforeCall(Boolean ascending, String filter, String orderBy, Integer page, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getRiskProfileAllUsingGetCall(ascending, filter, orderBy, page, size, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get All Risk Profile
     * Get All Risk Profile. 
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to update_date)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @return PageRiskProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageRiskProfile getRiskProfileAllUsingGet(Boolean ascending, String filter, String orderBy, Integer page, Integer size) throws ApiException {
        ApiResponse<PageRiskProfile> resp = getRiskProfileAllUsingGetWithHttpInfo(ascending, filter, orderBy, page, size);
        return resp.getData();
    }

    /**
     * Get All Risk Profile
     * Get All Risk Profile. 
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to update_date)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @return ApiResponse&lt;PageRiskProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageRiskProfile> getRiskProfileAllUsingGetWithHttpInfo(Boolean ascending, String filter, String orderBy, Integer page, Integer size) throws ApiException {
        com.squareup.okhttp.Call call = getRiskProfileAllUsingGetValidateBeforeCall(ascending, filter, orderBy, page, size, null, null);
        Type localVarReturnType = new TypeToken<PageRiskProfile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Risk Profile (asynchronously)
     * Get All Risk Profile. 
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to update_date)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRiskProfileAllUsingGetAsync(Boolean ascending, String filter, String orderBy, Integer page, Integer size, final ApiCallback<PageRiskProfile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRiskProfileAllUsingGetValidateBeforeCall(ascending, filter, orderBy, page, size, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageRiskProfile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRiskProfileUsingGet
     * @param riskProfileId UUID risk_profile_id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRiskProfileUsingGetCall(UUID riskProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/nucleus/v1/risk_profile/{risk_profile_id}"
            .replaceAll("\\{" + "risk_profile_id" + "\\}", apiClient.escapeString(riskProfileId.toString()));

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
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRiskProfileUsingGetValidateBeforeCall(UUID riskProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'riskProfileId' is set
        if (riskProfileId == null) {
            throw new ApiException("Missing the required parameter 'riskProfileId' when calling getRiskProfileUsingGet(Async)");
        }
        

        com.squareup.okhttp.Call call = getRiskProfileUsingGetCall(riskProfileId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Risk Profile
     * Get a Risk Profile. 
     * @param riskProfileId UUID risk_profile_id (required)
     * @return RiskProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RiskProfile getRiskProfileUsingGet(UUID riskProfileId) throws ApiException {
        ApiResponse<RiskProfile> resp = getRiskProfileUsingGetWithHttpInfo(riskProfileId);
        return resp.getData();
    }

    /**
     * Get a Risk Profile
     * Get a Risk Profile. 
     * @param riskProfileId UUID risk_profile_id (required)
     * @return ApiResponse&lt;RiskProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RiskProfile> getRiskProfileUsingGetWithHttpInfo(UUID riskProfileId) throws ApiException {
        com.squareup.okhttp.Call call = getRiskProfileUsingGetValidateBeforeCall(riskProfileId, null, null);
        Type localVarReturnType = new TypeToken<RiskProfile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Risk Profile (asynchronously)
     * Get a Risk Profile. 
     * @param riskProfileId UUID risk_profile_id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRiskProfileUsingGetAsync(UUID riskProfileId, final ApiCallback<RiskProfile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getRiskProfileUsingGetValidateBeforeCall(riskProfileId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RiskProfile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateRiskProfileUsingPut
     * @param riskProfile risk_profile (required)
     * @param riskProfileId UUID risk_profile_id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateRiskProfileUsingPutCall(Object riskProfile, UUID riskProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = riskProfile;

        // create path and map variables
        String localVarPath = "/nucleus/v1/risk_profile/{risk_profile_id}"
            .replaceAll("\\{" + "risk_profile_id" + "\\}", apiClient.escapeString(riskProfileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateRiskProfileUsingPutValidateBeforeCall(Object riskProfile, UUID riskProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'riskProfile' is set
        if (riskProfile == null) {
            throw new ApiException("Missing the required parameter 'riskProfile' when calling updateRiskProfileUsingPut(Async)");
        }
        
        // verify the required parameter 'riskProfileId' is set
        if (riskProfileId == null) {
            throw new ApiException("Missing the required parameter 'riskProfileId' when calling updateRiskProfileUsingPut(Async)");
        }
        

        com.squareup.okhttp.Call call = updateRiskProfileUsingPutCall(riskProfile, riskProfileId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a Risk Profile
     * Update a Risk Profile. 
     * @param riskProfile risk_profile (required)
     * @param riskProfileId UUID risk_profile_id (required)
     * @return RiskProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RiskProfile updateRiskProfileUsingPut(Object riskProfile, UUID riskProfileId) throws ApiException {
        ApiResponse<RiskProfile> resp = updateRiskProfileUsingPutWithHttpInfo(riskProfile, riskProfileId);
        return resp.getData();
    }

    /**
     * Update a Risk Profile
     * Update a Risk Profile. 
     * @param riskProfile risk_profile (required)
     * @param riskProfileId UUID risk_profile_id (required)
     * @return ApiResponse&lt;RiskProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RiskProfile> updateRiskProfileUsingPutWithHttpInfo(Object riskProfile, UUID riskProfileId) throws ApiException {
        com.squareup.okhttp.Call call = updateRiskProfileUsingPutValidateBeforeCall(riskProfile, riskProfileId, null, null);
        Type localVarReturnType = new TypeToken<RiskProfile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a Risk Profile (asynchronously)
     * Update a Risk Profile. 
     * @param riskProfile risk_profile (required)
     * @param riskProfileId UUID risk_profile_id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateRiskProfileUsingPutAsync(Object riskProfile, UUID riskProfileId, final ApiCallback<RiskProfile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateRiskProfileUsingPutValidateBeforeCall(riskProfile, riskProfileId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RiskProfile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
