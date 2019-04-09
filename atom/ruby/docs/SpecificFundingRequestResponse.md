# AtomApi::SpecificFundingRequestResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the funding request | [optional] 
**create_date** | **String** | Datetime the funding request was created | [optional] 
**account_id** | **String** | The ID for the account that will be receiving the funding request | 
**funding_type** | **String** | The type of the funding transaction. Value may be bank_transfer, wire_transfer, cash, debit_card, credit_card, check, stock_certificate, digital_wallet, money_order, account_transfer, or other | 
**funding_status** | **String** | Status of the funding request. Value may be request_received, request_initiated, request_declined, request_cancelled, or request_completed. In the case of a recurring request, the status remains request_received until the end date of the request | 
**frequency_unit** | **String** | Frequency of the funding request defined by your firm. Value may be one_time, daily, weekly, monthly, quarterly, or annually | 
**is_deposit** | **BOOLEAN** | Indicates if the funding request is a deposit. true indicates it is a deposit, false a withdrawal | 
**start_date** | **Date** | The date that the funding request should start | 
**end_date** | **Date** | In the case that the funding request is recurring, the date that the funding request should stop occurring | [optional] 
**frequency** | **Integer** | Number of frequency_unit between each request. For example, if the frequency_unit is weekly and the frequency is 2, this means the funding request occurs every two weeks. Default is 1 | [optional] 
**description** | **String** | Description for the request, such as “Initial Funding” | [optional] 
**amount** | **Float** | Amount that is included in the funding request | [optional] 
**bank_link_id** | **String** | In the case that the funding request relates to a specific bank link, the ID of the bank link providing the funds for the funding request | [optional] 
**transfer_id** | **String** | In the case that the funding request relates to the transfer of an external account into the account, the ID of the transfer | [optional] 
**support_ticket_id** | **String** | In the case that the funding request is attached to a Support Ticket in the Electron API, the ID of the ticket | [optional] 
**is_active** | **BOOLEAN** | Indicates if the funding request is currently active. Defaults to true which indicates it is active. | [optional] [default to true]
**metadata** | **Object** | Custom information associated with the funding request in the format key:value. | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **String** | Datetime the funding request was last updated | [optional] 


