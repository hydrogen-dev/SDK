
# CreateModelHoldingResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelId** | [**UUID**](UUID.md) | The ID of the model that the security holding record falls under | 
**securityId** | [**UUID**](UUID.md) | The ID of the security included in this holding record | 
**currentWeight** | **Double** | Current weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**strategicWeight** | **Double** | Strategic weight of the security as a percentage of the model’s total value; ex. 20 representing 20%. If the security is the only one, enter 100 | 
**date** | [**LocalDate**](LocalDate.md) | Date of the security weight | 
**metadata** | **Object** | Custom information associated with the model holding in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) | ID of the model holding |  [optional]
**createDate** | **String** | Datetime the model holding was created |  [optional]



