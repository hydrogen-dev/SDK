
# CreateModelAssetSizeResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**LocalDate**](LocalDate.md) | Date for this asset size record | 
**assetSize** | **Double** | “Growth of a dollar” within the model on the particular date | 
**isReconciled** | **Boolean** | Indicates the asset size record is reconciled. true means it is reconciled | 
**modelId** | [**UUID**](UUID.md) | The ID of the model for the asset size record | 
**currencyCode** | **String** | Alphabetic currency code for the base currency of the model, limited to 3 characters |  [optional]
**secondaryId** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) | ID of the model asset size |  [optional]
**createDate** | **String** | Datetime the model asset size was created |  [optional]



