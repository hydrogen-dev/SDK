
# ClientTransactionResponseContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The ID for the transaction record |  [optional]
**date** | [**LocalDate**](LocalDate.md) | Date of the transaction record |  [optional]
**isRead** | **Boolean** | Indicates if the transaction has been read. Defaults to false which indicates it has not been read |  [optional]
**portfolioId** | [**UUID**](UUID.md) | The ID of the portfolio that the transaction falls under |  [optional]
**modelId** | [**UUID**](UUID.md) | Model to which the portfolio that the transaction falls under subscribes |  [optional]
**price** | **Integer** | Price for the security included in the transaction at which it was sold or purchased |  [optional]
**quantity** | **Integer** | Quantity of shares of the security purchased |  [optional]
**securityId** | [**UUID**](UUID.md) | The ID of the security included in the transaction |  [optional]
**transactionCodeId** | **String** | The ID referring to the transaction codes defined by your firm |  [optional]
**secondaryId** | **String** | Alternate ID that can be used to identify the object such as an internal id |  [optional]
**createDate** | **String** | Timestamp for the date and time that the record was created |  [optional]
**updateDate** | **String** | Timestamp for the date and time that the record was last updated |  [optional]



