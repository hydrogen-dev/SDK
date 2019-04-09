# atom_api.NucleusApi

All URIs are relative to *https://api.hydrogenplatform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAccount**](NucleusApi.md#deleteAccount) | **DELETE** /nucleus/v1/account/{account_id}/ | Delete an account
[**deleteAccountAllocation**](NucleusApi.md#deleteAccountAllocation) | **DELETE** /nucleus/v1/account_allocation/{account_allocation_id} | Delete an account allocation
[**deleteAccountPermission**](NucleusApi.md#deleteAccountPermission) | **DELETE** /nucleus/v1/account_permission/{account_id} | Delete an account&#39;s permissions
[**deleteAccountStage**](NucleusApi.md#deleteAccountStage) | **DELETE** /nucleus/v1/stage/{stage_id} | Delete an account stage
[**deleteAccountStatus**](NucleusApi.md#deleteAccountStatus) | **DELETE** /nucleus/v1/account_status/{account_status_id} | Delete an account status
[**deleteAccountType**](NucleusApi.md#deleteAccountType) | **DELETE** /nucleus/v1/account_type/{account_type_id} | Delete an account type
[**deleteAggregationAccount**](NucleusApi.md#deleteAggregationAccount) | **DELETE** /nucleus/v1/aggregation_account/{aggregation_account_id} | Delete an aggregation account
[**deleteAggregationAccountBalance**](NucleusApi.md#deleteAggregationAccountBalance) | **DELETE** /nucleus/v1/aggregation_account_balance/{aggregation_account_balance_id} | Delete an aggregation account balance
[**deleteAllocation**](NucleusApi.md#deleteAllocation) | **DELETE** /nucleus/v1/allocation/{allocation_id} | Delete an allocation
[**deleteAllocationComposition**](NucleusApi.md#deleteAllocationComposition) | **DELETE** /nucleus/v1/allocation_composition/{allocation_composition_id} | Delete an allocation composition
[**deleteBankLink**](NucleusApi.md#deleteBankLink) | **DELETE** /nucleus/v1/bank_link/{bank_link_id} | Delete a bank link
[**deleteBenchmark**](NucleusApi.md#deleteBenchmark) | **DELETE** /nucleus/v1/benchmark/{benchmark_id} | Delete a benchmark
[**deleteClient**](NucleusApi.md#deleteClient) | **DELETE** /nucleus/v1/client/{client_id} | Delete a client
[**deleteClientHydro**](NucleusApi.md#deleteClientHydro) | **DELETE** /nucleus/v1/client_hydro/{client_hydro_id} | Delete a client-hydro relationship
[**deleteClientResponse**](NucleusApi.md#deleteClientResponse) | **DELETE** /nucleus/v1/client_response/{client_response_id} | Delete a client response
[**deleteDecisionTree**](NucleusApi.md#deleteDecisionTree) | **DELETE** /nucleus/v1/decision_tree/{decision_tree_id} | Delete a decision tree
[**deleteDepositRequest**](NucleusApi.md#deleteDepositRequest) | **DELETE** /nucleus/v1/deposit/{deposit_id} | Delete a deposit request
[**deleteFundingRequest**](NucleusApi.md#deleteFundingRequest) | **DELETE** /nucleus/v1/funding/{funding_id} | Delete a funding request
[**deleteGoal**](NucleusApi.md#deleteGoal) | **DELETE** /nucleus/v1/goal/{goal_id} | Delete a goal
[**deleteGoalTrackRecord**](NucleusApi.md#deleteGoalTrackRecord) | **DELETE** /nucleus/v1/goal_track/{goal_track_id} | Delete a goal track record
[**deleteModel**](NucleusApi.md#deleteModel) | **DELETE** /nucleus/v1/model/{model_id} | Delete a model
[**deleteModelAssetSize**](NucleusApi.md#deleteModelAssetSize) | **DELETE** /nucleus/v1/model_asset_size/{model_asset_size_id} | Delete a model asset size
[**deleteModelComment**](NucleusApi.md#deleteModelComment) | **DELETE** /nucleus/v1/model_comment/{model_comment_id} | Delete a model commentary
[**deleteModelHolding**](NucleusApi.md#deleteModelHolding) | **DELETE** /nucleus/v1/model_holding/{model_holding_id} | Delete a model holding
[**deleteModelTransaction**](NucleusApi.md#deleteModelTransaction) | **DELETE** /nucleus/v1/model_transaction/{model_transaction_id} | Delete a model transaction
[**deleteNode**](NucleusApi.md#deleteNode) | **DELETE** /nucleus/v1/node/{node_id} | Delete a node
[**deleteNodeRelationship**](NucleusApi.md#deleteNodeRelationship) | **DELETE** /nucleus/v1/node_relationship/{node_relationship_id} | Delete a node relationship
[**deleteOrderRecord**](NucleusApi.md#deleteOrderRecord) | **DELETE** /nucleus/v1/order/{order_id} | Delete an order record
[**deleteOrderStatus**](NucleusApi.md#deleteOrderStatus) | **DELETE** /nucleus/v1/order_status/{order_status_id} | Delete an order status
[**deleteOrderTrackingRecord**](NucleusApi.md#deleteOrderTrackingRecord) | **DELETE** /nucleus/v1/order_track/{order_track_id} | Delete an order tracking record
[**deletePortfolio**](NucleusApi.md#deletePortfolio) | **DELETE** /nucleus/v1/portfolio/{portfolio_id} | Delete a portfolio
[**deletePortfolioAssetSize**](NucleusApi.md#deletePortfolioAssetSize) | **DELETE** /nucleus/v1/portfolio_asset_size/{portfolio_asset_size_id} | Delete a portfolio asset size
[**deletePortfolioComment**](NucleusApi.md#deletePortfolioComment) | **DELETE** /nucleus/v1/portfolio_comment/{portfolio_comment_id} | Delete a portfolio commentary
[**deletePortfolioHolding**](NucleusApi.md#deletePortfolioHolding) | **DELETE** /nucleus/v1/portfolio_holding/{portfolio_holding_id} | Delete a portfolio holding
[**deletePortfolioTransaction**](NucleusApi.md#deletePortfolioTransaction) | **DELETE** /nucleus/v1/portfolio_transaction/{portfolio_transaction_id} | Delete a portfolio transaction
[**deleteQuestionnaire**](NucleusApi.md#deleteQuestionnaire) | **DELETE** /nucleus/v1/questionnaire/{questionnaire_id} | Delete a questionnaire
[**deleteScore**](NucleusApi.md#deleteScore) | **DELETE** /nucleus/v1/score/{score_id} | Delete a score
[**deleteSecurity**](NucleusApi.md#deleteSecurity) | **DELETE** /nucleus/v1/security/{security_id} | Delete a security
[**deleteSecurityExclusion**](NucleusApi.md#deleteSecurityExclusion) | **DELETE** /nucleus/v1/security_exclusion/{security_exclusion_id} | Delete a security exclusion
[**deleteSecurityPrice**](NucleusApi.md#deleteSecurityPrice) | **DELETE** /nucleus/v1/security_price/{security_price_id} | Delete a security price
[**deleteTransactionCode**](NucleusApi.md#deleteTransactionCode) | **DELETE** /nucleus/v1/transaction_code/{transaction_code_id} | Delete a transaction code
[**deleteTransferRequest**](NucleusApi.md#deleteTransferRequest) | **DELETE** /nucleus/v1/transfer/{transfer_id} | Delete a transfer request
[**deleteWithdrawalRequest**](NucleusApi.md#deleteWithdrawalRequest) | **DELETE** /nucleus/v1/withdrawal/{withdrawal_id} | Delete a withdrawal request
[**getAccount**](NucleusApi.md#getAccount) | **GET** /nucleus/v1/account/{account_id}/ | Retrieve an account
[**getAccountAllocation**](NucleusApi.md#getAccountAllocation) | **GET** /nucleus/v1/account_allocation/{account_allocation_id} | Retrieve an account allocation
[**getAccountAllocations**](NucleusApi.md#getAccountAllocations) | **GET** /nucleus/v1/account_allocation | List all account allocations
[**getAccountAssetSizes**](NucleusApi.md#getAccountAssetSizes) | **GET** /nucleus/v1/account/{account_id}/asset_size | List all account asset sizes
[**getAccountHoldings**](NucleusApi.md#getAccountHoldings) | **GET** /nucleus/v1/account/{account_id}/holding | List all account holdings
[**getAccountPerformance**](NucleusApi.md#getAccountPerformance) | **GET** /nucleus/v1/account/{account_id}/performance | Get account performance
[**getAccountPermission**](NucleusApi.md#getAccountPermission) | **GET** /nucleus/v1/account_permission/{account_id} | Retrieve an account&#39;s permission
[**getAccountPermissions**](NucleusApi.md#getAccountPermissions) | **GET** /nucleus/v1/account_permission | List all account permissions
[**getAccountStage**](NucleusApi.md#getAccountStage) | **GET** /nucleus/v1/stage/{stage_id} | Retrieve an account stage
[**getAccountStages**](NucleusApi.md#getAccountStages) | **GET** /nucleus/v1/stage | List all account stages
[**getAccountStatus**](NucleusApi.md#getAccountStatus) | **GET** /nucleus/v1/account_status/{account_status_id} | Retrieve an account status
[**getAccountStatuses**](NucleusApi.md#getAccountStatuses) | **GET** /nucleus/v1/account_status | List all account statuses
[**getAccountTransactions**](NucleusApi.md#getAccountTransactions) | **GET** /nucleus/v1/account/{account_id}/transaction | List all account transactions
[**getAccountType**](NucleusApi.md#getAccountType) | **GET** /nucleus/v1/account_type/{account_type_id} | Retrieve an account type
[**getAccountTypes**](NucleusApi.md#getAccountTypes) | **GET** /nucleus/v1/account_type | List all account types
[**getAccounts**](NucleusApi.md#getAccounts) | **GET** /nucleus/v1/account | Get information for all accounts for all clients defined for your firm
[**getAggregationAccount**](NucleusApi.md#getAggregationAccount) | **GET** /nucleus/v1/aggregation_account/{aggregation_account_id} | Retrieve an aggregation account
[**getAggregationAccountBalance**](NucleusApi.md#getAggregationAccountBalance) | **GET** /nucleus/v1/aggregation_account_balance/{aggregation_account_balance_id} | Retrieve an aggregation account balance
[**getAggregationAccountBalances**](NucleusApi.md#getAggregationAccountBalances) | **GET** /nucleus/v1/aggregation_account_balance | List all aggregation account balances
[**getAggregationAccounts**](NucleusApi.md#getAggregationAccounts) | **GET** /nucleus/v1/aggregation_account | List all aggregation accounts
[**getAllocation**](NucleusApi.md#getAllocation) | **GET** /nucleus/v1/allocation/{allocation_id} | Retrieve an allocation
[**getAllocationAssetSizes**](NucleusApi.md#getAllocationAssetSizes) | **GET** /nucleus/v1/allocation/{allocation_id}/asset_size | List all allocation asset sizes
[**getAllocationComposition**](NucleusApi.md#getAllocationComposition) | **GET** /nucleus/v1/allocation_composition/{allocation_composition_id} | Retrieve an allocation composition
[**getAllocationCompositions**](NucleusApi.md#getAllocationCompositions) | **GET** /nucleus/v1/allocation_composition | List all allocation compositions
[**getAllocationHoldings**](NucleusApi.md#getAllocationHoldings) | **GET** /nucleus/v1/allocation/{allocation_id}/holding | List all allocation holdings
[**getAllocationPerformance**](NucleusApi.md#getAllocationPerformance) | **GET** /nucleus/v1/allocation/{allocation_id}/performance | Get allocation performance
[**getAllocationTransactions**](NucleusApi.md#getAllocationTransactions) | **GET** /nucleus/v1/allocation/{allocation_id}/transaction | List all allocation transactions
[**getAllocations**](NucleusApi.md#getAllocations) | **GET** /nucleus/v1/allocation | List all allocations
[**getBankLink**](NucleusApi.md#getBankLink) | **GET** /nucleus/v1/bank_link/{bank_link_id} | Retrieve a bank link
[**getBankLinks**](NucleusApi.md#getBankLinks) | **GET** /nucleus/v1/bank_link | List all bank links
[**getBenchmark**](NucleusApi.md#getBenchmark) | **GET** /nucleus/v1/benchmark/{benchmark_id} | Retrieve a benchmark
[**getBenchmarkAssetSizes**](NucleusApi.md#getBenchmarkAssetSizes) | **GET** /nucleus/v1/benchmark/{benchmark_id}/asset_size | List all benchmark asset sizes
[**getBenchmarkPerformance**](NucleusApi.md#getBenchmarkPerformance) | **GET** /nucleus/v1/benchmark/{benchmark_id}/performance | Get benchmark performance
[**getBenchmarks**](NucleusApi.md#getBenchmarks) | **GET** /nucleus/v1/benchmark | List all benchmarks
[**getBulkOrders**](NucleusApi.md#getBulkOrders) | **GET** /nucleus/v1/order_bulk | List all bulk orders
[**getClient**](NucleusApi.md#getClient) | **GET** /nucleus/v1/client/{client_id} | Retrieve a client
[**getClientAssetSizes**](NucleusApi.md#getClientAssetSizes) | **GET** /nucleus/v1/client/{client_id}/asset_size | List all client asset sizes
[**getClientHoldings**](NucleusApi.md#getClientHoldings) | **GET** /nucleus/v1/client/{client_id}/holding | List all client holdings
[**getClientHydro**](NucleusApi.md#getClientHydro) | **GET** /nucleus/v1/client_hydro/{client_hydro_id} | Retrieve a client-hydro relationship
[**getClientHydros**](NucleusApi.md#getClientHydros) | **GET** /nucleus/v1/client_hydro | List all client-hydro relationships
[**getClientPerformance**](NucleusApi.md#getClientPerformance) | **GET** /nucleus/v1/client/{client_id}/performance | Get client performance
[**getClientResponse**](NucleusApi.md#getClientResponse) | **GET** /nucleus/v1/client_response/{client_response_id} | Retrieve a client response
[**getClientResponses**](NucleusApi.md#getClientResponses) | **GET** /nucleus/v1/client_response | List all client responses
[**getClientTransactions**](NucleusApi.md#getClientTransactions) | **GET** /nucleus/v1/client/{client_id}/transaction | List all client transactions
[**getClients**](NucleusApi.md#getClients) | **GET** /nucleus/v1/client | List all clients
[**getDecisionTree**](NucleusApi.md#getDecisionTree) | **GET** /nucleus/v1/decision_tree/{decision_tree_id} | Retrieve a decision tree
[**getDecisionTrees**](NucleusApi.md#getDecisionTrees) | **GET** /nucleus/v1/decision_tree | List all decision trees
[**getDepositRequest**](NucleusApi.md#getDepositRequest) | **GET** /nucleus/v1/deposit/{deposit_id} | Retrieve a deposit request
[**getDepositRequests**](NucleusApi.md#getDepositRequests) | **GET** /nucleus/v1/deposit | List all deposit requests
[**getFundingRequest**](NucleusApi.md#getFundingRequest) | **GET** /nucleus/v1/funding/{funding_id} | Retrieve a funding request
[**getFundingRequests**](NucleusApi.md#getFundingRequests) | **GET** /nucleus/v1/funding | List all funding requests
[**getGoal**](NucleusApi.md#getGoal) | **GET** /nucleus/v1/goal/{goal_id} | Retrieve a goal
[**getGoalAssetSizes**](NucleusApi.md#getGoalAssetSizes) | **GET** /nucleus/v1/goal/{goal_id}/asset_size | List goal asset sizes
[**getGoalHoldings**](NucleusApi.md#getGoalHoldings) | **GET** /goal/{goal_id}/holding | List goal holdings
[**getGoalPerformance**](NucleusApi.md#getGoalPerformance) | **GET** /nucleus/v1/goal/{goal_id}/performance | Get goal performance
[**getGoalTrackRecord**](NucleusApi.md#getGoalTrackRecord) | **GET** /nucleus/v1/goal_track/{goal_track_id} | Retrieve a goal track record
[**getGoalTrackRecords**](NucleusApi.md#getGoalTrackRecords) | **GET** /nucleus/v1/goal_track | List all goal track records
[**getGoalTransactions**](NucleusApi.md#getGoalTransactions) | **GET** /nucleus/v1/goal/{goal_id}/transaction | List goal transactions
[**getGoals**](NucleusApi.md#getGoals) | **GET** /nucleus/v1/goal | List all goals
[**getModel**](NucleusApi.md#getModel) | **GET** /nucleus/v1/model/{model_id} | Retrieve a model
[**getModelAssetSize**](NucleusApi.md#getModelAssetSize) | **GET** /nucleus/v1/model_asset_size/{model_asset_size_id} | Retrieve a model asset size
[**getModelAssetSizes**](NucleusApi.md#getModelAssetSizes) | **GET** /nucleus/v1/model_asset_size | List all model asset sizes
[**getModelComment**](NucleusApi.md#getModelComment) | **GET** /nucleus/v1/model_comment/{model_comment_id} | Retrieve a model commentary
[**getModelComments**](NucleusApi.md#getModelComments) | **GET** /nucleus/v1/model_comment | List all model commentary
[**getModelHolding**](NucleusApi.md#getModelHolding) | **GET** /nucleus/v1/model_holding/{model_holding_id} | Retrieve a model holding
[**getModelHoldings**](NucleusApi.md#getModelHoldings) | **GET** /nucleus/v1/model_holding | List all model holdings
[**getModelPerformance**](NucleusApi.md#getModelPerformance) | **GET** /nucleus/v1/model/{model_id}/performance | Get model performance
[**getModelTransaction**](NucleusApi.md#getModelTransaction) | **GET** /nucleus/v1/model_transaction/{model_transaction_id} | Retrieve a model transaction
[**getModelTransactions**](NucleusApi.md#getModelTransactions) | **GET** /nucleus/v1/model_transaction | List all model transactions
[**getModels**](NucleusApi.md#getModels) | **GET** /nucleus/v1/model | List all models
[**getNode**](NucleusApi.md#getNode) | **GET** /nucleus/v1/node/{node_id} | Retrieve a node
[**getNodeRelationship**](NucleusApi.md#getNodeRelationship) | **GET** /nucleus/v1/node_relationship/{node_relationship_id} | Retrieve a node relationship
[**getNodeRelationships**](NucleusApi.md#getNodeRelationships) | **GET** /nucleus/v1/node_relationship | List all node relationships
[**getNodes**](NucleusApi.md#getNodes) | **GET** /nucleus/v1/node | List all nodes
[**getOrderRecord**](NucleusApi.md#getOrderRecord) | **GET** /nucleus/v1/order/{order_id} | Retrieve an order record
[**getOrderRecords**](NucleusApi.md#getOrderRecords) | **GET** /nucleus/v1/order | List all order records
[**getOrderStatus**](NucleusApi.md#getOrderStatus) | **GET** /nucleus/v1/order_status/{order_status_id} | Retrieve an order status
[**getOrderStatuses**](NucleusApi.md#getOrderStatuses) | **GET** /nucleus/v1/order_status | List all order statuses
[**getOrderTrackingRecord**](NucleusApi.md#getOrderTrackingRecord) | **GET** /nucleus/v1/order_track/{order_track_id} | Retrieve an order tracking record
[**getOrderTrackingRecords**](NucleusApi.md#getOrderTrackingRecords) | **GET** /nucleus/v1/order_track | List all order tracking records
[**getPortfolio**](NucleusApi.md#getPortfolio) | **GET** /nucleus/v1/portfolio/{portfolio_id} | Retrieve a portfolio
[**getPortfolioAssetSize**](NucleusApi.md#getPortfolioAssetSize) | **GET** /nucleus/v1/portfolio_asset_size/{portfolio_asset_size_id} | Retrieve a portfolio asset size
[**getPortfolioAssetSizes**](NucleusApi.md#getPortfolioAssetSizes) | **GET** /nucleus/v1/portfolio_asset_size | List all portfolio asset sizes
[**getPortfolioComment**](NucleusApi.md#getPortfolioComment) | **GET** /nucleus/v1/portfolio_comment/{portfolio_comment_id} | Retrieve a portfolio commentary
[**getPortfolioComments**](NucleusApi.md#getPortfolioComments) | **GET** /nucleus/v1/portfolio_comment | List all portfolio commentary
[**getPortfolioHolding**](NucleusApi.md#getPortfolioHolding) | **GET** /nucleus/v1/portfolio_holding/{portfolio_holding_id} | Retrieve a portfolio holding
[**getPortfolioHoldings**](NucleusApi.md#getPortfolioHoldings) | **GET** /nucleus/v1/portfolio_holding | List all portfolio holdings
[**getPortfolioPerformance**](NucleusApi.md#getPortfolioPerformance) | **GET** /nucleus/v1/portfolio/{portfolio_id}/performance | Get portfolio performance
[**getPortfolioTransaction**](NucleusApi.md#getPortfolioTransaction) | **GET** /nucleus/v1/portfolio_transaction/{portfolio_transaction_id} | Retrieve a portfolio transaction
[**getPortfolioTransactions**](NucleusApi.md#getPortfolioTransactions) | **GET** /nucleus/v1/portfolio_transaction | List all portfolio transactions
[**getPortfolios**](NucleusApi.md#getPortfolios) | **GET** /nucleus/v1/portfolio | List all portfolios
[**getQuestionnaire**](NucleusApi.md#getQuestionnaire) | **GET** /nucleus/v1/questionnaire/{questionnaire_id} | Retrieve a questionnaire
[**getQuestionnaires**](NucleusApi.md#getQuestionnaires) | **GET** /nucleus/v1/questionnaire | List all questionnaires
[**getScore**](NucleusApi.md#getScore) | **GET** /nucleus/v1/score/{score_id} | Retrieve a score
[**getScores**](NucleusApi.md#getScores) | **GET** /nucleus/v1/score | List all scores
[**getSecurities**](NucleusApi.md#getSecurities) | **GET** /nucleus/v1/security | List all securities
[**getSecurity**](NucleusApi.md#getSecurity) | **GET** /nucleus/v1/security/{security_id} | Retrieve a security
[**getSecurityExclusion**](NucleusApi.md#getSecurityExclusion) | **GET** /nucleus/v1/security_exclusion/{security_exclusion_id} | Retrieve a security exclusion
[**getSecurityExclusions**](NucleusApi.md#getSecurityExclusions) | **GET** /nucleus/v1/security_exclusion | List all security exclusions
[**getSecurityPerformance**](NucleusApi.md#getSecurityPerformance) | **GET** /nucleus/v1/security/{security_id}/performance | Get security performance
[**getSecurityPrice**](NucleusApi.md#getSecurityPrice) | **GET** /nucleus/v1/security_price/{security_price_id} | Retrieve a security price
[**getSecurityPrices**](NucleusApi.md#getSecurityPrices) | **GET** /nucleus/v1/security_price | List all security prices
[**getTransactionCode**](NucleusApi.md#getTransactionCode) | **GET** /nucleus/v1/transaction_code/{transaction_code_id} | Retrieve a transaction code
[**getTransactionCodes**](NucleusApi.md#getTransactionCodes) | **GET** /nucleus/v1/transaction_code | List all transaction codes
[**getTransferRequest**](NucleusApi.md#getTransferRequest) | **GET** /nucleus/v1/transfer/{transfer_id} | Retrieve a transfer request
[**getTransferRequests**](NucleusApi.md#getTransferRequests) | **GET** /nucleus/v1/transfer | List all transfer requests
[**getWithdrawalRequest**](NucleusApi.md#getWithdrawalRequest) | **GET** /nucleus/v1/withdrawal/{withdrawal_id} | Retrieve a withdrawal request
[**getWithdrawalRequests**](NucleusApi.md#getWithdrawalRequests) | **GET** /nucleus/v1/withdrawal | List all withdrawal requests
[**postAccount**](NucleusApi.md#postAccount) | **POST** /nucleus/v1/account | Create an account under a client
[**postAccountAllocation**](NucleusApi.md#postAccountAllocation) | **POST** /nucleus/v1/account_allocation | Create an account allocation
[**postAccountBulkOrder**](NucleusApi.md#postAccountBulkOrder) | **POST** /nucleus/v1/account/{account_id}/order_bulk | Bulk orders for an account
[**postAccountRebalanceBuyOnlyOrder**](NucleusApi.md#postAccountRebalanceBuyOnlyOrder) | **POST** /nucleus/v1/account/{account_id}/order_buy_only | Create buy-only account rebalance orders
[**postAccountRebalanceOrder**](NucleusApi.md#postAccountRebalanceOrder) | **POST** /nucleus/v1/account/{account_id}/order_rebalance | Create account rebalance orders
[**postAccountRebalanceSellOnlyOrder**](NucleusApi.md#postAccountRebalanceSellOnlyOrder) | **POST** /nucleus/v1/account/{account_id}/order_sell_only | Create sell-only account rebalance orders
[**postAccountSellAllOrder**](NucleusApi.md#postAccountSellAllOrder) | **POST** /nucleus/v1/account/{account_id}/order_sell_all | Sell all account order
[**postAccountStage**](NucleusApi.md#postAccountStage) | **POST** /nucleus/v1/stage | Create an account stage
[**postAccountStatus**](NucleusApi.md#postAccountStatus) | **POST** /nucleus/v1/account_status | Create an account status
[**postAccountType**](NucleusApi.md#postAccountType) | **POST** /nucleus/v1/account_type | Create an account type
[**postAggregationAccount**](NucleusApi.md#postAggregationAccount) | **POST** /nucleus/v1/aggregation_account | Create an aggregation account
[**postAggregationAccountBalance**](NucleusApi.md#postAggregationAccountBalance) | **POST** /nucleus/v1/aggregation_account_balance | Create an aggregation account balance
[**postAllocation**](NucleusApi.md#postAllocation) | **POST** /nucleus/v1/allocation | Create an allocation
[**postAllocationComposition**](NucleusApi.md#postAllocationComposition) | **POST** /nucleus/v1/allocation_composition | Create an allocation composition
[**postBankLink**](NucleusApi.md#postBankLink) | **POST** /nucleus/v1/bank_link | Create a bank link
[**postBenchmark**](NucleusApi.md#postBenchmark) | **POST** /nucleus/v1/benchmark | Create a benchmark
[**postBulkOrder**](NucleusApi.md#postBulkOrder) | **POST** /nucleus/v1/order_bulk | Bulk orders for your firm
[**postClient**](NucleusApi.md#postClient) | **POST** /nucleus/v1/client | Create a client
[**postClientBulkOrder**](NucleusApi.md#postClientBulkOrder) | **POST** /nucleus/v1/client/{client_id}/order_bulk | Bulk orders for a client
[**postClientHydro**](NucleusApi.md#postClientHydro) | **POST** /nucleus/v1/client_hydro | Create a client-hydro relationship
[**postClientResponse**](NucleusApi.md#postClientResponse) | **POST** /nucleus/v1/client_response | Create a client response
[**postDecisionTree**](NucleusApi.md#postDecisionTree) | **POST** /nucleus/v1/decision_tree | Create a decision tree
[**postDepositRequest**](NucleusApi.md#postDepositRequest) | **POST** /nucleus/v1/deposit | Create a deposit request
[**postFundingRequest**](NucleusApi.md#postFundingRequest) | **POST** /nucleus/v1/funding | Create a funding request
[**postGoal**](NucleusApi.md#postGoal) | **POST** /nucleus/v1/goal | Create a goal
[**postGoalTrackRecord**](NucleusApi.md#postGoalTrackRecord) | **POST** /nucleus/v1/goal_track | Create a goal track record
[**postModel**](NucleusApi.md#postModel) | **POST** /nucleus/v1/model | Create a model
[**postModelAssetSize**](NucleusApi.md#postModelAssetSize) | **POST** /nucleus/v1/model_asset_size | Create a model asset size
[**postModelComment**](NucleusApi.md#postModelComment) | **POST** /nucleus/v1/model_comment | Create a model commentary
[**postModelHolding**](NucleusApi.md#postModelHolding) | **POST** /nucleus/v1/model_holding | Create a model holding
[**postModelTransaction**](NucleusApi.md#postModelTransaction) | **POST** /nucleus/v1/model_transaction | Create a model transaction
[**postNode**](NucleusApi.md#postNode) | **POST** /nucleus/v1/node | Create a node
[**postNodeRelationship**](NucleusApi.md#postNodeRelationship) | **POST** /nucleus/v1/node_relationship | Create a node relationship
[**postOrderRecord**](NucleusApi.md#postOrderRecord) | **POST** /nucleus/v1/order | Create an order record
[**postOrderStatus**](NucleusApi.md#postOrderStatus) | **POST** /nucleus/v1/order_status | Create an order status
[**postOrderTrackingRecord**](NucleusApi.md#postOrderTrackingRecord) | **POST** /nucleus/v1/order_track | Create an order tracking record
[**postPortfolio**](NucleusApi.md#postPortfolio) | **POST** /nucleus/v1/portfolio | Create a portfolio
[**postPortfolioAssetSize**](NucleusApi.md#postPortfolioAssetSize) | **POST** /nucleus/v1/portfolio_asset_size | Create a portfolio asset size
[**postPortfolioComment**](NucleusApi.md#postPortfolioComment) | **POST** /nucleus/v1/portfolio_comment | Create a portfolio commentary
[**postPortfolioHolding**](NucleusApi.md#postPortfolioHolding) | **POST** /nucleus/v1/portfolio_holding | Create a portfolio holding
[**postPortfolioRebalanceBuyOnlyOrder**](NucleusApi.md#postPortfolioRebalanceBuyOnlyOrder) | **POST** /nucleus/v1/portfolio/{portfolio_id}/order_buy_only | Create buy-only portfolio rebalance orders
[**postPortfolioRebalanceOrder**](NucleusApi.md#postPortfolioRebalanceOrder) | **POST** /nucleus/v1/portfolio/{portfolio_id}/order_rebalance | Create portfolio rebalance orders
[**postPortfolioRebalanceSellOnlyOrder**](NucleusApi.md#postPortfolioRebalanceSellOnlyOrder) | **POST** /nucleus/v1/portfolio/{portfolio_id}/order_sell_only | Create sell-only portfolio rebalance orders
[**postPortfolioSellAllOrder**](NucleusApi.md#postPortfolioSellAllOrder) | **POST** /nucleus/v1/portfolio/{portfolio_id}/order_sell_all | Sell all portfolio order
[**postPortfolioTransaction**](NucleusApi.md#postPortfolioTransaction) | **POST** /nucleus/v1/portfolio_transaction | Create a portfolio transaction
[**postQuestionnaire**](NucleusApi.md#postQuestionnaire) | **POST** /nucleus/v1/questionnaire | Create a questionnaire
[**postScore**](NucleusApi.md#postScore) | **POST** /nucleus/v1/score | Create a score
[**postSecurity**](NucleusApi.md#postSecurity) | **POST** /nucleus/v1/security | Create a security
[**postSecurityExclusion**](NucleusApi.md#postSecurityExclusion) | **POST** /nucleus/v1/security_exclusion | Create a security exclusion
[**postSecurityPrice**](NucleusApi.md#postSecurityPrice) | **POST** /nucleus/v1/security_price | Create a security price
[**postTransactionCode**](NucleusApi.md#postTransactionCode) | **POST** /nucleus/v1/transaction_code | Create a transaction code
[**postTransferRequest**](NucleusApi.md#postTransferRequest) | **POST** /nucleus/v1/transfer | Create a transfer request
[**postWithdrawalRequest**](NucleusApi.md#postWithdrawalRequest) | **POST** /nucleus/v1/withdrawal | Create a withdrawal request
[**subscribeAccount**](NucleusApi.md#subscribeAccount) | **POST** /nucleus/v1/account/{account_id}/subscribe | Subscribe an account
[**updateAccount**](NucleusApi.md#updateAccount) | **PUT** /nucleus/v1/account/{account_id}/ | Update an account
[**updateAccountAllocation**](NucleusApi.md#updateAccountAllocation) | **PUT** /nucleus/v1/account_allocation/{account_allocation_id} | Update an account allocation
[**updateAccountPermission**](NucleusApi.md#updateAccountPermission) | **PUT** /nucleus/v1/account_permission/{account_id} | Update an account&#39;s permissions
[**updateAccountStage**](NucleusApi.md#updateAccountStage) | **PUT** /nucleus/v1/stage/{stage_id} | Update an account stage
[**updateAccountStatus**](NucleusApi.md#updateAccountStatus) | **PUT** /nucleus/v1/account_status/{account_status_id} | Update an account status
[**updateAccountType**](NucleusApi.md#updateAccountType) | **PUT** /nucleus/v1/account_type/{account_type_id} | Update an account type
[**updateAggregationAccount**](NucleusApi.md#updateAggregationAccount) | **PUT** /nucleus/v1/aggregation_account/{aggregation_account_id} | Update an aggregation account
[**updateAggregationAccountBalance**](NucleusApi.md#updateAggregationAccountBalance) | **PUT** /nucleus/v1/aggregation_account_balance/{aggregation_account_balance_id} | Update an aggregation account balance
[**updateAllocation**](NucleusApi.md#updateAllocation) | **PUT** /nucleus/v1/allocation/{allocation_id} | Update an allocation
[**updateAllocationComposition**](NucleusApi.md#updateAllocationComposition) | **PUT** /nucleus/v1/allocation_composition/{allocation_composition_id} | Update an allocation composition
[**updateBankLink**](NucleusApi.md#updateBankLink) | **PUT** /nucleus/v1/bank_link/{bank_link_id} | Update a bank link
[**updateBenchmark**](NucleusApi.md#updateBenchmark) | **PUT** /nucleus/v1/benchmark/{benchmark_id} | Update a benchmark
[**updateClient**](NucleusApi.md#updateClient) | **PUT** /nucleus/v1/client/{client_id} | Update a client
[**updateClientHydro**](NucleusApi.md#updateClientHydro) | **PUT** /nucleus/v1/client_hydro/{client_hydro_id} | Update a client-hydro relationship
[**updateClientResponse**](NucleusApi.md#updateClientResponse) | **PUT** /nucleus/v1/client_response/{client_response_id} | Update a client response
[**updateDecisionTree**](NucleusApi.md#updateDecisionTree) | **PUT** /nucleus/v1/decision_tree/{decision_tree_id} | Update a decision tree
[**updateDepositRequest**](NucleusApi.md#updateDepositRequest) | **PUT** /nucleus/v1/deposit/{deposit_id} | Update a deposit request
[**updateFundingRequest**](NucleusApi.md#updateFundingRequest) | **PUT** /nucleus/v1/funding/{funding_id} | Update a funding request
[**updateGoal**](NucleusApi.md#updateGoal) | **PUT** /nucleus/v1/goal/{goal_id} | Update a goal
[**updateGoalTrackRecord**](NucleusApi.md#updateGoalTrackRecord) | **PUT** /nucleus/v1/goal_track/{goal_track_id} | Update a goal track record
[**updateModel**](NucleusApi.md#updateModel) | **PUT** /nucleus/v1/model/{model_id} | Update a model
[**updateModelAssetSize**](NucleusApi.md#updateModelAssetSize) | **PUT** /nucleus/v1/model_asset_size/{model_asset_size_id} | Update a model asset size
[**updateModelComment**](NucleusApi.md#updateModelComment) | **PUT** /nucleus/v1/model_comment/{model_comment_id} | Update a model commentary
[**updateModelComposition**](NucleusApi.md#updateModelComposition) | **POST** /nucleus/v1/model/{model_id}/model_change | Change a model composition
[**updateModelHolding**](NucleusApi.md#updateModelHolding) | **PUT** /nucleus/v1/model_holding/{model_holding_id} | Update a model holding
[**updateModelTransaction**](NucleusApi.md#updateModelTransaction) | **PUT** /nucleus/v1/model_transaction/{model_transaction_id} | Update a model transaction
[**updateNode**](NucleusApi.md#updateNode) | **PUT** /nucleus/v1/node/{node_id} | Update a node
[**updateNodeRelationship**](NucleusApi.md#updateNodeRelationship) | **PUT** /nucleus/v1/node_relationship/{node_relationship_id} | Update a node relationship
[**updateOrderRecord**](NucleusApi.md#updateOrderRecord) | **PUT** /nucleus/v1/order/{order_id} | Update an order record
[**updateOrderStatus**](NucleusApi.md#updateOrderStatus) | **PUT** /nucleus/v1/order_status/{order_status_id} | Update an order status
[**updateOrderTrackingRecord**](NucleusApi.md#updateOrderTrackingRecord) | **PUT** /nucleus/v1/order_track/{order_track_id} | Update an order tracking record
[**updatePortfolio**](NucleusApi.md#updatePortfolio) | **PUT** /nucleus/v1/portfolio/{portfolio_id} | Update a portfolio
[**updatePortfolioAssetSize**](NucleusApi.md#updatePortfolioAssetSize) | **PUT** /nucleus/v1/portfolio_asset_size/{portfolio_asset_size_id} | Update a portfolio asset size
[**updatePortfolioComment**](NucleusApi.md#updatePortfolioComment) | **PUT** /nucleus/v1/portfolio_comment/{portfolio_comment_id} | Update a portfolio commentary
[**updatePortfolioHolding**](NucleusApi.md#updatePortfolioHolding) | **PUT** /nucleus/v1/portfolio_holding/{portfolio_holding_id} | Update a portfolio holding
[**updatePortfolioTransaction**](NucleusApi.md#updatePortfolioTransaction) | **PUT** /nucleus/v1/portfolio_transaction/{portfolio_transaction_id} | Update a portfolio transaction
[**updateQuestionnaire**](NucleusApi.md#updateQuestionnaire) | **PUT** /nucleus/v1/questionnaire/{questionnaire_id} | Update a questionnaire
[**updateScore**](NucleusApi.md#updateScore) | **PUT** /nucleus/v1/score/{score_id} | Update a score
[**updateSecurity**](NucleusApi.md#updateSecurity) | **PUT** /nucleus/v1/security/{security_id} | Update a security
[**updateSecurityExclusion**](NucleusApi.md#updateSecurityExclusion) | **PUT** /nucleus/v1/security_exclusion/{security_exclusion_id} | Update a security exclusion
[**updateSecurityPrice**](NucleusApi.md#updateSecurityPrice) | **PUT** /nucleus/v1/security_price/{security_price_id} | Update a security price
[**updateTransactionCode**](NucleusApi.md#updateTransactionCode) | **PUT** /nucleus/v1/transaction_code/{transaction_code_id} | Update a transaction code
[**updateTransferRequest**](NucleusApi.md#updateTransferRequest) | **PUT** /nucleus/v1/transfer/{transfer_id} | Update a transfer request
[**updateWithdrawalRequest**](NucleusApi.md#updateWithdrawalRequest) | **PUT** /nucleus/v1/withdrawal/{withdrawal_id} | Update a withdrawal request


<a name="deleteAccount"></a>
# **deleteAccount**
> deleteAccount(accountId)

Delete an account

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAccount(accountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountAllocation"></a>
# **deleteAccountAllocation**
> deleteAccountAllocation(accountAllocationId)

Delete an account allocation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountAllocationId = "accountAllocationId_example"; // String | UUID of an account allocation


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAccountAllocation(accountAllocationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountAllocationId** | [**String**](.md)| UUID of an account allocation | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountPermission"></a>
# **deleteAccountPermission**
> deleteAccountPermission(accountId)

Delete an account&#39;s permissions

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAccountPermission(accountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountStage"></a>
# **deleteAccountStage**
> deleteAccountStage(stageId)

Delete an account stage

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var stageId = "stageId_example"; // String | UUID of an account stage


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAccountStage(stageId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageId** | [**String**](.md)| UUID of an account stage | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountStatus"></a>
# **deleteAccountStatus**
> deleteAccountStatus(accountStatusId)

Delete an account status

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountStatusId = "accountStatusId_example"; // String | UUID of an account status


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAccountStatus(accountStatusId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountStatusId** | [**String**](.md)| UUID of an account status | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountType"></a>
# **deleteAccountType**
> deleteAccountType(accountTypeId)

Delete an account type

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountTypeId = "accountTypeId_example"; // String | UUID of an account type


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAccountType(accountTypeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountTypeId** | [**String**](.md)| UUID of an account type | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAggregationAccount"></a>
# **deleteAggregationAccount**
> deleteAggregationAccount(aggregationAccountId)

Delete an aggregation account

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var aggregationAccountId = "aggregationAccountId_example"; // String | UUID of an aggregation account


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAggregationAccount(aggregationAccountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountId** | [**String**](.md)| UUID of an aggregation account | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAggregationAccountBalance"></a>
# **deleteAggregationAccountBalance**
> deleteAggregationAccountBalance(aggregationAccountBalanceId)

Delete an aggregation account balance

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var aggregationAccountBalanceId = "aggregationAccountBalanceId_example"; // String | UUID of an aggregation account balance


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAggregationAccountBalance(aggregationAccountBalanceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalanceId** | [**String**](.md)| UUID of an aggregation account balance | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAllocation"></a>
# **deleteAllocation**
> deleteAllocation(allocationId)

Delete an allocation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var allocationId = "allocationId_example"; // String | UUID of an allocation


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAllocation(allocationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**String**](.md)| UUID of an allocation | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAllocationComposition"></a>
# **deleteAllocationComposition**
> deleteAllocationComposition(allocationCompositionId)

Delete an allocation composition

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var allocationCompositionId = "allocationCompositionId_example"; // String | UUID of an allocation composition


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAllocationComposition(allocationCompositionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationCompositionId** | [**String**](.md)| UUID of an allocation composition | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBankLink"></a>
# **deleteBankLink**
> deleteBankLink(bankLinkId)

Delete a bank link

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var bankLinkId = "bankLinkId_example"; // String | UUID of a bank link


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteBankLink(bankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankLinkId** | [**String**](.md)| UUID of a bank link | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBenchmark"></a>
# **deleteBenchmark**
> deleteBenchmark(benchmarkId, )

Delete a benchmark

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var benchmarkId = "benchmarkId_example"; // String | UUID of a benchmark


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteBenchmark(benchmarkId, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmarkId** | [**String**](.md)| UUID of a benchmark | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClient"></a>
# **deleteClient**
> deleteClient(clientId, )

Delete a client

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientId = "clientId_example"; // String | UUID of a client


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteClient(clientId, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID of a client | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClientHydro"></a>
# **deleteClientHydro**
> deleteClientHydro(clientHydroId)

Delete a client-hydro relationship

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientHydroId = "clientHydroId_example"; // String | UUID of a client-hydro relationship


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteClientHydro(clientHydroId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientHydroId** | [**String**](.md)| UUID of a client-hydro relationship | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClientResponse"></a>
# **deleteClientResponse**
> deleteClientResponse(clientResponseId)

Delete a client response

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientResponseId = "clientResponseId_example"; // String | UUID of a client response


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteClientResponse(clientResponseId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientResponseId** | [**String**](.md)| UUID of a client response | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDecisionTree"></a>
# **deleteDecisionTree**
> deleteDecisionTree(decisionTreeId)

Delete a decision tree

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var decisionTreeId = "decisionTreeId_example"; // String | UUID of a decision tree


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteDecisionTree(decisionTreeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTreeId** | [**String**](.md)| UUID of a decision tree | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDepositRequest"></a>
# **deleteDepositRequest**
> deleteDepositRequest(depositId)

Delete a deposit request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var depositId = "depositId_example"; // String | UUID of a deposit record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteDepositRequest(depositId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositId** | [**String**](.md)| UUID of a deposit record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFundingRequest"></a>
# **deleteFundingRequest**
> deleteFundingRequest(fundingId)

Delete a funding request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var fundingId = "fundingId_example"; // String | UUID of a funding record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteFundingRequest(fundingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingId** | [**String**](.md)| UUID of a funding record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGoal"></a>
# **deleteGoal**
> deleteGoal(goalId, )

Delete a goal

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var goalId = "goalId_example"; // String | UUID of a goal


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteGoal(goalId, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalId** | [**String**](.md)| UUID of a goal | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGoalTrackRecord"></a>
# **deleteGoalTrackRecord**
> deleteGoalTrackRecord(goalTrackId)

Delete a goal track record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var goalTrackId = "goalTrackId_example"; // String | UUID of a goal tracking record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteGoalTrackRecord(goalTrackId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalTrackId** | [**String**](.md)| UUID of a goal tracking record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteModel"></a>
# **deleteModel**
> deleteModel(modelId, )

Delete a model

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelId = "modelId_example"; // String | UUID of a model


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteModel(modelId, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**String**](.md)| UUID of a model | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteModelAssetSize"></a>
# **deleteModelAssetSize**
> deleteModelAssetSize(modelAssetSizeId)

Delete a model asset size

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelAssetSizeId = "modelAssetSizeId_example"; // String | UUID of a model asset size record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteModelAssetSize(modelAssetSizeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelAssetSizeId** | [**String**](.md)| UUID of a model asset size record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteModelComment"></a>
# **deleteModelComment**
> deleteModelComment(modelCommentId)

Delete a model commentary

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelCommentId = "modelCommentId_example"; // String | UUID of a model comment


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteModelComment(modelCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelCommentId** | [**String**](.md)| UUID of a model comment | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteModelHolding"></a>
# **deleteModelHolding**
> deleteModelHolding(modelHoldingId)

Delete a model holding

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelHoldingId = "modelHoldingId_example"; // String | UUID of a model holding record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteModelHolding(modelHoldingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelHoldingId** | [**String**](.md)| UUID of a model holding record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteModelTransaction"></a>
# **deleteModelTransaction**
> deleteModelTransaction(modelTransactionId)

Delete a model transaction

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelTransactionId = "modelTransactionId_example"; // String | UUID of a model transaction record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteModelTransaction(modelTransactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelTransactionId** | [**String**](.md)| UUID of a model transaction record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNode"></a>
# **deleteNode**
> deleteNode(nodeId)

Delete a node

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var nodeId = "nodeId_example"; // String | UUID of a node


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteNode(nodeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | [**String**](.md)| UUID of a node | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNodeRelationship"></a>
# **deleteNodeRelationship**
> deleteNodeRelationship(nodeRelationshipId)

Delete a node relationship

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var nodeRelationshipId = "nodeRelationshipId_example"; // String | UUID of a node relationship


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteNodeRelationship(nodeRelationshipId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeRelationshipId** | [**String**](.md)| UUID of a node relationship | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrderRecord"></a>
# **deleteOrderRecord**
> deleteOrderRecord(orderId)

Delete an order record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var orderId = "orderId_example"; // String | UUID of an order record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteOrderRecord(orderId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | [**String**](.md)| UUID of an order record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrderStatus"></a>
# **deleteOrderStatus**
> deleteOrderStatus(orderStatusId)

Delete an order status

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var orderStatusId = "orderStatusId_example"; // String | UUID of an order status record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteOrderStatus(orderStatusId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderStatusId** | [**String**](.md)| UUID of an order status record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrderTrackingRecord"></a>
# **deleteOrderTrackingRecord**
> deleteOrderTrackingRecord(orderTrackId)

Delete an order tracking record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var orderTrackId = "orderTrackId_example"; // String | UUID of an order tracking record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteOrderTrackingRecord(orderTrackId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderTrackId** | [**String**](.md)| UUID of an order tracking record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePortfolio"></a>
# **deletePortfolio**
> deletePortfolio(portfolioId)

Delete a portfolio

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioId = "portfolioId_example"; // String | UUID of a portfolio


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePortfolio(portfolioId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**String**](.md)| UUID of a portfolio | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePortfolioAssetSize"></a>
# **deletePortfolioAssetSize**
> deletePortfolioAssetSize(portfolioAssetSizeId)

Delete a portfolio asset size

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioAssetSizeId = "portfolioAssetSizeId_example"; // String | UUID of a portfolio asset size record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePortfolioAssetSize(portfolioAssetSizeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioAssetSizeId** | [**String**](.md)| UUID of a portfolio asset size record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePortfolioComment"></a>
# **deletePortfolioComment**
> deletePortfolioComment(portfolioCommentId)

Delete a portfolio commentary

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioCommentId = "portfolioCommentId_example"; // String | UUID of a portfolio comment


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePortfolioComment(portfolioCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioCommentId** | [**String**](.md)| UUID of a portfolio comment | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePortfolioHolding"></a>
# **deletePortfolioHolding**
> deletePortfolioHolding(portfolioHoldingId)

Delete a portfolio holding

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioHoldingId = "portfolioHoldingId_example"; // String | UUID of a portfolio holding record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePortfolioHolding(portfolioHoldingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioHoldingId** | [**String**](.md)| UUID of a portfolio holding record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePortfolioTransaction"></a>
# **deletePortfolioTransaction**
> deletePortfolioTransaction(portfolioTransactionId)

Delete a portfolio transaction

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioTransactionId = "portfolioTransactionId_example"; // String | UUID of a portfolio transaction record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePortfolioTransaction(portfolioTransactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioTransactionId** | [**String**](.md)| UUID of a portfolio transaction record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQuestionnaire"></a>
# **deleteQuestionnaire**
> deleteQuestionnaire(questionnaireId)

Delete a questionnaire

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var questionnaireId = "questionnaireId_example"; // String | UUID of a questionnaire


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteQuestionnaire(questionnaireId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaireId** | [**String**](.md)| UUID of a questionnaire | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteScore"></a>
# **deleteScore**
> deleteScore(scoreId)

Delete a score

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var scoreId = "scoreId_example"; // String | UUID of a score record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteScore(scoreId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scoreId** | [**String**](.md)| UUID of a score record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSecurity"></a>
# **deleteSecurity**
> deleteSecurity(securityId)

Delete a security

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var securityId = "securityId_example"; // String | UUID of a security


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSecurity(securityId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityId** | [**String**](.md)| UUID of a security | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSecurityExclusion"></a>
# **deleteSecurityExclusion**
> deleteSecurityExclusion(securityExclusionId)

Delete a security exclusion

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var securityExclusionId = "securityExclusionId_example"; // String | UUID of a security exclusion record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSecurityExclusion(securityExclusionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityExclusionId** | [**String**](.md)| UUID of a security exclusion record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSecurityPrice"></a>
# **deleteSecurityPrice**
> deleteSecurityPrice(securityPriceId)

Delete a security price

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var securityPriceId = "securityPriceId_example"; // String | UUID of a security price record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSecurityPrice(securityPriceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityPriceId** | [**String**](.md)| UUID of a security price record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTransactionCode"></a>
# **deleteTransactionCode**
> deleteTransactionCode(transactionCodeId)

Delete a transaction code

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var transactionCodeId = "transactionCodeId_example"; // String | UUID of a transaction code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteTransactionCode(transactionCodeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionCodeId** | [**String**](.md)| UUID of a transaction code | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTransferRequest"></a>
# **deleteTransferRequest**
> deleteTransferRequest(transferId)

Delete a transfer request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var transferId = "transferId_example"; // String | UUID of an account transfer record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteTransferRequest(transferId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferId** | [**String**](.md)| UUID of an account transfer record | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWithdrawalRequest"></a>
# **deleteWithdrawalRequest**
> deleteWithdrawalRequest(withdrawalId)

Delete a withdrawal request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var withdrawalId = "withdrawalId_example"; // String | UUID of a withdrawal request


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteWithdrawalRequest(withdrawalId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawalId** | [**String**](.md)| UUID of a withdrawal request | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccount"></a>
# **getAccount**
> SpecificAccountResponse getAccount(accountId)

Retrieve an account

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccount(accountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 

### Return type

[**SpecificAccountResponse**](SpecificAccountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountAllocation"></a>
# **getAccountAllocation**
> SpecificAccountAllocationResponse getAccountAllocation(accountAllocationId)

Retrieve an account allocation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountAllocationId = "accountAllocationId_example"; // String | UUID of an account allocation


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountAllocation(accountAllocationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountAllocationId** | [**String**](.md)| UUID of an account allocation | 

### Return type

[**SpecificAccountAllocationResponse**](SpecificAccountAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountAllocations"></a>
# **getAccountAllocations**
> GetAccountAllocationResponse getAccountAllocations(opts)

List all account allocations

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountAllocations(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetAccountAllocationResponse**](GetAccountAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountAssetSizes"></a>
# **getAccountAssetSizes**
> GetAccountAssetSizeResponse getAccountAssetSizes(accountId, opts)

List all account asset sizes

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account

var opts = { 
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountAssetSizes(accountId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetAccountAssetSizeResponse**](GetAccountAssetSizeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountHoldings"></a>
# **getAccountHoldings**
> GetAccountHoldingResponse getAccountHoldings(accountId, opts)

List all account holdings

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account

var opts = { 
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountHoldings(accountId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetAccountHoldingResponse**](GetAccountHoldingResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountPerformance"></a>
# **getAccountPerformance**
> PerformanceResponse getAccountPerformance(accountIdstat)

Get account performance

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account

var stat = "stat_example"; // String | Performance statistic


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountPerformance(accountIdstat, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 
 **stat** | **String**| Performance statistic | 

### Return type

[**PerformanceResponse**](PerformanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountPermission"></a>
# **getAccountPermission**
> SpecificAccountPermissionResponse getAccountPermission(accountId)

Retrieve an account&#39;s permission

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountPermission(accountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 

### Return type

[**SpecificAccountPermissionResponse**](SpecificAccountPermissionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountPermissions"></a>
# **getAccountPermissions**
> GetAccountPermissionsResponse getAccountPermissions(opts)

List all account permissions

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountPermissions(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetAccountPermissionsResponse**](GetAccountPermissionsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountStage"></a>
# **getAccountStage**
> SpecificAccountStageResponse getAccountStage(stageId)

Retrieve an account stage

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var stageId = "stageId_example"; // String | UUID of an account stage


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountStage(stageId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageId** | [**String**](.md)| UUID of an account stage | 

### Return type

[**SpecificAccountStageResponse**](SpecificAccountStageResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountStages"></a>
# **getAccountStages**
> GetAccountStageResponse getAccountStages(opts)

List all account stages

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountStages(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetAccountStageResponse**](GetAccountStageResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountStatus"></a>
# **getAccountStatus**
> SpecificAccountStatusResponse getAccountStatus(accountStatusId)

Retrieve an account status

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountStatusId = "accountStatusId_example"; // String | UUID of an account status


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountStatus(accountStatusId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountStatusId** | [**String**](.md)| UUID of an account status | 

### Return type

[**SpecificAccountStatusResponse**](SpecificAccountStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountStatuses"></a>
# **getAccountStatuses**
> GetAccountStatusResponse getAccountStatuses(opts)

List all account statuses

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountStatuses(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetAccountStatusResponse**](GetAccountStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountTransactions"></a>
# **getAccountTransactions**
> AccountTransactionResponse getAccountTransactions(accountId, opts)

List all account transactions

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account

var opts = { 
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountTransactions(accountId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**AccountTransactionResponse**](AccountTransactionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountType"></a>
# **getAccountType**
> GetAccountTypeSubresponse getAccountType(accountTypeId)

Retrieve an account type

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountTypeId = "accountTypeId_example"; // String | UUID of an account type


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountType(accountTypeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountTypeId** | [**String**](.md)| UUID of an account type | 

### Return type

[**GetAccountTypeSubresponse**](GetAccountTypeSubresponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountTypes"></a>
# **getAccountTypes**
> GetAccountTypeResponse getAccountTypes(opts)

List all account types

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountTypes(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetAccountTypeResponse**](GetAccountTypeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccounts"></a>
# **getAccounts**
> GetAccountResponse getAccounts(opts)

Get information for all accounts for all clients defined for your firm

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccounts(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetAccountResponse**](GetAccountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAggregationAccount"></a>
# **getAggregationAccount**
> SpecificAggregationAccountResponse getAggregationAccount(aggregationAccountId)

Retrieve an aggregation account

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var aggregationAccountId = "aggregationAccountId_example"; // String | UUID of an aggregation account


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccount(aggregationAccountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountId** | [**String**](.md)| UUID of an aggregation account | 

### Return type

[**SpecificAggregationAccountResponse**](SpecificAggregationAccountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAggregationAccountBalance"></a>
# **getAggregationAccountBalance**
> SpecificAggregationAccountBalanceResponse getAggregationAccountBalance(aggregationAccountBalanceId)

Retrieve an aggregation account balance

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var aggregationAccountBalanceId = "aggregationAccountBalanceId_example"; // String | UUID of an aggregation account balance


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountBalance(aggregationAccountBalanceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalanceId** | [**String**](.md)| UUID of an aggregation account balance | 

### Return type

[**SpecificAggregationAccountBalanceResponse**](SpecificAggregationAccountBalanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAggregationAccountBalances"></a>
# **getAggregationAccountBalances**
> GetAggregationAccountBalanceResponse getAggregationAccountBalances(opts)

List all aggregation account balances

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountBalances(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetAggregationAccountBalanceResponse**](GetAggregationAccountBalanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAggregationAccounts"></a>
# **getAggregationAccounts**
> GetAggregationAccountsResponse getAggregationAccounts(opts)

List all aggregation accounts

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccounts(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetAggregationAccountsResponse**](GetAggregationAccountsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllocation"></a>
# **getAllocation**
> SpecificAllocationResponse getAllocation(allocationId)

Retrieve an allocation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var allocationId = "allocationId_example"; // String | UUID of an allocation


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocation(allocationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**String**](.md)| UUID of an allocation | 

### Return type

[**SpecificAllocationResponse**](SpecificAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllocationAssetSizes"></a>
# **getAllocationAssetSizes**
> AllocationAssetSizeResponse getAllocationAssetSizes(allocationId, opts)

List all allocation asset sizes

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var allocationId = "allocationId_example"; // String | UUID of an allocation

var opts = { 
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocationAssetSizes(allocationId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**String**](.md)| UUID of an allocation | 
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**AllocationAssetSizeResponse**](AllocationAssetSizeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllocationComposition"></a>
# **getAllocationComposition**
> SpecificAllocationCompositionResponse getAllocationComposition(allocationCompositionId)

Retrieve an allocation composition

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var allocationCompositionId = "allocationCompositionId_example"; // String | UUID of an allocation composition


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocationComposition(allocationCompositionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationCompositionId** | [**String**](.md)| UUID of an allocation composition | 

### Return type

[**SpecificAllocationCompositionResponse**](SpecificAllocationCompositionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllocationCompositions"></a>
# **getAllocationCompositions**
> GetAllocationCompositionResponse getAllocationCompositions(opts)

List all allocation compositions

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocationCompositions(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetAllocationCompositionResponse**](GetAllocationCompositionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllocationHoldings"></a>
# **getAllocationHoldings**
> AllocationHoldingsResponse getAllocationHoldings(allocationId, opts)

List all allocation holdings

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var allocationId = "allocationId_example"; // String | UUID of an allocation

var opts = { 
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocationHoldings(allocationId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**String**](.md)| UUID of an allocation | 
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**AllocationHoldingsResponse**](AllocationHoldingsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllocationPerformance"></a>
# **getAllocationPerformance**
> PerformanceResponse getAllocationPerformance(allocationId)

Get allocation performance

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var allocationId = "allocationId_example"; // String | UUID of an allocation


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocationPerformance(allocationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**String**](.md)| UUID of an allocation | 

### Return type

[**PerformanceResponse**](PerformanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllocationTransactions"></a>
# **getAllocationTransactions**
> AllocationTransactionResponse getAllocationTransactions(allocationId, opts)

List all allocation transactions

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var allocationId = "allocationId_example"; // String | UUID of an allocation

var opts = { 
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocationTransactions(allocationId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**String**](.md)| UUID of an allocation | 
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**AllocationTransactionResponse**](AllocationTransactionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllocations"></a>
# **getAllocations**
> GetAllocationResponse getAllocations(opts)

List all allocations

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocations(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetAllocationResponse**](GetAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBankLink"></a>
# **getBankLink**
> SpecificBankLinkResponse getBankLink(bankLinkId)

Retrieve a bank link

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var bankLinkId = "bankLinkId_example"; // String | UUID of a bank link


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBankLink(bankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankLinkId** | [**String**](.md)| UUID of a bank link | 

### Return type

[**SpecificBankLinkResponse**](SpecificBankLinkResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBankLinks"></a>
# **getBankLinks**
> GetBankLinkResponse getBankLinks(opts)

List all bank links

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBankLinks(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetBankLinkResponse**](GetBankLinkResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBenchmark"></a>
# **getBenchmark**
> SpecificBenchmarkResponse getBenchmark(benchmarkId, )

Retrieve a benchmark

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var benchmarkId = "benchmarkId_example"; // String | UUID of a benchmark


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBenchmark(benchmarkId, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmarkId** | [**String**](.md)| UUID of a benchmark | 

### Return type

[**SpecificBenchmarkResponse**](SpecificBenchmarkResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBenchmarkAssetSizes"></a>
# **getBenchmarkAssetSizes**
> BenchmarkAssetSizeResponse getBenchmarkAssetSizes(benchmarkId, , opts)

List all benchmark asset sizes

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var benchmarkId = "benchmarkId_example"; // String | UUID of a benchmark

var opts = { 
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBenchmarkAssetSizes(benchmarkId, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmarkId** | [**String**](.md)| UUID of a benchmark | 
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**BenchmarkAssetSizeResponse**](BenchmarkAssetSizeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBenchmarkPerformance"></a>
# **getBenchmarkPerformance**
> PerformanceResponse getBenchmarkPerformance(benchmarkId, stat)

Get benchmark performance

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var benchmarkId = "benchmarkId_example"; // String | UUID of a benchmark

var stat = "stat_example"; // String | Performance statistic


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBenchmarkPerformance(benchmarkId, stat, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmarkId** | [**String**](.md)| UUID of a benchmark | 
 **stat** | **String**| Performance statistic | 

### Return type

[**PerformanceResponse**](PerformanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBenchmarks"></a>
# **getBenchmarks**
> GetBenchmarkResponse getBenchmarks(opts)

List all benchmarks

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBenchmarks(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetBenchmarkResponse**](GetBenchmarkResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBulkOrders"></a>
# **getBulkOrders**
> GetBulkOrderResponse getBulkOrders(opts)

List all bulk orders

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBulkOrders(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetBulkOrderResponse**](GetBulkOrderResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClient"></a>
# **getClient**
> SpecificClientResponse getClient(clientId, )

Retrieve a client

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientId = "clientId_example"; // String | UUID of a client


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClient(clientId, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID of a client | 

### Return type

[**SpecificClientResponse**](SpecificClientResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientAssetSizes"></a>
# **getClientAssetSizes**
> ClientAssetSizeResponse getClientAssetSizes(clientId, , opts)

List all client asset sizes

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientId = "clientId_example"; // String | UUID of a client

var opts = { 
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientAssetSizes(clientId, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID of a client | 
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**ClientAssetSizeResponse**](ClientAssetSizeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientHoldings"></a>
# **getClientHoldings**
> ClientHoldingsResponse getClientHoldings(clientId, , opts)

List all client holdings

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientId = "clientId_example"; // String | UUID of a client

var opts = { 
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientHoldings(clientId, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID of a client | 
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**ClientHoldingsResponse**](ClientHoldingsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientHydro"></a>
# **getClientHydro**
> SpecificClientHydroResponse getClientHydro(clientHydroId)

Retrieve a client-hydro relationship

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientHydroId = "clientHydroId_example"; // String | UUID of a client-hydro relationship


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientHydro(clientHydroId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientHydroId** | [**String**](.md)| UUID of a client-hydro relationship | 

### Return type

[**SpecificClientHydroResponse**](SpecificClientHydroResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientHydros"></a>
# **getClientHydros**
> GetClientHydroResponse getClientHydros(opts)

List all client-hydro relationships

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientHydros(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetClientHydroResponse**](GetClientHydroResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientPerformance"></a>
# **getClientPerformance**
> PerformanceResponse getClientPerformance(clientId, stat)

Get client performance

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientId = "clientId_example"; // String | UUID of a client

var stat = "stat_example"; // String | Performance statistic


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientPerformance(clientId, stat, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID of a client | 
 **stat** | **String**| Performance statistic | 

### Return type

[**PerformanceResponse**](PerformanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientResponse"></a>
# **getClientResponse**
> SpecificClientResponseResponse getClientResponse(clientResponseId)

Retrieve a client response

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientResponseId = "clientResponseId_example"; // String | UUID of a client response


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientResponse(clientResponseId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientResponseId** | [**String**](.md)| UUID of a client response | 

### Return type

[**SpecificClientResponseResponse**](SpecificClientResponseResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientResponses"></a>
# **getClientResponses**
> GetClientResponseResponse getClientResponses(opts)

List all client responses

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientResponses(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetClientResponseResponse**](GetClientResponseResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientTransactions"></a>
# **getClientTransactions**
> ClientTransactionResponse getClientTransactions(clientId, , opts)

List all client transactions

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientId = "clientId_example"; // String | UUID of a client

var opts = { 
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientTransactions(clientId, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID of a client | 
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**ClientTransactionResponse**](ClientTransactionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClients"></a>
# **getClients**
> GetClientResponse getClients(opts)

List all clients

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClients(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetClientResponse**](GetClientResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDecisionTree"></a>
# **getDecisionTree**
> SpecificDecisionTreeResponse getDecisionTree(decisionTreeId)

Retrieve a decision tree

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var decisionTreeId = "decisionTreeId_example"; // String | UUID of a decision tree


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getDecisionTree(decisionTreeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTreeId** | [**String**](.md)| UUID of a decision tree | 

### Return type

[**SpecificDecisionTreeResponse**](SpecificDecisionTreeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDecisionTrees"></a>
# **getDecisionTrees**
> GetDecisionTreeResponse getDecisionTrees(opts)

List all decision trees

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getDecisionTrees(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetDecisionTreeResponse**](GetDecisionTreeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDepositRequest"></a>
# **getDepositRequest**
> SpecificDepositRequestResponse getDepositRequest(depositId)

Retrieve a deposit request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var depositId = "depositId_example"; // String | UUID of a deposit record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getDepositRequest(depositId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositId** | [**String**](.md)| UUID of a deposit record | 

### Return type

[**SpecificDepositRequestResponse**](SpecificDepositRequestResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDepositRequests"></a>
# **getDepositRequests**
> GetDepositRequestResponse getDepositRequests(opts)

List all deposit requests

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getDepositRequests(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetDepositRequestResponse**](GetDepositRequestResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFundingRequest"></a>
# **getFundingRequest**
> SpecificFundingRequestResponse getFundingRequest(fundingId)

Retrieve a funding request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var fundingId = "fundingId_example"; // String | UUID of a funding record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getFundingRequest(fundingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingId** | [**String**](.md)| UUID of a funding record | 

### Return type

[**SpecificFundingRequestResponse**](SpecificFundingRequestResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFundingRequests"></a>
# **getFundingRequests**
> GetFundingRequestResponse getFundingRequests(opts)

List all funding requests

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getFundingRequests(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetFundingRequestResponse**](GetFundingRequestResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGoal"></a>
# **getGoal**
> SpecificGoalResponse getGoal(goalId, )

Retrieve a goal

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var goalId = "goalId_example"; // String | UUID of a goal


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoal(goalId, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalId** | [**String**](.md)| UUID of a goal | 

### Return type

[**SpecificGoalResponse**](SpecificGoalResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGoalAssetSizes"></a>
# **getGoalAssetSizes**
> GoalAssetSizeResponse getGoalAssetSizes(goalId, clientId, opts)

List goal asset sizes

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var goalId = "goalId_example"; // String | UUID of a goal

var clientId = "clientId_example"; // String | UUID of a client

var opts = { 
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalAssetSizes(goalId, clientId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalId** | [**String**](.md)| UUID of a goal | 
 **clientId** | [**String**](.md)| UUID of a client | 
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GoalAssetSizeResponse**](GoalAssetSizeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGoalHoldings"></a>
# **getGoalHoldings**
> GoalHoldingsResponse getGoalHoldings(goalId, clientId, opts)

List goal holdings

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var goalId = "goalId_example"; // String | UUID of a goal

var clientId = "clientId_example"; // String | UUID of a client

var opts = { 
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalHoldings(goalId, clientId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalId** | [**String**](.md)| UUID of a goal | 
 **clientId** | [**String**](.md)| UUID of a client | 
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GoalHoldingsResponse**](GoalHoldingsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGoalPerformance"></a>
# **getGoalPerformance**
> PerformanceResponse getGoalPerformance(goalId, statclientId)

Get goal performance

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var goalId = "goalId_example"; // String | UUID of a goal

var stat = "stat_example"; // String | Performance statistic

var clientId = "clientId_example"; // String | UUID of a client


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalPerformance(goalId, statclientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalId** | [**String**](.md)| UUID of a goal | 
 **stat** | **String**| Performance statistic | 
 **clientId** | [**String**](.md)| UUID of a client | 

### Return type

[**PerformanceResponse**](PerformanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGoalTrackRecord"></a>
# **getGoalTrackRecord**
> SpecificGoalTrackResponse getGoalTrackRecord(goalTrackId)

Retrieve a goal track record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var goalTrackId = "goalTrackId_example"; // String | UUID of a goal tracking record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalTrackRecord(goalTrackId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalTrackId** | [**String**](.md)| UUID of a goal tracking record | 

### Return type

[**SpecificGoalTrackResponse**](SpecificGoalTrackResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGoalTrackRecords"></a>
# **getGoalTrackRecords**
> GetGoalTrackResponse getGoalTrackRecords(opts)

List all goal track records

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalTrackRecords(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetGoalTrackResponse**](GetGoalTrackResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGoalTransactions"></a>
# **getGoalTransactions**
> GoalTransactionsResponse getGoalTransactions(goalId, clientId, opts)

List goal transactions

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var goalId = "goalId_example"; // String | UUID of a goal

var clientId = "clientId_example"; // String | UUID of a client

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalTransactions(goalId, clientId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalId** | [**String**](.md)| UUID of a goal | 
 **clientId** | [**String**](.md)| UUID of a client | 
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GoalTransactionsResponse**](GoalTransactionsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGoals"></a>
# **getGoals**
> GetGoalResponse getGoals(opts)

List all goals

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoals(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetGoalResponse**](GetGoalResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModel"></a>
# **getModel**
> SpecificModelResponse getModel(modelId, )

Retrieve a model

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelId = "modelId_example"; // String | UUID of a model


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModel(modelId, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**String**](.md)| UUID of a model | 

### Return type

[**SpecificModelResponse**](SpecificModelResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelAssetSize"></a>
# **getModelAssetSize**
> SpecificModelAssetSizeResponse getModelAssetSize(modelAssetSizeId)

Retrieve a model asset size

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelAssetSizeId = "modelAssetSizeId_example"; // String | UUID of a model asset size record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelAssetSize(modelAssetSizeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelAssetSizeId** | [**String**](.md)| UUID of a model asset size record | 

### Return type

[**SpecificModelAssetSizeResponse**](SpecificModelAssetSizeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelAssetSizes"></a>
# **getModelAssetSizes**
> GetModelAssetSizeResponse getModelAssetSizes(opts)

List all model asset sizes

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelAssetSizes(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetModelAssetSizeResponse**](GetModelAssetSizeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelComment"></a>
# **getModelComment**
> SpecificModelCommentResponse getModelComment(modelCommentId)

Retrieve a model commentary

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelCommentId = "modelCommentId_example"; // String | UUID of a model comment


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelComment(modelCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelCommentId** | [**String**](.md)| UUID of a model comment | 

### Return type

[**SpecificModelCommentResponse**](SpecificModelCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelComments"></a>
# **getModelComments**
> GetModelCommentResponse getModelComments(opts)

List all model commentary

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelComments(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetModelCommentResponse**](GetModelCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelHolding"></a>
# **getModelHolding**
> SpecificModelHoldingResponse getModelHolding(modelHoldingId)

Retrieve a model holding

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelHoldingId = "modelHoldingId_example"; // String | UUID of a model holding record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelHolding(modelHoldingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelHoldingId** | [**String**](.md)| UUID of a model holding record | 

### Return type

[**SpecificModelHoldingResponse**](SpecificModelHoldingResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelHoldings"></a>
# **getModelHoldings**
> GetModelHoldingResponse getModelHoldings(opts)

List all model holdings

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelHoldings(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetModelHoldingResponse**](GetModelHoldingResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelPerformance"></a>
# **getModelPerformance**
> PerformanceResponse getModelPerformance(modelId, stat)

Get model performance

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelId = "modelId_example"; // String | UUID of a model

var stat = "stat_example"; // String | Performance statistic


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelPerformance(modelId, stat, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**String**](.md)| UUID of a model | 
 **stat** | **String**| Performance statistic | 

### Return type

[**PerformanceResponse**](PerformanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelTransaction"></a>
# **getModelTransaction**
> SpecificModelTransactionResponse getModelTransaction(modelTransactionId)

Retrieve a model transaction

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelTransactionId = "modelTransactionId_example"; // String | UUID of a model transaction record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelTransaction(modelTransactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelTransactionId** | [**String**](.md)| UUID of a model transaction record | 

### Return type

[**SpecificModelTransactionResponse**](SpecificModelTransactionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelTransactions"></a>
# **getModelTransactions**
> GetModelTransactionResponse getModelTransactions(opts)

List all model transactions

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelTransactions(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetModelTransactionResponse**](GetModelTransactionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModels"></a>
# **getModels**
> GetModelResponse getModels(opts)

List all models

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModels(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetModelResponse**](GetModelResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNode"></a>
# **getNode**
> SpecificNodeResponse getNode(nodeId)

Retrieve a node

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var nodeId = "nodeId_example"; // String | UUID of a node


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNode(nodeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | [**String**](.md)| UUID of a node | 

### Return type

[**SpecificNodeResponse**](SpecificNodeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeRelationship"></a>
# **getNodeRelationship**
> SpecificNodeRelationshipResponse getNodeRelationship(nodeRelationshipId)

Retrieve a node relationship

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var nodeRelationshipId = "nodeRelationshipId_example"; // String | UUID of a node relationship


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNodeRelationship(nodeRelationshipId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeRelationshipId** | [**String**](.md)| UUID of a node relationship | 

### Return type

[**SpecificNodeRelationshipResponse**](SpecificNodeRelationshipResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeRelationships"></a>
# **getNodeRelationships**
> GetNodeRelationshipResponse getNodeRelationships(opts)

List all node relationships

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNodeRelationships(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetNodeRelationshipResponse**](GetNodeRelationshipResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodes"></a>
# **getNodes**
> GetNodeResponse getNodes(opts)

List all nodes

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNodes(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetNodeResponse**](GetNodeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderRecord"></a>
# **getOrderRecord**
> SpecificOrderResponse getOrderRecord(orderId)

Retrieve an order record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var orderId = "orderId_example"; // String | UUID of an order record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderRecord(orderId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | [**String**](.md)| UUID of an order record | 

### Return type

[**SpecificOrderResponse**](SpecificOrderResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderRecords"></a>
# **getOrderRecords**
> GetOrderResponse getOrderRecords(opts)

List all order records

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderRecords(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetOrderResponse**](GetOrderResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderStatus"></a>
# **getOrderStatus**
> SpecificOrderStatusResponse getOrderStatus(orderStatusId)

Retrieve an order status

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var orderStatusId = "orderStatusId_example"; // String | UUID of an order status record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderStatus(orderStatusId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderStatusId** | [**String**](.md)| UUID of an order status record | 

### Return type

[**SpecificOrderStatusResponse**](SpecificOrderStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderStatuses"></a>
# **getOrderStatuses**
> GetOrderStatusResponse getOrderStatuses(opts)

List all order statuses

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderStatuses(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetOrderStatusResponse**](GetOrderStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderTrackingRecord"></a>
# **getOrderTrackingRecord**
> SpecificOrderTrackResponse getOrderTrackingRecord(orderTrackId)

Retrieve an order tracking record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var orderTrackId = "orderTrackId_example"; // String | UUID of an order tracking record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderTrackingRecord(orderTrackId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderTrackId** | [**String**](.md)| UUID of an order tracking record | 

### Return type

[**SpecificOrderTrackResponse**](SpecificOrderTrackResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderTrackingRecords"></a>
# **getOrderTrackingRecords**
> GetOrderTrackResponse getOrderTrackingRecords(opts)

List all order tracking records

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderTrackingRecords(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetOrderTrackResponse**](GetOrderTrackResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortfolio"></a>
# **getPortfolio**
> SpecificPortfolioResponse getPortfolio(portfolioId)

Retrieve a portfolio

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioId = "portfolioId_example"; // String | UUID of a portfolio


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolio(portfolioId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**String**](.md)| UUID of a portfolio | 

### Return type

[**SpecificPortfolioResponse**](SpecificPortfolioResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortfolioAssetSize"></a>
# **getPortfolioAssetSize**
> SpecificPortfolioAssetSizeResponse getPortfolioAssetSize(portfolioAssetSizeId)

Retrieve a portfolio asset size

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioAssetSizeId = "portfolioAssetSizeId_example"; // String | UUID of a portfolio asset size record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioAssetSize(portfolioAssetSizeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioAssetSizeId** | [**String**](.md)| UUID of a portfolio asset size record | 

### Return type

[**SpecificPortfolioAssetSizeResponse**](SpecificPortfolioAssetSizeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortfolioAssetSizes"></a>
# **getPortfolioAssetSizes**
> GetPortfolioAssetSizeResponse getPortfolioAssetSizes(opts)

List all portfolio asset sizes

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioAssetSizes(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetPortfolioAssetSizeResponse**](GetPortfolioAssetSizeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortfolioComment"></a>
# **getPortfolioComment**
> SpecificPortfolioCommentResponse getPortfolioComment(portfolioCommentId)

Retrieve a portfolio commentary

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioCommentId = "portfolioCommentId_example"; // String | UUID of a portfolio comment


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioComment(portfolioCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioCommentId** | [**String**](.md)| UUID of a portfolio comment | 

### Return type

[**SpecificPortfolioCommentResponse**](SpecificPortfolioCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortfolioComments"></a>
# **getPortfolioComments**
> GetPortfolioCommentResponse getPortfolioComments(opts)

List all portfolio commentary

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioComments(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetPortfolioCommentResponse**](GetPortfolioCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortfolioHolding"></a>
# **getPortfolioHolding**
> SpecificPortfolioHoldingResponse getPortfolioHolding(portfolioHoldingId)

Retrieve a portfolio holding

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioHoldingId = "portfolioHoldingId_example"; // String | UUID of a portfolio holding record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioHolding(portfolioHoldingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioHoldingId** | [**String**](.md)| UUID of a portfolio holding record | 

### Return type

[**SpecificPortfolioHoldingResponse**](SpecificPortfolioHoldingResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortfolioHoldings"></a>
# **getPortfolioHoldings**
> GetPortfolioHoldingResponse getPortfolioHoldings(opts)

List all portfolio holdings

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioHoldings(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetPortfolioHoldingResponse**](GetPortfolioHoldingResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortfolioPerformance"></a>
# **getPortfolioPerformance**
> PerformanceResponse getPortfolioPerformance(portfolioIdstat)

Get portfolio performance

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioId = "portfolioId_example"; // String | UUID of a portfolio

var stat = "stat_example"; // String | Performance statistic


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioPerformance(portfolioIdstat, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**String**](.md)| UUID of a portfolio | 
 **stat** | **String**| Performance statistic | 

### Return type

[**PerformanceResponse**](PerformanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortfolioTransaction"></a>
# **getPortfolioTransaction**
> SpecificPortfolioTransactionResponse getPortfolioTransaction(portfolioTransactionId)

Retrieve a portfolio transaction

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioTransactionId = "portfolioTransactionId_example"; // String | UUID of a portfolio transaction record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioTransaction(portfolioTransactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioTransactionId** | [**String**](.md)| UUID of a portfolio transaction record | 

### Return type

[**SpecificPortfolioTransactionResponse**](SpecificPortfolioTransactionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortfolioTransactions"></a>
# **getPortfolioTransactions**
> GetPortfolioTransactionResponse getPortfolioTransactions(opts)

List all portfolio transactions

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioTransactions(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetPortfolioTransactionResponse**](GetPortfolioTransactionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortfolios"></a>
# **getPortfolios**
> GetPortfolioResponse getPortfolios(opts)

List all portfolios

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolios(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetPortfolioResponse**](GetPortfolioResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuestionnaire"></a>
# **getQuestionnaire**
> SpecificQuestionnaireResponse getQuestionnaire(questionnaireId)

Retrieve a questionnaire

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var questionnaireId = "questionnaireId_example"; // String | UUID of a questionnaire


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getQuestionnaire(questionnaireId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaireId** | [**String**](.md)| UUID of a questionnaire | 

### Return type

[**SpecificQuestionnaireResponse**](SpecificQuestionnaireResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuestionnaires"></a>
# **getQuestionnaires**
> GetQuestionnaireResponse getQuestionnaires(opts)

List all questionnaires

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getQuestionnaires(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetQuestionnaireResponse**](GetQuestionnaireResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getScore"></a>
# **getScore**
> SpecificScoreResponse getScore(scoreId)

Retrieve a score

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var scoreId = "scoreId_example"; // String | UUID of a score record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getScore(scoreId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scoreId** | [**String**](.md)| UUID of a score record | 

### Return type

[**SpecificScoreResponse**](SpecificScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getScores"></a>
# **getScores**
> GetScoreResponse getScores(opts)

List all scores

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getScores(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetScoreResponse**](GetScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurities"></a>
# **getSecurities**
> GetSecurityResponse getSecurities(opts)

List all securities

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSecurities(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetSecurityResponse**](GetSecurityResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurity"></a>
# **getSecurity**
> SpecificSecurityResponse getSecurity(securityId)

Retrieve a security

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var securityId = "securityId_example"; // String | UUID of a security


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSecurity(securityId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityId** | [**String**](.md)| UUID of a security | 

### Return type

[**SpecificSecurityResponse**](SpecificSecurityResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurityExclusion"></a>
# **getSecurityExclusion**
> SpecificSecurityExclusionResponse getSecurityExclusion(securityExclusionId)

Retrieve a security exclusion

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var securityExclusionId = "securityExclusionId_example"; // String | UUID of a security exclusion record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSecurityExclusion(securityExclusionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityExclusionId** | [**String**](.md)| UUID of a security exclusion record | 

### Return type

[**SpecificSecurityExclusionResponse**](SpecificSecurityExclusionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurityExclusions"></a>
# **getSecurityExclusions**
> GetSecurityExclusionResponse getSecurityExclusions(opts)

List all security exclusions

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSecurityExclusions(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetSecurityExclusionResponse**](GetSecurityExclusionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurityPerformance"></a>
# **getSecurityPerformance**
> PerformanceResponse getSecurityPerformance(securityIdstat)

Get security performance

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var securityId = "securityId_example"; // String | UUID of a security

var stat = "stat_example"; // String | Performance statistic


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSecurityPerformance(securityIdstat, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityId** | [**String**](.md)| UUID of a security | 
 **stat** | **String**| Performance statistic | 

### Return type

[**PerformanceResponse**](PerformanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurityPrice"></a>
# **getSecurityPrice**
> SpecificSecurityPriceResponse getSecurityPrice(securityPriceId)

Retrieve a security price

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var securityPriceId = "securityPriceId_example"; // String | UUID of a security price record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSecurityPrice(securityPriceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityPriceId** | [**String**](.md)| UUID of a security price record | 

### Return type

[**SpecificSecurityPriceResponse**](SpecificSecurityPriceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurityPrices"></a>
# **getSecurityPrices**
> GetSecurityPriceResponse getSecurityPrices(opts)

List all security prices

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSecurityPrices(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetSecurityPriceResponse**](GetSecurityPriceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionCode"></a>
# **getTransactionCode**
> SpecificTransactionCodeResponse getTransactionCode(transactionCodeId)

Retrieve a transaction code

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var transactionCodeId = "transactionCodeId_example"; // String | UUID of a transaction code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTransactionCode(transactionCodeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionCodeId** | [**String**](.md)| UUID of a transaction code | 

### Return type

[**SpecificTransactionCodeResponse**](SpecificTransactionCodeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionCodes"></a>
# **getTransactionCodes**
> GetTransactionCodeResponse getTransactionCodes(opts)

List all transaction codes

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTransactionCodes(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetTransactionCodeResponse**](GetTransactionCodeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransferRequest"></a>
# **getTransferRequest**
> SpecificTransferResponse getTransferRequest(transferId)

Retrieve a transfer request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var transferId = "transferId_example"; // String | UUID of an account transfer record


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTransferRequest(transferId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferId** | [**String**](.md)| UUID of an account transfer record | 

### Return type

[**SpecificTransferResponse**](SpecificTransferResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransferRequests"></a>
# **getTransferRequests**
> GetTransferResponse getTransferRequests(opts)

List all transfer requests

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTransferRequests(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetTransferResponse**](GetTransferResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWithdrawalRequest"></a>
# **getWithdrawalRequest**
> SpecificWithdrawalResponse getWithdrawalRequest(withdrawalId)

Retrieve a withdrawal request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var withdrawalId = "withdrawalId_example"; // String | UUID of a withdrawal request


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWithdrawalRequest(withdrawalId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawalId** | [**String**](.md)| UUID of a withdrawal request | 

### Return type

[**SpecificWithdrawalResponse**](SpecificWithdrawalResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWithdrawalRequests"></a>
# **getWithdrawalRequests**
> GetWithdrawalResponse getWithdrawalRequests(opts)

List all withdrawal requests

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var opts = { 
  'page': 0, // Number | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  'size': 25, // Number | The number or records to be included per page. The default is 25. There is no max value.
  'orderBy': "update_date", // String | The field in the response body to order the list by. Default is update_date.
  'ascending': false, // Boolean | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  'filter': "filter_example" // String | Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWithdrawalRequests(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **Number**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **orderBy** | **String**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **Boolean**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **filter** | **String**| Every field within an object using the GET method can be filtered except for fields stored under metadata. Filtering is especially useful for calls that return many different fields. | [optional] 

### Return type

[**GetWithdrawalResponse**](GetWithdrawalResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccount"></a>
# **postAccount**
> CreateAccountResponse postAccount(payload)

Create an account under a client

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.AccountCreatePayload(); // AccountCreatePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAccount(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AccountCreatePayload**](AccountCreatePayload.md)|  | 

### Return type

[**CreateAccountResponse**](CreateAccountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountAllocation"></a>
# **postAccountAllocation**
> SpecificAccountAllocationResponse postAccountAllocation(payload)

Create an account allocation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.AccountAllocationPayload(); // AccountAllocationPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAccountAllocation(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AccountAllocationPayload**](AccountAllocationPayload.md)|  | 

### Return type

[**SpecificAccountAllocationResponse**](SpecificAccountAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountBulkOrder"></a>
# **postAccountBulkOrder**
> BulkOrderFirmclientaccountResponse postAccountBulkOrder(accountIdpayload)

Bulk orders for an account

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account

var payload = new atom_api.BulkOrderAccountPayload(); // BulkOrderAccountPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAccountBulkOrder(accountIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 
 **payload** | [**BulkOrderAccountPayload**](BulkOrderAccountPayload.md)|  | 

### Return type

[**BulkOrderFirmclientaccountResponse**](BulkOrderFirmclientaccountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountRebalanceBuyOnlyOrder"></a>
# **postAccountRebalanceBuyOnlyOrder**
> postAccountRebalanceBuyOnlyOrder(accountIdpayload)

Create buy-only account rebalance orders

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account

var payload = new atom_api.AccountRebalanceBuyOnlyOrderPayload(); // AccountRebalanceBuyOnlyOrderPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postAccountRebalanceBuyOnlyOrder(accountIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 
 **payload** | [**AccountRebalanceBuyOnlyOrderPayload**](AccountRebalanceBuyOnlyOrderPayload.md)|  | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountRebalanceOrder"></a>
# **postAccountRebalanceOrder**
> SpecificOrderTrackResponse postAccountRebalanceOrder(accountIdpayload)

Create account rebalance orders

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account

var payload = new atom_api.AccountRebalanceOrderPayload(); // AccountRebalanceOrderPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAccountRebalanceOrder(accountIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 
 **payload** | [**AccountRebalanceOrderPayload**](AccountRebalanceOrderPayload.md)|  | 

### Return type

[**SpecificOrderTrackResponse**](SpecificOrderTrackResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountRebalanceSellOnlyOrder"></a>
# **postAccountRebalanceSellOnlyOrder**
> postAccountRebalanceSellOnlyOrder(accountIdpayload)

Create sell-only account rebalance orders

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account

var payload = new atom_api.AccountRebalanceSellOnlyOrderPayload(); // AccountRebalanceSellOnlyOrderPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postAccountRebalanceSellOnlyOrder(accountIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 
 **payload** | [**AccountRebalanceSellOnlyOrderPayload**](AccountRebalanceSellOnlyOrderPayload.md)|  | 

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountSellAllOrder"></a>
# **postAccountSellAllOrder**
> SellAllAccountResponse postAccountSellAllOrder(accountIdpayload)

Sell all account order

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account

var payload = new atom_api.SellAllAccountPayload(); // SellAllAccountPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAccountSellAllOrder(accountIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 
 **payload** | [**SellAllAccountPayload**](SellAllAccountPayload.md)|  | 

### Return type

[**SellAllAccountResponse**](SellAllAccountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountStage"></a>
# **postAccountStage**
> SpecificAccountStageResponse postAccountStage(payload)

Create an account stage

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.AccountStagePayload(); // AccountStagePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAccountStage(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AccountStagePayload**](AccountStagePayload.md)|  | 

### Return type

[**SpecificAccountStageResponse**](SpecificAccountStageResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountStatus"></a>
# **postAccountStatus**
> CreateAccountStatusResponse postAccountStatus(payload)

Create an account status

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.AccountStatusPayload(); // AccountStatusPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAccountStatus(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AccountStatusPayload**](AccountStatusPayload.md)|  | 

### Return type

[**CreateAccountStatusResponse**](CreateAccountStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountType"></a>
# **postAccountType**
> GetAccountTypeSubresponse postAccountType(payload)

Create an account type

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.AccountTypePayload(); // AccountTypePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAccountType(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AccountTypePayload**](AccountTypePayload.md)|  | 

### Return type

[**GetAccountTypeSubresponse**](GetAccountTypeSubresponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAggregationAccount"></a>
# **postAggregationAccount**
> CreateAggregationAccountResponse postAggregationAccount(payload)

Create an aggregation account

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.AggregationAccountPayload(); // AggregationAccountPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAggregationAccount(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AggregationAccountPayload**](AggregationAccountPayload.md)|  | 

### Return type

[**CreateAggregationAccountResponse**](CreateAggregationAccountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAggregationAccountBalance"></a>
# **postAggregationAccountBalance**
> CreateAggregationAccountBalanceResponse postAggregationAccountBalance(payload)

Create an aggregation account balance

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.AggregationAccountBalancePayload(); // AggregationAccountBalancePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAggregationAccountBalance(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AggregationAccountBalancePayload**](AggregationAccountBalancePayload.md)|  | 

### Return type

[**CreateAggregationAccountBalanceResponse**](CreateAggregationAccountBalanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAllocation"></a>
# **postAllocation**
> CreateAllocationResponse postAllocation(payload)

Create an allocation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.AllocationPayload(); // AllocationPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAllocation(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AllocationPayload**](AllocationPayload.md)|  | 

### Return type

[**CreateAllocationResponse**](CreateAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAllocationComposition"></a>
# **postAllocationComposition**
> CreateAllocationCompositionResponse postAllocationComposition(payload)

Create an allocation composition

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.AllocationCompositionPayload(); // AllocationCompositionPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAllocationComposition(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AllocationCompositionPayload**](AllocationCompositionPayload.md)|  | 

### Return type

[**CreateAllocationCompositionResponse**](CreateAllocationCompositionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBankLink"></a>
# **postBankLink**
> CreateBankLinkResponse postBankLink(payload)

Create a bank link

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.BankLinkPayload(); // BankLinkPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postBankLink(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**BankLinkPayload**](BankLinkPayload.md)|  | 

### Return type

[**CreateBankLinkResponse**](CreateBankLinkResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBenchmark"></a>
# **postBenchmark**
> CreateBenchmarkResponse postBenchmark(payload)

Create a benchmark

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.BenchmarkPayload(); // BenchmarkPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postBenchmark(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**BenchmarkPayload**](BenchmarkPayload.md)|  | 

### Return type

[**CreateBenchmarkResponse**](CreateBenchmarkResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBulkOrder"></a>
# **postBulkOrder**
> BulkOrderFirmclientaccountResponse postBulkOrder(payload)

Bulk orders for your firm

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.BulkOrderFirmPayload(); // BulkOrderFirmPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postBulkOrder(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**BulkOrderFirmPayload**](BulkOrderFirmPayload.md)|  | 

### Return type

[**BulkOrderFirmclientaccountResponse**](BulkOrderFirmclientaccountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postClient"></a>
# **postClient**
> CreateClientResponse postClient(payload)

Create a client

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.ClientPayload(); // ClientPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postClient(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ClientPayload**](ClientPayload.md)|  | 

### Return type

[**CreateClientResponse**](CreateClientResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postClientBulkOrder"></a>
# **postClientBulkOrder**
> BulkOrderFirmclientaccountResponse postClientBulkOrder(clientId, payload)

Bulk orders for a client

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientId = "clientId_example"; // String | UUID of a client

var payload = new atom_api.BulkOrderClientPayload(); // BulkOrderClientPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postClientBulkOrder(clientId, payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID of a client | 
 **payload** | [**BulkOrderClientPayload**](BulkOrderClientPayload.md)|  | 

### Return type

[**BulkOrderFirmclientaccountResponse**](BulkOrderFirmclientaccountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postClientHydro"></a>
# **postClientHydro**
> CreateClientHydroResponse postClientHydro(payload)

Create a client-hydro relationship

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.ClientHydroPayload(); // ClientHydroPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postClientHydro(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ClientHydroPayload**](ClientHydroPayload.md)|  | 

### Return type

[**CreateClientHydroResponse**](CreateClientHydroResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postClientResponse"></a>
# **postClientResponse**
> CreateClientResponseResponse postClientResponse(payload)

Create a client response

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.ClientResponsePayload(); // ClientResponsePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postClientResponse(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ClientResponsePayload**](ClientResponsePayload.md)|  | 

### Return type

[**CreateClientResponseResponse**](CreateClientResponseResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDecisionTree"></a>
# **postDecisionTree**
> CreateDecisionTreeResponse postDecisionTree(payload)

Create a decision tree

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.DecisionTreePayload(); // DecisionTreePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postDecisionTree(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**DecisionTreePayload**](DecisionTreePayload.md)|  | 

### Return type

[**CreateDecisionTreeResponse**](CreateDecisionTreeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDepositRequest"></a>
# **postDepositRequest**
> CreateDepositRequestResponse postDepositRequest(payload)

Create a deposit request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.DepositRequestPayload(); // DepositRequestPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postDepositRequest(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**DepositRequestPayload**](DepositRequestPayload.md)|  | 

### Return type

[**CreateDepositRequestResponse**](CreateDepositRequestResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFundingRequest"></a>
# **postFundingRequest**
> CreateFundingRequestResponse postFundingRequest(payload)

Create a funding request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.FundingRequestPayload(); // FundingRequestPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postFundingRequest(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**FundingRequestPayload**](FundingRequestPayload.md)|  | 

### Return type

[**CreateFundingRequestResponse**](CreateFundingRequestResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGoal"></a>
# **postGoal**
> CreateGoalResponse postGoal(payload)

Create a goal

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.GoalPayload(); // GoalPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postGoal(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalPayload**](GoalPayload.md)|  | 

### Return type

[**CreateGoalResponse**](CreateGoalResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGoalTrackRecord"></a>
# **postGoalTrackRecord**
> CreateGoalTrackResponse postGoalTrackRecord(payload)

Create a goal track record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.GoalTrackPayload(); // GoalTrackPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postGoalTrackRecord(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalTrackPayload**](GoalTrackPayload.md)|  | 

### Return type

[**CreateGoalTrackResponse**](CreateGoalTrackResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postModel"></a>
# **postModel**
> CreateModelResponse postModel(payload)

Create a model

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.ModelPayload(); // ModelPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postModel(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ModelPayload**](ModelPayload.md)|  | 

### Return type

[**CreateModelResponse**](CreateModelResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postModelAssetSize"></a>
# **postModelAssetSize**
> CreateModelAssetSizeResponse postModelAssetSize(payload)

Create a model asset size

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.ModelAssetSizePayload(); // ModelAssetSizePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postModelAssetSize(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ModelAssetSizePayload**](ModelAssetSizePayload.md)|  | 

### Return type

[**CreateModelAssetSizeResponse**](CreateModelAssetSizeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postModelComment"></a>
# **postModelComment**
> CreateModelCommentResponse postModelComment(payload)

Create a model commentary

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.ModelCommentPayload(); // ModelCommentPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postModelComment(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ModelCommentPayload**](ModelCommentPayload.md)|  | 

### Return type

[**CreateModelCommentResponse**](CreateModelCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postModelHolding"></a>
# **postModelHolding**
> CreateModelHoldingResponse postModelHolding(payload)

Create a model holding

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.ModelHoldingPayload(); // ModelHoldingPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postModelHolding(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ModelHoldingPayload**](ModelHoldingPayload.md)|  | 

### Return type

[**CreateModelHoldingResponse**](CreateModelHoldingResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postModelTransaction"></a>
# **postModelTransaction**
> CreateModelTransactionResponse postModelTransaction(payload)

Create a model transaction

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.ModelTransactionPayload(); // ModelTransactionPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postModelTransaction(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ModelTransactionPayload**](ModelTransactionPayload.md)|  | 

### Return type

[**CreateModelTransactionResponse**](CreateModelTransactionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postNode"></a>
# **postNode**
> CreateNodeResponse postNode(payload)

Create a node

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.NodePayload(); // NodePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postNode(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**NodePayload**](NodePayload.md)|  | 

### Return type

[**CreateNodeResponse**](CreateNodeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postNodeRelationship"></a>
# **postNodeRelationship**
> CreateNodeRelationshipResponse postNodeRelationship(payload)

Create a node relationship

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.NodeRelationshipPayload(); // NodeRelationshipPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postNodeRelationship(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**NodeRelationshipPayload**](NodeRelationshipPayload.md)|  | 

### Return type

[**CreateNodeRelationshipResponse**](CreateNodeRelationshipResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOrderRecord"></a>
# **postOrderRecord**
> CreateOrderResponse postOrderRecord(payload)

Create an order record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.OrderPayload(); // OrderPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postOrderRecord(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**OrderPayload**](OrderPayload.md)|  | 

### Return type

[**CreateOrderResponse**](CreateOrderResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOrderStatus"></a>
# **postOrderStatus**
> CreateOrderStatusResponse postOrderStatus(payload)

Create an order status

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.OrderStatusPayload(); // OrderStatusPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postOrderStatus(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**OrderStatusPayload**](OrderStatusPayload.md)|  | 

### Return type

[**CreateOrderStatusResponse**](CreateOrderStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOrderTrackingRecord"></a>
# **postOrderTrackingRecord**
> CreateOrderTrackResponse postOrderTrackingRecord(payload)

Create an order tracking record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.OrderTrackPayload(); // OrderTrackPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postOrderTrackingRecord(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**OrderTrackPayload**](OrderTrackPayload.md)|  | 

### Return type

[**CreateOrderTrackResponse**](CreateOrderTrackResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPortfolio"></a>
# **postPortfolio**
> CreatePortfolioResponse postPortfolio(payload)

Create a portfolio

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.PortfolioPayload(); // PortfolioPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postPortfolio(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PortfolioPayload**](PortfolioPayload.md)|  | 

### Return type

[**CreatePortfolioResponse**](CreatePortfolioResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPortfolioAssetSize"></a>
# **postPortfolioAssetSize**
> CreatePortfolioAssetSizeResponse postPortfolioAssetSize(payload)

Create a portfolio asset size

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.PortfolioAssetSizePayload(); // PortfolioAssetSizePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postPortfolioAssetSize(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PortfolioAssetSizePayload**](PortfolioAssetSizePayload.md)|  | 

### Return type

[**CreatePortfolioAssetSizeResponse**](CreatePortfolioAssetSizeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPortfolioComment"></a>
# **postPortfolioComment**
> CreatePortfolioCommentResponse postPortfolioComment(payload)

Create a portfolio commentary

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.PortfolioCommentPayload(); // PortfolioCommentPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postPortfolioComment(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PortfolioCommentPayload**](PortfolioCommentPayload.md)|  | 

### Return type

[**CreatePortfolioCommentResponse**](CreatePortfolioCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPortfolioHolding"></a>
# **postPortfolioHolding**
> CreatePortfolioHoldingResponse postPortfolioHolding(payload)

Create a portfolio holding

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.PortfolioHoldingPayload(); // PortfolioHoldingPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postPortfolioHolding(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PortfolioHoldingPayload**](PortfolioHoldingPayload.md)|  | 

### Return type

[**CreatePortfolioHoldingResponse**](CreatePortfolioHoldingResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPortfolioRebalanceBuyOnlyOrder"></a>
# **postPortfolioRebalanceBuyOnlyOrder**
> PortfolioRebalanceBuyOnlyOrderPayload postPortfolioRebalanceBuyOnlyOrder(portfolioIdpayload)

Create buy-only portfolio rebalance orders

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioId = "portfolioId_example"; // String | UUID of a portfolio

var payload = new atom_api.PortfolioRebalanceBuyOnlyOrderPayload(); // PortfolioRebalanceBuyOnlyOrderPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postPortfolioRebalanceBuyOnlyOrder(portfolioIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**String**](.md)| UUID of a portfolio | 
 **payload** | [**PortfolioRebalanceBuyOnlyOrderPayload**](PortfolioRebalanceBuyOnlyOrderPayload.md)|  | 

### Return type

[**PortfolioRebalanceBuyOnlyOrderPayload**](PortfolioRebalanceBuyOnlyOrderPayload.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPortfolioRebalanceOrder"></a>
# **postPortfolioRebalanceOrder**
> PortfolioRebalanceOrderPayload postPortfolioRebalanceOrder(portfolioIdpayload)

Create portfolio rebalance orders

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioId = "portfolioId_example"; // String | UUID of a portfolio

var payload = new atom_api.PortfolioRebalanceOrderPayload(); // PortfolioRebalanceOrderPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postPortfolioRebalanceOrder(portfolioIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**String**](.md)| UUID of a portfolio | 
 **payload** | [**PortfolioRebalanceOrderPayload**](PortfolioRebalanceOrderPayload.md)|  | 

### Return type

[**PortfolioRebalanceOrderPayload**](PortfolioRebalanceOrderPayload.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPortfolioRebalanceSellOnlyOrder"></a>
# **postPortfolioRebalanceSellOnlyOrder**
> PortfolioRebalanceSellOnlyOrderPayload postPortfolioRebalanceSellOnlyOrder(portfolioIdpayload)

Create sell-only portfolio rebalance orders

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioId = "portfolioId_example"; // String | UUID of a portfolio

var payload = new atom_api.PortfolioRebalanceSellOnlyOrderPayload(); // PortfolioRebalanceSellOnlyOrderPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postPortfolioRebalanceSellOnlyOrder(portfolioIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**String**](.md)| UUID of a portfolio | 
 **payload** | [**PortfolioRebalanceSellOnlyOrderPayload**](PortfolioRebalanceSellOnlyOrderPayload.md)|  | 

### Return type

[**PortfolioRebalanceSellOnlyOrderPayload**](PortfolioRebalanceSellOnlyOrderPayload.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPortfolioSellAllOrder"></a>
# **postPortfolioSellAllOrder**
> SellAllPortfolioResponse postPortfolioSellAllOrder(portfolioIdpayload)

Sell all portfolio order

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioId = "portfolioId_example"; // String | UUID of a portfolio

var payload = new atom_api.SellAllPortfolioPayload(); // SellAllPortfolioPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postPortfolioSellAllOrder(portfolioIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**String**](.md)| UUID of a portfolio | 
 **payload** | [**SellAllPortfolioPayload**](SellAllPortfolioPayload.md)|  | 

### Return type

[**SellAllPortfolioResponse**](SellAllPortfolioResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPortfolioTransaction"></a>
# **postPortfolioTransaction**
> CreatePortfolioTransactionResponse postPortfolioTransaction(payload)

Create a portfolio transaction

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.PortfolioTransactionPayload(); // PortfolioTransactionPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postPortfolioTransaction(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PortfolioTransactionPayload**](PortfolioTransactionPayload.md)|  | 

### Return type

[**CreatePortfolioTransactionResponse**](CreatePortfolioTransactionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postQuestionnaire"></a>
# **postQuestionnaire**
> CreateQuestionnaireResponse postQuestionnaire(payload)

Create a questionnaire

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.QuestionnairePayload(); // QuestionnairePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postQuestionnaire(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**QuestionnairePayload**](QuestionnairePayload.md)|  | 

### Return type

[**CreateQuestionnaireResponse**](CreateQuestionnaireResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postScore"></a>
# **postScore**
> CreateScoreResponse postScore(payload)

Create a score

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.ScorePayload(); // ScorePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postScore(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ScorePayload**](ScorePayload.md)|  | 

### Return type

[**CreateScoreResponse**](CreateScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSecurity"></a>
# **postSecurity**
> CreateSecurityResponse postSecurity(payload)

Create a security

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.SecurityPayload(); // SecurityPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postSecurity(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SecurityPayload**](SecurityPayload.md)|  | 

### Return type

[**CreateSecurityResponse**](CreateSecurityResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSecurityExclusion"></a>
# **postSecurityExclusion**
> CreateSecurityExclusionResponse postSecurityExclusion(payload)

Create a security exclusion

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.SecurityExclusionPayload(); // SecurityExclusionPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postSecurityExclusion(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SecurityExclusionPayload**](SecurityExclusionPayload.md)|  | 

### Return type

[**CreateSecurityExclusionResponse**](CreateSecurityExclusionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSecurityPrice"></a>
# **postSecurityPrice**
> CreateSecurityPriceResponse postSecurityPrice(payload)

Create a security price

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.SecurityPricePayload(); // SecurityPricePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postSecurityPrice(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SecurityPricePayload**](SecurityPricePayload.md)|  | 

### Return type

[**CreateSecurityPriceResponse**](CreateSecurityPriceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTransactionCode"></a>
# **postTransactionCode**
> CreateTransactionCodeResponse postTransactionCode(payload)

Create a transaction code

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.TransactionCodePayload(); // TransactionCodePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postTransactionCode(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TransactionCodePayload**](TransactionCodePayload.md)|  | 

### Return type

[**CreateTransactionCodeResponse**](CreateTransactionCodeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTransferRequest"></a>
# **postTransferRequest**
> CreateTransferResponse postTransferRequest(payload)

Create a transfer request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.TransferRequestPayload(); // TransferRequestPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postTransferRequest(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TransferRequestPayload**](TransferRequestPayload.md)|  | 

### Return type

[**CreateTransferResponse**](CreateTransferResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postWithdrawalRequest"></a>
# **postWithdrawalRequest**
> CreateWithdrawalResponse postWithdrawalRequest(payload)

Create a withdrawal request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var payload = new atom_api.WithdrawalPayload(); // WithdrawalPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postWithdrawalRequest(payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**WithdrawalPayload**](WithdrawalPayload.md)|  | 

### Return type

[**CreateWithdrawalResponse**](CreateWithdrawalResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subscribeAccount"></a>
# **subscribeAccount**
> SubscribeAccountResponse subscribeAccount(accountIdpayload)

Subscribe an account

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account

var payload = new atom_api.AccountSubscribePayload(); // AccountSubscribePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.subscribeAccount(accountIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 
 **payload** | [**AccountSubscribePayload**](AccountSubscribePayload.md)|  | 

### Return type

[**SubscribeAccountResponse**](SubscribeAccountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccount"></a>
# **updateAccount**
> SpecificAccountResponse updateAccount(accountIdpayload)

Update an account

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account

var payload = new atom_api.AccountCreatePayload(); // AccountCreatePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAccount(accountIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 
 **payload** | [**AccountCreatePayload**](AccountCreatePayload.md)|  | 

### Return type

[**SpecificAccountResponse**](SpecificAccountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccountAllocation"></a>
# **updateAccountAllocation**
> SpecificAccountAllocationResponse updateAccountAllocation(accountAllocationIdpayload)

Update an account allocation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountAllocationId = "accountAllocationId_example"; // String | UUID of an account allocation

var payload = new atom_api.AccountAllocationPayload(); // AccountAllocationPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAccountAllocation(accountAllocationIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountAllocationId** | [**String**](.md)| UUID of an account allocation | 
 **payload** | [**AccountAllocationPayload**](AccountAllocationPayload.md)|  | 

### Return type

[**SpecificAccountAllocationResponse**](SpecificAccountAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccountPermission"></a>
# **updateAccountPermission**
> SpecificAccountPermissionResponse updateAccountPermission(accountIdpayload)

Update an account&#39;s permissions

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountId = "accountId_example"; // String | UUID of an account

var payload = new atom_api.AccountPermissionPayload(); // AccountPermissionPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAccountPermission(accountIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| UUID of an account | 
 **payload** | [**AccountPermissionPayload**](AccountPermissionPayload.md)|  | 

### Return type

[**SpecificAccountPermissionResponse**](SpecificAccountPermissionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccountStage"></a>
# **updateAccountStage**
> SpecificAccountStageResponse updateAccountStage(stageIdpayload)

Update an account stage

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var stageId = "stageId_example"; // String | UUID of an account stage

var payload = new atom_api.AccountStagePayload(); // AccountStagePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAccountStage(stageIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageId** | [**String**](.md)| UUID of an account stage | 
 **payload** | [**AccountStagePayload**](AccountStagePayload.md)|  | 

### Return type

[**SpecificAccountStageResponse**](SpecificAccountStageResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccountStatus"></a>
# **updateAccountStatus**
> SpecificAccountStatusResponse updateAccountStatus(accountStatusIdpayload)

Update an account status

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountStatusId = "accountStatusId_example"; // String | UUID of an account status

var payload = new atom_api.AccountStatusPayload(); // AccountStatusPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAccountStatus(accountStatusIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountStatusId** | [**String**](.md)| UUID of an account status | 
 **payload** | [**AccountStatusPayload**](AccountStatusPayload.md)|  | 

### Return type

[**SpecificAccountStatusResponse**](SpecificAccountStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccountType"></a>
# **updateAccountType**
> GetAccountTypeSubresponse updateAccountType(accountTypeIdpayload)

Update an account type

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var accountTypeId = "accountTypeId_example"; // String | UUID of an account type

var payload = new atom_api.AccountTypePayload(); // AccountTypePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAccountType(accountTypeIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountTypeId** | [**String**](.md)| UUID of an account type | 
 **payload** | [**AccountTypePayload**](AccountTypePayload.md)|  | 

### Return type

[**GetAccountTypeSubresponse**](GetAccountTypeSubresponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAggregationAccount"></a>
# **updateAggregationAccount**
> SpecificAggregationAccountResponse updateAggregationAccount(aggregationAccountIdpayload)

Update an aggregation account

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var aggregationAccountId = "aggregationAccountId_example"; // String | UUID of an aggregation account

var payload = new atom_api.AggregationAccountPayload(); // AggregationAccountPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAggregationAccount(aggregationAccountIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountId** | [**String**](.md)| UUID of an aggregation account | 
 **payload** | [**AggregationAccountPayload**](AggregationAccountPayload.md)|  | 

### Return type

[**SpecificAggregationAccountResponse**](SpecificAggregationAccountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAggregationAccountBalance"></a>
# **updateAggregationAccountBalance**
> SpecificAggregationAccountBalanceResponse updateAggregationAccountBalance(aggregationAccountBalanceIdpayload)

Update an aggregation account balance

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var aggregationAccountBalanceId = "aggregationAccountBalanceId_example"; // String | UUID of an aggregation account balance

var payload = new atom_api.AggregationAccountBalancePayload(); // AggregationAccountBalancePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAggregationAccountBalance(aggregationAccountBalanceIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalanceId** | [**String**](.md)| UUID of an aggregation account balance | 
 **payload** | [**AggregationAccountBalancePayload**](AggregationAccountBalancePayload.md)|  | 

### Return type

[**SpecificAggregationAccountBalanceResponse**](SpecificAggregationAccountBalanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAllocation"></a>
# **updateAllocation**
> SpecificAllocationResponse updateAllocation(allocationIdpayload)

Update an allocation

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var allocationId = "allocationId_example"; // String | UUID of an allocation

var payload = new atom_api.AllocationPayload(); // AllocationPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAllocation(allocationIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**String**](.md)| UUID of an allocation | 
 **payload** | [**AllocationPayload**](AllocationPayload.md)|  | 

### Return type

[**SpecificAllocationResponse**](SpecificAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAllocationComposition"></a>
# **updateAllocationComposition**
> GetAllocationCompositionResponse updateAllocationComposition(allocationCompositionIdpayload)

Update an allocation composition

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var allocationCompositionId = "allocationCompositionId_example"; // String | UUID of an allocation composition

var payload = new atom_api.AllocationCompositionPayload(); // AllocationCompositionPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAllocationComposition(allocationCompositionIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationCompositionId** | [**String**](.md)| UUID of an allocation composition | 
 **payload** | [**AllocationCompositionPayload**](AllocationCompositionPayload.md)|  | 

### Return type

[**GetAllocationCompositionResponse**](GetAllocationCompositionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBankLink"></a>
# **updateBankLink**
> SpecificBankLinkResponse updateBankLink(bankLinkIdpayload)

Update a bank link

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var bankLinkId = "bankLinkId_example"; // String | UUID of a bank link

var payload = new atom_api.BankLinkPayload(); // BankLinkPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBankLink(bankLinkIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankLinkId** | [**String**](.md)| UUID of a bank link | 
 **payload** | [**BankLinkPayload**](BankLinkPayload.md)|  | 

### Return type

[**SpecificBankLinkResponse**](SpecificBankLinkResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBenchmark"></a>
# **updateBenchmark**
> SpecificBenchmarkResponse updateBenchmark(benchmarkId, payload)

Update a benchmark

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var benchmarkId = "benchmarkId_example"; // String | UUID of a benchmark

var payload = new atom_api.BenchmarkPayload(); // BenchmarkPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBenchmark(benchmarkId, payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmarkId** | [**String**](.md)| UUID of a benchmark | 
 **payload** | [**BenchmarkPayload**](BenchmarkPayload.md)|  | 

### Return type

[**SpecificBenchmarkResponse**](SpecificBenchmarkResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClient"></a>
# **updateClient**
> SpecificClientResponse updateClient(clientId, payload)

Update a client

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientId = "clientId_example"; // String | UUID of a client

var payload = new atom_api.ClientPayload(); // ClientPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateClient(clientId, payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| UUID of a client | 
 **payload** | [**ClientPayload**](ClientPayload.md)|  | 

### Return type

[**SpecificClientResponse**](SpecificClientResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClientHydro"></a>
# **updateClientHydro**
> SpecificClientHydroResponse updateClientHydro(clientHydroIdpayload)

Update a client-hydro relationship

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientHydroId = "clientHydroId_example"; // String | UUID of a client-hydro relationship

var payload = new atom_api.ClientHydroPayload(); // ClientHydroPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateClientHydro(clientHydroIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientHydroId** | [**String**](.md)| UUID of a client-hydro relationship | 
 **payload** | [**ClientHydroPayload**](ClientHydroPayload.md)|  | 

### Return type

[**SpecificClientHydroResponse**](SpecificClientHydroResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClientResponse"></a>
# **updateClientResponse**
> SpecificClientResponseResponse updateClientResponse(clientResponseIdpayload)

Update a client response

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var clientResponseId = "clientResponseId_example"; // String | UUID of a client response

var payload = new atom_api.ClientResponsePayload(); // ClientResponsePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateClientResponse(clientResponseIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientResponseId** | [**String**](.md)| UUID of a client response | 
 **payload** | [**ClientResponsePayload**](ClientResponsePayload.md)|  | 

### Return type

[**SpecificClientResponseResponse**](SpecificClientResponseResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDecisionTree"></a>
# **updateDecisionTree**
> SpecificDecisionTreeResponse updateDecisionTree(decisionTreeIdpayload)

Update a decision tree

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var decisionTreeId = "decisionTreeId_example"; // String | UUID of a decision tree

var payload = new atom_api.DecisionTreePayload(); // DecisionTreePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateDecisionTree(decisionTreeIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTreeId** | [**String**](.md)| UUID of a decision tree | 
 **payload** | [**DecisionTreePayload**](DecisionTreePayload.md)|  | 

### Return type

[**SpecificDecisionTreeResponse**](SpecificDecisionTreeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDepositRequest"></a>
# **updateDepositRequest**
> SpecificDepositRequestResponse updateDepositRequest(depositIdpayload)

Update a deposit request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var depositId = "depositId_example"; // String | UUID of a deposit record

var payload = new atom_api.DepositRequestPayload(); // DepositRequestPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateDepositRequest(depositIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositId** | [**String**](.md)| UUID of a deposit record | 
 **payload** | [**DepositRequestPayload**](DepositRequestPayload.md)|  | 

### Return type

[**SpecificDepositRequestResponse**](SpecificDepositRequestResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFundingRequest"></a>
# **updateFundingRequest**
> SpecificFundingRequestResponse updateFundingRequest(fundingIdpayload)

Update a funding request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var fundingId = "fundingId_example"; // String | UUID of a funding record

var payload = new atom_api.FundingRequestPayload(); // FundingRequestPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateFundingRequest(fundingIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingId** | [**String**](.md)| UUID of a funding record | 
 **payload** | [**FundingRequestPayload**](FundingRequestPayload.md)|  | 

### Return type

[**SpecificFundingRequestResponse**](SpecificFundingRequestResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGoal"></a>
# **updateGoal**
> SpecificGoalResponse updateGoal(goalId, payload)

Update a goal

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var goalId = "goalId_example"; // String | UUID of a goal

var payload = new atom_api.GoalPayload(); // GoalPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateGoal(goalId, payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalId** | [**String**](.md)| UUID of a goal | 
 **payload** | [**GoalPayload**](GoalPayload.md)|  | 

### Return type

[**SpecificGoalResponse**](SpecificGoalResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGoalTrackRecord"></a>
# **updateGoalTrackRecord**
> SpecificGoalTrackResponse updateGoalTrackRecord(goalTrackIdpayload)

Update a goal track record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var goalTrackId = "goalTrackId_example"; // String | UUID of a goal tracking record

var payload = new atom_api.GoalTrackPayload(); // GoalTrackPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateGoalTrackRecord(goalTrackIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalTrackId** | [**String**](.md)| UUID of a goal tracking record | 
 **payload** | [**GoalTrackPayload**](GoalTrackPayload.md)|  | 

### Return type

[**SpecificGoalTrackResponse**](SpecificGoalTrackResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateModel"></a>
# **updateModel**
> SpecificModelResponse updateModel(modelId, payload)

Update a model

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelId = "modelId_example"; // String | UUID of a model

var payload = new atom_api.ModelPayload(); // ModelPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateModel(modelId, payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**String**](.md)| UUID of a model | 
 **payload** | [**ModelPayload**](ModelPayload.md)|  | 

### Return type

[**SpecificModelResponse**](SpecificModelResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateModelAssetSize"></a>
# **updateModelAssetSize**
> SpecificModelAssetSizeResponse updateModelAssetSize(modelAssetSizeIdpayload)

Update a model asset size

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelAssetSizeId = "modelAssetSizeId_example"; // String | UUID of a model asset size record

var payload = new atom_api.ModelAssetSizePayload(); // ModelAssetSizePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateModelAssetSize(modelAssetSizeIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelAssetSizeId** | [**String**](.md)| UUID of a model asset size record | 
 **payload** | [**ModelAssetSizePayload**](ModelAssetSizePayload.md)|  | 

### Return type

[**SpecificModelAssetSizeResponse**](SpecificModelAssetSizeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateModelComment"></a>
# **updateModelComment**
> SpecificModelCommentResponse updateModelComment(modelCommentIdpayload)

Update a model commentary

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelCommentId = "modelCommentId_example"; // String | UUID of a model comment

var payload = new atom_api.ModelCommentPayload(); // ModelCommentPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateModelComment(modelCommentIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelCommentId** | [**String**](.md)| UUID of a model comment | 
 **payload** | [**ModelCommentPayload**](ModelCommentPayload.md)|  | 

### Return type

[**SpecificModelCommentResponse**](SpecificModelCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateModelComposition"></a>
# **updateModelComposition**
> ChangeModelCompositionResponse updateModelComposition(modelId, payload)

Change a model composition

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelId = "modelId_example"; // String | UUID of a model

var payload = new atom_api.ModelCompositionPayload(); // ModelCompositionPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateModelComposition(modelId, payload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**String**](.md)| UUID of a model | 
 **payload** | [**ModelCompositionPayload**](ModelCompositionPayload.md)|  | 

### Return type

[**ChangeModelCompositionResponse**](ChangeModelCompositionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateModelHolding"></a>
# **updateModelHolding**
> SpecificModelHoldingResponse updateModelHolding(modelHoldingIdpayload)

Update a model holding

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelHoldingId = "modelHoldingId_example"; // String | UUID of a model holding record

var payload = new atom_api.ModelHoldingPayload(); // ModelHoldingPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateModelHolding(modelHoldingIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelHoldingId** | [**String**](.md)| UUID of a model holding record | 
 **payload** | [**ModelHoldingPayload**](ModelHoldingPayload.md)|  | 

### Return type

[**SpecificModelHoldingResponse**](SpecificModelHoldingResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateModelTransaction"></a>
# **updateModelTransaction**
> SpecificModelTransactionResponse updateModelTransaction(modelTransactionIdpayload)

Update a model transaction

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var modelTransactionId = "modelTransactionId_example"; // String | UUID of a model transaction record

var payload = new atom_api.ModelTransactionPayload(); // ModelTransactionPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateModelTransaction(modelTransactionIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelTransactionId** | [**String**](.md)| UUID of a model transaction record | 
 **payload** | [**ModelTransactionPayload**](ModelTransactionPayload.md)|  | 

### Return type

[**SpecificModelTransactionResponse**](SpecificModelTransactionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNode"></a>
# **updateNode**
> SpecificNodeResponse updateNode(nodeIdpayload)

Update a node

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var nodeId = "nodeId_example"; // String | UUID of a node

var payload = new atom_api.NodePayload(); // NodePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateNode(nodeIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | [**String**](.md)| UUID of a node | 
 **payload** | [**NodePayload**](NodePayload.md)|  | 

### Return type

[**SpecificNodeResponse**](SpecificNodeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNodeRelationship"></a>
# **updateNodeRelationship**
> SpecificNodeRelationshipResponse updateNodeRelationship(nodeRelationshipIdpayload)

Update a node relationship

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var nodeRelationshipId = "nodeRelationshipId_example"; // String | UUID of a node relationship

var payload = new atom_api.NodeRelationshipPayload(); // NodeRelationshipPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateNodeRelationship(nodeRelationshipIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeRelationshipId** | [**String**](.md)| UUID of a node relationship | 
 **payload** | [**NodeRelationshipPayload**](NodeRelationshipPayload.md)|  | 

### Return type

[**SpecificNodeRelationshipResponse**](SpecificNodeRelationshipResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrderRecord"></a>
# **updateOrderRecord**
> SpecificOrderResponse updateOrderRecord(orderIdpayload)

Update an order record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var orderId = "orderId_example"; // String | UUID of an order record

var payload = new atom_api.OrderPayload(); // OrderPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateOrderRecord(orderIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | [**String**](.md)| UUID of an order record | 
 **payload** | [**OrderPayload**](OrderPayload.md)|  | 

### Return type

[**SpecificOrderResponse**](SpecificOrderResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrderStatus"></a>
# **updateOrderStatus**
> SpecificOrderStatusResponse updateOrderStatus(orderStatusIdpayload)

Update an order status

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var orderStatusId = "orderStatusId_example"; // String | UUID of an order status record

var payload = new atom_api.OrderStatusPayload(); // OrderStatusPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateOrderStatus(orderStatusIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderStatusId** | [**String**](.md)| UUID of an order status record | 
 **payload** | [**OrderStatusPayload**](OrderStatusPayload.md)|  | 

### Return type

[**SpecificOrderStatusResponse**](SpecificOrderStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrderTrackingRecord"></a>
# **updateOrderTrackingRecord**
> SpecificOrderTrackResponse updateOrderTrackingRecord(orderTrackIdpayload)

Update an order tracking record

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var orderTrackId = "orderTrackId_example"; // String | UUID of an order tracking record

var payload = new atom_api.OrderTrackPayload(); // OrderTrackPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateOrderTrackingRecord(orderTrackIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderTrackId** | [**String**](.md)| UUID of an order tracking record | 
 **payload** | [**OrderTrackPayload**](OrderTrackPayload.md)|  | 

### Return type

[**SpecificOrderTrackResponse**](SpecificOrderTrackResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePortfolio"></a>
# **updatePortfolio**
> SpecificPortfolioResponse updatePortfolio(portfolioIdpayload)

Update a portfolio

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioId = "portfolioId_example"; // String | UUID of a portfolio

var payload = new atom_api.PortfolioPayload(); // PortfolioPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolio(portfolioIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**String**](.md)| UUID of a portfolio | 
 **payload** | [**PortfolioPayload**](PortfolioPayload.md)|  | 

### Return type

[**SpecificPortfolioResponse**](SpecificPortfolioResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePortfolioAssetSize"></a>
# **updatePortfolioAssetSize**
> SpecificPortfolioAssetSizeResponse updatePortfolioAssetSize(portfolioAssetSizeIdpayload)

Update a portfolio asset size

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioAssetSizeId = "portfolioAssetSizeId_example"; // String | UUID of a portfolio asset size record

var payload = new atom_api.PortfolioAssetSizePayload(); // PortfolioAssetSizePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioAssetSize(portfolioAssetSizeIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioAssetSizeId** | [**String**](.md)| UUID of a portfolio asset size record | 
 **payload** | [**PortfolioAssetSizePayload**](PortfolioAssetSizePayload.md)|  | 

### Return type

[**SpecificPortfolioAssetSizeResponse**](SpecificPortfolioAssetSizeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePortfolioComment"></a>
# **updatePortfolioComment**
> SpecificPortfolioCommentResponse updatePortfolioComment(portfolioCommentIdpayload)

Update a portfolio commentary

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioCommentId = "portfolioCommentId_example"; // String | UUID of a portfolio comment

var payload = new atom_api.PortfolioCommentPayload(); // PortfolioCommentPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioComment(portfolioCommentIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioCommentId** | [**String**](.md)| UUID of a portfolio comment | 
 **payload** | [**PortfolioCommentPayload**](PortfolioCommentPayload.md)|  | 

### Return type

[**SpecificPortfolioCommentResponse**](SpecificPortfolioCommentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePortfolioHolding"></a>
# **updatePortfolioHolding**
> SpecificPortfolioHoldingResponse updatePortfolioHolding(portfolioHoldingIdpayload)

Update a portfolio holding

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioHoldingId = "portfolioHoldingId_example"; // String | UUID of a portfolio holding record

var payload = new atom_api.PortfolioHoldingPayload(); // PortfolioHoldingPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioHolding(portfolioHoldingIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioHoldingId** | [**String**](.md)| UUID of a portfolio holding record | 
 **payload** | [**PortfolioHoldingPayload**](PortfolioHoldingPayload.md)|  | 

### Return type

[**SpecificPortfolioHoldingResponse**](SpecificPortfolioHoldingResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePortfolioTransaction"></a>
# **updatePortfolioTransaction**
> SpecificPortfolioTransactionResponse updatePortfolioTransaction(portfolioTransactionIdpayload)

Update a portfolio transaction

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var portfolioTransactionId = "portfolioTransactionId_example"; // String | UUID of a portfolio transaction record

var payload = new atom_api.PortfolioTransactionPayload(); // PortfolioTransactionPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioTransaction(portfolioTransactionIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioTransactionId** | [**String**](.md)| UUID of a portfolio transaction record | 
 **payload** | [**PortfolioTransactionPayload**](PortfolioTransactionPayload.md)|  | 

### Return type

[**SpecificPortfolioTransactionResponse**](SpecificPortfolioTransactionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateQuestionnaire"></a>
# **updateQuestionnaire**
> SpecificQuestionnaireResponse updateQuestionnaire(questionnaireIdpayload)

Update a questionnaire

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var questionnaireId = "questionnaireId_example"; // String | UUID of a questionnaire

var payload = new atom_api.QuestionnairePayload(); // QuestionnairePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateQuestionnaire(questionnaireIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **questionnaireId** | [**String**](.md)| UUID of a questionnaire | 
 **payload** | [**QuestionnairePayload**](QuestionnairePayload.md)|  | 

### Return type

[**SpecificQuestionnaireResponse**](SpecificQuestionnaireResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateScore"></a>
# **updateScore**
> SpecificScoreResponse updateScore(scoreIdpayload)

Update a score

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var scoreId = "scoreId_example"; // String | UUID of a score record

var payload = new atom_api.ScorePayload(); // ScorePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateScore(scoreIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scoreId** | [**String**](.md)| UUID of a score record | 
 **payload** | [**ScorePayload**](ScorePayload.md)|  | 

### Return type

[**SpecificScoreResponse**](SpecificScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSecurity"></a>
# **updateSecurity**
> SpecificSecurityResponse updateSecurity(securityIdpayload)

Update a security

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var securityId = "securityId_example"; // String | UUID of a security

var payload = new atom_api.SecurityPayload(); // SecurityPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateSecurity(securityIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityId** | [**String**](.md)| UUID of a security | 
 **payload** | [**SecurityPayload**](SecurityPayload.md)|  | 

### Return type

[**SpecificSecurityResponse**](SpecificSecurityResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSecurityExclusion"></a>
# **updateSecurityExclusion**
> SpecificSecurityExclusionResponse updateSecurityExclusion(securityExclusionIdpayload)

Update a security exclusion

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var securityExclusionId = "securityExclusionId_example"; // String | UUID of a security exclusion record

var payload = new atom_api.SecurityExclusionPayload(); // SecurityExclusionPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateSecurityExclusion(securityExclusionIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityExclusionId** | [**String**](.md)| UUID of a security exclusion record | 
 **payload** | [**SecurityExclusionPayload**](SecurityExclusionPayload.md)|  | 

### Return type

[**SpecificSecurityExclusionResponse**](SpecificSecurityExclusionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSecurityPrice"></a>
# **updateSecurityPrice**
> SpecificSecurityPriceResponse updateSecurityPrice(securityPriceIdpayload)

Update a security price

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var securityPriceId = "securityPriceId_example"; // String | UUID of a security price record

var payload = new atom_api.SecurityPricePayload(); // SecurityPricePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateSecurityPrice(securityPriceIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityPriceId** | [**String**](.md)| UUID of a security price record | 
 **payload** | [**SecurityPricePayload**](SecurityPricePayload.md)|  | 

### Return type

[**SpecificSecurityPriceResponse**](SpecificSecurityPriceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTransactionCode"></a>
# **updateTransactionCode**
> SpecificTransactionCodeResponse updateTransactionCode(transactionCodeIdpayload)

Update a transaction code

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var transactionCodeId = "transactionCodeId_example"; // String | UUID of a transaction code

var payload = new atom_api.TransactionCodePayload(); // TransactionCodePayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateTransactionCode(transactionCodeIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionCodeId** | [**String**](.md)| UUID of a transaction code | 
 **payload** | [**TransactionCodePayload**](TransactionCodePayload.md)|  | 

### Return type

[**SpecificTransactionCodeResponse**](SpecificTransactionCodeResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTransferRequest"></a>
# **updateTransferRequest**
> SpecificTransferResponse updateTransferRequest(transferIdpayload)

Update a transfer request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var transferId = "transferId_example"; // String | UUID of an account transfer record

var payload = new atom_api.TransferRequestPayload(); // TransferRequestPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateTransferRequest(transferIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferId** | [**String**](.md)| UUID of an account transfer record | 
 **payload** | [**TransferRequestPayload**](TransferRequestPayload.md)|  | 

### Return type

[**SpecificTransferResponse**](SpecificTransferResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWithdrawalRequest"></a>
# **updateWithdrawalRequest**
> SpecificWithdrawalResponse updateWithdrawalRequest(withdrawalIdpayload)

Update a withdrawal request

### Example
```javascript
var atom_api = require('hydrogen-atom-api');
var defaultClient = atom_api.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth

// Method 1: Fetch and set access token with client_id and client_secret (requires npm client-oauth2)

// Initialize the OAuth2 Library
var ClientOAuth2 = require('client-oauth2')

// Set the configuration settings
var auth = new ClientOAuth2({
  clientId: '<your clientId>',
  clientSecret: '<your clientSecret>',
  accessTokenUri: 'https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials',
})

// Get the access token object for the client
try {
  auth.credentials.getToken()
    .then(function (user) {
      defaultClient.authentications['oauth']['accessToken'] = user.accessToken;
} catch (error) {
    console.log('Access Token error', error.message);
}

// Method 2: Set access token using an existing token
var oauth = defaultClient.authentications['oauth'];
oauth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new atom_api.NucleusApi();

var withdrawalId = "withdrawalId_example"; // String | UUID of a withdrawal request

var payload = new atom_api.WithdrawalPayload(); // WithdrawalPayload | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateWithdrawalRequest(withdrawalIdpayload, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawalId** | [**String**](.md)| UUID of a withdrawal request | 
 **payload** | [**WithdrawalPayload**](WithdrawalPayload.md)|  | 

### Return type

[**SpecificWithdrawalResponse**](SpecificWithdrawalResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

