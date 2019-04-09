
# RiskAllocationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**securities** | **List&lt;String&gt;** | If allocation_method &#x3D; create, the tickers of the securities that should be included in the allocation created. | 
**weights** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | If allocation_method &#x3D; create, the weights of each security that should be included in the allocation created. | 
**ret** | [**BigDecimal**](BigDecimal.md) | The annualized return of the portfolio. | 
**risk** | [**BigDecimal**](BigDecimal.md) | The annualized standard deviation of the portfolio. | 



