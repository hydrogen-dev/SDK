
# ChangeModelCompositionResponseInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The ID of the model transaction record created |  [optional]
**shares** | **Double** | Number of shares of the security purchased as part of the transaction |  [optional]
**price** | **Double** | Security price at which the shares were purchased as part of the transaction |  [optional]
**date** | [**LocalDate**](LocalDate.md) | Date of the transaction |  [optional]
**modelId** | [**UUID**](UUID.md) | The ID of the model that the transaction record falls under |  [optional]
**securityId** | [**UUID**](UUID.md) | The ID of the security included in the transaction |  [optional]
**transactionCodeId** | [**UUID**](UUID.md) | The ID referring to the transaction codes defined by your firm |  [optional]
**createDate** | **String** | Timestamp for the date and time that the record was created |  [optional]
**updateDate** | **String** | Timestamp for the date and time that the record was last updated |  [optional]



