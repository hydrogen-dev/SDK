const molecule_api = require('hydrogen-molecule-api');

const defaultClient = molecule_api.ApiClient.instance;
defaultClient.basePath = "https://dev.hydrogenplatform.com";

const oauth = defaultClient.authentications['oauth'];
oauth.accessToken = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJOL0EiXSwiZXhwIjoxNTc1NTY3OTc0LCJhdXRob3JpdGllcyI6WyJST0xFX1NVUEVSX0FETUlOIl0sImp0aSI6ImYyOGY0OGQzLWU5YWYtNDQzYS1iM2EwLWJjMzFkMDI3MzU4NiIsImNsaWVudF9pZCI6InVtdXJUZXN0IiwiYXBwcyI6Im51Y2xldXMscHJvdG9uLGVsZWN0cm9uLGh5ZHJvLGlvbixtb2xlY3VsZSxpbnRlZ3JhdGlvbiJ9.LCmW7C2oYNSLD7e9hC3xGgNkr5mZ7RSqe-qGlgRhrN-iIu1XFQjaD3YqcC_gvdwYhmxa8ebbjN86inrY4WCW2jDSFVOd0fAf3HgYMiPQ3MO-6jwGX2MsokWK7dTQN0em2WhlILZoIAAaLC3tSx8qxIGzi4IpfjPIR4vcot70mCEH5YKdfmCdFv9t4mYoNqYox67FtQ0sYr7Ta83sD1N2YTlKOgUxBG1qvPOoMlPcqYceI2iQ-Qgdd2gdcFD9RQIYIgzF9xTZwqI19TQi7jEKWrLgP6_Nm2ZUz1S2R-YSG0y4LIXsCJ8wmwAS5h6fvXGDD3CPhu-F9tBLMIA_l788eA"

