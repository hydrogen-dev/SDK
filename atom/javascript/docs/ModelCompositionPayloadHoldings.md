# atom_api.ModelCompositionPayloadHoldings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**securityId** | **String** | The ID of the security included in this holding record | 
**currentWeight** | **Number** | Current weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**strategicWeight** | **Number** | Strategic weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**_date** | **Date** | Date of the security weight | 
**isSafeSecurity** | **Boolean** | If true, the security is classified as safe | [optional] 
**isInitialHolding** | **Boolean** | If true, the security is an initial holding in the model | [optional] 


