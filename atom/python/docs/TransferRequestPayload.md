# TransferRequestPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **str** | The ID of the account to which the transfer belongs | 
**account_holder** | **str** | Name of the individual that is the owner of the external account | 
**account_number** | **str** | Account number for the external account that is the source of the funds | 
**account_type_id** | **str** | The ID for the type of the account on your platform | 
**firm_name** | **str** | Name of the firm that previously held or holds the external account | 
**transfer_all_cash** | **bool** | Indicator if the external account should be entirely converted to cash to be transferred. | 
**amount** | **float** | Amount that is transferred | [optional] 
**comment** | **str** | Comment for the transfer such as “Funded” | [optional] 
**dtc_number** | **str** | Number of the Deposit Trust Company (DTC)’s that held or holds the external account usually in the case of an Individual Retirement Account (IRA) in the United States | [optional] 
**roth_five_year** | **int** | In the case that the account is a United States Roth IRA account, the year it was opened (e.g. 2010) | [optional] 
**status** | **str** | Status of the transfer such as “Pending” | [optional] 
**transfer_type** | **str** | Type of transaction being made such as “wire” or “check” | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **object** | Custom information associated with the transfer in the format key:value | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


