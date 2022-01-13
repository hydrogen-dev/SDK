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
from nucleus_api.api.risk_profile_api import RiskProfileApi  # noqa: E501
from nucleus_api.rest import ApiException


class TestRiskProfileApi(unittest.TestCase):
    """RiskProfileApi unit test stubs"""

    def setUp(self):
        self.api = nucleus_api.api.risk_profile_api.RiskProfileApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_risk_profile_using_post(self):
        """Test case for create_risk_profile_using_post

        Create a Risk Profile  # noqa: E501
        """
        pass

    def test_delete_risk_profile_using_delete(self):
        """Test case for delete_risk_profile_using_delete

        Delete a Risk Profile  # noqa: E501
        """
        pass

    def test_get_risk_profile_all_using_get(self):
        """Test case for get_risk_profile_all_using_get

        Get All Risk Profile  # noqa: E501
        """
        pass

    def test_get_risk_profile_using_get(self):
        """Test case for get_risk_profile_using_get

        Get a Risk Profile  # noqa: E501
        """
        pass

    def test_update_risk_profile_using_put(self):
        """Test case for update_risk_profile_using_put

        Update a Risk Profile  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
