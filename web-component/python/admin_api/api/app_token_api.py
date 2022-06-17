# coding: utf-8

"""
    Hydrogen Admin API

    The Hydrogen Admin API  # noqa: E501

    OpenAPI spec version: 1.0.2
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from admin_api.api_client import ApiClient


class AppTokenApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_app_token_using_get(self, app_name, **kwargs):  # noqa: E501
        """getAppToken  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_app_token_using_get(app_name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param list[str] app_name: app_name (required)
        :return: list[AppToken]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_app_token_using_get_with_http_info(app_name, **kwargs)  # noqa: E501
        else:
            (data) = self.get_app_token_using_get_with_http_info(app_name, **kwargs)  # noqa: E501
            return data

    def get_app_token_using_get_with_http_info(self, app_name, **kwargs):  # noqa: E501
        """getAppToken  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_app_token_using_get_with_http_info(app_name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param list[str] app_name: app_name (required)
        :return: list[AppToken]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['app_name']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_app_token_using_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'app_name' is set
        if ('app_name' not in params or
                params['app_name'] is None):
            raise ValueError("Missing the required parameter `app_name` when calling `get_app_token_using_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'app_name' in params:
            query_params.append(('app_name', params['app_name']))  # noqa: E501
            collection_formats['app_name'] = 'multi'  # noqa: E501

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
            '/component/v1/app_token', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[AppToken]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
