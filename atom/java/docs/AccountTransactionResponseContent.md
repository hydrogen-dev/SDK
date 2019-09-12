
# AccountTransactionResponseContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The ID for the transaction record |  [optional]
**date** | [**LocalDate**](LocalDate.md) | Date for when the transaction occurred |  [optional]
**isRead** | **Boolean** | Indicates if the transaction has been read. Defaults to false which indicates it has not been read |  [optional]
**portfolioId** | [**UUID**](UUID.md) | The ID for the portfolio that the transaction falls under |  [optional]
**modelId** | [**UUID**](UUID.md) | The ID for the model to which the portfolio that the transaction falls under subscribes |  [optional]
**price** | **Double** | Price at which security was bought or sold included in the transaction |  [optional]
**quantity** | **Double** | Quantity of shares of the security purchased |  [optional]
**securityId** | [**UUID**](UUID.md) | The ID of the security included in the transaction |  [optional]
**transactionCodeId** | [**UUID**](UUID.md) | The ID referring to the transaction code, defined by your firm |  [optional]
**secondaryId** | **String** | Alternate ID that can be used to identify the object such as an internal id |  [optional]
**createDate** | **String** | Timestamp for the date and time that the transaction record was created |  [optional]
**updateDate** | **String** | Timestamp for the date and time that the transaction record was last updated |  [optional]



