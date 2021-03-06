# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.8.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import nucleus_api
from nucleus_api.api.insurance_api import InsuranceApi  # noqa: E501
from nucleus_api.rest import ApiException


class TestInsuranceApi(unittest.TestCase):
    """InsuranceApi unit test stubs"""

    def setUp(self):
        self.api = nucleus_api.api.insurance_api.InsuranceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_insurance_coverage_using_post(self):
        """Test case for create_insurance_coverage_using_post

        Create a insurance coverage request  # noqa: E501
        """
        pass

    def test_create_insurance_discount_using_post(self):
        """Test case for create_insurance_discount_using_post

        Create a insurance discount request  # noqa: E501
        """
        pass

    def test_create_insurance_quote_using_post(self):
        """Test case for create_insurance_quote_using_post

        Create a insuranceQuote request  # noqa: E501
        """
        pass

    def test_delete_insurance_coverage_using_delete(self):
        """Test case for delete_insurance_coverage_using_delete

        Delete an insurance coverage request  # noqa: E501
        """
        pass

    def test_delete_insurance_discount_using_delete(self):
        """Test case for delete_insurance_discount_using_delete

        Delete an insurance discount request  # noqa: E501
        """
        pass

    def test_delete_insurance_quote_using_delete(self):
        """Test case for delete_insurance_quote_using_delete

        Delete a insuranceQuote request  # noqa: E501
        """
        pass

    def test_get_insurance_coverage_all_using_get(self):
        """Test case for get_insurance_coverage_all_using_get

        Get all insurance coverage request  # noqa: E501
        """
        pass

    def test_get_insurance_coverage_using_get(self):
        """Test case for get_insurance_coverage_using_get

        Get a insurance coverage request  # noqa: E501
        """
        pass

    def test_get_insurance_discount_all_using_get(self):
        """Test case for get_insurance_discount_all_using_get

        Get all insurance discount request  # noqa: E501
        """
        pass

    def test_get_insurance_discount_using_get(self):
        """Test case for get_insurance_discount_using_get

        Get a insurance discount request  # noqa: E501
        """
        pass

    def test_get_insurance_quote_all_using_get(self):
        """Test case for get_insurance_quote_all_using_get

        List all insuranceQuote requests  # noqa: E501
        """
        pass

    def test_get_insurance_quote_using_get(self):
        """Test case for get_insurance_quote_using_get

        Retrieve a insuranceQuote request  # noqa: E501
        """
        pass

    def test_update_insurance_coverage_using_put(self):
        """Test case for update_insurance_coverage_using_put

        Update a insurance coverage request  # noqa: E501
        """
        pass

    def test_update_insurance_discount_using_put(self):
        """Test case for update_insurance_discount_using_put

        Update an insurance discount   # noqa: E501
        """
        pass

    def test_update_insurance_quote_using_put(self):
        """Test case for update_insurance_quote_using_put

        Update a insuranceQuote request  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
