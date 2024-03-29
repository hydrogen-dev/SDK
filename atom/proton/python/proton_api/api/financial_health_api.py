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


class FinancialHealthApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def diversification_score(self, diversification_score_request, **kwargs):  # noqa: E501
        """Diversification Score  # noqa: E501

        Assess how well a group of investments is diversified  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.diversification_score(diversification_score_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param DiversificationScoreRequest diversification_score_request: Request payload for Diversification Score (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.diversification_score_with_http_info(diversification_score_request, **kwargs)  # noqa: E501
        else:
            (data) = self.diversification_score_with_http_info(diversification_score_request, **kwargs)  # noqa: E501
            return data

    def diversification_score_with_http_info(self, diversification_score_request, **kwargs):  # noqa: E501
        """Diversification Score  # noqa: E501

        Assess how well a group of investments is diversified  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.diversification_score_with_http_info(diversification_score_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param DiversificationScoreRequest diversification_score_request: Request payload for Diversification Score (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['diversification_score_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method diversification_score" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'diversification_score_request' is set
        if self.api_client.client_side_validation and ('diversification_score_request' not in params or
                                                       params['diversification_score_request'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `diversification_score_request` when calling `diversification_score`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'diversification_score_request' in params:
            body_params = params['diversification_score_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/diversification_score', 'POST',
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

    def emergency_fund_calculator(self, emergency_fund_calculator_request, **kwargs):  # noqa: E501
        """Emergency Fund Calculator  # noqa: E501

        Calculate a target emergency fund amount and savings plan  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.emergency_fund_calculator(emergency_fund_calculator_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param EmergencyFundCalculatorRequest emergency_fund_calculator_request: Request payload for Emergency Fund Calculator (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.emergency_fund_calculator_with_http_info(emergency_fund_calculator_request, **kwargs)  # noqa: E501
        else:
            (data) = self.emergency_fund_calculator_with_http_info(emergency_fund_calculator_request, **kwargs)  # noqa: E501
            return data

    def emergency_fund_calculator_with_http_info(self, emergency_fund_calculator_request, **kwargs):  # noqa: E501
        """Emergency Fund Calculator  # noqa: E501

        Calculate a target emergency fund amount and savings plan  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.emergency_fund_calculator_with_http_info(emergency_fund_calculator_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param EmergencyFundCalculatorRequest emergency_fund_calculator_request: Request payload for Emergency Fund Calculator (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['emergency_fund_calculator_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method emergency_fund_calculator" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'emergency_fund_calculator_request' is set
        if self.api_client.client_side_validation and ('emergency_fund_calculator_request' not in params or
                                                       params['emergency_fund_calculator_request'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `emergency_fund_calculator_request` when calling `emergency_fund_calculator`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'emergency_fund_calculator_request' in params:
            body_params = params['emergency_fund_calculator_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/emergency_fund_calculator', 'POST',
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

    def financial_health_check(self, financial_health_check_request, **kwargs):  # noqa: E501
        """Financial Health Check  # noqa: E501

        Calculate a series of financial ratios to assess financial health  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.financial_health_check(financial_health_check_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param FinancialHealthCheckRequest financial_health_check_request: Request payload for Financial Health Check (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.financial_health_check_with_http_info(financial_health_check_request, **kwargs)  # noqa: E501
        else:
            (data) = self.financial_health_check_with_http_info(financial_health_check_request, **kwargs)  # noqa: E501
            return data

    def financial_health_check_with_http_info(self, financial_health_check_request, **kwargs):  # noqa: E501
        """Financial Health Check  # noqa: E501

        Calculate a series of financial ratios to assess financial health  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.financial_health_check_with_http_info(financial_health_check_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param FinancialHealthCheckRequest financial_health_check_request: Request payload for Financial Health Check (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['financial_health_check_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method financial_health_check" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'financial_health_check_request' is set
        if self.api_client.client_side_validation and ('financial_health_check_request' not in params or
                                                       params['financial_health_check_request'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `financial_health_check_request` when calling `financial_health_check`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'financial_health_check_request' in params:
            body_params = params['financial_health_check_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/financial_health_check', 'POST',
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

    def portfolio_optimization_score(self, portfolio_optimization_score_request, **kwargs):  # noqa: E501
        """Portfolio Optimization Score  # noqa: E501

        Analyze a group of investments against the optimized result  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.portfolio_optimization_score(portfolio_optimization_score_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PortfolioOptimizationScoreRequest portfolio_optimization_score_request: Request payload for Portfolio Optimization Score (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.portfolio_optimization_score_with_http_info(portfolio_optimization_score_request, **kwargs)  # noqa: E501
        else:
            (data) = self.portfolio_optimization_score_with_http_info(portfolio_optimization_score_request, **kwargs)  # noqa: E501
            return data

    def portfolio_optimization_score_with_http_info(self, portfolio_optimization_score_request, **kwargs):  # noqa: E501
        """Portfolio Optimization Score  # noqa: E501

        Analyze a group of investments against the optimized result  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.portfolio_optimization_score_with_http_info(portfolio_optimization_score_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PortfolioOptimizationScoreRequest portfolio_optimization_score_request: Request payload for Portfolio Optimization Score (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['portfolio_optimization_score_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method portfolio_optimization_score" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'portfolio_optimization_score_request' is set
        if self.api_client.client_side_validation and ('portfolio_optimization_score_request' not in params or
                                                       params['portfolio_optimization_score_request'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `portfolio_optimization_score_request` when calling `portfolio_optimization_score`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'portfolio_optimization_score_request' in params:
            body_params = params['portfolio_optimization_score_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/portfolio_optimization_score', 'POST',
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
