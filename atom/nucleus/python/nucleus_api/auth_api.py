# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.5
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""
from __future__ import absolute_import

import re

# python 2 and python 3 compatibility library
import six
import json
import urllib3
from nucleus_api.api_client import ApiClient


class AuthApi(object):

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def create_using_post_client_credentials(self, client_id, client_secret, **kwargs):

        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_using_post_client_credentials_with_http_info(client_id, client_secret, **kwargs)
        else:
            (data) = self.create_using_post_client_credentials_with_http_info(client_id, client_secret, **kwargs)
            return data

    def create_using_post_client_credentials_with_http_info(self, client_id, client_secret, **kwargs):

        query_params = {'grant_type': 'client_credentials'}
        url = re.sub('\\.com.*', '.com/authorization/v1/oauth/token', self.api_client.configuration.host)
        header_params = {
            "Authorization": urllib3.util.make_headers(basic_auth=client_id + ':' + client_secret).get('authorization')
        }

        response = self.api_client.rest_client.POST(url,
                                                    query_params=query_params,
                                                    headers=header_params,
                                                    post_params=None,
                                                    body=None)
        data = json.loads('[' + response.data + ']')
        self.access_token = data[0]["access_token"]
        return self

    def create_using_post_password_credentials(self, client_id, client_secret, username, password, **kwargs):

        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_using_post_password_credentials_with_http_info(client_id, client_secret, username,
                                                                              password, **kwargs)
        else:
            (data) = self.create_using_post_password_credentials_with_http_info(client_id, client_secret, username,
                                                                                password, **kwargs)
            return data

    def create_using_post_password_credentials_with_http_info(self, client_id, client_secret, username, password,
                                                              **kwargs):

        query_params = [('grant_type', 'password')]
        query_params.append(('username', username))
        query_params.append(('password', password))
        collection_formats = {}
        if query_params:
            query_params = self.api_client.sanitize_for_serialization(query_params)
            query_params = self.api_client.parameters_to_tuples(query_params,
                                                                collection_formats)

        url = re.sub('\\.com.*', '.com/authorization/v1/oauth/token', self.api_client.configuration.host)

        header_params = {
            "Authorization": urllib3.util.make_headers(basic_auth=client_id + ':' + client_secret).get('authorization')
        }

        response = self.api_client.rest_client.POST(url,
                                                    query_params=query_params,
                                                    headers=header_params,
                                                    post_params=None,
                                                    body=None)
        data = json.loads('[' + response.data + ']')
        self.access_token = data[0]["access_token"]
        return self

    def set_access_token(self, access_token):
        self.access_token = access_token
        return self

    def create_client_token_credentials(self, client_id, client_secret, client_token, **kwargs):
        url = re.sub('\\.com.*', '.com/authorization/v1/client-token', self.api_client.configuration.host);
        header_params = {
            "Authorization": urllib3.util.make_headers(basic_auth=client_id + ':' + client_secret).get('authorization'),
            "Client-Token": "Bearer " + client_token
        }
        response = self.api_client.rest_client.POST(url,
                                                    query_params=None,
                                                    headers=header_params,
                                                    post_params=None,
                                                    body=None)
        data = json.loads('[' + response.data + ']')
        self.access_token = data[0]["access_token"]
        return self
