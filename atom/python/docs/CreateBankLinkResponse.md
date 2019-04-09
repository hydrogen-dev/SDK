# CreateBankLinkResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **str** | The ID for the account to which the bank link belongs | 
**bank_account_holder** | **str** | Name of the individual that owns the bank account | 
**bank_account_number** | **str** | Account number of the bank account | 
**name** | **str** | Name of the bank for the bank link, e.g. HSBC | 
**routing** | **str** | Routing number of the bank for the bank link | 
**routing_wire** | **str** | Routing number of the bank for the bank link used for wire transfers | [optional] 
**bank_account_name** | **str** | Name of the bank account, e.g. Mike’s HSBC Checking | [optional] 
**currency_code** | **str** | Alphabetic currency code for the base currency of the bank account linked, limited to 3 characters | [optional] 
**balance** | **str** | Current balance of the bank account | [optional] 
**available_balance** | **str** | Available balance of the bank account, usually taking into consideration pending transactions or available overdraft | [optional] 
**type** | **str** | Used to indicate the type of bank account for this bank link such as a ‘savings’ account | [optional] 
**is_active** | **bool** | Indicates if the bank link is active. Defaults to true which indicates it is active | [optional] [default to True]
**is_link_verified** | **bool** | Indicates if the bank link has been verified. Defaults to false which indicates it has not been verified | [optional] [default to False]
**link_verified_date** | **date** | Date and time that the bank link was verified | [optional] 
**metadata** | **object** | Custom information associated with the bank link in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **str** | ID of the bank link | [optional] 
**create_date** | **str** | Datetime the bank link was created | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


