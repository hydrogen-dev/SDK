# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.9.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import proton_api
from proton_api.api.personal_financial_management_api import PersonalFinancialManagementApi  # noqa: E501
from proton_api.rest import ApiException


class TestPersonalFinancialManagementApi(unittest.TestCase):
    """PersonalFinancialManagementApi unit test stubs"""

    def setUp(self):
        self.api = proton_api.api.personal_financial_management_api.PersonalFinancialManagementApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_budget_calculator(self):
        """Test case for budget_calculator

        Budget Calculator  # noqa: E501
        """
        pass

    def test_cash_flow_analysis(self):
        """Test case for cash_flow_analysis

        Cash Flow Analysis  # noqa: E501
        """
        pass

    def test_fee_analysis(self):
        """Test case for fee_analysis

        RFee Analysis  # noqa: E501
        """
        pass

    def test_financial_picture(self):
        """Test case for financial_picture

        Financial Picture  # noqa: E501
        """
        pass

    def test_recurring_transaction_analysis(self):
        """Test case for recurring_transaction_analysis

        Recurring Transaction Analysis  # noqa: E501
        """
        pass

    def test_spending_analysis(self):
        """Test case for spending_analysis

        Spending Analysis  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
