
# CreateOrderTrackResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**UUID**](UUID.md) | The ID of the order that the to which order track record belongs | 
**orderStatusId** | [**UUID**](UUID.md) | The ID of the order status currently assigned to the order track record | 
**date** | [**LocalDate**](LocalDate.md) | Date of the order track record | 
**commission** | **Double** | Commission earned by the agent on the order |  [optional]
**externalTrackId** | [**UUID**](UUID.md) | The external ID used by the agent or other party executing the order to track the order ticket (if provided) |  [optional]
**fee** | **Double** | Total fees associated with the order |  [optional]
**price** | **Double** | Execution price at which the securities in the order were bought or sold |  [optional]
**quantity** | **Double** | Quantity of securities that were bought or sold |  [optional]
**metadata** | **Object** | Custom information associated with the order tracking record in the format key:value |  [optional]
**id** | [**UUID**](UUID.md) | ID of the order tracking record |  [optional]
**createDate** | **String** | Datetime the order tracking record was created |  [optional]



