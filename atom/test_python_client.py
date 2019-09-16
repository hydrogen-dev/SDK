from __future__ import print_function
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = atom_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("dev")

# Configure OAuth2 access token for authorization: oauth
# Fetch and set access token with client_id and client_secret
print('\nrequesting OAuth bearer token...\n')
configuration.access_token = configuration.get_oauth_token('TestUser', 'test123')
print(f'\n{configuration.access_token}\n')

# create an instance of the API class
proton = atom_api.ProtonApi(atom_api.ApiClient(configuration))
nucleus = atom_api.NucleusApi(atom_api.ApiClient(configuration))

# Nucleus 1.5.1
try:  # new param (bank_link): client_id
    print('\n\nPOST /bank_link with client_id\n')
    payload = atom_api.BankLinkPayload(bank_account_number='x44430998',
                                       bank_account_holder='george',
                                       name='Cool Bank',
                                       routing='123456789',
                                       client_id='30b56397-4354-470a-aae3-048a65080a55')
    api_response = nucleus.post_bank_link(payload)
    pprint(api_response)
    print('\n')
except ApiException as e:
    print('Exception when calling NucleusApi->post_bank_link: %s\n' % e)
try:  # new param (budget): aggregation_accounts
    print('\n\nPOST /budget with aggregation_accounts\n')
    payload = atom_api.BudgetPayload(client_id='10e6db9e-d2b2-4806-9a19-2203f877ece1',
                                     name='My Test Budget',
                                     currency_code='USD',
                                     frequency_unit='monthly',
                                     budget=[{"category": "Food & Dining", "subcategory": "Alcohol & Bars", "value": 50.0},
                                             {"category": "Health & Fitness", "subcategory": "Sports", "value": 50.0}],
                                     aggregation_accounts=[{'aggregation_account_id': 'f04faaa3-b504-4f87-938b-49ebbac9f23d'}, {'aggregation_account_id': '58a1c24d-ba1c-4630-89ec-dfab0779cc53'}])
    api_response = nucleus.post_budget(payload)
    pprint(api_response)
    print('\n')
except ApiException as e:
    print('Exception when calling NucleusApi->post_budget: %s\n' % e)

# Proton 1.6.2
try:  # new endpoint: budget_calculator
    print('\n\nPOST /budget_calculator\n')
    payload = atom_api.BudgetCalculatorPayload(budget_id='fcf758bc-bda2-4ceb-b9c8-bff16afe7b29')
    api_response = proton.budget_calculator(payload)
    pprint(api_response)
    print('\n')
except ApiException as e:
    print('Exception when calling ProtonApi->budget_calculator: %s\n' % e)

try:  # new endpoint: cash_flow_analysis
    print('\n\nPOST /cash_flow_analysis\n')
    payload = atom_api.CashFlowAnalysisPayload(client_id='1c92f054-e4a6-4e45-b29b-567587f34c27',
                                               start_date='2015-06-15',
                                               end_date='2015-06-30')
    api_response = proton.cash_flow_analysis(payload)
    pprint(api_response)
    print('\n')
except ApiException as e:
    print('Exception when calling ProtonApi->cash_flow_analysis: %s\n' % e)

try:  # new endpoint: financial_picture
    print('\nPOST /financial_picture\n')
    payload = atom_api.FinancialPicturePayload(client_id='1c92f054-e4a6-4e45-b29b-567587f34c27',
                                               start_date='2015-06-15',
                                               end_date='2015-06-30')
    print('payload: {}\n'.format(payload))
    api_response = proton.financial_picture(payload)
    pprint(api_response)
    print('\n')
except ApiException as e:
    print('Exception when calling ProtonApi->financial_picture: %s\n' % e)

