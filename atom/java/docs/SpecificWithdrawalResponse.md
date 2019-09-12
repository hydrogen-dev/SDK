
# SpecificWithdrawalResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the withdrawal request |  [optional]
**createDate** | **String** | Datetime of the withdrawal request |  [optional]
**accountId** | [**UUID**](UUID.md) | The ID for the account that is the destination of the withdrawal | 
**amount** | **Double** | Amount that is being withdrawn from the account | 
**fundingId** | [**UUID**](UUID.md) | The ID of the funding record that maps to this withdrawal | 
**withdrawalDate** | **String** | Date and time that the withdrawal was made | 
**accountNumber** | **String** | Bank account number that is the destination of the withdrawal |  [optional]
**comments** | **String** | Comment for the withdrawal such as “Funded” |  [optional]
**direction** | **String** | Label to indicate the direction of the transaction such as “Incoming” or “Outgoing” |  [optional]
**fees** | **String** | Any fees associated with the withdrawal, especially for an investment account |  [optional]
**lastRequestDate** | **String** | In the case of recurring withdrawals, the date and time that the withdrawal was last requested |  [optional]
**receivedDate** | **String** | Date and time that the withdrawal was received |  [optional]
**status** | **String** | Status of the transaction such as “Processing” |  [optional]
**statusTimeStamp** | **String** | Date and time that the status of the record was last updated |  [optional]
**type** | **String** | Indicates the payment type such as “check, “wire”, etc. |  [optional]
**secondaryId** | **String** |  |  [optional]
**metadata** | **Object** | Custom information associated with the withdrawal in the format key:value |  [optional]
**updateDate** | **String** | Datetime the withdrawal request was last updated |  [optional]



