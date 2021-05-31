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


class SMSApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_sms_status(self, sms_id, **kwargs):  # noqa: E501
        """Fetch details for corresponding sms_id  # noqa: E501

        Fetch details for corresponding sms_id  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sms_status(sms_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str sms_id: sms_id (required)
        :return: SMS
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_sms_status_with_http_info(sms_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_sms_status_with_http_info(sms_id, **kwargs)  # noqa: E501
            return data

    def get_sms_status_with_http_info(self, sms_id, **kwargs):  # noqa: E501
        """Fetch details for corresponding sms_id  # noqa: E501

        Fetch details for corresponding sms_id  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sms_status_with_http_info(sms_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str sms_id: sms_id (required)
        :return: SMS
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['sms_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_sms_status" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'sms_id' is set
        if self.api_client.client_side_validation and ('sms_id' not in params or
                                                       params['sms_id'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `sms_id` when calling `get_sms_status`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'sms_id' in params:
            path_params['sms_id'] = params['sms_id']  # noqa: E501

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
            '/sms/status/{sms_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='SMS',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def send_sms(self, sms_vo, **kwargs):  # noqa: E501
        """Send SMS to recipient  # noqa: E501

        Send SMS to recipient  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.send_sms(sms_vo, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param SMSVO sms_vo: smsVO (required)
        :return: SMSResponseVO
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.send_sms_with_http_info(sms_vo, **kwargs)  # noqa: E501
        else:
            (data) = self.send_sms_with_http_info(sms_vo, **kwargs)  # noqa: E501
            return data

    def send_sms_with_http_info(self, sms_vo, **kwargs):  # noqa: E501
        """Send SMS to recipient  # noqa: E501

        Send SMS to recipient  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.send_sms_with_http_info(sms_vo, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param SMSVO sms_vo: smsVO (required)
        :return: SMSResponseVO
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['sms_vo']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method send_sms" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'sms_vo' is set
        if self.api_client.client_side_validation and ('sms_vo' not in params or
                                                       params['sms_vo'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `sms_vo` when calling `send_sms`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'sms_vo' in params:
            body_params = params['sms_vo']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/sms', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='SMSResponseVO',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
