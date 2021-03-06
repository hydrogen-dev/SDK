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
from nucleus_api.api.marketing_api import MarketingApi  # noqa: E501
from nucleus_api.rest import ApiException


class TestMarketingApi(unittest.TestCase):
    """MarketingApi unit test stubs"""

    def setUp(self):
        self.api = nucleus_api.api.marketing_api.MarketingApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_campaign_data_using_post(self):
        """Test case for create_campaign_data_using_post

        Create a campaign data record  # noqa: E501
        """
        pass

    def test_create_campaign_plan_using_post(self):
        """Test case for create_campaign_plan_using_post

        Create a campaign plan  # noqa: E501
        """
        pass

    def test_create_campaign_using_post(self):
        """Test case for create_campaign_using_post

        Create a campaign  # noqa: E501
        """
        pass

    def test_create_client_campaign_using_post(self):
        """Test case for create_client_campaign_using_post

        Mark a client signing up through a campaign  # noqa: E501
        """
        pass

    def test_delete_campaign_data_using_delete(self):
        """Test case for delete_campaign_data_using_delete

        Delete a campaign data record  # noqa: E501
        """
        pass

    def test_delete_campaign_plan_using_delete(self):
        """Test case for delete_campaign_plan_using_delete

        Delete a campaign plan  # noqa: E501
        """
        pass

    def test_delete_campaign_using_delete(self):
        """Test case for delete_campaign_using_delete

        Delete a campaign  # noqa: E501
        """
        pass

    def test_delete_client_campaign_using_delete(self):
        """Test case for delete_client_campaign_using_delete

        Delete a clients/ips pair under a campaign  # noqa: E501
        """
        pass

    def test_get_campaign_all_using_get(self):
        """Test case for get_campaign_all_using_get

        List all campaigns  # noqa: E501
        """
        pass

    def test_get_campaign_data_all_using_get(self):
        """Test case for get_campaign_data_all_using_get

        List all campaign data  # noqa: E501
        """
        pass

    def test_get_campaign_data_using_get(self):
        """Test case for get_campaign_data_using_get

        Retrieve a campaign data record  # noqa: E501
        """
        pass

    def test_get_campaign_plan_all_using_get(self):
        """Test case for get_campaign_plan_all_using_get

        List all campaign plans  # noqa: E501
        """
        pass

    def test_get_campaign_plan_using_get(self):
        """Test case for get_campaign_plan_using_get

        Retrieve a campaign plan  # noqa: E501
        """
        pass

    def test_get_campaign_using_get(self):
        """Test case for get_campaign_using_get

        Retrieve a campaign  # noqa: E501
        """
        pass

    def test_get_client_campaign_all_using_get(self):
        """Test case for get_client_campaign_all_using_get

        List all clients/ips under a campaign  # noqa: E501
        """
        pass

    def test_get_client_campaign_using_get(self):
        """Test case for get_client_campaign_using_get

        Retrieve a clients/ips pair under a campaign  # noqa: E501
        """
        pass

    def test_update_campaign_data_using_put(self):
        """Test case for update_campaign_data_using_put

        Update a campaign data record  # noqa: E501
        """
        pass

    def test_update_campaign_plan_using_put(self):
        """Test case for update_campaign_plan_using_put

        Update a campaign plan  # noqa: E501
        """
        pass

    def test_update_campaign_using_put(self):
        """Test case for update_campaign_using_put

        Update a campaign  # noqa: E501
        """
        pass

    def test_update_client_campaign_using_put(self):
        """Test case for update_client_campaign_using_put

        Update a clients/ips pair under a campaign  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
