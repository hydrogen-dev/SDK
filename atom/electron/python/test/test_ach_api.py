# coding: utf-8

"""
    Hydrogen Electron API

    The Hydrogen Electron API  # noqa: E501

    OpenAPI spec version: 1.3.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import electron_api
from electron_api.api.ach_api import ACHApi  # noqa: E501
from electron_api.rest import ApiException


class TestACHApi(unittest.TestCase):
    """ACHApi unit test stubs"""

    def setUp(self):
        self.api = electron_api.api.ach_api.ACHApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_fund_card_using_post(self):
        """Test case for fund_card_using_post

        Fund card  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
