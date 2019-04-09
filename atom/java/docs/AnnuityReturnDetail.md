
# AnnuityReturnDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodContribution** | [**BigDecimal**](BigDecimal.md) | The deposit made for this period. | 
**cumulativeContributions** | [**BigDecimal**](BigDecimal.md) | The cumulative deposits made up to and including this period. | 
**periodWithdrawal** | [**BigDecimal**](BigDecimal.md) | The withdrawal made for this period. | 
**cumulativeWithdrawals** | [**BigDecimal**](BigDecimal.md) | The cumulative withdrawals made up to and including this period. | 
**periodTax** | [**BigDecimal**](BigDecimal.md) | The tax amount for this period. | 
**cumulativeTax** | [**BigDecimal**](BigDecimal.md) | The cumulative taxes up to and including this period. | 
**periodEarnings** | [**BigDecimal**](BigDecimal.md) | The investment earnings for this period. Earnings are calculated at the beginning of each period, before contributions are made. | 
**cumulativeEarnings** | [**BigDecimal**](BigDecimal.md) | The cumulative investment earnings made up to and including this period. | 
**endingBalance** | [**BigDecimal**](BigDecimal.md) | The ending balance, inclusive of earnings and contributions for the current period. | 



