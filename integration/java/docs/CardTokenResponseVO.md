
# CardTokenResponseVO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applePayload** | [**ApplePayload**](ApplePayload.md) |  |  [optional]
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
GOOGLE | &quot;google&quot;
APPLE | &quot;apple&quot;
SAMSUNG | &quot;samsung&quot;