function sleep(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

const apiInstance = new molecule_api.MoleculeApi();

let webhookId;
let walletOneId;
let walletTwoId;
let walletThreeId;
let tokenId;
let currencyId;
let nucleusClientId = "922a3933-6ea6-444c-9743-14bd4224d06e";
let nucleusModelId = "dd8a49e0-da77-4f1f-a394-417a913914ec";

function webhooks(){

  let payload = new molecule_api.WebhookCreatePayload();
  payload.url="https://www.hydrogenplatform.com";
  payload.molecule_service=["whitelisted", "transaction"];

  apiInstance.postWebhook(payload, function(error, data, response) {
    console.log('Create a webhook \n', JSON.stringify(data));
    webhookId = data.id;

    apiInstance.getWebhook(webhookId, function(error, data, response){
      console.log('Get a webhook \n', JSON.stringify(data));

      apiInstance.getWebhooks(webhookId, function(error, data, response){
        console.log('Get all webhooks \n', JSON.stringify(data));

        payload = new molecule_api.WebhookUpdatePayload();
        payload.is_active=false;

        apiInstance.updateWebhook(webhookId, payload, function(error, data, response){
          if (error) {
            console.error(error);
          }
          console.log('Update a webhook \n', JSON.stringify(data));

          apiInstance.deleteWebhook(webhookId, function(error, data, response){
            console.log('Delete a webhook \n');
          })
        })
      })
    })
  })
}

function walletOne(){
  var client = new molecule_api.WalletCreateClient();
  client.nucleus_client_id = nucleusClientId;
  client.client_wallet_association_type = "owner";

  var payload = new molecule_api.WalletCreatePayload();
  payload.name = "Wallet";
  payload.type = "business";
  payload.clients = [client];

  apiInstance.postWallet(payload, function(error, data, response) {
    console.log('Create a wallet \n', JSON.stringify(data));
    walletOneId = data.id;

    apiInstance.getWallet(walletOneId, function(error, data, response) {
      console.log('Get a wallet \n', JSON.stringify(data));

      apiInstance.getWallets(walletOneId, function(error, data, response) {
        console.log('Get all wallets \n', JSON.stringify(data));

        payload = new molecule_api.WalletUpdatePayload();
        payload.name = "Wallet One";

        apiInstance.updateWallet(walletOneId, payload, function(error, data, response){
          console.log('Update a wallet \n', JSON.stringify(data));
        })
      })
    })
  })
}

function walletKeyOne(){
  var payload = new molecule_api.WalletKeyCreatePayload();
  payload.wallet_id=walletOneId;
  payload.private_key="0xA1FF580DCC87D926CC06319B383E54AC0AE5D188825EEAFA0E6DCD082186AD00";
  payload.address="0x177e1749d6fea7AC0118725240ACA00f46b1E8bC";

  apiInstance.postWalletKey(payload, function(error, data, response) {
    console.log('Store Wallet One Key \n', JSON.stringify(data));

    var walletKeyId = data.id;

    apiInstance.getWalletKeys(walletKeyId, function(error, data, response) {
      console.log('Get Wallet Keys \n', JSON.stringify(data));

      apiInstance.getWalletKey(walletKeyId, function(error, data, response) {
        console.log('Get Wallet One Key \n', JSON.stringify(data));
      })
    })
  })
}

function walletTwo(){
  var client = new molecule_api.WalletCreateClient();
  client.nucleus_client_id = nucleusClientId;
  client.client_wallet_association_type = "owner";

  var payload = new molecule_api.WalletCreatePayload();
  payload.name = "Wallet Two";
  payload.type = "business";
  payload.clients = [client];

  apiInstance.postWallet(payload, function(error, data, response) {
    console.log('Create wallet two \n', JSON.stringify(data));
    walletTwoId = data.id;

    payload = new molecule_api.WalletKeyCreatePayload();
    payload.wallet_id=data.id;
    payload.private_key="0x19095CE7C6D5128B30FDDE9E7BC1B3AB1DD8D986D6D188606CD3A33100322B54";
    payload.address="0xf13a1Ac7a8aE7AC83d180B666a32a266399Add9D";

    apiInstance.postWalletKey(payload, function(error, data, response) {
      console.log('Store Wallet Two Key \n', JSON.stringify(data));
    })
  })
}

function walletThree(){
  var client = new molecule_api.WalletCreateClient();
  client.nucleus_client_id = nucleusClientId;
  client.client_wallet_association_type = "owner";

  var payload = new molecule_api.WalletCreatePayload();
  payload.name = "Wallet Three";
  payload.type = "business";
  payload.clients = [client];

  apiInstance.postWallet(payload, function(error, data, response) {
    console.log('Create wallet three \n', JSON.stringify(data));
    walletThreeId = data.id;

    payload = new molecule_api.WalletKeyGeneratorPayload();
    payload.wallet_id=data.id;

    apiInstance.postWalletKeyGenerator(payload, function(error, data, response) {
      console.log('Generate Wallet Three Key \n', JSON.stringify(data));
    })
  })
}

function transferCurrency(){
  var payload = new molecule_api.CurrencyTransferPayload();
  payload.sender_wallet_id = walletThreeId;
  payload.receiver_wallet_id = walletOneId;
  payload.currency_id= currencyId;
  payload.amount= "0.08";

  apiInstance.postCurrencyTransfer(payload, function(error, data, response) {
    console.log('Transfer 0.08 ETH from W3 to W1 \n', JSON.stringify(data));
  })
}

function tokenOffChain(){
  var tokenOfferingSettings = new molecule_api.OfferingSettingsCreatePayload();
  tokenOfferingSettings.rate="10000";

  var tokenRestrictions = new molecule_api.TokenRestrictionsPayload();
  tokenRestrictions.min_age="21";
  tokenRestrictions.include_country=["US","TR"];

  var payload = new molecule_api.TokenCreatePayload();
  payload.symbol="JTST";
  payload.name="JAVASCRIPT SDK TEST TOKEN";
  payload.total_supply="1000000";
  payload.nucleus_model_id=nucleusModelId;
  payload.owner_wallet_id=walletOneId;
  payload.restrictions=tokenRestrictions;
  payload.offering_settings=tokenOfferingSettings;

  apiInstance.postToken(payload, function(error, data, response) {
    console.log('Create a token \n' + JSON.stringify(data));
    var tokenId = data.id;

    apiInstance.getTokens(tokenId, function(error, data, response){
      console.log('Get all tokens \n' + JSON.stringify(data));

      apiInstance.getToken(tokenId, function(error, data, response){
        console.log('Get a token \n' + JSON.stringify(data));

        payload = new molecule_api.TokenUpdatePayload();
        payload.total_supply="1000";

        apiInstance.updateToken(tokenId, payload, function(error, data, response){
          console.log('Update a token \n' + JSON.stringify(data));

          apiInstance.deleteToken(tokenId, function(error, data, response){
            console.log('Delete a token \n');
          })
        })
      })
    })
  })
}

function createToken(){
  var tokenOfferingSettings = new molecule_api.OfferingSettingsCreatePayload();
  tokenOfferingSettings.rate="10000";

  var tokenRestrictions = new molecule_api.TokenRestrictionsPayload();
  tokenRestrictions.min_age="21";
  tokenRestrictions.include_country=["US","TR"];

  var payload = new molecule_api.TokenCreatePayload();
  payload.symbol="JTST";
  payload.name="JAVASCRIPT SDK TEST TOKEN";
  payload.total_supply="1000000";
  payload.nucleus_model_id=nucleusModelId;
  payload.owner_wallet_id=walletOneId;
  payload.restrictions=tokenRestrictions;
  payload.offering_settings=tokenOfferingSettings;

  apiInstance.postToken(payload, function(error, data, response) {
    console.log('Create a token \n' + JSON.stringify(data));
    tokenId = data.id;
  })
}

function deployToken(){

  var payload = new molecule_api.TokenDeployPayload();
  payload.token_id= tokenId;

  apiInstance.postTokenDeploy(payload, function(error, data, response) {
    console.log('Deploy a token \n' + JSON.stringify(data));
  })
}

function whitelistWalletTwo(){

  var payload = new molecule_api.TokenWhitelistPayload();
  payload.token_id= tokenId;
  payload.wallet_id = walletTwoId;

  apiInstance.postTokenWhitelist(payload, function(error, data, response) {
    console.log('Whitelist W2 \n' + JSON.stringify(data));
  })
}

function deployCrowdsale(){

  var payload = new molecule_api.CrowdsaleDeployPayload();
  payload.token_id= tokenId;

  apiInstance.postCrowdsaleDeploy(payload, function(error, data, response) {
    console.log('Deploy a crowdsale \n' + JSON.stringify(data));
  })
}

function fundCrowdsale(){

  var payload = new molecule_api.CrowdsaleFundPayload();
  payload.token_id = tokenId;
  payload.supply = "500000";

  apiInstance.postCrowdsaleFund(payload, function(error, data, response) {
    console.log('Fund a crowdsale \n' + JSON.stringify(data));
  })
}

function purchaseCrowdsale(){

  var payload = new molecule_api.CrowdsalePurchasePayload();
  payload.token_id = tokenId;
  payload.wallet_id = walletTwoId;
  payload.amount = "100";

  apiInstance.postCrowdsalePurchase(payload, function(error, data, response) {
    console.log('Purchase from a crowdsale \n' + JSON.stringify(data));
  })
}

function transferToken(){
  var payload = new molecule_api.TokenTransferPayload();
  payload.sender_wallet_id = walletTwoId;
  payload.receiver_wallet_id = walletOneId;
  payload.token_id = tokenId;
  payload.amount = "100";

  apiInstance.postTokenTransfer(payload, function(error, data, response) {
    console.log('Tranfer tokens from W2 to W1 \n' + JSON.stringify(data));
  })
}

function transactionStatuses(){
  apiInstance.getTransactionStatuses(null, function(error, data, response) {
    console.log('Get all TX Statuses \n' + JSON.stringify(data));

    var transactionStatusId = data.content[0].id;
    apiInstance.getTransactionStatus(transactionStatusId, function(error, data, response) {
      console.log('Get TX Status \n' + JSON.stringify(data));
    })
  })
}

function currencyBalances(){
  apiInstance.getCurrencyBalances(null, function(error, data, response) {
    console.log('Get all currency balances \n' + JSON.stringify(data));

    var currencyBalanceId = data.content[0].id;
    apiInstance.getCurrencyBalance(currencyBalanceId, function(error, data, response) {
      console.log('Get currency balance \n' + JSON.stringify(data));
    })
  })
}

function currencyTransfers(){
  apiInstance.getCurrencyTransfers(null, function(error, data, response) {
    console.log('Get all currency transfers \n' + JSON.stringify(data));

    var currencyTransferId = data.content[0].id;
    apiInstance.getCurrencyTransfer(currencyTransferId, function(error, data, response) {
      console.log('Get currency transfer \n' + JSON.stringify(data));
    })
  })
}

function tokenTransfers(){
  apiInstance.getTokenTransfers(null, function(error, data, response) {
    console.log('Get all token transfers \n' + JSON.stringify(data));

    var tokenTransferId = data.content[0].id;
    apiInstance.getTokenTransfer(tokenTransferId, function(error, data, response) {
      console.log('Get token transfer \n' + JSON.stringify(data));
    })
  })
}

function tokenSupplies(){
  apiInstance.getTokenSupplies(null, function(error, data, response) {
    console.log('Get all token supplies \n' + JSON.stringify(data));

    var tokenSupplyId = data.content[0].id;
    apiInstance.getTokenSupply(tokenSupplyId, function(error, data, response) {
      console.log('Get token supply \n' + JSON.stringify(data));
    })
  })
}

function tokenBalances(){
  apiInstance.getTokenBalances(null, function(error, data, response) {
    console.log('Get all token balances \n' + JSON.stringify(data));

    var tokenBalanceId = data.content[0].id;
    apiInstance.getTokenBalance(tokenBalanceId, function(error, data, response) {
      console.log('Get token balance \n' + JSON.stringify(data));
    })
  })
}

function currencies(){
  apiInstance.getCurrencies(null, function(error, data, response) {
    console.log('Get all currencies \n' + JSON.stringify(data));

    var tempId = data.content[0].id;
    apiInstance.getCurrency(tempId, function(error, data, response) {
      console.log('Get currency \n' + JSON.stringify(data));
    })
  })
}

function queryParameterSymbol(){
  var params = {
    'symbol': "ETH"
  }

  apiInstance.getCurrencies(params, function(error, data, response) {
    console.log('Get currency id for ETH \n' + JSON.stringify(data));
    currencyId = data.content[0].id;
  })
}

function queryParameterTokenId(){
  var params = {
    'tokenId': tokenId
  }

  apiInstance.getTokenBalances(params, function(error, data, response) {
    console.log('Filter token balances by token id \n' + JSON.stringify(data));
  })
}

function queryParameterCurrencyId(){
  var params = {
    'currencyId': currencyId
  }

  apiInstance.getCurrencyBalances(params, function(error, data, response) {
    console.log('Filter currency balances by currency id \n' + JSON.stringify(data));
  })
}

function queryParameterWalletId(){
  var params = {
    'walletId': walletOneId
  }

  apiInstance.getCurrencyTransfers(params, function(error, data, response) {
    console.log('Filter currency transfers by wallet id \n' + JSON.stringify(data));
  })
}

function queryParameterSenderWalletId(){
  var params = {
    'senderWalletId': walletOneId
  }

  apiInstance.getCurrencyTransfers(params, function(error, data, response) {
    console.log('Filter currency transfers by sender wallet id \n' + JSON.stringify(data));
  })
}

function queryParameterReceiverWalletId(){
  var params = {
    'receiverWalletId': walletOneId
  }

  apiInstance.getCurrencyTransfers(params, function(error, data, response) {
    console.log('Filter currency transfers by receiver wallet id \n' + JSON.stringify(data));
  })
}

function queryParameterNucleusClientId(){
  var params = {
    'nucleusClientId': nucleusClientId
  }

  apiInstance.getWallets(params, function(error, data, response) {
    console.log('Filter wallets by nucleus client id \n' + JSON.stringify(data));
  })
}

function queryParameterIsPrimary(){
  var params = {
    'nucleusClientId': nucleusClientId,
    'isPrimary': true
  }

  apiInstance.getWallets(params, function(error, data, response) {
    console.log('Get primary wallet of a nucleus client id \n' + JSON.stringify(data));
  })
}

function queryParameterGetLatest(){
  var params = {
    'getLatest': true
  }

  apiInstance.getCurrencyBalances(params, function(error, data, response) {
    console.log('Get latest currency balance \n' + JSON.stringify(data));
  })
}

async function runTests() {
  await webhooks();
  await sleep(5000);
  await walletThree();
  await sleep(90000);
  await walletOne()
  await sleep(5000);
  await walletKeyOne();
  await sleep(5000);
  await walletTwo();
  await sleep(5000);
  await queryParameterSymbol();
  await sleep(5000);
  await transferCurrency();
  await sleep(5000);
  await tokenOffChain();
  await sleep(5000);
  await createToken();
  await sleep(5000);
  await deployToken();
  await sleep(180000);
  await whitelistWalletTwo();
  await sleep(90000);
  await deployCrowdsale();
  await sleep(180000);
  await fundCrowdsale();
  await sleep(90000);
  await purchaseCrowdsale();
  await sleep(90000);
  await transferToken();
  await sleep(90000);
  await transactionStatuses();
  await sleep(5000);
  await currencyBalances();
  await sleep(5000);
  await currencyTransfers();
  await sleep(5000);
  await tokenSupplies();
  await sleep(5000);
  await tokenTransfers();
  await sleep(5000);
  await tokenBalances();
  await sleep(5000);
  await currencies();
  await sleep(5000);
  await queryParameterTokenId();
  await sleep(5000);
  await queryParameterCurrencyId();
  await sleep(5000);
  await queryParameterWalletId();
  await sleep(5000);
  await queryParameterSenderWalletId();
  await sleep(5000);
  await queryParameterReceiverWalletId();
  await sleep(5000);
  await queryParameterNucleusClientId();
  await sleep(5000);
  await queryParameterIsPrimary();
  await sleep(5000);
  await queryParameterGetLatest();
  await sleep(5000);
}

runTests();
