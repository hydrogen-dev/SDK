
# TxStatusSpecificResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the transaction status |  [optional]
**walletId** | [**UUID**](UUID.md) | ID of the wallet sent out the transaction |  [optional]
**hash** | **String** | The unique hash of the transaction |  [optional]
**status** | **String** | Status of the transaction. Could be pending, processed, or failed |  [optional]
**emitsEvent** | **Boolean** | Shows if the transaction will emit an event or not |  [optional]
**eventHandled** | **Boolean** | Shows if the event of the transaction has been handled or not |  [optional]
**createDate** | **String** | Datetime the currency transfer record was created |  [optional]
**updateDate** | **String** | Datetime the currency transfer record was updated |  [optional]



