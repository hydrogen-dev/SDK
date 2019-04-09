# atom_api.CampaignDataPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **String** | The ID of the campaign to which the campaign data record belongs | 
**startDate** | **Date** | Date for when the period being measured by the campaign data record began | 
**endDate** | **Date** | Date for when the period being measured by the campaign data record ended | 
**clickThroughRate** | **Number** | Rate of clicks measured in the campaign data record for a specific feature as a whole number | [optional] 
**lineItem** | **String** | Name of the campaign data record indicating the feature that it is measuring such as banner click through | [optional] 
**publisherCampaignName** | **String** | Name of the campaign publisher | [optional] 
**totalClicks** | **Number** | Total number of clicks measured in the campaign data record for a specific feature as a whole number | [optional] 
**totalImpressions** | **Number** | Total number of impressions measured in the campaign data record for a specific feature as a whole number | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


