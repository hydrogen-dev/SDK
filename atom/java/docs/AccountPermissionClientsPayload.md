
# AccountPermissionClientsPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | [**UUID**](UUID.md) | The id of the client being granted permissions to the account. Must also be included in the clients.client_id field of the account | 
**permissionType** | [**PermissionTypeEnum**](#PermissionTypeEnum) | The permission type for the client. Available values are INQUIRY_ACCESS, LIMTIED_AUTHORITY, FULL_AUTHORITY, and POWER_OF_ATTORNEY. | 
**aclExist** | **Boolean** | Indicator used for existing clients mapped to an account (upon implementation) in the database to indicate if permissioning has been applied for them. true indicates it has. After implementation of data access controls, this field would no longer be necessary |  [optional]


<a name="PermissionTypeEnum"></a>
## Enum: PermissionTypeEnum
Name | Value
---- | -----
INQUIRY_ACCESS | &quot;INQUIRY_ACCESS&quot;
LIMTIED_AUTHORITY | &quot;LIMTIED_AUTHORITY&quot;
FULL_AUTHORITY | &quot;FULL_AUTHORITY&quot;
POWER_OF_ATTORNEY | &quot;POWER_OF_ATTORNEY&quot;



