
# RebalanceSubresponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the order |  [optional]
**createDate** | **String** | Datetime the order was created |  [optional]
**updateDate** | **String** | Datetime the order was last updated |  [optional]
**transactionCodeId** | [**UUID**](UUID.md) | ID of the transaction code |  [optional]
**date** | [**LocalDate**](LocalDate.md) | Date the order was generated |  [optional]
**price** | **Double** | Price of the security at the time the order is created |  [optional]
**isRead** | **Boolean** | Indicator for whether or not the order record has been read. Defaults to false which indicates that it has not been read |  [optional]
**quantity** | **Double** | The number of shares of security being bought or sold |  [optional]
**securityId** | [**UUID**](UUID.md) | The ID of the security being bought or sold |  [optional]
**accountId** | [**UUID**](UUID.md) | The ID of the account that the order falls under |  [optional]
**portfolioId** | [**UUID**](UUID.md) | The ID of the portfolio that the order falls under |  [optional]
**modelId** | [**UUID**](UUID.md) | The ID of the model with which the order is associated |  [optional]
**metadata** | **Object** | Custom information associated with the order record in the format key:value |  [optional]



