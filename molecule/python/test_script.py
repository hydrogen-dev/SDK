from __future__ import print_function
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("dev")

# Configure OAuth2 access token for authorization: oauth
# Fetch and set access token with client_id and client_secret
print('\nrequesting OAuth bearer token...\n')
configuration.access_token = configuration.get_oauth_token('IntegrationTest', 'IntegrationTest')
print(f'\n{configuration.access_token}\n')

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))

# make a call
try:
    print('\nCalling GET /wallet...\n')
    api_response = api_instance.get_wallets()
    pprint(api_response)
except ApiException as e:
    print('Exception when calling MoleculeApi->get_wallets: %s\n' % e)
