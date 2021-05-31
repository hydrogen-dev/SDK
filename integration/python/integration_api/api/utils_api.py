# coding: utf-8

"""
    Hydrogen Integration API

    The Hydrogen Integration API  # noqa: E501

    OpenAPI spec version: 1.3.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from integration_api.api_client import ApiClient


class UtilsApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def create_token_exchange_using_post(self, exchange_token_co, **kwargs):  # noqa: E501
        """Retrieve token based on certain vendor specific value  # noqa: E501

        Retrieve the token.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_token_exchange_using_post(exchange_token_co, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ExchangeTokenCO exchange_token_co: exchangeTokenCO (required)
        :return: ExchangePublicTokenVO
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_token_exchange_using_post_with_http_info(exchange_token_co, **kwargs)  # noqa: E501
        else:
            (data) = self.create_token_exchange_using_post_with_http_info(exchange_token_co, **kwargs)  # noqa: E501
            return data

    def create_token_exchange_using_post_with_http_info(self, exchange_token_co, **kwargs):  # noqa: E501
        """Retrieve token based on certain vendor specific value  # noqa: E501

        Retrieve the token.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_token_exchange_using_post_with_http_info(exchange_token_co, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ExchangeTokenCO exchange_token_co: exchangeTokenCO (required)
        :return: ExchangePublicTokenVO
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['exchange_token_co']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_token_exchange_using_post" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'exchange_token_co' is set
        if self.api_client.client_side_validation and ('exchange_token_co' not in params or
                                                       params['exchange_token_co'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `exchange_token_co` when calling `create_token_exchange_using_post`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'exchange_token_co' in params:
            body_params = params['exchange_token_co']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/token_exchange', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='ExchangePublicTokenVO',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def create_user_using_post(self, create_user_request, **kwargs):  # noqa: E501
        """Create user in vendor  # noqa: E501

        Create user in vendor.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_user_using_post(create_user_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CreateUserRequest create_user_request: createUserRequest (required)
        :return: UserResponseVO
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_user_using_post_with_http_info(create_user_request, **kwargs)  # noqa: E501
        else:
            (data) = self.create_user_using_post_with_http_info(create_user_request, **kwargs)  # noqa: E501
            return data

    def create_user_using_post_with_http_info(self, create_user_request, **kwargs):  # noqa: E501
        """Create user in vendor  # noqa: E501

        Create user in vendor.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_user_using_post_with_http_info(create_user_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CreateUserRequest create_user_request: createUserRequest (required)
        :return: UserResponseVO
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['create_user_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_user_using_post" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'create_user_request' is set
        if self.api_client.client_side_validation and ('create_user_request' not in params or
                                                       params['create_user_request'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `create_user_request` when calling `create_user_using_post`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'create_user_request' in params:
            body_params = params['create_user_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/user', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='UserResponseVO',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_audit_log_all_using_get(self, **kwargs):  # noqa: E501
        """Gel all audit log  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_audit_log_all_using_get(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool ascending: ascending
        :param datetime end_date: end_date
        :param str event: event
        :param str integration_type: integration_type
        :param bool is_request: is_request
        :param str nucleus_aggregation_account_id: nucleus_aggregation_account_id
        :param str nucleus_client_id: nucleus_client_id
        :param str order_by: order_by
        :param int page: page
        :param str request_type: request_type
        :param int size: size
        :param datetime start_date: start_date
        :param str vendor_name: vendor_name
        :return: Pageobject
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_audit_log_all_using_get_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_audit_log_all_using_get_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_audit_log_all_using_get_with_http_info(self, **kwargs):  # noqa: E501
        """Gel all audit log  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_audit_log_all_using_get_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool ascending: ascending
        :param datetime end_date: end_date
        :param str event: event
        :param str integration_type: integration_type
        :param bool is_request: is_request
        :param str nucleus_aggregation_account_id: nucleus_aggregation_account_id
        :param str nucleus_client_id: nucleus_client_id
        :param str order_by: order_by
        :param int page: page
        :param str request_type: request_type
        :param int size: size
        :param datetime start_date: start_date
        :param str vendor_name: vendor_name
        :return: Pageobject
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ascending', 'end_date', 'event', 'integration_type', 'is_request', 'nucleus_aggregation_account_id', 'nucleus_client_id', 'order_by', 'page', 'request_type', 'size', 'start_date', 'vendor_name']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_audit_log_all_using_get" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'ascending' in params:
            query_params.append(('ascending', params['ascending']))  # noqa: E501
        if 'end_date' in params:
            query_params.append(('end_date', params['end_date']))  # noqa: E501
        if 'event' in params:
            query_params.append(('event', params['event']))  # noqa: E501
        if 'integration_type' in params:
            query_params.append(('integration_type', params['integration_type']))  # noqa: E501
        if 'is_request' in params:
            query_params.append(('is_request', params['is_request']))  # noqa: E501
        if 'nucleus_aggregation_account_id' in params:
            query_params.append(('nucleus_aggregation_account_id', params['nucleus_aggregation_account_id']))  # noqa: E501
        if 'nucleus_client_id' in params:
            query_params.append(('nucleus_client_id', params['nucleus_client_id']))  # noqa: E501
        if 'order_by' in params:
            query_params.append(('order_by', params['order_by']))  # noqa: E501
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'request_type' in params:
            query_params.append(('request_type', params['request_type']))  # noqa: E501
        if 'size' in params:
            query_params.append(('size', params['size']))  # noqa: E501
        if 'start_date' in params:
            query_params.append(('start_date', params['start_date']))  # noqa: E501
        if 'vendor_name' in params:
            query_params.append(('vendor_name', params['vendor_name']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/audit_log', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Pageobject',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_widget_link_using_get(self, nucleus_id, **kwargs):  # noqa: E501
        """Retrieve widget link  # noqa: E501

        Retrieve the widget link.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_widget_link_using_get(nucleus_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str nucleus_id: nucleus_id (required)
        :param bool is_business: is_business
        :param bool is_mobile_webview: is_mobile_webview
        :param float message_version: message_version
        :param str mode: mode
        :param str vendor_name: vendor_name
        :param bool wait_for_full_aggregation: wait_for_full_aggregation
        :param str webview_url_scheme: webview_url_scheme
        :return: WidgetUrlVO
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_widget_link_using_get_with_http_info(nucleus_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_widget_link_using_get_with_http_info(nucleus_id, **kwargs)  # noqa: E501
            return data

    def get_widget_link_using_get_with_http_info(self, nucleus_id, **kwargs):  # noqa: E501
        """Retrieve widget link  # noqa: E501

        Retrieve the widget link.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_widget_link_using_get_with_http_info(nucleus_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str nucleus_id: nucleus_id (required)
        :param bool is_business: is_business
        :param bool is_mobile_webview: is_mobile_webview
        :param float message_version: message_version
        :param str mode: mode
        :param str vendor_name: vendor_name
        :param bool wait_for_full_aggregation: wait_for_full_aggregation
        :param str webview_url_scheme: webview_url_scheme
        :return: WidgetUrlVO
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['nucleus_id', 'is_business', 'is_mobile_webview', 'message_version', 'mode', 'vendor_name', 'wait_for_full_aggregation', 'webview_url_scheme']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_widget_link_using_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'nucleus_id' is set
        if self.api_client.client_side_validation and ('nucleus_id' not in params or
                                                       params['nucleus_id'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `nucleus_id` when calling `get_widget_link_using_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'nucleus_id' in params:
            path_params['nucleus_id'] = params['nucleus_id']  # noqa: E501

        query_params = []
        if 'is_business' in params:
            query_params.append(('is_business', params['is_business']))  # noqa: E501
        if 'is_mobile_webview' in params:
            query_params.append(('is_mobile_webview', params['is_mobile_webview']))  # noqa: E501
        if 'message_version' in params:
            query_params.append(('message_version', params['message_version']))  # noqa: E501
        if 'mode' in params:
            query_params.append(('mode', params['mode']))  # noqa: E501
        if 'vendor_name' in params:
            query_params.append(('vendor_name', params['vendor_name']))  # noqa: E501
        if 'wait_for_full_aggregation' in params:
            query_params.append(('wait_for_full_aggregation', params['wait_for_full_aggregation']))  # noqa: E501
        if 'webview_url_scheme' in params:
            query_params.append(('webview_url_scheme', params['webview_url_scheme']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/widget_link/{nucleus_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='WidgetUrlVO',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
