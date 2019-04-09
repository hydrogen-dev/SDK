# AtomApi::SpecificOrderTrackResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the order tracking record | [optional] 
**create_date** | **String** | Datetime the order tracking record was created | [optional] 
**order_id** | **String** | The ID of the order that the to which order track record belongs | 
**order_status_id** | **String** | The ID of the order status currently assigned to the order track record | 
**date** | **Date** | Date of the order track record | 
**commission** | **Float** | Commission earned by the agent on the order | [optional] 
**external_track_id** | **String** | The external ID used by the agent or other party executing the order to track the order ticket (if provided) | [optional] 
**fee** | **Float** | Total fees associated with the order | [optional] 
**price** | **Float** | Execution price at which the securities in the order were bought or sold | [optional] 
**quantity** | **Float** | Quantity of securities that were bought or sold | [optional] 
**metadata** | **Object** | Custom information associated with the order tracking record in the format key:value | [optional] 
**update_date** | **String** | Datetime the order tracking record was last updated | [optional] 


