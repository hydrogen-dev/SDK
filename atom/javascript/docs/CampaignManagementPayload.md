# atom_api.CampaignManagementPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Title of the campaign | 
**description** | **String** | Description of the campaign such as its purpose | 
**startDate** | **Date** | Date that the marketing campaign begins | 
**endDate** | **Date** | Date that the marketing campaign ends | 
**isAcquisition** | **Boolean** | Indicates if the campaign is an acquisition campaign, such as affiliate. Defaults to false meaning it is not an acquisition campaign | [optional] [default to false]
**campaignCategory** | **String** | The category assigned to the campaign | [optional] 
**campaignPlanId** | **String** | The ID of a campaign plan associated with a campaign | [optional] 
**cookieCode** | **String** | Cookie code associated with the campaign used for tracking purposes | [optional] 
**isActive** | **Boolean** | Indicates if the campaign is currently active. Defaults to true which indicates that it is active | [optional] [default to true]
**landingPage** | **String** | Name for the landing page of the campaign | [optional] 
**rate** | **Number** | Rate of client/user registration for the campaign | [optional] 
**utmCampaign** | **String** | Name of an Urchin Tracking Module (UTM) for a marketing feature used in the campaign | [optional] 
**utmContent** | **String** | Content of an Urchin Tracking Module (UTM) for a marketing campaign feature used in the campaign. For example, content in a site banner | [optional] 
**utmMedium** | **String** | Platform of an Urchin Tracking Module (UTM) for a marketing campaign feature such as Social Media | [optional] 
**utmSource** | **String** | Feature Urchin Tracking Module (UTM) for a marketing campaign such as a banner advertisement | [optional] 
**utmTerm** | **String** | Term of an Urchin Tracking Module (UTM) for a marketing campaign | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


