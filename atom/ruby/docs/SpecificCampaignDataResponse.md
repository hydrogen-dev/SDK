# AtomApi::SpecificCampaignDataResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the marketing campaign data record | [optional] 
**create_date** | **String** | Datetime the marketing campaign data record was created | [optional] 
**campaign_id** | **String** | The ID of the campaign to which the campaign data record belongs | 
**start_date** | **Date** | Date for when the period being measured by the campaign data record began | 
**end_date** | **Date** | Date for when the period being measured by the campaign data record ended | 
**click_through_rate** | **Float** | Rate of clicks measured in the campaign data record for a specific feature as a whole number | [optional] 
**line_item** | **String** | Name of the campaign data record indicating the feature that it is measuring such as banner click through | [optional] 
**publisher_campaign_name** | **String** | Name of the campaign publisher | [optional] 
**total_clicks** | **Integer** | Total number of clicks measured in the campaign data record for a specific feature as a whole number | [optional] 
**total_impressions** | **Integer** | Total number of impressions measured in the campaign data record for a specific feature as a whole number | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the campaign data in the format key:value | [optional] 
**update_date** | **String** | Datetime the marketing campaign data record was last updated | [optional] 


