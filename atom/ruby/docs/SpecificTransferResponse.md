# AtomApi::SpecificTransferResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **String** | The ID of the account to which the transfer belongs | 
**account_holder** | **String** | Name of the individual that is the owner of the external account | 
**account_number** | **String** | Account number for the external account that is the source of the funds | 
**account_type_id** | **String** | The ID for the type of the account on your platform | 
**firm_name** | **String** | Name of the firm that previously held or holds the external account | 
**transfer_all_cash** | **BOOLEAN** | Indicator if the external account should be entirely converted to cash to be transferred. | 
**amount** | **Float** | Amount that is transferred | [optional] 
**comment** | **String** | Comment for the transfer such as “Funded” | [optional] 
**dtc_number** | **String** | Number of the Deposit Trust Company (DTC)’s that held or holds the external account usually in the case of an Individual Retirement Account (IRA) in the United States | [optional] 
**roth_five_year** | **Integer** | In the case that the account is a United States Roth IRA account, the year it was opened (e.g. 2010) | [optional] 
**status** | **String** | Status of the transfer such as “Pending” | [optional] 
**transfer_type** | **String** | Type of transaction being made such as “wire” or “check” | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the transfer in the format key:value | [optional] 
**update_date** | **String** | Datetime the transfer request was last updated | [optional] 


