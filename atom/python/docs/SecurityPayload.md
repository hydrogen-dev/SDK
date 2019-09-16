# SecurityPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name for the security | 
**ticker** | **str** | Security’s ticker on the exchange where it is traded | 
**asset_class** | **str** | The asset class for the security such as “equity”, “fixed-income”, “cash”, etc. | [optional] 
**sector** | **str** | Sector for the security such as “Technology” or “Pharmaceuticals” | [optional] 
**industry** | **str** | The industry of the security such as “Consumer Tech” or “Enterprise Systems” | [optional] 
**security_class** | **str** | The security class of the security such as “stock”, “mutual fund”, “ETF” (exchange-traded fund), etc. | [optional] 
**exchange** | **str** | The exchange on which the security is traded | [optional] 
**proxy_id** | **str** | ID of a security that will serve as a proxy in financial analytics | [optional] 
**currency_code** | **str** | Alphabetic currency code for the base currency of the security, limited to 3 characters | [optional] 
**is_active** | **bool** | Indicates if the security is active. Defaults to true which indicates that the it is active | [optional] [default to True]
**security_composition** | [**list[SecurityPayloadSecurityComposition]**](SecurityPayloadSecurityComposition.md) | Details on the components of a security, their relative weight within the security, and their start and end dates | [optional] 
**security_country** | [**list[SecurityPayloadSecurityCountry]**](SecurityPayloadSecurityCountry.md) | Each country where the security is traded and its relative weight within the security | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


