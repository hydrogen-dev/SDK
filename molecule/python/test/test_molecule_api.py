# coding: utf-8

"""
    Hydrogen Molecule API

    The Hydrogen Molecule API  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import molecule_api
from molecule_api.api.molecule_api import MoleculeApi  # noqa: E501
from molecule_api.rest import ApiException


class TestMoleculeApi(unittest.TestCase):
    """MoleculeApi unit test stubs"""

    def setUp(self):
        self.api = molecule_api.api.molecule_api.MoleculeApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_delete_token(self):
        """Test case for delete_token

        Delete a token  # noqa: E501
        """
        pass

    def test_delete_webhook(self):
        """Test case for delete_webhook

        Delete a webhook  # noqa: E501
        """
        pass

    def test_get_currency_balance(self):
        """Test case for get_currency_balance

        Retrieve a currency balance  # noqa: E501
        """
        pass

    def test_get_currency_balances(self):
        """Test case for get_currency_balances

        Get information for all currency balances recorded in your application.  # noqa: E501
        """
        pass

    def test_get_currency_transfer(self):
        """Test case for get_currency_transfer

        Retrieve a currency transfer  # noqa: E501
        """
        pass

    def test_get_currency_transfers(self):
        """Test case for get_currency_transfers

        Get information for all currency transfers  # noqa: E501
        """
        pass

    def test_get_token(self):
        """Test case for get_token

        Retrieve a token  # noqa: E501
        """
        pass

    def test_get_token_balance(self):
        """Test case for get_token_balance

        Retrieve a token balance  # noqa: E501
        """
        pass

    def test_get_token_balances(self):
        """Test case for get_token_balances

        Get information for all token balances defined for your application.  # noqa: E501
        """
        pass

    def test_get_token_supplies(self):
        """Test case for get_token_supplies

        Get information for all token supplies defined for your application.  # noqa: E501
        """
        pass

    def test_get_token_supply(self):
        """Test case for get_token_supply

        Retrieve a token supply  # noqa: E501
        """
        pass

    def test_get_token_transfer(self):
        """Test case for get_token_transfer

        Retrieve a token transfer  # noqa: E501
        """
        pass

    def test_get_token_transfers(self):
        """Test case for get_token_transfers

        Get information for all token transfers  # noqa: E501
        """
        pass

    def test_get_tokens(self):
        """Test case for get_tokens

        Get information for all tokens defined for your firm  # noqa: E501
        """
        pass

    def test_get_transaction_status(self):
        """Test case for get_transaction_status

        Retrieve status information for a specific transaction  # noqa: E501
        """
        pass

    def test_get_transaction_statuses(self):
        """Test case for get_transaction_statuses

        Get status information for all transactions  # noqa: E501
        """
        pass

    def test_get_wallet(self):
        """Test case for get_wallet

        Retrieve a wallet  # noqa: E501
        """
        pass

    def test_get_wallet_key(self):
        """Test case for get_wallet_key

        Retrieve a wallet key  # noqa: E501
        """
        pass

    def test_get_wallet_keys(self):
        """Test case for get_wallet_keys

        Get all wallet keys associated with wallets defined for your firm.  # noqa: E501
        """
        pass

    def test_get_wallets(self):
        """Test case for get_wallets

        Get information for all wallets defined for your firm  # noqa: E501
        """
        pass

    def test_get_webhook(self):
        """Test case for get_webhook

        Retrieve a webhook  # noqa: E501
        """
        pass

    def test_get_webhooks(self):
        """Test case for get_webhooks

        Get information for all webhooks defined for your firm  # noqa: E501
        """
        pass

    def test_post_crowdsale_deploy(self):
        """Test case for post_crowdsale_deploy

        Deploy a token's crowdsale contract.  # noqa: E501
        """
        pass

    def test_post_crowdsale_fund(self):
        """Test case for post_crowdsale_fund

        Transfer tokens to a token's crowdsale address.  # noqa: E501
        """
        pass

    def test_post_crowdsale_purchase(self):
        """Test case for post_crowdsale_purchase

        Purchase tokens from a crowdsale contract  # noqa: E501
        """
        pass

    def test_post_currency_transfer(self):
        """Test case for post_currency_transfer

        Transfer currency between wallets  # noqa: E501
        """
        pass

    def test_post_token(self):
        """Test case for post_token

        Create a token under your firm.  # noqa: E501
        """
        pass

    def test_post_token_deploy(self):
        """Test case for post_token_deploy

        Deploy a security token contract to blockchain.  # noqa: E501
        """
        pass

    def test_post_token_transfer(self):
        """Test case for post_token_transfer

        Transfer tokens between wallets  # noqa: E501
        """
        pass

    def test_post_token_whitelist(self):
        """Test case for post_token_whitelist

        Add an investor to a token's whitelist  # noqa: E501
        """
        pass

    def test_post_wallet(self):
        """Test case for post_wallet

        Create a wallet under your firm.  # noqa: E501
        """
        pass

    def test_post_wallet_key(self):
        """Test case for post_wallet_key

        Associate an existing key pair with a wallet defined for your firm.  # noqa: E501
        """
        pass

    def test_post_wallet_key_generator(self):
        """Test case for post_wallet_key_generator

        Generate a wallet key using the Key Service and associate with a wallet defined for your firm.  # noqa: E501
        """
        pass

    def test_post_webhook(self):
        """Test case for post_webhook

        Create a webhook under your firm.  # noqa: E501
        """
        pass

    def test_update_token(self):
        """Test case for update_token

        Update a token  # noqa: E501
        """
        pass

    def test_update_wallet(self):
        """Test case for update_wallet

        Update a wallet  # noqa: E501
        """
        pass

    def test_update_webhook(self):
        """Test case for update_webhook

        Update a webhook  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
