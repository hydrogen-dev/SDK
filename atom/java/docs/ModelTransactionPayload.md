
# ModelTransactionPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shares** | **Double** | Number of shares of the security purchased as part of the transaction | 
**price** | **Double** | Security price at which the shares were purchased as part of the transaction | 
**date** | [**LocalDate**](LocalDate.md) | Date of the transaction | 
**modelId** | [**UUID**](UUID.md) | The ID of the model that the transaction record falls under | 
**securityId** | [**UUID**](UUID.md) | The ID of the security included in the transaction | 
**transactionCodeId** | **Integer** | The ID referring to the transaction codes defined by your firm | 
**secondaryId** | **String** |  |  [optional]



