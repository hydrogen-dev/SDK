
# CreateTransferResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | [**UUID**](UUID.md) | The ID of the account to which the transfer belongs | 
**accountHolder** | **String** | Name of the individual that is the owner of the external account | 
**accountNumber** | **String** | Account number for the external account that is the source of the funds | 
**accountTypeId** | [**UUID**](UUID.md) | The ID for the type of the account on your platform | 
**firmName** | **String** | Name of the firm that previously held or holds the external account | 
**transferAllCash** | **Boolean** | Indicator if the external account should be entirely converted to cash to be transferred. | 
**amount** | **Double** | Amount that is transferred |  [optional]
**comment** | **String** | Comment for the transfer such as “Funded” |  [optional]
**dtcNumber** | **String** | Number of the Deposit Trust Company (DTC)’s that held or holds the external account usually in the case of an Individual Retirement Account (IRA) in the United States |  [optional]
**rothFiveYear** | **Integer** | In the case that the account is a United States Roth IRA account, the year it was opened (e.g. 2010) |  [optional]
**status** | **String** | Status of the transfer such as “Pending” |  [optional]
**transferType** | **String** | Type of transaction being made such as “wire” or “check” |  [optional]
**secondaryId** | **String** |  |  [optional]
**metadata** | **Object** | Custom information associated with the transfer in the format key:value |  [optional]
**id** | [**UUID**](UUID.md) | ID of the transfer request |  [optional]
**createDate** | **String** | Datetime the transfer request was created |  [optional]



