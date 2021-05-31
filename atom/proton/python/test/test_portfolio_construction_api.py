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
from proton_api.api.portfolio_construction_api import PortfolioConstructionApi  # noqa: E501
from proton_api.rest import ApiException


class TestPortfolioConstructionApi(unittest.TestCase):
    """PortfolioConstructionApi unit test stubs"""

    def setUp(self):
        self.api = proton_api.api.portfolio_construction_api.PortfolioConstructionApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_mvo(self):
        """Test case for mvo

        MVO  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
