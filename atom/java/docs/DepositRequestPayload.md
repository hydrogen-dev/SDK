
# DepositRequestPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | [**UUID**](UUID.md) | The ID for the account that is the destination of the deposit | 
**amount** | **Double** | Amount that is being deposited | 
**fundingId** | [**UUID**](UUID.md) | The ID of the funding record that maps to this deposit | 
**investedDate** | **String** | Date and time that the funds should be pulled from the funding request to be invested | 
**accountNumber** | **String** | Bank account number that is the source of the deposit |  [optional]
**comments** | **String** | Comment for the deposit such as “Funded” |  [optional]
**direction** | **String** | Label to indicate the direction of the transaction such as “Incoming” or “Outgoing” |  [optional]
**lastRequestDate** | **String** | In the case of recurring deposits, the last date and time that the deposit was last requested |  [optional]
**receivedDate** | **String** | Date and time that the deposit was received into the account |  [optional]
**status** | **String** | Status of the deposit transaction such as “Processing”. Use this field to track the status of the individual deposit if it is associated with a recurring Funding request |  [optional]
**statusTimeStamp** | **String** | Date and time that the record was last updated |  [optional]
**type** | **String** | Indicates the payment type such as “check, “wire”, etc. |  [optional]
**secondaryId** | **String** |  |  [optional]



