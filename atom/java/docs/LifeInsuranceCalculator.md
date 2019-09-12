
# LifeInsuranceCalculator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mortgageBalance** | [**BigDecimal**](BigDecimal.md) | The outstanding mortgage balance | 
**otherDebt** | [**BigDecimal**](BigDecimal.md) | Other outstanding debt | 
**interestRate** | [**BigDecimal**](BigDecimal.md) | The interest rate earned once the benefit amount is received | 
**endOfLifeExpenses** | [**BigDecimal**](BigDecimal.md) | End-of-life expenses |  [optional]
**existingLifeInsurance** | [**BigDecimal**](BigDecimal.md) | Life insurance already held |  [optional]
**liquidAssets** | [**BigDecimal**](BigDecimal.md) | Liquid assets held |  [optional]
**generalInflationRate** | [**BigDecimal**](BigDecimal.md) | The general inflation rate |  [optional]
**educationInflationRate** | [**BigDecimal**](BigDecimal.md) | The inflation rate for education |  [optional]
**taxRate** | [**BigDecimal**](BigDecimal.md) | The tax rate applied to earnings from the interest rate |  [optional]
**benefitAmountRounding** | [**BigDecimal**](BigDecimal.md) | A parameter to round the benefit amount up to a configurable number of digits |  [optional]
**marginOfError** | [**BigDecimal**](BigDecimal.md) | The margin of error to apply to the life insurance needed, before rounding |  [optional]
**childrenEducationConfig** | [**List&lt;ChildrenEducationConfig&gt;**](ChildrenEducationConfig.md) | Benefit information to provide for childrens&#39; primary, secondary, and tertiary schooling |  [optional]
**incomeConfig** | [**List&lt;IncomeConfig&gt;**](IncomeConfig.md) | Information on replacement income for beneficiaries |  [optional]
**beneficiaryBequestConfig** | [**List&lt;BeneficiaryBequestConfig&gt;**](BeneficiaryBequestConfig.md) | Information on bequests for beneficiaries |  [optional]



