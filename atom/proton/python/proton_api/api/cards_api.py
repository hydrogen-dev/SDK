# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.9.2
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from proton_api.api_client import ApiClient


class CardsApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def card_analysis(self, card_analysis_request, **kwargs):  # noqa: E501
        """Card Analysis  # noqa: E501

        Analyze cardholder activity over time  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.card_analysis(card_analysis_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CardAnalysisRequest card_analysis_request: Request payload for Card Analysis (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.card_analysis_with_http_info(card_analysis_request, **kwargs)  # noqa: E501
        else:
            (data) = self.card_analysis_with_http_info(card_analysis_request, **kwargs)  # noqa: E501
            return data

    def card_analysis_with_http_info(self, card_analysis_request, **kwargs):  # noqa: E501
        """Card Analysis  # noqa: E501

        Analyze cardholder activity over time  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.card_analysis_with_http_info(card_analysis_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CardAnalysisRequest card_analysis_request: Request payload for Card Analysis (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['card_analysis_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method card_analysis" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'card_analysis_request' is set
        if self.api_client.client_side_validation and ('card_analysis_request' not in params or
                                                       params['card_analysis_request'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `card_analysis_request` when calling `card_analysis`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'card_analysis_request' in params:
            body_params = params['card_analysis_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/card_analysis', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='dict(str, object)',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def card_limit_check(self, card_limit_check_request, **kwargs):  # noqa: E501
        """Card Limit Check  # noqa: E501

        Evaluate card transaction history against spending controls  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.card_limit_check(card_limit_check_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CardLimitCheckRequest card_limit_check_request: Request payload for Card Limit Check (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.card_limit_check_with_http_info(card_limit_check_request, **kwargs)  # noqa: E501
        else:
            (data) = self.card_limit_check_with_http_info(card_limit_check_request, **kwargs)  # noqa: E501
            return data

    def card_limit_check_with_http_info(self, card_limit_check_request, **kwargs):  # noqa: E501
        """Card Limit Check  # noqa: E501

        Evaluate card transaction history against spending controls  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.card_limit_check_with_http_info(card_limit_check_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CardLimitCheckRequest card_limit_check_request: Request payload for Card Limit Check (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['card_limit_check_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method card_limit_check" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'card_limit_check_request' is set
        if self.api_client.client_side_validation and ('card_limit_check_request' not in params or
                                                       params['card_limit_check_request'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `card_limit_check_request` when calling `card_limit_check`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'card_limit_check_request' in params:
            body_params = params['card_limit_check_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/card_limit_check', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='dict(str, object)',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def card_transaction_authorization(self, card_transaction_authorization_request, **kwargs):  # noqa: E501
        """Card Transaction Authorization  # noqa: E501

        Approve or reject a card transaction based on applicable conditions  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.card_transaction_authorization(card_transaction_authorization_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CardTransactionAuthorizationRequest card_transaction_authorization_request: Request payload for Card Transaction Authorization (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.card_transaction_authorization_with_http_info(card_transaction_authorization_request, **kwargs)  # noqa: E501
        else:
            (data) = self.card_transaction_authorization_with_http_info(card_transaction_authorization_request, **kwargs)  # noqa: E501
            return data

    def card_transaction_authorization_with_http_info(self, card_transaction_authorization_request, **kwargs):  # noqa: E501
        """Card Transaction Authorization  # noqa: E501

        Approve or reject a card transaction based on applicable conditions  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.card_transaction_authorization_with_http_info(card_transaction_authorization_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CardTransactionAuthorizationRequest card_transaction_authorization_request: Request payload for Card Transaction Authorization (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['card_transaction_authorization_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method card_transaction_authorization" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'card_transaction_authorization_request' is set
        if self.api_client.client_side_validation and ('card_transaction_authorization_request' not in params or
                                                       params['card_transaction_authorization_request'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `card_transaction_authorization_request` when calling `card_transaction_authorization`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'card_transaction_authorization_request' in params:
            body_params = params['card_transaction_authorization_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/card_authorization', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='dict(str, object)',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
