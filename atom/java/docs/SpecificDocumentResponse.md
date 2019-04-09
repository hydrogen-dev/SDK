
# SpecificDocumentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the document |  [optional]
**createDate** | **String** | Datetime the document was created |  [optional]
**docSize** | **Integer** | Size of the document. Must be a whole number | 
**docName** | **String** | Name or title of the document |  [optional]
**docType** | **String** | Type of document such as “Compliance” or “Registration” |  [optional]
**docFile** | **String** | File path or content for the document |  [optional]
**urlPath** | **String** | URL path for the document such as http://domain.com/sample.pdf |  [optional]
**clientId** | [**UUID**](UUID.md) | In the case that the document relates to a specific Client, the ID of the client |  [optional]
**accountId** | [**UUID**](UUID.md) | In the case that the document relates to a specific Account, the ID of the account |  [optional]
**metadata** | **Object** | Custom information associated with the document in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]
**updateDate** | **String** | Datetime the document was last updated |  [optional]



