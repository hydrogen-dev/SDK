
# SpecificCampaignDataResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the marketing campaign data record |  [optional]
**createDate** | **String** | Datetime the marketing campaign data record was created |  [optional]
**campaignId** | [**UUID**](UUID.md) | The ID of the campaign to which the campaign data record belongs | 
**startDate** | [**LocalDate**](LocalDate.md) | Date for when the period being measured by the campaign data record began | 
**endDate** | [**LocalDate**](LocalDate.md) | Date for when the period being measured by the campaign data record ended | 
**clickThroughRate** | **Double** | Rate of clicks measured in the campaign data record for a specific feature as a whole number |  [optional]
**lineItem** | **String** | Name of the campaign data record indicating the feature that it is measuring such as banner click through |  [optional]
**publisherCampaignName** | **String** | Name of the campaign publisher |  [optional]
**totalClicks** | **Integer** | Total number of clicks measured in the campaign data record for a specific feature as a whole number |  [optional]
**totalImpressions** | **Integer** | Total number of impressions measured in the campaign data record for a specific feature as a whole number |  [optional]
**secondaryId** | **String** |  |  [optional]
**metadata** | **Object** | Custom information associated with the campaign data in the format key:value |  [optional]
**updateDate** | **String** | Datetime the marketing campaign data record was last updated |  [optional]



