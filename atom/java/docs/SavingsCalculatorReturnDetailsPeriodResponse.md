
# SavingsCalculatorReturnDetailsPeriodResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodEarnings** | [**BigDecimal**](BigDecimal.md) | The investment earnings for this period. Earnings are calculated at the beginning of each period, before contributions or withdrawals are made. | 
**periodContribution** | [**BigDecimal**](BigDecimal.md) | The deposit made for this period. | 
**periodWithdrawal** | [**BigDecimal**](BigDecimal.md) | The withdrawal made for this period. | 
**cumulativeEarnings** | [**BigDecimal**](BigDecimal.md) | The cumulative investment earnings made up to and including this period. | 
**endingBalance** | [**BigDecimal**](BigDecimal.md) | The ending balance, inclusive of earnings and contributions for the current period. | 


