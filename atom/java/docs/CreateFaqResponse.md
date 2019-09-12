
# CreateFaqResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**question** | **String** | Value for the question in the FAQ | 
**answer** | **String** | Value for the answer to the question in the FAQ | 
**category** | **String** | Category that the FAQ falls under |  [optional]
**subcategory** | **String** | Subcategory that the FAQ falls under within a category |  [optional]
**isActive** | **Boolean** | Indicates if the FAQ is active. Defaults to true which indicates that the FAQ is active |  [optional]
**number** | **Integer** | Order number of the FAQ. For example 3 indicates it’s the third FAQ in a list. Must be a whole number |  [optional]
**seoName** | **String** | File name used to optimize finding the FAQ in a search engine query |  [optional]
**faqKeywords** | [**List&lt;FaqPayloadFaqKeywords&gt;**](FaqPayloadFaqKeywords.md) |  |  [optional]
**isFeatured** | **Boolean** | Indicator for whether or not this is a featured FAQ. Defaults to false indicating it is not featured |  [optional]
**secondaryId** | **String** |  |  [optional]
**metadata** | **Object** | Custom information associated with the FAQ in the format key:value |  [optional]
**id** | [**UUID**](UUID.md) | ID of the FAQ |  [optional]
**createDate** | **String** | Datetime the FAQ was created |  [optional]



