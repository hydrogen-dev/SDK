# AtomApi::CreateBankLinkResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **String** | The ID for the account to which the bank link belongs | 
**bank_account_holder** | **String** | Name of the individual that owns the bank account | 
**bank_account_number** | **String** | Account number of the bank account | 
**name** | **String** | Name of the bank for the bank link, e.g. HSBC | 
**routing** | **String** | Routing number of the bank for the bank link | 
**routing_wire** | **String** | Routing number of the bank for the bank link used for wire transfers | [optional] 
**bank_account_name** | **String** | Name of the bank account, e.g. Mike’s HSBC Checking | [optional] 
**currency_code** | **String** | Alphabetic currency code for the base currency of the bank account linked, limited to 3 characters | [optional] 
**balance** | **String** | Current balance of the bank account | [optional] 
**available_balance** | **String** | Available balance of the bank account, usually taking into consideration pending transactions or available overdraft | [optional] 
**type** | **String** | Used to indicate the type of bank account for this bank link such as a ‘savings’ account | [optional] 
**is_active** | **BOOLEAN** | Indicates if the bank link is active. Defaults to true which indicates it is active | [optional] [default to true]
**is_link_verified** | **BOOLEAN** | Indicates if the bank link has been verified. Defaults to false which indicates it has not been verified | [optional] [default to false]
**link_verified_date** | **Date** | Date and time that the bank link was verified | [optional] 
**metadata** | **Object** | Custom information associated with the bank link in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | ID of the bank link | [optional] 
**create_date** | **String** | Datetime the bank link was created | [optional] 


