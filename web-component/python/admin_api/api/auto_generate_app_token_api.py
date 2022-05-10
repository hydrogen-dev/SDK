# coding: utf-8

"""
    Hydrogen Admin API

    The Hydrogen Admin API  # noqa: E501

    OpenAPI spec version: 1.0.2
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import
from pprint import pprint
from functools import reduce
import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from admin_api.api_client import ApiClient
from admin_api.auth_api import AuthApi


class AutoGenerateAppTokenApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.from pprint import pprint
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None, auth_api=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        if auth_api is None:
            auth_api = AuthApi(self.api_client)
        self.auth_api = auth_api

    def get_app_token_using_get(self, appTokenConfig, **kwargs):  # noqa: E501
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
            return self.get_app_token_using_get_with_http_info(appTokenConfig, **kwargs)  # noqa: E501
        else:
            (data) = self.get_app_token_using_get_with_http_info(appTokenConfig, **kwargs)  # noqa: E501
            return data

    def get_app_token_using_get_with_http_info(self, appTokenConfig, **kwargs):  # noqa: E501
        """getAppToken  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_app_token_using_get_with_http_info(appTokenConfig, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param list[str] app_name: app_name (required)
        :return: list[AppToken]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        template  = "<tag app-token='##app_token##' ##attrib_map##></tag>"
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

        if (appTokenConfig['appName'] is None):
            raise ValueError("Missing the required parameter `app_name` when calling `get_app_token_using_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if appTokenConfig['appName'] is not None:
            query_params.append(('app_name', appTokenConfig['appName']))  # noqa: E501
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

        finalAttribMap = []
        if appTokenConfig['attribMap']:
            finalAttribMap = list((x['name'] + "='" + x['value']+"'") for x in appTokenConfig['attribMap'])

        auth_api_cc_response = self.auth_api.create_using_post_client_credentials(appTokenConfig['clientId'], appTokenConfig['clientSecret'])
        self.api_client.configuration.access_token = auth_api_cc_response.access_token

        response = []
        for appConfig in appTokenConfig['appName']:
            item = {}
            app = appConfig
            authType = appTokenConfig['auth_type']
            if(authType is not None and authType.lower() == "client_credentials"):
                self.api_client.configuration.access_token = auth_api_cc_response.access_token
            elif(authType is not None and authType.lower() == "client_token_credentials"):
                self.auth_api.create_client_token_credentials(appTokenConfig['clientId'], appTokenConfig['clientSecret'], appTokenConfig['clientToken'])
            elif(authType is not None and authType.lower() == "password_credentials"):
                self.api_client.configuration.access_token = appTokenConfig['accessToken']

                if appTokenConfig['accessToken'] is None:

                    passwordTokenData = self.auth_api.create_using_post_password_credentials(appTokenConfig['clientId'], appTokenConfig['clientSecret'], appTokenConfig['username'], appTokenConfig['password'])
                    self.api_client.configuration.access_token = passwordTokenData.access_token

            appTokenData = self.api_client.call_api(
                '/component/v1/app_token?app_name='+app['app_name'], 'GET',
                path_params,
                [],
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
            appTokenValue = ""
            if appTokenData is not None and len(appTokenData)>0 :
                appTokenValue = appTokenData[0].app_token
            tagValue = app['app_name'].lower().replace("_", '-')
            fillTemplateValue = template.replace("tag", tagValue).replace("##app_token##", appTokenValue).replace("##attrib_map##", ' '.join(finalAttribMap))

            item[app['app_name']] = appTokenValue
            if appTokenConfig['isEmbed'] :
                item[app['app_name']] = fillTemplateValue
            response.append(item)

        return response