# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.3
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import nucleus_api
from nucleus_api.api.resource_api import ResourceApi  # noqa: E501
from nucleus_api.rest import ApiException


class TestResourceApi(unittest.TestCase):
    """ResourceApi unit test stubs"""

    def setUp(self):
        self.api = nucleus_api.api.resource_api.ResourceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_fx_rate_bulk_using_post(self):
        """Test case for create_fx_rate_bulk_using_post

        Create a bulk fxRate  # noqa: E501
        """
        pass

    def test_create_institution_using_post(self):
        """Test case for create_institution_using_post

        Create a institution  # noqa: E501
        """
        pass

    def test_delete_institution_using_delete(self):
        """Test case for delete_institution_using_delete

        Delete a institution  # noqa: E501
        """
        pass

    def test_get_account_result_for_mapping(self):
        """Test case for get_account_result_for_mapping

        Get all account category mapping  # noqa: E501
        """
        pass

    def test_get_all_country_using_get(self):
        """Test case for get_all_country_using_get

        Get All Countries  # noqa: E501
        """
        pass

    def test_get_all_currency_using_get(self):
        """Test case for get_all_currency_using_get

        Get All Currencies  # noqa: E501
        """
        pass

    def test_get_all_merchant_category_code_using_get(self):
        """Test case for get_all_merchant_category_code_using_get

        Get All Merchant Category Codes  # noqa: E501
        """
        pass

    def test_get_all_states_using_get(self):
        """Test case for get_all_states_using_get

        List all state resource  # noqa: E501
        """
        pass

    def test_get_all_statistics_using_get(self):
        """Test case for get_all_statistics_using_get

        List all statistic resource  # noqa: E501
        """
        pass

    def test_get_currency_exchange_rate_all_using_get(self):
        """Test case for get_currency_exchange_rate_all_using_get

        List all fxRates  # noqa: E501
        """
        pass

    def test_get_institution_all_using_get(self):
        """Test case for get_institution_all_using_get

        List all institutions  # noqa: E501
        """
        pass

    def test_get_institution_using_get(self):
        """Test case for get_institution_using_get

        Retrieve a institution  # noqa: E501
        """
        pass

    def test_get_merchants_all_using_get(self):
        """Test case for get_merchants_all_using_get

        Get all merchants  # noqa: E501
        """
        pass

    def test_get_transaction_result_for_mapping(self):
        """Test case for get_transaction_result_for_mapping

        Get all transaction category mapping  # noqa: E501
        """
        pass

    def test_update_institution_using_put(self):
        """Test case for update_institution_using_put

        Update a institution  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
