
# CardTokenResponseVO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applePayload** | [**ApplePayload**](ApplePayload.md) |  |  [optional]
**cardStatus** | **String** |  |  [optional]
**googlePayload** | [**GooglePayload**](GooglePayload.md) |  |  [optional]
**message** | **String** |  |  [optional]
**nucleusCardId** | [**UUID**](UUID.md) |  |  [optional]
**samsungPayload** | [**SamsungPayload**](SamsungPayload.md) |  |  [optional]
**vendorName** | **String** |  |  [optional]
**vendorResponse** | **Object** |  |  [optional]
**wallet** | [**WalletEnum**](#WalletEnum) |  |  [optional]


<a name="WalletEnum"></a>
## Enum: WalletEnum
Name | Value
---- | -----
APPLE | &quot;apple&quot;
GOOGLE | &quot;google&quot;
SAMSUNG | &quot;samsung&quot;



