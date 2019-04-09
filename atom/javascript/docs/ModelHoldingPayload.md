# atom_api.ModelHoldingPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelId** | **String** | The ID of the model that the security holding record falls under | 
**securityId** | **String** | The ID of the security included in this holding record | 
**currentWeight** | **Number** | Current weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**strategicWeight** | **Number** | Strategic weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**_date** | **Date** | Date of the security weight | 
**metadata** | **Object** | Custom information associated with the model holding in the format key:value | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


