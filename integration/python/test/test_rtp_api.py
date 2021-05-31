# coding: utf-8

"""
    Hydrogen Integration API

    The Hydrogen Integration API  # noqa: E501

    OpenAPI spec version: 1.3.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import integration_api
from integration_api.api.rtp_api import RTPApi  # noqa: E501
from integration_api.rest import ApiException


class TestRTPApi(unittest.TestCase):
    """RTPApi unit test stubs"""

    def setUp(self):
        self.api = integration_api.api.rtp_api.RTPApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_cancel_rtp_transfer_using_delete(self):
        """Test case for cancel_rtp_transfer_using_delete

        Cancel the RTP transfer  # noqa: E501
        """
        pass

    def test_create_bank_link_using_post2(self):
        """Test case for create_bank_link_using_post2

        Create bank link  # noqa: E501
        """
        pass

    def test_delete_bank_link_using_delete3(self):
        """Test case for delete_bank_link_using_delete3

        Delete bank link  # noqa: E501
        """
        pass

    def test_get_bank_link_using_get2(self):
        """Test case for get_bank_link_using_get2

        Get bank link  # noqa: E501
        """
        pass

    def test_get_client_bank_links_using_get1(self):
        """Test case for get_client_bank_links_using_get1

        Get client bank links  # noqa: E501
        """
        pass

    def test_get_list_of_rtp_transfers_using_get(self):
        """Test case for get_list_of_rtp_transfers_using_get

        Get a list of Rtp transfers  # noqa: E501
        """
        pass

    def test_get_rtp_transfer_using_get(self):
        """Test case for get_rtp_transfer_using_get

        Get the RTP transfer  # noqa: E501
        """
        pass

    def test_submit_rtp_transfer_using_post(self):
        """Test case for submit_rtp_transfer_using_post

        Submit a RTP transfer  # noqa: E501
        """
        pass

    def test_update_bank_link_using_put2(self):
        """Test case for update_bank_link_using_put2

        Update bank link  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
