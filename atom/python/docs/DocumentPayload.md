# DocumentPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**doc_size** | **int** | Size of the document. Must be a whole number | 
**doc_name** | **str** | Name or title of the document | [optional] 
**doc_type** | **str** | Type of document such as “Compliance” or “Registration” | [optional] 
**doc_file** | **str** | File path or content for the document | [optional] 
**url_path** | **str** | URL path for the document such as http://domain.com/sample.pdf | [optional] 
**client_id** | **str** | In the case that the document relates to a specific Client, the ID of the client | [optional] 
**account_id** | **str** | In the case that the document relates to a specific Account, the ID of the account | [optional] 
**metadata** | **object** | Custom information associated with the document in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


