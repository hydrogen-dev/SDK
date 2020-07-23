
# WalletClientsPermission

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nucleusClientId** | [**UUID**](UUID.md) |  | 
**clientWalletAssociationType** | [**ClientWalletAssociationTypeEnum**](#ClientWalletAssociationTypeEnum) |  | 
**permissionType** | [**PermissionTypeEnum**](#PermissionTypeEnum) |  | 
**isPrimary** | **Boolean** |  |  [optional]


<a name="ClientWalletAssociationTypeEnum"></a>
## Enum: ClientWalletAssociationTypeEnum
Name | Value
---- | -----
JOINT | &quot;joint&quot;
OWNER | &quot;owner&quot;
TRUSTEE | &quot;trustee&quot;
VIEWER | &quot;viewer&quot;
ADMIN | &quot;admin&quot;


<a name="PermissionTypeEnum"></a>
## Enum: PermissionTypeEnum
Name | Value
---- | -----
INQUIRY_ACCESS | &quot;INQUIRY_ACCESS&quot;
LIMITED_AUTHORITY | &quot;LIMITED_AUTHORITY&quot;
POWER_OF_ATTORNEY | &quot;POWER_OF_ATTORNEY&quot;
FULL_AUTHORITY | &quot;FULL_AUTHORITY&quot;



