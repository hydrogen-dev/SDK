# AtomApi::CreateCampaignResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Title of the campaign | 
**description** | **String** | Description of the campaign such as its purpose | 
**start_date** | **Date** | Date that the marketing campaign begins | 
**end_date** | **Date** | Date that the marketing campaign ends | 
**is_acquisition** | **BOOLEAN** | Indicates if the campaign is an acquisition campaign, such as affiliate. Defaults to false meaning it is not an acquisition campaign | [optional] [default to false]
**campaign_category** | **String** | The category assigned to the campaign | [optional] 
**campaign_plan_id** | **String** | The ID of a campaign plan associated with a campaign | [optional] 
**cookie_code** | **String** | Cookie code associated with the campaign used for tracking purposes | [optional] 
**is_active** | **BOOLEAN** | Indicates if the campaign is currently active. Defaults to true which indicates that it is active | [optional] [default to true]
**landing_page** | **String** | Name for the landing page of the campaign | [optional] 
**rate** | **Float** | Rate of client/user registration for the campaign | [optional] 
**utm_campaign** | **String** | Name of an Urchin Tracking Module (UTM) for a marketing feature used in the campaign | [optional] 
**utm_content** | **String** | Content of an Urchin Tracking Module (UTM) for a marketing campaign feature used in the campaign. For example, content in a site banner | [optional] 
**utm_medium** | **String** | Platform of an Urchin Tracking Module (UTM) for a marketing campaign feature such as Social Media | [optional] 
**utm_source** | **String** | Feature Urchin Tracking Module (UTM) for a marketing campaign such as a banner advertisement | [optional] 
**utm_term** | **String** | Term of an Urchin Tracking Module (UTM) for a marketing campaign | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | ID of the marketing campaign | [optional] 
**create_date** | **String** | Datetime the marketing campaign was created | [optional] 


