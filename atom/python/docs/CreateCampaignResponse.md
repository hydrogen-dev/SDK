# CreateCampaignResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **str** | Title of the campaign | 
**description** | **str** | Description of the campaign such as its purpose | 
**start_date** | **date** | Date that the marketing campaign begins | 
**end_date** | **date** | Date that the marketing campaign ends | 
**is_acquisition** | **bool** | Indicates if the campaign is an acquisition campaign, such as affiliate. Defaults to false meaning it is not an acquisition campaign | [optional] [default to False]
**campaign_category** | **str** | The category assigned to the campaign | [optional] 
**campaign_plan_id** | **str** | The ID of a campaign plan associated with a campaign | [optional] 
**cookie_code** | **str** | Cookie code associated with the campaign used for tracking purposes | [optional] 
**is_active** | **bool** | Indicates if the campaign is currently active. Defaults to true which indicates that it is active | [optional] [default to True]
**landing_page** | **str** | Name for the landing page of the campaign | [optional] 
**rate** | **float** | Rate of client/user registration for the campaign | [optional] 
**utm_campaign** | **str** | Name of an Urchin Tracking Module (UTM) for a marketing feature used in the campaign | [optional] 
**utm_content** | **str** | Content of an Urchin Tracking Module (UTM) for a marketing campaign feature used in the campaign. For example, content in a site banner | [optional] 
**utm_medium** | **str** | Platform of an Urchin Tracking Module (UTM) for a marketing campaign feature such as Social Media | [optional] 
**utm_source** | **str** | Feature Urchin Tracking Module (UTM) for a marketing campaign such as a banner advertisement | [optional] 
**utm_term** | **str** | Term of an Urchin Tracking Module (UTM) for a marketing campaign | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **str** | ID of the marketing campaign | [optional] 
**create_date** | **str** | Datetime the marketing campaign was created | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


