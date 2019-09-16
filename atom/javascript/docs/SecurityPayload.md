# atom_api.SecurityPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name for the security | 
**ticker** | **String** | Security’s ticker on the exchange where it is traded | 
**assetClass** | **String** | The asset class for the security such as “equity”, “fixed-income”, “cash”, etc. | [optional] 
**sector** | **String** | Sector for the security such as “Technology” or “Pharmaceuticals” | [optional] 
**industry** | **String** | The industry of the security such as “Consumer Tech” or “Enterprise Systems” | [optional] 
**securityClass** | **String** | The security class of the security such as “stock”, “mutual fund”, “ETF” (exchange-traded fund), etc. | [optional] 
**exchange** | **String** | The exchange on which the security is traded | [optional] 
**proxyId** | **String** | ID of a security that will serve as a proxy in financial analytics | [optional] 
**currencyCode** | **String** | Alphabetic currency code for the base currency of the security, limited to 3 characters | [optional] 
**isActive** | **Boolean** | Indicates if the security is active. Defaults to true which indicates that the it is active | [optional] [default to true]
**securityComposition** | [**[SecurityPayloadSecurityComposition]**](SecurityPayloadSecurityComposition.md) | Details on the components of a security, their relative weight within the security, and their start and end dates | [optional] 
**securityCountry** | [**[SecurityPayloadSecurityCountry]**](SecurityPayloadSecurityCountry.md) | Each country where the security is traded and its relative weight within the security | [optional] 


