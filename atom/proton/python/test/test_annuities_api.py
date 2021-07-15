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
from proton_api.api.annuities_api import AnnuitiesApi  # noqa: E501
from proton_api.rest import ApiException


class TestAnnuitiesApi(unittest.TestCase):
    """AnnuitiesApi unit test stubs"""

    def setUp(self):
        self.api = proton_api.api.annuities_api.AnnuitiesApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_annuity_calculator_accumulation_horizon(self):
        """Test case for annuity_calculator_accumulation_horizon

        Annuity Calculator - Accumulation Horizon  # noqa: E501
        """
        pass

    def test_annuity_calculator_annuity_amount(self):
        """Test case for annuity_calculator_annuity_amount

        Annuity Calculator - Annuity Amount  # noqa: E501
        """
        pass

    def test_annuity_calculator_decumulation_horizon(self):
        """Test case for annuity_calculator_decumulation_horizon

        Annuity Calculator - Decumulation Horizon  # noqa: E501
        """
        pass

    def test_annuity_calculator_deposit_amount(self):
        """Test case for annuity_calculator_deposit_amount

        Annuity Calculator - Deposit Amount  # noqa: E501
        """
        pass

    def test_annuity_calculator_initial_balance(self):
        """Test case for annuity_calculator_initial_balance

        Annuity Calculator - Initial Balance  # noqa: E501
        """
        pass

    def test_variable_annuity(self):
        """Test case for variable_annuity

        Variable Annuity  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
