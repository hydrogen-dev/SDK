
# RebalanceSignal

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **String** | The date of the given rebalancing signal. | 
**ticker** | **String** | The unique identifier of a given security. | 
**signal** | [**SignalEnum**](#SignalEnum) | The trade action, either BUY or SELL. | 
**amount** | [**BigDecimal**](BigDecimal.md) | The amount of the trade as a percentage. For example, amount &#x3D; 0.02 translates to selling 2% of a given ticker. | 
**type** | **Integer** | The type of trade signal. 1 &#x3D; period-based, 2 &#x3D; drift-based, and 4 &#x3D; downside protection. | 


<a name="SignalEnum"></a>
## Enum: SignalEnum
Name | Value
---- | -----
SELL | &quot;SELL&quot;
BUY | &quot;BUY&quot;



