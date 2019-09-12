
# SpecificSecurityResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the security |  [optional]
**createDate** | **String** | Datetime the security was created |  [optional]
**name** | **String** | Name for the security | 
**ticker** | **String** | Security’s ticker on the exchange where it is traded | 
**assetClass** | **String** | The asset class for the security such as “equity”, “fixed-income”, “cash”, etc. |  [optional]
**sector** | **String** | Sector for the security such as “Technology” or “Pharmaceuticals” |  [optional]
**industry** | **String** | The industry of the security such as “Consumer Tech” or “Enterprise Systems” |  [optional]
**securityClass** | **String** | The security class of the security such as “stock”, “mutual fund”, “ETF” (exchange-traded fund), etc. |  [optional]
**exchange** | **String** | The exchange on which the security is traded |  [optional]
**isActive** | **Boolean** | Indicates if the security is active. Defaults to true which indicates that the it is active |  [optional]
**securityComposition** | [**List&lt;SecurityPayloadSecurityComposition&gt;**](SecurityPayloadSecurityComposition.md) | Details on the components of a security, their relative weight within the security, and their start and end dates |  [optional]
**securityCountry** | [**List&lt;SecurityPayloadSecurityCountry&gt;**](SecurityPayloadSecurityCountry.md) | Each country where the security is traded and its relative weight within the security |  [optional]
**updateDate** | **String** | Datetime the security was last updated |  [optional]



