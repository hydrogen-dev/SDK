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
from nucleus_api.api.financial_statement_api import FinancialStatementApi  # noqa: E501
from nucleus_api.rest import ApiException


class TestFinancialStatementApi(unittest.TestCase):
    """FinancialStatementApi unit test stubs"""

    def setUp(self):
        self.api = nucleus_api.api.financial_statement_api.FinancialStatementApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_financial_statement_using_post(self):
        """Test case for create_financial_statement_using_post

        Create an financialStatement  # noqa: E501
        """
        pass

    def test_delete_financial_statement_using_delete(self):
        """Test case for delete_financial_statement_using_delete

        Delete an financialStatement  # noqa: E501
        """
        pass

    def test_get_financial_statement_all_using_get(self):
        """Test case for get_financial_statement_all_using_get

        List all financialStatement  # noqa: E501
        """
        pass

    def test_get_financial_statement_using_get(self):
        """Test case for get_financial_statement_using_get

        Retrieve an financialStatement  # noqa: E501
        """
        pass

    def test_update_financial_statement_using_put(self):
        """Test case for update_financial_statement_using_put

        Update an financialStatement  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
