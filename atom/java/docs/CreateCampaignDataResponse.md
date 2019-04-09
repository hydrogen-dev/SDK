
# CreateCampaignDataResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | [**UUID**](UUID.md) | The ID of the campaign to which the campaign data record belongs | 
**startDate** | [**LocalDate**](LocalDate.md) | Date for when the period being measured by the campaign data record began | 
**endDate** | [**LocalDate**](LocalDate.md) | Date for when the period being measured by the campaign data record ended | 
**clickThroughRate** | **Double** | Rate of clicks measured in the campaign data record for a specific feature as a whole number |  [optional]
**lineItem** | **String** | Name of the campaign data record indicating the feature that it is measuring such as banner click through |  [optional]
**publisherCampaignName** | **String** | Name of the campaign publisher |  [optional]
**totalClicks** | **Integer** | Total number of clicks measured in the campaign data record for a specific feature as a whole number |  [optional]
**totalImpressions** | **Integer** | Total number of impressions measured in the campaign data record for a specific feature as a whole number |  [optional]
**secondaryId** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) | ID of the marketing campaign data record |  [optional]
**createDate** | **String** | Datetime the marketing campaign data record was created |  [optional]


