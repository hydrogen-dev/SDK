# coding: utf-8

"""
    Molecule API Documentation

    The Hydrogen Molecule API  # noqa: E501

    OpenAPI spec version: 1.3.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from molecule_api.api_client import ApiClient


class WalletApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def create_wallet_using_post(self, wallet_params, **kwargs):  # noqa: E501
        """Creates a new Wallet  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_wallet_using_post(wallet_params, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param WalletParams wallet_params: It enables a user to create a Wallet (required)
        :return: WalletResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_wallet_using_post_with_http_info(wallet_params, **kwargs)  # noqa: E501
        else:
            (data) = self.create_wallet_using_post_with_http_info(wallet_params, **kwargs)  # noqa: E501
            return data

    def create_wallet_using_post_with_http_info(self, wallet_params, **kwargs):  # noqa: E501
        """Creates a new Wallet  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_wallet_using_post_with_http_info(wallet_params, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param WalletParams wallet_params: It enables a user to create a Wallet (required)
        :return: WalletResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['wallet_params']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_wallet_using_post" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'wallet_params' is set
        if ('wallet_params' not in params or
                params['wallet_params'] is None):
            raise ValueError("Missing the required parameter `wallet_params` when calling `create_wallet_using_post`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'wallet_params' in params:
            body_params = params['wallet_params']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/wallet', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='WalletResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_wallet_all_using_get(self, **kwargs):  # noqa: E501
        """Fetch Wallet list  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_wallet_all_using_get(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str nucleus_client_id: To filter response wallet list by client's ID
        :param bool is_primary: To filter response for primary wallets
        :param int page: To filter response wallet list by page number
        :param int size: Number of records per page
        :param str order_by: Field to sort record list
        :param bool ascending: Sorting order
        :param bool get_latest: To fetch latest (one) record
        :return: PageWalletResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_wallet_all_using_get_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_wallet_all_using_get_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_wallet_all_using_get_with_http_info(self, **kwargs):  # noqa: E501
        """Fetch Wallet list  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_wallet_all_using_get_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str nucleus_client_id: To filter response wallet list by client's ID
        :param bool is_primary: To filter response for primary wallets
        :param int page: To filter response wallet list by page number
        :param int size: Number of records per page
        :param str order_by: Field to sort record list
        :param bool ascending: Sorting order
        :param bool get_latest: To fetch latest (one) record
        :return: PageWalletResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['nucleus_client_id', 'is_primary', 'page', 'size', 'order_by', 'ascending', 'get_latest']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_wallet_all_using_get" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'nucleus_client_id' in params:
            query_params.append(('nucleus_client_id', params['nucleus_client_id']))  # noqa: E501
        if 'is_primary' in params:
            query_params.append(('is_primary', params['is_primary']))  # noqa: E501
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'size' in params:
            query_params.append(('size', params['size']))  # noqa: E501
        if 'order_by' in params:
            query_params.append(('order_by', params['order_by']))  # noqa: E501
        if 'ascending' in params:
            query_params.append(('ascending', params['ascending']))  # noqa: E501
        if 'get_latest' in params:
            query_params.append(('get_latest', params['get_latest']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/wallet', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PageWalletResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_wallet_by_wallet_key_using_get(self, wallet_key_id, **kwargs):  # noqa: E501
        """Fetch Wallet details by Wallet Key ID  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_wallet_by_wallet_key_using_get(wallet_key_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str wallet_key_id: Wallet Key ID (required)
        :return: WalletResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_wallet_by_wallet_key_using_get_with_http_info(wallet_key_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_wallet_by_wallet_key_using_get_with_http_info(wallet_key_id, **kwargs)  # noqa: E501
            return data

    def get_wallet_by_wallet_key_using_get_with_http_info(self, wallet_key_id, **kwargs):  # noqa: E501
        """Fetch Wallet details by Wallet Key ID  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_wallet_by_wallet_key_using_get_with_http_info(wallet_key_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str wallet_key_id: Wallet Key ID (required)
        :return: WalletResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['wallet_key_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_wallet_by_wallet_key_using_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'wallet_key_id' is set
        if ('wallet_key_id' not in params or
                params['wallet_key_id'] is None):
            raise ValueError("Missing the required parameter `wallet_key_id` when calling `get_wallet_by_wallet_key_using_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'wallet_key_id' in params:
            path_params['wallet_key_id'] = params['wallet_key_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/wallet/wallet_key/{wallet_key_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='WalletResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_wallet_using_get(self, wallet_id, **kwargs):  # noqa: E501
        """Fetch Wallet details  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_wallet_using_get(wallet_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str wallet_id: Wallet ID (required)
        :return: WalletResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_wallet_using_get_with_http_info(wallet_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_wallet_using_get_with_http_info(wallet_id, **kwargs)  # noqa: E501
            return data

    def get_wallet_using_get_with_http_info(self, wallet_id, **kwargs):  # noqa: E501
        """Fetch Wallet details  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_wallet_using_get_with_http_info(wallet_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str wallet_id: Wallet ID (required)
        :return: WalletResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['wallet_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_wallet_using_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'wallet_id' is set
        if ('wallet_id' not in params or
                params['wallet_id'] is None):
            raise ValueError("Missing the required parameter `wallet_id` when calling `get_wallet_using_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'wallet_id' in params:
            path_params['wallet_id'] = params['wallet_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/wallet/{wallet_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='WalletResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def update_wallet_using_put(self, wallet_id, **kwargs):  # noqa: E501
        """Update Wallet details  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_wallet_using_put(wallet_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str wallet_id: Wallet ID (required)
        :param WalletParams wallet_update_params: Wallet details to be updated
        :return: WalletResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.update_wallet_using_put_with_http_info(wallet_id, **kwargs)  # noqa: E501
        else:
            (data) = self.update_wallet_using_put_with_http_info(wallet_id, **kwargs)  # noqa: E501
            return data

    def update_wallet_using_put_with_http_info(self, wallet_id, **kwargs):  # noqa: E501
        """Update Wallet details  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_wallet_using_put_with_http_info(wallet_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str wallet_id: Wallet ID (required)
        :param WalletParams wallet_update_params: Wallet details to be updated
        :return: WalletResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['wallet_id', 'wallet_update_params']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_wallet_using_put" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'wallet_id' is set
        if ('wallet_id' not in params or
                params['wallet_id'] is None):
            raise ValueError("Missing the required parameter `wallet_id` when calling `update_wallet_using_put`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'wallet_id' in params:
            path_params['wallet_id'] = params['wallet_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'wallet_update_params' in params:
            body_params = params['wallet_update_params']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/wallet/{wallet_id}', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='WalletResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
