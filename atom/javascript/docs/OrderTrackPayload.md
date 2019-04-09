# atom_api.OrderTrackPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | The ID of the order that the to which order track record belongs | 
**orderStatusId** | **String** | The ID of the order status currently assigned to the order track record | 
**_date** | **Date** | Date of the order track record | 
**commission** | **Number** | Commission earned by the agent on the order | [optional] 
**externalTrackId** | **String** | The external ID used by the agent or other party executing the order to track the order ticket (if provided) | [optional] 
**fee** | **Number** | Total fees associated with the order | [optional] 
**price** | **Number** | Execution price at which the securities in the order were bought or sold | [optional] 
**quantity** | **Number** | Quantity of securities that were bought or sold | [optional] 
**metadata** | **Object** | Custom information associated with the order tracking record in the format key:value | [optional] 


