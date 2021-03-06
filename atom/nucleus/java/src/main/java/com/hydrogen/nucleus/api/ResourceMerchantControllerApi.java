/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.ApiClient;
import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.ApiResponse;
import com.hydrogen.nucleus.Configuration;
import com.hydrogen.nucleus.Pair;
import com.hydrogen.nucleus.ProgressResponseBody;
import com.hydrogen.nucleus.model.MXMerchantRes;
import com.hydrogen.nucleus.model.PageMXMerchantRes;
import com.hydrogen.nucleus.ApiCallback;
import com.hydrogen.nucleus.ProgressRequestBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourceMerchantControllerApi {
    private ApiClient apiClient;

    public ResourceMerchantControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ResourceMerchantControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllMerchantsUsingGET
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to id)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllMerchantsUsingGETCall(Boolean ascending, String filter, String orderBy, Integer page, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/resource/merchant";

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
    private com.squareup.okhttp.Call getAllMerchantsUsingGETValidateBeforeCall(Boolean ascending, String filter, String orderBy, Integer page, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllMerchantsUsingGETCall(ascending, filter, orderBy, page, size, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getAllMerchants
     * 
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to id)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @return PageMXMerchantRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageMXMerchantRes getAllMerchantsUsingGET(Boolean ascending, String filter, String orderBy, Integer page, Integer size) throws ApiException {
        ApiResponse<PageMXMerchantRes> resp = getAllMerchantsUsingGETWithHttpInfo(ascending, filter, orderBy, page, size);
        return resp.getData();
    }

    /**
     * getAllMerchants
     * 
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to id)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @return ApiResponse&lt;PageMXMerchantRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageMXMerchantRes> getAllMerchantsUsingGETWithHttpInfo(Boolean ascending, String filter, String orderBy, Integer page, Integer size) throws ApiException {
        com.squareup.okhttp.Call call = getAllMerchantsUsingGETValidateBeforeCall(ascending, filter, orderBy, page, size, null, null);
        Type localVarReturnType = new TypeToken<PageMXMerchantRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getAllMerchants (asynchronously)
     * 
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to id)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllMerchantsUsingGETAsync(Boolean ascending, String filter, String orderBy, Integer page, Integer size, final ApiCallback<PageMXMerchantRes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllMerchantsUsingGETValidateBeforeCall(ascending, filter, orderBy, page, size, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageMXMerchantRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for saveMerchantsUsingPOST
     * @param merchants merchants (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call saveMerchantsUsingPOSTCall(List<MXMerchantRes> merchants, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = merchants;

        // create path and map variables
        String localVarPath = "/resource/merchant";

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
    private com.squareup.okhttp.Call saveMerchantsUsingPOSTValidateBeforeCall(List<MXMerchantRes> merchants, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'merchants' is set
        if (merchants == null) {
            throw new ApiException("Missing the required parameter 'merchants' when calling saveMerchantsUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = saveMerchantsUsingPOSTCall(merchants, progressListener, progressRequestListener);
        return call;

    }

    /**
     * saveMerchants
     * 
     * @param merchants merchants (required)
     * @return List&lt;MXMerchantRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MXMerchantRes> saveMerchantsUsingPOST(List<MXMerchantRes> merchants) throws ApiException {
        ApiResponse<List<MXMerchantRes>> resp = saveMerchantsUsingPOSTWithHttpInfo(merchants);
        return resp.getData();
    }

    /**
     * saveMerchants
     * 
     * @param merchants merchants (required)
     * @return ApiResponse&lt;List&lt;MXMerchantRes&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MXMerchantRes>> saveMerchantsUsingPOSTWithHttpInfo(List<MXMerchantRes> merchants) throws ApiException {
        com.squareup.okhttp.Call call = saveMerchantsUsingPOSTValidateBeforeCall(merchants, null, null);
        Type localVarReturnType = new TypeToken<List<MXMerchantRes>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * saveMerchants (asynchronously)
     * 
     * @param merchants merchants (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call saveMerchantsUsingPOSTAsync(List<MXMerchantRes> merchants, final ApiCallback<List<MXMerchantRes>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = saveMerchantsUsingPOSTValidateBeforeCall(merchants, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MXMerchantRes>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
