# AtomApi::CreateDocumentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**doc_size** | **Integer** | Size of the document. Must be a whole number | 
**doc_name** | **String** | Name or title of the document | [optional] 
**doc_type** | **String** | Type of document such as “Compliance” or “Registration” | [optional] 
**doc_file** | **String** | File path or content for the document | [optional] 
**url_path** | **String** | URL path for the document such as http://domain.com/sample.pdf | [optional] 
**client_id** | **String** | In the case that the document relates to a specific Client, the ID of the client | [optional] 
**account_id** | **String** | In the case that the document relates to a specific Account, the ID of the account | [optional] 
**metadata** | **Object** | Custom information associated with the document in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | ID of the document | [optional] 
**create_date** | **String** | Datetime the document was created | [optional] 


