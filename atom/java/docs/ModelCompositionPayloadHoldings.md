
# ModelCompositionPayloadHoldings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**securityId** | [**UUID**](UUID.md) | The ID of the security included in this holding record | 
**currentWeight** | **Double** | Current weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**strategicWeight** | **Double** | Strategic weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**date** | [**LocalDate**](LocalDate.md) | Date of the security weight | 
**isSafeSecurity** | **Boolean** | If true, the security is classified as safe |  [optional]
**isInitialHolding** | **Boolean** | If true, the security is an initial holding in the model |  [optional]



