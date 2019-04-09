# atom_api.FundingRequestPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | The ID for the account that will be receiving the funding request | 
**fundingType** | **String** | The type of the funding transaction. Value may be bank_transfer, wire_transfer, cash, debit_card, credit_card, check, stock_certificate, digital_wallet, money_order, account_transfer, or other | 
**fundingStatus** | **String** | Status of the funding request. Value may be request_received, request_initiated, request_declined, request_cancelled, or request_completed. In the case of a recurring request, the status remains request_received until the end date of the request | 
**frequencyUnit** | **String** | Frequency of the funding request defined by your firm. Value may be one_time, daily, weekly, monthly, quarterly, or annually | 
**isDeposit** | **Boolean** | Indicates if the funding request is a deposit. true indicates it is a deposit, false a withdrawal | 
**startDate** | **Date** | The date that the funding request should start | 
**endDate** | **Date** | In the case that the funding request is recurring, the date that the funding request should stop occurring | [optional] 
**frequency** | **Number** | Number of frequency_unit between each request. For example, if the frequency_unit is weekly and the frequency is 2, this means the funding request occurs every two weeks. Default is 1 | [optional] 
**description** | **String** | Description for the request, such as “Initial Funding” | [optional] 
**amount** | **Number** | Amount that is included in the funding request | [optional] 
**bankLinkId** | **String** | In the case that the funding request relates to a specific bank link, the ID of the bank link providing the funds for the funding request | [optional] 
**transferId** | **String** | In the case that the funding request relates to the transfer of an external account into the account, the ID of the transfer | [optional] 
**supportTicketId** | **String** | In the case that the funding request is attached to a Support Ticket in the Electron API, the ID of the ticket | [optional] 
**isActive** | **Boolean** | Indicates if the funding request is currently active. Defaults to true which indicates it is active. | [optional] [default to true]
**metadata** | **Object** | Custom information associated with the funding request in the format key:value. | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


<a name="FundingTypeEnum"></a>
## Enum: FundingTypeEnum


* `bank_transfer` (value: `"bank_transfer"`)

* `wire_transfer` (value: `"wire_transfer"`)

* `cash` (value: `"cash"`)

* `debit_card` (value: `"debit_card"`)

* `credit_card` (value: `"credit_card"`)

* `check` (value: `"check"`)

* `stock_certificate` (value: `"stock_certificate"`)

* `digital_wallet` (value: `"digital_wallet"`)

* `money_order` (value: `"money_order"`)

* `account_transfer` (value: `"account_transfer"`)

* `other` (value: `"other"`)




<a name="FundingStatusEnum"></a>
## Enum: FundingStatusEnum


* `received` (value: `"request_received"`)

* `initiated` (value: `"request_initiated"`)

* `cancelled` (value: `"request_cancelled"`)

* `completed` (value: `"request_completed"`)




<a name="FrequencyUnitEnum"></a>
## Enum: FrequencyUnitEnum


* `one_time` (value: `"one_time"`)

* `daily` (value: `"daily"`)

* `weekly` (value: `"weekly"`)

* `monthly` (value: `"monthly"`)

* `quarterly` (value: `"quarterly"`)

* `annually` (value: `"annually"`)




