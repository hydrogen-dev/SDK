# atom_api.AccountPermissionClientsPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** | The id of the client being granted permissions to the account. Must also be included in the clients.client_id field of the account | 
**permissionType** | **String** | The permission type for the client. Available values are INQUIRY_ACCESS, LIMTIED_AUTHORITY, FULL_AUTHORITY, and POWER_OF_ATTORNEY. | 
**aclExist** | **Boolean** | Indicator used for existing clients mapped to an account (upon implementation) in the database to indicate if permissioning has been applied for them. true indicates it has. After implementation of data access controls, this field would no longer be necessary | [optional] 


<a name="PermissionTypeEnum"></a>
## Enum: PermissionTypeEnum


* `INQUIRY_ACCESS` (value: `"INQUIRY_ACCESS"`)

* `LIMTIED_AUTHORITY` (value: `"LIMTIED_AUTHORITY"`)

* `FULL_AUTHORITY` (value: `"FULL_AUTHORITY"`)

* `POWER_OF_ATTORNEY` (value: `"POWER_OF_ATTORNEY"`)




