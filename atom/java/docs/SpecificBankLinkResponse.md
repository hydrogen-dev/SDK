
# SpecificBankLinkResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the bank link |  [optional]
**createDate** | **String** | Datetime the bank link was created |  [optional]
**accountId** | [**UUID**](UUID.md) | The ID for the account to which the bank link belongs |  [optional]
**bankAccountHolder** | **String** | Name of the individual that owns the bank account | 
**bankAccountNumber** | **String** | Account number of the bank account | 
**name** | **String** | Name of the bank for the bank link, e.g. HSBC | 
**routing** | **String** | Routing number of the bank for the bank link | 
**routingWire** | **String** | Routing number of the bank for the bank link used for wire transfers |  [optional]
**bankAccountName** | **String** | Name of the bank account, e.g. Mike’s HSBC Checking |  [optional]
**currencyCode** | **String** | Alphabetic currency code for the base currency of the bank account linked, limited to 3 characters |  [optional]
**balance** | **String** | Current balance of the bank account |  [optional]
**availableBalance** | **String** | Available balance of the bank account, usually taking into consideration pending transactions or available overdraft |  [optional]
**type** | **String** | Used to indicate the type of bank account for this bank link such as a ‘savings’ account |  [optional]
**isActive** | **Boolean** | Indicates if the bank link is active. Defaults to true which indicates it is active |  [optional]
**isLinkVerified** | **Boolean** | Indicates if the bank link has been verified. Defaults to false which indicates it has not been verified |  [optional]
**linkVerifiedDate** | [**LocalDate**](LocalDate.md) | Date and time that the bank link was verified |  [optional]
**metadata** | **Object** | Custom information associated with the bank link in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]
**updateDate** | **String** | Datetime the bank link was last updated |  [optional]



