# AtomApi::CreateSecurityResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name for the security | 
**ticker** | **String** | Security’s ticker on the exchange where it is traded | 
**asset_class** | **String** | The asset class for the security such as “equity”, “fixed-income”, “cash”, etc. | [optional] 
**sector** | **String** | Sector for the security such as “Technology” or “Pharmaceuticals” | [optional] 
**industry** | **String** | The industry of the security such as “Consumer Tech” or “Enterprise Systems” | [optional] 
**security_class** | **String** | The security class of the security such as “stock”, “mutual fund”, “ETF” (exchange-traded fund), etc. | [optional] 
**exchange** | **String** | The exchange on which the security is traded | [optional] 
**proxy_id** | **String** | ID of a security that will serve as a proxy in financial analytics | [optional] 
**currency_code** | **String** | Alphabetic currency code for the base currency of the security, limited to 3 characters | [optional] 
**is_active** | **BOOLEAN** | Indicates if the security is active. Defaults to true which indicates that the it is active | [optional] [default to true]
**security_composition** | [**Array&lt;SecurityPayloadSecurityComposition&gt;**](SecurityPayloadSecurityComposition.md) | Details on the components of a security, their relative weight within the security, and their start and end dates | [optional] 
**security_country** | [**Array&lt;SecurityPayloadSecurityCountry&gt;**](SecurityPayloadSecurityCountry.md) | Each country where the security is traded and its relative weight within the security | [optional] 
**id** | **String** | ID of the security | [optional] 
**create_date** | **String** | Datetime the security was created | [optional] 


