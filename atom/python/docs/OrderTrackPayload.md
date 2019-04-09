# OrderTrackPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_id** | **str** | The ID of the order that the to which order track record belongs | 
**order_status_id** | **str** | The ID of the order status currently assigned to the order track record | 
**_date** | **date** | Date of the order track record | 
**commission** | **float** | Commission earned by the agent on the order | [optional] 
**external_track_id** | **str** | The external ID used by the agent or other party executing the order to track the order ticket (if provided) | [optional] 
**fee** | **float** | Total fees associated with the order | [optional] 
**price** | **float** | Execution price at which the securities in the order were bought or sold | [optional] 
**quantity** | **float** | Quantity of securities that were bought or sold | [optional] 
**metadata** | **object** | Custom information associated with the order tracking record in the format key:value | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


