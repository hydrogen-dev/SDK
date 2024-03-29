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


class RiskScoringApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def dimensional_risk_score(self, dimensional_risk_score_request, **kwargs):  # noqa: E501
        """Dimensional Risk Score  # noqa: E501

        Calculate a dimensional risk score based on questionnaire responses  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.dimensional_risk_score(dimensional_risk_score_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param DimensionalRiskScoreRequest dimensional_risk_score_request: Request payload for Dimensional Risk Score (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.dimensional_risk_score_with_http_info(dimensional_risk_score_request, **kwargs)  # noqa: E501
        else:
            (data) = self.dimensional_risk_score_with_http_info(dimensional_risk_score_request, **kwargs)  # noqa: E501
            return data

    def dimensional_risk_score_with_http_info(self, dimensional_risk_score_request, **kwargs):  # noqa: E501
        """Dimensional Risk Score  # noqa: E501

        Calculate a dimensional risk score based on questionnaire responses  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.dimensional_risk_score_with_http_info(dimensional_risk_score_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param DimensionalRiskScoreRequest dimensional_risk_score_request: Request payload for Dimensional Risk Score (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['dimensional_risk_score_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method dimensional_risk_score" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'dimensional_risk_score_request' is set
        if self.api_client.client_side_validation and ('dimensional_risk_score_request' not in params or
                                                       params['dimensional_risk_score_request'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `dimensional_risk_score_request` when calling `dimensional_risk_score`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'dimensional_risk_score_request' in params:
            body_params = params['dimensional_risk_score_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/dimensional_risk_score', 'POST',
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

    def risk_allocation(self, risk_allocation_request, **kwargs):  # noqa: E501
        """Risk Allocation  # noqa: E501

        Allocate based on a risk score  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.risk_allocation(risk_allocation_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RiskAllocationRequest risk_allocation_request: Request payload for Risk Allocation (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.risk_allocation_with_http_info(risk_allocation_request, **kwargs)  # noqa: E501
        else:
            (data) = self.risk_allocation_with_http_info(risk_allocation_request, **kwargs)  # noqa: E501
            return data

    def risk_allocation_with_http_info(self, risk_allocation_request, **kwargs):  # noqa: E501
        """Risk Allocation  # noqa: E501

        Allocate based on a risk score  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.risk_allocation_with_http_info(risk_allocation_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RiskAllocationRequest risk_allocation_request: Request payload for Risk Allocation (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['risk_allocation_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method risk_allocation" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'risk_allocation_request' is set
        if self.api_client.client_side_validation and ('risk_allocation_request' not in params or
                                                       params['risk_allocation_request'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `risk_allocation_request` when calling `risk_allocation`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'risk_allocation_request' in params:
            body_params = params['risk_allocation_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/risk_allocation', 'POST',
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

    def risk_score(self, risk_score_request, **kwargs):  # noqa: E501
        """Risk Score  # noqa: E501

        Calculate a risk score based on questionnaire responses  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.risk_score(risk_score_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RiskScoreRequest risk_score_request: Request payload for Risk Score (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.risk_score_with_http_info(risk_score_request, **kwargs)  # noqa: E501
        else:
            (data) = self.risk_score_with_http_info(risk_score_request, **kwargs)  # noqa: E501
            return data

    def risk_score_with_http_info(self, risk_score_request, **kwargs):  # noqa: E501
        """Risk Score  # noqa: E501

        Calculate a risk score based on questionnaire responses  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.risk_score_with_http_info(risk_score_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RiskScoreRequest risk_score_request: Request payload for Risk Score (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['risk_score_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method risk_score" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'risk_score_request' is set
        if self.api_client.client_side_validation and ('risk_score_request' not in params or
                                                       params['risk_score_request'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `risk_score_request` when calling `risk_score`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'risk_score_request' in params:
            body_params = params['risk_score_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/risk_score', 'POST',
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
