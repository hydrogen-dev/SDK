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

import com.hydrogen.integration.ApiClient;
import com.hydrogen.integration.ApiException;
import com.hydrogen.integration.ApiResponse;
import com.hydrogen.integration.Pair;
import com.hydrogen.integration.ProgressResponseBody;
import com.hydrogen.integration.model.AsyncTransaction;
import com.hydrogen.integration.model.AsyncTransactionVO;
import com.hydrogen.integration.ApiCallback;
import com.hydrogen.integration.Configuration;
import com.hydrogen.integration.ProgressRequestBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AsyncApi {
    private ApiClient apiClient;

    public AsyncApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AsyncApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAsyncData
     * @param integrationType String integration_type (required)
     * @param service String service (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAsyncDataCall(String integrationType, String service, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/async/{integration_type}/{service}"
            .replaceAll("\\{" + "integration_type" + "\\}", apiClient.escapeString(integrationType.toString()))
            .replaceAll("\\{" + "service" + "\\}", apiClient.escapeString(service.toString()));

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
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call getAsyncDataValidateBeforeCall(String integrationType, String service, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'integrationType' is set
        if (integrationType == null) {
            throw new ApiException("Missing the required parameter 'integrationType' when calling getAsyncData(Async)");
        }
        
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new ApiException("Missing the required parameter 'service' when calling getAsyncData(Async)");
        }
        

        com.squareup.okhttp.Call call = getAsyncDataCall(integrationType, service, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create async transaction for GET endpoints for bulk data
     * Create async transaction for GET endpoints for bulk data
     * @param integrationType String integration_type (required)
     * @param service String service (required)
     * @return AsyncTransaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsyncTransaction getAsyncData(String integrationType, String service) throws ApiException {
        ApiResponse<AsyncTransaction> resp = getAsyncDataWithHttpInfo(integrationType, service);
        return resp.getData();
    }

    /**
     * Create async transaction for GET endpoints for bulk data
     * Create async transaction for GET endpoints for bulk data
     * @param integrationType String integration_type (required)
     * @param service String service (required)
     * @return ApiResponse&lt;AsyncTransaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AsyncTransaction> getAsyncDataWithHttpInfo(String integrationType, String service) throws ApiException {
        com.squareup.okhttp.Call call = getAsyncDataValidateBeforeCall(integrationType, service, null, null);
        Type localVarReturnType = new TypeToken<AsyncTransaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create async transaction for GET endpoints for bulk data (asynchronously)
     * Create async transaction for GET endpoints for bulk data
     * @param integrationType String integration_type (required)
     * @param service String service (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAsyncDataAsync(String integrationType, String service, final ApiCallback<AsyncTransaction> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAsyncDataValidateBeforeCall(integrationType, service, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsyncTransaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAsyncData2
     * @param data data (required)
     * @param integrationType String integration_type (required)
     * @param service String service (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAsyncData2Call(Object data, String integrationType, String service, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;

        // create path and map variables
        String localVarPath = "/async/{integration_type}/{service}"
            .replaceAll("\\{" + "integration_type" + "\\}", apiClient.escapeString(integrationType.toString()))
            .replaceAll("\\{" + "service" + "\\}", apiClient.escapeString(service.toString()));

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
    private com.squareup.okhttp.Call getAsyncData2ValidateBeforeCall(Object data, String integrationType, String service, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling getAsyncData2(Async)");
        }
        
        // verify the required parameter 'integrationType' is set
        if (integrationType == null) {
            throw new ApiException("Missing the required parameter 'integrationType' when calling getAsyncData2(Async)");
        }
        
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new ApiException("Missing the required parameter 'service' when calling getAsyncData2(Async)");
        }
        

        com.squareup.okhttp.Call call = getAsyncData2Call(data, integrationType, service, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create async transaction for POST endpoints for bulk data
     * Create async transaction for POST endpoints for bulk data
     * @param data data (required)
     * @param integrationType String integration_type (required)
     * @param service String service (required)
     * @return AsyncTransaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsyncTransaction getAsyncData2(Object data, String integrationType, String service) throws ApiException {
        ApiResponse<AsyncTransaction> resp = getAsyncData2WithHttpInfo(data, integrationType, service);
        return resp.getData();
    }

    /**
     * Create async transaction for POST endpoints for bulk data
     * Create async transaction for POST endpoints for bulk data
     * @param data data (required)
     * @param integrationType String integration_type (required)
     * @param service String service (required)
     * @return ApiResponse&lt;AsyncTransaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AsyncTransaction> getAsyncData2WithHttpInfo(Object data, String integrationType, String service) throws ApiException {
        com.squareup.okhttp.Call call = getAsyncData2ValidateBeforeCall(data, integrationType, service, null, null);
        Type localVarReturnType = new TypeToken<AsyncTransaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create async transaction for POST endpoints for bulk data (asynchronously)
     * Create async transaction for POST endpoints for bulk data
     * @param data data (required)
     * @param integrationType String integration_type (required)
     * @param service String service (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAsyncData2Async(Object data, String integrationType, String service, final ApiCallback<AsyncTransaction> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAsyncData2ValidateBeforeCall(data, integrationType, service, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsyncTransaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAsyncDataById
     * @param id UUID id (required)
     * @param integrationType String integration_type (required)
     * @param service String service (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAsyncDataByIdCall(UUID id, String integrationType, String service, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/async/{integration_type}/{service}/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "integration_type" + "\\}", apiClient.escapeString(integrationType.toString()))
            .replaceAll("\\{" + "service" + "\\}", apiClient.escapeString(service.toString()));

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
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call getAsyncDataByIdValidateBeforeCall(UUID id, String integrationType, String service, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAsyncDataById(Async)");
        }
        
        // verify the required parameter 'integrationType' is set
        if (integrationType == null) {
            throw new ApiException("Missing the required parameter 'integrationType' when calling getAsyncDataById(Async)");
        }
        
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new ApiException("Missing the required parameter 'service' when calling getAsyncDataById(Async)");
        }
        

        com.squareup.okhttp.Call call = getAsyncDataByIdCall(id, integrationType, service, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create async transaction for GET endpoints for bulk data
     * Create async transaction for GET endpoints for bulk data
     * @param id UUID id (required)
     * @param integrationType String integration_type (required)
     * @param service String service (required)
     * @return AsyncTransaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsyncTransaction getAsyncDataById(UUID id, String integrationType, String service) throws ApiException {
        ApiResponse<AsyncTransaction> resp = getAsyncDataByIdWithHttpInfo(id, integrationType, service);
        return resp.getData();
    }

    /**
     * Create async transaction for GET endpoints for bulk data
     * Create async transaction for GET endpoints for bulk data
     * @param id UUID id (required)
     * @param integrationType String integration_type (required)
     * @param service String service (required)
     * @return ApiResponse&lt;AsyncTransaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AsyncTransaction> getAsyncDataByIdWithHttpInfo(UUID id, String integrationType, String service) throws ApiException {
        com.squareup.okhttp.Call call = getAsyncDataByIdValidateBeforeCall(id, integrationType, service, null, null);
        Type localVarReturnType = new TypeToken<AsyncTransaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create async transaction for GET endpoints for bulk data (asynchronously)
     * Create async transaction for GET endpoints for bulk data
     * @param id UUID id (required)
     * @param integrationType String integration_type (required)
     * @param service String service (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAsyncDataByIdAsync(UUID id, String integrationType, String service, final ApiCallback<AsyncTransaction> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAsyncDataByIdValidateBeforeCall(id, integrationType, service, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsyncTransaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAsyncStatus
     * @param id UUID Async Transaction Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAsyncStatusCall(UUID id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/async/status/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call getAsyncStatusValidateBeforeCall(UUID id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAsyncStatus(Async)");
        }
        

        com.squareup.okhttp.Call call = getAsyncStatusCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Status of async transaction created through GET/POST endpoints
     * Get Status of async transaction created through GET/POST endpoints
     * @param id UUID Async Transaction Id (required)
     * @return AsyncTransactionVO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsyncTransactionVO getAsyncStatus(UUID id) throws ApiException {
        ApiResponse<AsyncTransactionVO> resp = getAsyncStatusWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Status of async transaction created through GET/POST endpoints
     * Get Status of async transaction created through GET/POST endpoints
     * @param id UUID Async Transaction Id (required)
     * @return ApiResponse&lt;AsyncTransactionVO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AsyncTransactionVO> getAsyncStatusWithHttpInfo(UUID id) throws ApiException {
        com.squareup.okhttp.Call call = getAsyncStatusValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<AsyncTransactionVO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Status of async transaction created through GET/POST endpoints (asynchronously)
     * Get Status of async transaction created through GET/POST endpoints
     * @param id UUID Async Transaction Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAsyncStatusAsync(UUID id, final ApiCallback<AsyncTransactionVO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAsyncStatusValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsyncTransactionVO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
