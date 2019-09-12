# AccountPermissionClientsPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** | The id of the client being granted permissions to the account. Must also be included in the clients.client_id field of the account | 
**permission_type** | **str** | The permission type for the client. Available values are INQUIRY_ACCESS, LIMTIED_AUTHORITY, FULL_AUTHORITY, and POWER_OF_ATTORNEY. | 
**acl_exist** | **bool** | Indicator used for existing clients mapped to an account (upon implementation) in the database to indicate if permissioning has been applied for them. true indicates it has. After implementation of data access controls, this field would no longer be necessary | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


