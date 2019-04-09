# AtomApi::ModelCompositionPayloadHoldings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**security_id** | **String** | The ID of the security included in this holding record | 
**current_weight** | **Float** | Current weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**strategic_weight** | **Float** | Strategic weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**date** | **Date** | Date of the security weight | 
**is_safe_security** | **BOOLEAN** | If true, the security is classified as safe | [optional] 
**is_initial_holding** | **BOOLEAN** | If true, the security is an initial holding in the model | [optional] 


