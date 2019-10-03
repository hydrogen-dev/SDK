
# BulkOrderAccountPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**LocalDate**](LocalDate.md) | Date for all the orders that should be aggregated together in the bulk order record | 
**buyTransactionCodeId** | [**UUID**](UUID.md) | The ID of the transaction code that will ultimately be used to denote the buy transactions | 
**sellTransactionCodeId** | [**UUID**](UUID.md) | The ID of the transaction code that will ultimately be used to denote the sell transactions | 
**metadata** | **Object** | Custom information associated with the bulk order in the format key:value |  [optional]



