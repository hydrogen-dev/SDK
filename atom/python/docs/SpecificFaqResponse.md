# SpecificFaqResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the FAQ | [optional] 
**create_date** | **str** | Datetime the FAQ was created | [optional] 
**question** | **str** | Value for the question in the FAQ | 
**answer** | **str** | Value for the answer to the question in the FAQ | 
**category** | **str** | Category that the FAQ falls under | [optional] 
**subcategory** | **str** | Subcategory that the FAQ falls under within a category | [optional] 
**is_active** | **bool** | Indicates if the FAQ is active. Defaults to true which indicates that the FAQ is active | [optional] [default to True]
**number** | **int** | Order number of the FAQ. For example 3 indicates it’s the third FAQ in a list. Must be a whole number | [optional] 
**seo_name** | **str** | File name used to optimize finding the FAQ in a search engine query | [optional] 
**faq_keywords** | [**list[FaqPayloadFaqKeywords]**](FaqPayloadFaqKeywords.md) |  | [optional] 
**is_featured** | **bool** | Indicator for whether or not this is a featured FAQ. Defaults to false indicating it is not featured | [optional] [default to False]
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the FAQ was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


