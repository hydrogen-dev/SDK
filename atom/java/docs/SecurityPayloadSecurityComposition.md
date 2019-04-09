
# SecurityPayloadSecurityComposition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**componentId** | [**UUID**](UUID.md) | The ID of the underlying security that is part of the broader security | 
**startDate** | [**LocalDate**](LocalDate.md) | Date for when the underlying security started being a part of the broader security | 
**endDate** | [**LocalDate**](LocalDate.md) | Date for when the underlying security no longer was a part of the broader security | 
**weight** | **Double** | The weight of the country as a percentage of the broader security; ex. 20 representing 20%. The weights of all the components must add up to 100 | 



