# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.8.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from nucleus_api.api_client import ApiClient


class BusinessApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def create_business_using_post(self, business_request, **kwargs):  # noqa: E501
        """Create a business  # noqa: E501

        Create a new business, or register a new business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_business_using_post(business_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Business business_request: businessRequest (required)
        :return: Business
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_business_using_post_with_http_info(business_request, **kwargs)  # noqa: E501
        else:
            (data) = self.create_business_using_post_with_http_info(business_request, **kwargs)  # noqa: E501
            return data

    def create_business_using_post_with_http_info(self, business_request, **kwargs):  # noqa: E501
        """Create a business  # noqa: E501

        Create a new business, or register a new business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_business_using_post_with_http_info(business_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Business business_request: businessRequest (required)
        :return: Business
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['business_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_business_using_post" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'business_request' is set
        if ('business_request' not in params or
                params['business_request'] is None):
            raise ValueError("Missing the required parameter `business_request` when calling `create_business_using_post`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'business_request' in params:
            body_params = params['business_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/business', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Business',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def delete_business_using_delete(self, business_id, **kwargs):  # noqa: E501
        """Delete a business  # noqa: E501

        Permanently delete a business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_business_using_delete(business_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str business_id: UUID business_id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_business_using_delete_with_http_info(business_id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_business_using_delete_with_http_info(business_id, **kwargs)  # noqa: E501
            return data

    def delete_business_using_delete_with_http_info(self, business_id, **kwargs):  # noqa: E501
        """Delete a business  # noqa: E501

        Permanently delete a business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_business_using_delete_with_http_info(business_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str business_id: UUID business_id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['business_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_business_using_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'business_id' is set
        if ('business_id' not in params or
                params['business_id'] is None):
            raise ValueError("Missing the required parameter `business_id` when calling `delete_business_using_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'business_id' in params:
            path_params['business_id'] = params['business_id']  # noqa: E501

        query_params = []

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
            '/business/{business_id}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_business_all_using_get(self, **kwargs):  # noqa: E501
        """List all business  # noqa: E501

        Get details for all business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_business_all_using_get(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool ascending: ascending
        :param str filter: filter
        :param str order_by: order_by
        :param int page: page
        :param int size: size
        :return: PageBusiness
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_business_all_using_get_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_business_all_using_get_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_business_all_using_get_with_http_info(self, **kwargs):  # noqa: E501
        """List all business  # noqa: E501

        Get details for all business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_business_all_using_get_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool ascending: ascending
        :param str filter: filter
        :param str order_by: order_by
        :param int page: page
        :param int size: size
        :return: PageBusiness
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ascending', 'filter', 'order_by', 'page', 'size']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_business_all_using_get" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'ascending' in params:
            query_params.append(('ascending', params['ascending']))  # noqa: E501
        if 'filter' in params:
            query_params.append(('filter', params['filter']))  # noqa: E501
        if 'order_by' in params:
            query_params.append(('order_by', params['order_by']))  # noqa: E501
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'size' in params:
            query_params.append(('size', params['size']))  # noqa: E501

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
            '/business', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PageBusiness',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_business_asset_size_using_get(self, business_id, **kwargs):  # noqa: E501
        """List all business asset sizes  # noqa: E501

        Get a list of asset sizes per date for a business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_business_asset_size_using_get(business_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str business_id: UUID business_id (required)
        :param str currency_conversion: Currency Code
        :param date end_date: end date
        :param bool exclude_subledger: exclude_subledger
        :param bool get_latest: true or false
        :param str sort_type:  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
        :param date start_date: start date
        :return: list[AvailableDateDoubleVO]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_business_asset_size_using_get_with_http_info(business_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_business_asset_size_using_get_with_http_info(business_id, **kwargs)  # noqa: E501
            return data

    def get_business_asset_size_using_get_with_http_info(self, business_id, **kwargs):  # noqa: E501
        """List all business asset sizes  # noqa: E501

        Get a list of asset sizes per date for a business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_business_asset_size_using_get_with_http_info(business_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str business_id: UUID business_id (required)
        :param str currency_conversion: Currency Code
        :param date end_date: end date
        :param bool exclude_subledger: exclude_subledger
        :param bool get_latest: true or false
        :param str sort_type:  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
        :param date start_date: start date
        :return: list[AvailableDateDoubleVO]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['business_id', 'currency_conversion', 'end_date', 'exclude_subledger', 'get_latest', 'sort_type', 'start_date']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_business_asset_size_using_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'business_id' is set
        if ('business_id' not in params or
                params['business_id'] is None):
            raise ValueError("Missing the required parameter `business_id` when calling `get_business_asset_size_using_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'business_id' in params:
            path_params['business_id'] = params['business_id']  # noqa: E501

        query_params = []
        if 'currency_conversion' in params:
            query_params.append(('currency_conversion', params['currency_conversion']))  # noqa: E501
        if 'end_date' in params:
            query_params.append(('end_date', params['end_date']))  # noqa: E501
        if 'exclude_subledger' in params:
            query_params.append(('exclude_subledger', params['exclude_subledger']))  # noqa: E501
        if 'get_latest' in params:
            query_params.append(('get_latest', params['get_latest']))  # noqa: E501
        if 'sort_type' in params:
            query_params.append(('sort_type', params['sort_type']))  # noqa: E501
        if 'start_date' in params:
            query_params.append(('start_date', params['start_date']))  # noqa: E501

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
            '/business/{business_id}/asset_size', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[AvailableDateDoubleVO]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_business_client_transaction_all_using_get(self, business_id, **kwargs):  # noqa: E501
        """List all business transactions  # noqa: E501

        Get the information for all transactions under all client registered with your business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_business_client_transaction_all_using_get(business_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str business_id: UUID business_id (required)
        :param bool ascending: ascending
        :param str currency_conversion: currency_conversion
        :param str end_date: end date - yyyy-mm-dd
        :param str order_by: order_by
        :param int page: page
        :param int size: size
        :param str start_date: start date - yyyy-mm-dd
        :return: PagePortfolioTransaction
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_business_client_transaction_all_using_get_with_http_info(business_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_business_client_transaction_all_using_get_with_http_info(business_id, **kwargs)  # noqa: E501
            return data

    def get_business_client_transaction_all_using_get_with_http_info(self, business_id, **kwargs):  # noqa: E501
        """List all business transactions  # noqa: E501

        Get the information for all transactions under all client registered with your business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_business_client_transaction_all_using_get_with_http_info(business_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str business_id: UUID business_id (required)
        :param bool ascending: ascending
        :param str currency_conversion: currency_conversion
        :param str end_date: end date - yyyy-mm-dd
        :param str order_by: order_by
        :param int page: page
        :param int size: size
        :param str start_date: start date - yyyy-mm-dd
        :return: PagePortfolioTransaction
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['business_id', 'ascending', 'currency_conversion', 'end_date', 'order_by', 'page', 'size', 'start_date']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_business_client_transaction_all_using_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'business_id' is set
        if ('business_id' not in params or
                params['business_id'] is None):
            raise ValueError("Missing the required parameter `business_id` when calling `get_business_client_transaction_all_using_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'business_id' in params:
            path_params['business_id'] = params['business_id']  # noqa: E501

        query_params = []
        if 'ascending' in params:
            query_params.append(('ascending', params['ascending']))  # noqa: E501
        if 'currency_conversion' in params:
            query_params.append(('currency_conversion', params['currency_conversion']))  # noqa: E501
        if 'end_date' in params:
            query_params.append(('end_date', params['end_date']))  # noqa: E501
        if 'order_by' in params:
            query_params.append(('order_by', params['order_by']))  # noqa: E501
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'size' in params:
            query_params.append(('size', params['size']))  # noqa: E501
        if 'start_date' in params:
            query_params.append(('start_date', params['start_date']))  # noqa: E501

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
            '/business/{business_id}/transaction', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PagePortfolioTransaction',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_business_holding_using_get(self, business_id, **kwargs):  # noqa: E501
        """List all business holdings  # noqa: E501

        Get a list of holdings for a business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_business_holding_using_get(business_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str business_id: UUID business_id (required)
        :param str currency_conversion: Currency Code
        :param str end_date: end date - yyyy-mm-dd
        :param bool get_latest: true or false
        :param str start_date: start date - yyyy-mm-dd
        :return: list[PortfolioHoldingAgg]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_business_holding_using_get_with_http_info(business_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_business_holding_using_get_with_http_info(business_id, **kwargs)  # noqa: E501
            return data

    def get_business_holding_using_get_with_http_info(self, business_id, **kwargs):  # noqa: E501
        """List all business holdings  # noqa: E501

        Get a list of holdings for a business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_business_holding_using_get_with_http_info(business_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str business_id: UUID business_id (required)
        :param str currency_conversion: Currency Code
        :param str end_date: end date - yyyy-mm-dd
        :param bool get_latest: true or false
        :param str start_date: start date - yyyy-mm-dd
        :return: list[PortfolioHoldingAgg]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['business_id', 'currency_conversion', 'end_date', 'get_latest', 'start_date']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_business_holding_using_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'business_id' is set
        if ('business_id' not in params or
                params['business_id'] is None):
            raise ValueError("Missing the required parameter `business_id` when calling `get_business_holding_using_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'business_id' in params:
            path_params['business_id'] = params['business_id']  # noqa: E501

        query_params = []
        if 'currency_conversion' in params:
            query_params.append(('currency_conversion', params['currency_conversion']))  # noqa: E501
        if 'end_date' in params:
            query_params.append(('end_date', params['end_date']))  # noqa: E501
        if 'get_latest' in params:
            query_params.append(('get_latest', params['get_latest']))  # noqa: E501
        if 'start_date' in params:
            query_params.append(('start_date', params['start_date']))  # noqa: E501

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
            '/business/{business_id}/holding', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[PortfolioHoldingAgg]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_business_using_get(self, business_id, **kwargs):  # noqa: E501
        """Retrieve a business  # noqa: E501

        Retrieve the information for a business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_business_using_get(business_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str business_id: UUID business_id (required)
        :return: Business
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_business_using_get_with_http_info(business_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_business_using_get_with_http_info(business_id, **kwargs)  # noqa: E501
            return data

    def get_business_using_get_with_http_info(self, business_id, **kwargs):  # noqa: E501
        """Retrieve a business  # noqa: E501

        Retrieve the information for a business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_business_using_get_with_http_info(business_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str business_id: UUID business_id (required)
        :return: Business
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['business_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_business_using_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'business_id' is set
        if ('business_id' not in params or
                params['business_id'] is None):
            raise ValueError("Missing the required parameter `business_id` when calling `get_business_using_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'business_id' in params:
            path_params['business_id'] = params['business_id']  # noqa: E501

        query_params = []

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
            '/business/{business_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Business',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def update_business_using_put(self, business, business_id, **kwargs):  # noqa: E501
        """Update a business  # noqa: E501

        Update the information for a business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_business_using_put(business, business_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param object business: business (required)
        :param str business_id: UUID business_id (required)
        :return: Business
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.update_business_using_put_with_http_info(business, business_id, **kwargs)  # noqa: E501
        else:
            (data) = self.update_business_using_put_with_http_info(business, business_id, **kwargs)  # noqa: E501
            return data

    def update_business_using_put_with_http_info(self, business, business_id, **kwargs):  # noqa: E501
        """Update a business  # noqa: E501

        Update the information for a business.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_business_using_put_with_http_info(business, business_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param object business: business (required)
        :param str business_id: UUID business_id (required)
        :return: Business
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['business', 'business_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_business_using_put" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'business' is set
        if ('business' not in params or
                params['business'] is None):
            raise ValueError("Missing the required parameter `business` when calling `update_business_using_put`")  # noqa: E501
        # verify the required parameter 'business_id' is set
        if ('business_id' not in params or
                params['business_id'] is None):
            raise ValueError("Missing the required parameter `business_id` when calling `update_business_using_put`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'business_id' in params:
            path_params['business_id'] = params['business_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'business' in params:
            body_params = params['business']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/business/{business_id}', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Business',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)