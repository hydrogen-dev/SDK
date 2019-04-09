
# SpecificOrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the order record |  [optional]
**createDate** | **String** | Datetime the order record was created |  [optional]
**transactionCodeId** | [**UUID**](UUID.md) | The ID referring to the transaction codes defined by your firm | 
**quantity** | **Double** | The number of shares of security being bought or sold | 
**securityId** | [**UUID**](UUID.md) | The ID of the security being bought or sold | 
**date** | [**LocalDate**](LocalDate.md) | Date for when the order was generated | 
**price** | **Double** | Price of the security at the time the order is created. Should be provided to use the rebalancing functionality |  [optional]
**orderBulkId** | [**UUID**](UUID.md) | In the case that the order is part of a bulk order, the ID of the bulk order |  [optional]
**isRead** | **Boolean** | Indicator for whether or not the order record has been read. Defaults to false which indicates that it has not been read |  [optional]
**orderType** | **String** | Type of the order transaction |  [optional]
**orderTicketId** | [**UUID**](UUID.md) | The ID that reflects all orders generated during a rebalance |  [optional]
**portfolioId** | [**UUID**](UUID.md) | The ID of the portfolio that the order falls under. Used when aggregating order records into Bulk Order |  [optional]
**accountId** | [**UUID**](UUID.md) | The ID of the account that the order falls under. Used when aggregating order records into Bulk Order |  [optional]
**modelId** | [**UUID**](UUID.md) | The ID of the model with which the order is associated. Used when aggregating order records into Bulk Order |  [optional]
**metadata** | **Object** | Custom information associated with the order record in the format key:value |  [optional]
**updateDate** | **String** | Datetime the order record was last updated |  [optional]



