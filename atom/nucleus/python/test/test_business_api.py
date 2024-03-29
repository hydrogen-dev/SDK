# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.5
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import nucleus_api
from nucleus_api.api.business_api import BusinessApi  # noqa: E501
from nucleus_api.rest import ApiException


class TestBusinessApi(unittest.TestCase):
    """BusinessApi unit test stubs"""

    def setUp(self):
        self.api = nucleus_api.api.business_api.BusinessApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_business_using_post(self):
        """Test case for create_business_using_post

        Create a business  # noqa: E501
        """
        pass

    def test_delete_business_using_delete(self):
        """Test case for delete_business_using_delete

        Delete a business  # noqa: E501
        """
        pass

    def test_get_business_all_using_get(self):
        """Test case for get_business_all_using_get

        List all business  # noqa: E501
        """
        pass

    def test_get_business_asset_size_using_get(self):
        """Test case for get_business_asset_size_using_get

        List all business asset sizes  # noqa: E501
        """
        pass

    def test_get_business_client_transaction_all_using_get(self):
        """Test case for get_business_client_transaction_all_using_get

        List all business transactions  # noqa: E501
        """
        pass

    def test_get_business_holding_using_get(self):
        """Test case for get_business_holding_using_get

        List all business holdings  # noqa: E501
        """
        pass

    def test_get_business_using_get(self):
        """Test case for get_business_using_get

        Retrieve a business  # noqa: E501
        """
        pass

    def test_update_business_using_put(self):
        """Test case for update_business_using_put

        Update a business  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
