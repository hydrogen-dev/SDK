# AtomApi::CreateModelHoldingResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model_id** | **String** | The ID of the model that the security holding record falls under | 
**security_id** | **String** | The ID of the security included in this holding record | 
**current_weight** | **Float** | Current weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**strategic_weight** | **Float** | Strategic weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**date** | **Date** | Date of the security weight | 
**metadata** | **Object** | Custom information associated with the model holding in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | ID of the model holding | [optional] 
**create_date** | **String** | Datetime the model holding was created | [optional] 


