# MoleculeApi::TxStatusSpecificResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the transaction status | [optional] 
**wallet_id** | **String** | ID of the wallet sent out the transaction | [optional] 
**hash** | **String** | The unique hash of the transaction | [optional] 
**status** | **String** | Status of the transaction. Could be pending, processed, or failed | [optional] 
**emits_event** | **BOOLEAN** | Shows if the transaction will emit an event or not | [optional] 
**event_handled** | **BOOLEAN** | Shows if the event of the transaction has been handled or not | [optional] 
**create_date** | **String** | Datetime the currency transfer record was created | [optional] 
**update_date** | **String** | Datetime the currency transfer record was updated | [optional] 


