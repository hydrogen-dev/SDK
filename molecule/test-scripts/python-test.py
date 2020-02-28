from __future__ import print_function
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint
import time

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("qa")

# Configure OAuth2 access token for authorization: oauth
# Fetch and set access token with client_id and client_secret
print('\nrequesting OAuth bearer token...\n')
configuration.access_token = configuration.get_oauth_token('umurTest', 'umurTest539162%')
print(f'\n{configuration.access_token}\n')

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))

nucleus_client_id = "f40c3796-bfaa-4c16-a81e-34ebf9252364"
nucleus_model_id = "0da78c88-3f0c-49a5-94fc-babfe3368c5d"


print('Create Webhook')

payload = molecule_api.WebhookCreatePayload(
    url="https://www.hydrogenplatform.com",
    molecule_service=["whitelisted", "transaction"]
)

try:
    api_response = api_instance.post_webhook(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_webhook: %s\n" % e)

time.sleep(2);

webhook_id = api_response.id

print('Get Webhook')

try:
    api_response = api_instance.get_webhook(webhook_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_webhook: %s\n" % e)

time.sleep(2);

print('Get all Webhooks')

try:
    api_response = api_instance.get_webhooks()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_webhooks: %s\n" % e)

time.sleep(2);

print('Update webhook')

payload = molecule_api.WebhookUpdatePayload(
    is_active=False
)

try:
    api_response = api_instance.update_webhook(webhook_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->update_webhook: %s\n" % e)

time.sleep(2);

print('Delete webhook')

try:
    api_instance.delete_webhook(webhook_id)
except ApiException as e:
    print("Exception when calling MoleculeApi->delete_webhook: %s\n" % e)

time.sleep(2);

print('Create wallet 3')

client = molecule_api.WalletCreateClient(
    nucleus_client_id=nucleus_client_id,
    client_wallet_association_type="owner"
)

payload = molecule_api.WalletCreatePayload(
    name="Wallet 3",
    type="business",
    clients=[client]
)

try:
    api_response = api_instance.post_wallet(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_wallet: %s\n" % e)

wallet_3_id = api_response.id

time.sleep(2);

print('Generate wallet key 3')

payload = molecule_api.WalletKeyGeneratorPayload(
    wallet_id=wallet_3_id
)

try:
    api_response = api_instance.post_wallet_key_generator(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_wallet_key_generator: %s\n" % e)

time.sleep(90);

print('Create wallet 1')

payload = molecule_api.WalletCreatePayload(
    name="Wallet 1",
    type="business",
    clients=[client]
)

try:
    api_response = api_instance.post_wallet(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_wallet: %s\n" % e)

wallet_1_id = api_response.id

time.sleep(2);

print('Get wallet 1')

try:
    api_response = api_instance.get_wallet(wallet_1_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_wallet: %s\n" % e)

time.sleep(2);

print('Get all wallets')

try:
    api_response = api_instance.get_wallets()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_wallets: %s\n" % e)

time.sleep(2);

print('Update wallet 1')

payload = molecule_api.WalletUpdatePayload(
    is_active=False,
)

try:
    api_response = api_instance.update_wallet(wallet_1_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->update_wallet: %s\n" % e)

time.sleep(2);

print('Store wallet key 1')

payload = molecule_api.WalletKeyCreatePayload(
  wallet_id=wallet_1_id,
  private_key="0xA1FF580DCC87D926CC06319B383E54AC0AE5D188825EEAFA0E6DCD082186AD00",
  address="0x177e1749d6fea7AC0118725240ACA00f46b1E8bC"
)

try:
    api_response = api_instance.post_wallet_key(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_wallet_key: %s\n" % e)

wallet_key_id = api_response.id

time.sleep(2);

print('Get wallet key 1')

try:
    api_response = api_instance.get_wallet_key(wallet_key_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_wallet_key: %s\n" % e)

time.sleep(2);

print('Get all wallet keys')

try:
    api_response = api_instance.get_wallet_keys()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_wallet_keys: %s\n" % e)

time.sleep(2);

print('Create wallet 2')

payload = molecule_api.WalletCreatePayload(
    name="Wallet 2",
    type="business",
    clients=[client]
)

try:
    api_response = api_instance.post_wallet(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_wallet: %s\n" % e)

wallet_2_id = api_response.id

time.sleep(2);

print('Store wallet key 2')

payload = molecule_api.WalletKeyCreatePayload(
  wallet_id=wallet_2_id,
  private_key="0x19095CE7C6D5128B30FDDE9E7BC1B3AB1DD8D986D6D188606CD3A33100322B54",
  address="0xf13a1Ac7a8aE7AC83d180B666a32a266399Add9D"
)

try:
    api_response = api_instance.post_wallet_key(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_wallet_key: %s\n" % e)

time.sleep(2);

print('Find Ethereum Currency ID')

symbol = 'ETH'

try:
    api_response = api_instance.get_currencies(symbol=symbol)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currencies: %s\n" % e)

currency_id = api_response.content[0].id

time.sleep(2);

print('Transfer 0.08 ETH from W3 to W1')

payload = molecule_api.CurrencyTransferPayload(
  sender_wallet_id=wallet_3_id,
  receiver_wallet_id=wallet_1_id,
  currency_id=currency_id,
  amount="0.08"
)

try:
    api_response = api_instance.post_currency_transfer(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_currency_transfer: %s\n" % e)

time.sleep(90);

print('Create token')

token_offering_settings = molecule_api.OfferingSettingsCreatePayload(
    rate="10000"
)

token_restrictions = molecule_api.TokenRestrictionsPayload(
    min_age="21",
    include_country=["US","TR"]
)

payload = molecule_api.TokenCreatePayload(
    symbol="PTST",
    name="PYTHON SDK TEST TOKEN",
    total_supply="1000000",
    nucleus_model_id=nucleus_model_id,
    owner_wallet_id=wallet_1_id,
    restrictions=token_restrictions,
    offering_settings=token_offering_settings
)

try:
    api_response = api_instance.post_token(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_token: %s\n" % e)

token_id = api_response.id

time.sleep(2);

print('Get a token')

try:
    api_response = api_instance.get_token(token_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token: %s\n" % e)

time.sleep(2);

print('Get all tokens')

try:
    api_response = api_instance.get_tokens()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_tokens: %s\n" % e)

time.sleep(2);

print('Update a token')

payload = molecule_api.TokenUpdatePayload(
    total_supply="1000"
)

try:
    api_response = api_instance.update_token(token_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->update_token: %s\n" % e)

time.sleep(2);

print('Delete a token')

try:
    api_instance.delete_token(token_id)
except ApiException as e:
    print("Exception when calling MoleculeApi->delete_token: %s\n" % e)

time.sleep(2);

print('Create a token')

payload = molecule_api.TokenCreatePayload(
    symbol="PTST",
    name="PYTHON SDK TEST TOKEN",
    total_supply="1000000",
    nucleus_model_id=nucleus_model_id,
    owner_wallet_id=wallet_1_id,
    restrictions=token_restrictions,
    offering_settings=token_offering_settings
)

try:
    api_response = api_instance.post_token(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_token: %s\n" % e)

token_id = api_response.id

time.sleep(2);

print('Deploy a token')

payload = molecule_api.TokenDeployPayload(
    token_id=token_id
)

try:
    api_response = api_instance.post_token_deploy(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_token_deploy: %s\n" % e)

time.sleep(180);

print('Whitelist W2')

payload = molecule_api.TokenWhitelistPayload(
    token_id=token_id,
    wallet_id=wallet_2_id
)

try:
    api_instance.post_token_whitelist(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_token_whitelist: %s\n" % e)

time.sleep(90);

print('Deploy crowdsale')

payload = molecule_api.CrowdsaleDeployPayload(
    token_id=token_id
)

try:
    api_response = api_instance.post_crowdsale_deploy(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_crowdsale_deploy: %s\n" % e)

time.sleep(180);

print('Fund crowdsale')

payload = molecule_api.CrowdsaleFundPayload(
    token_id=token_id,
    supply="500000"
)

try:
    api_response = api_instance.post_crowdsale_fund(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_crowdsale_fund: %s\n" % e)

time.sleep(90);

print('purhcase from crowdsale')

payload = molecule_api.CrowdsalePurchasePayload(
    token_id=token_id,
    wallet_id=wallet_2_id,
    amount="100"
)

try:
    api_instance.post_crowdsale_purchase(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_crowdsale_purchase: %s\n" % e)

time.sleep(90);

print('Transfer tokens from W2 to W1')

payload = molecule_api.TokenTransferPayload(
    sender_wallet_id=wallet_2_id,
    receiver_wallet_id=wallet_1_id,
    token_id=token_id,
    amount="100"
)

try:
    api_instance.post_token_transfer(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_token_transfer: %s\n" % e)

time.sleep(90);

print('List all TX statuses')

try:
    api_response = api_instance.get_transaction_statuses()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_transaction_statuses: %s\n" % e)

transaction_status_id = api_response.content[0].id

time.sleep(2);

print('Get a TX status')

try:
    api_response = api_instance.get_transaction_status(transaction_status_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_transaction_status: %s\n" % e)

time.sleep(2);

print('List all currency balances')

try:
    api_response = api_instance.get_currency_balances()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency_balances: %s\n" % e)

currency_balance_id = api_response.content[0].id

time.sleep(2);

print('Get a currency balance')

try:
    api_response = api_instance.get_currency_balance(currency_balance_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency_balance: %s\n" % e)

time.sleep(2);


print('List all currency transfers')

try:
    api_response = api_instance.get_currency_transfers()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency_transfers: %s\n" % e)

currency_transfer_id = api_response.content[0].id

time.sleep(2);

print('Get a currency transfer')

try:
    api_response = api_instance.get_currency_transfer(currency_transfer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency_transfer: %s\n" % e)

time.sleep(2);

print('List all token supplies')

try:
    api_response = api_instance.get_token_supplies()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token_supplies: %s\n" % e)

token_supply_id = api_response.content[0].id

time.sleep(2);

print('Get a token supply')

try:
    api_response = api_instance.get_token_supply(token_supply_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token_supply: %s\n" % e)

time.sleep(2);

print('List all token transfers')

try:
    api_response = api_instance.get_token_transfers()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token_transfers: %s\n" % e)

token_transfer_id = api_response.content[0].id

time.sleep(2);

print('Get a token transfer')

try:
    api_response = api_instance.get_token_transfer(token_transfer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token_transfer: %s\n" % e)

time.sleep(2);

print('List all token balances')

try:
    api_response = api_instance.get_token_balances()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token_balances: %s\n" % e)

token_balance_id = api_response.content[0].id

time.sleep(2);

print('Get a token balance')

try:
    api_response = api_instance.get_token_balance(token_balance_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token_balance: %s\n" % e)

time.sleep(2);

print('List all currencies')

try:
    api_response = api_instance.get_currencies()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currencies: %s\n" % e)


time.sleep(2);

print('Get a currency')

try:
    api_response = api_instance.get_currency(currency_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency: %s\n" % e)

time.sleep(2);

# Query Parameter Tests

print('Filter by token_id')

try:
    api_response = api_instance.get_token_balances(token_id=token_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token_balances: %s\n" % e)

time.sleep(2);

print('Filter by currency_id')

try:
    api_response = api_instance.get_currency_balances(currency_id=currency_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency_balances: %s\n" % e)

time.sleep(2);

print('Filter by wallet_id')

try:
    api_response = api_instance.get_currency_transfers(wallet_id=wallet_1_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency_transfers: %s\n" % e)

time.sleep(2);

print('Filter by sender_wallet_id')

try:
    api_response = api_instance.get_currency_transfers(sender_wallet_id=wallet_1_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency_transfers: %s\n" % e)

time.sleep(2);

print('Filter by receiver_wallet_id')

try:
    api_response = api_instance.get_currency_transfers(receiver_wallet_id=wallet_1_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency_transfers: %s\n" % e)

time.sleep(2);

print('Filter by nucleus_client_id')

try:
    api_response = api_instance.get_wallets(nucleus_client_id=nucleus_client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_wallets: %s\n" % e)

time.sleep(2);

print('Filter by primary')

try:
    api_response = api_instance.get_wallets(nucleus_client_id=nucleus_client_id, is_primary="true")
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_wallets: %s\n" % e)

time.sleep(2);

print('Get latest')

try:
    api_response = api_instance.get_currency_balances(get_latest="true")
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency_balances: %s\n" % e)

time.sleep(2);
