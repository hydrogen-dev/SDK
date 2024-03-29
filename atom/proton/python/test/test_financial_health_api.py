# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.9.2
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import proton_api
from proton_api.api.financial_health_api import FinancialHealthApi  # noqa: E501
from proton_api.rest import ApiException


class TestFinancialHealthApi(unittest.TestCase):
    """FinancialHealthApi unit test stubs"""

    def setUp(self):
        self.api = proton_api.api.financial_health_api.FinancialHealthApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_diversification_score(self):
        """Test case for diversification_score

        Diversification Score  # noqa: E501
        """
        pass

    def test_emergency_fund_calculator(self):
        """Test case for emergency_fund_calculator

        Emergency Fund Calculator  # noqa: E501
        """
        pass

    def test_financial_health_check(self):
        """Test case for financial_health_check

        Financial Health Check  # noqa: E501
        """
        pass

    def test_portfolio_optimization_score(self):
        """Test case for portfolio_optimization_score

        Portfolio Optimization Score  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
