# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from nucleus_api.api_client import ApiClient


class RiskProfileApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def create_risk_profile_using_post(self, risk_profile, **kwargs):  # noqa: E501
        """Create a Risk Profile  # noqa: E501

        Create a new Risk Profile.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_risk_profile_using_post(risk_profile, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RiskProfile risk_profile: riskProfile (required)
        :return: RiskProfile
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_risk_profile_using_post_with_http_info(risk_profile, **kwargs)  # noqa: E501
        else:
            (data) = self.create_risk_profile_using_post_with_http_info(risk_profile, **kwargs)  # noqa: E501
            return data

    def create_risk_profile_using_post_with_http_info(self, risk_profile, **kwargs):  # noqa: E501
        """Create a Risk Profile  # noqa: E501

        Create a new Risk Profile.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_risk_profile_using_post_with_http_info(risk_profile, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RiskProfile risk_profile: riskProfile (required)
        :return: RiskProfile
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['risk_profile']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_risk_profile_using_post" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'risk_profile' is set
        if self.api_client.client_side_validation and ('risk_profile' not in params or
                                                       params['risk_profile'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `risk_profile` when calling `create_risk_profile_using_post`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'risk_profile' in params:
            body_params = params['risk_profile']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/nucleus/v1/risk_profile', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='RiskProfile',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def delete_risk_profile_using_delete(self, risk_profile_id, **kwargs):  # noqa: E501
        """Delete a Risk Profile  # noqa: E501

        Permanently Delete a Risk Profile.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_risk_profile_using_delete(risk_profile_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str risk_profile_id: UUID risk_profile_id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_risk_profile_using_delete_with_http_info(risk_profile_id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_risk_profile_using_delete_with_http_info(risk_profile_id, **kwargs)  # noqa: E501
            return data

    def delete_risk_profile_using_delete_with_http_info(self, risk_profile_id, **kwargs):  # noqa: E501
        """Delete a Risk Profile  # noqa: E501

        Permanently Delete a Risk Profile.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_risk_profile_using_delete_with_http_info(risk_profile_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str risk_profile_id: UUID risk_profile_id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['risk_profile_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_risk_profile_using_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'risk_profile_id' is set
        if self.api_client.client_side_validation and ('risk_profile_id' not in params or
                                                       params['risk_profile_id'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `risk_profile_id` when calling `delete_risk_profile_using_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'risk_profile_id' in params:
            path_params['risk_profile_id'] = params['risk_profile_id']  # noqa: E501

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
            '/nucleus/v1/risk_profile/{risk_profile_id}', 'DELETE',
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

    def get_risk_profile_all_using_get(self, **kwargs):  # noqa: E501
        """Get All Risk Profile  # noqa: E501

        Get All Risk Profile.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_risk_profile_all_using_get(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool ascending: ascending
        :param str filter: filter
        :param str order_by: order_by
        :param int page: page
        :param int size: size
        :return: PageRiskProfile
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_risk_profile_all_using_get_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_risk_profile_all_using_get_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_risk_profile_all_using_get_with_http_info(self, **kwargs):  # noqa: E501
        """Get All Risk Profile  # noqa: E501

        Get All Risk Profile.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_risk_profile_all_using_get_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool ascending: ascending
        :param str filter: filter
        :param str order_by: order_by
        :param int page: page
        :param int size: size
        :return: PageRiskProfile
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
                    " to method get_risk_profile_all_using_get" % key
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
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/nucleus/v1/risk_profile', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PageRiskProfile',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_risk_profile_using_get(self, risk_profile_id, **kwargs):  # noqa: E501
        """Get a Risk Profile  # noqa: E501

        Get a Risk Profile.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_risk_profile_using_get(risk_profile_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str risk_profile_id: UUID risk_profile_id (required)
        :return: RiskProfile
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_risk_profile_using_get_with_http_info(risk_profile_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_risk_profile_using_get_with_http_info(risk_profile_id, **kwargs)  # noqa: E501
            return data

    def get_risk_profile_using_get_with_http_info(self, risk_profile_id, **kwargs):  # noqa: E501
        """Get a Risk Profile  # noqa: E501

        Get a Risk Profile.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_risk_profile_using_get_with_http_info(risk_profile_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str risk_profile_id: UUID risk_profile_id (required)
        :return: RiskProfile
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['risk_profile_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_risk_profile_using_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'risk_profile_id' is set
        if self.api_client.client_side_validation and ('risk_profile_id' not in params or
                                                       params['risk_profile_id'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `risk_profile_id` when calling `get_risk_profile_using_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'risk_profile_id' in params:
            path_params['risk_profile_id'] = params['risk_profile_id']  # noqa: E501

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
            '/nucleus/v1/risk_profile/{risk_profile_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='RiskProfile',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def update_risk_profile_using_put(self, risk_profile, risk_profile_id, **kwargs):  # noqa: E501
        """Update a Risk Profile  # noqa: E501

        Update a Risk Profile.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_risk_profile_using_put(risk_profile, risk_profile_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param object risk_profile: risk_profile (required)
        :param str risk_profile_id: UUID risk_profile_id (required)
        :return: RiskProfile
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.update_risk_profile_using_put_with_http_info(risk_profile, risk_profile_id, **kwargs)  # noqa: E501
        else:
            (data) = self.update_risk_profile_using_put_with_http_info(risk_profile, risk_profile_id, **kwargs)  # noqa: E501
            return data

    def update_risk_profile_using_put_with_http_info(self, risk_profile, risk_profile_id, **kwargs):  # noqa: E501
        """Update a Risk Profile  # noqa: E501

        Update a Risk Profile.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_risk_profile_using_put_with_http_info(risk_profile, risk_profile_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param object risk_profile: risk_profile (required)
        :param str risk_profile_id: UUID risk_profile_id (required)
        :return: RiskProfile
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['risk_profile', 'risk_profile_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_risk_profile_using_put" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'risk_profile' is set
        if self.api_client.client_side_validation and ('risk_profile' not in params or
                                                       params['risk_profile'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `risk_profile` when calling `update_risk_profile_using_put`")  # noqa: E501
        # verify the required parameter 'risk_profile_id' is set
        if self.api_client.client_side_validation and ('risk_profile_id' not in params or
                                                       params['risk_profile_id'] is None):  # noqa: E501
            raise ValueError("Missing the required parameter `risk_profile_id` when calling `update_risk_profile_using_put`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'risk_profile_id' in params:
            path_params['risk_profile_id'] = params['risk_profile_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'risk_profile' in params:
            body_params = params['risk_profile']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/nucleus/v1/risk_profile/{risk_profile_id}', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='RiskProfile',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
