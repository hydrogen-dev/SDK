# atom_api.LifeInsuranceCalculator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mortgageBalance** | **Number** | The outstanding mortgage balance | 
**otherDebt** | **Number** | Other outstanding debt | 
**interestRate** | **Number** | The interest rate earned once the benefit amount is received | 
**endOfLifeExpenses** | **Number** | End-of-life expenses | [optional] 
**existingLifeInsurance** | **Number** | Life insurance already held | [optional] 
**liquidAssets** | **Number** | Liquid assets held | [optional] 
**generalInflationRate** | **Number** | The general inflation rate | [optional] 
**educationInflationRate** | **Number** | The inflation rate for education | [optional] 
**taxRate** | **Number** | The tax rate applied to earnings from the interest rate | [optional] 
**benefitAmountRounding** | **Number** | A parameter to round the benefit amount up to a configurable number of digits | [optional] 
**marginOfError** | **Number** | The margin of error to apply to the life insurance needed, before rounding | [optional] 
**childrenEducationConfig** | [**[ChildrenEducationConfig]**](ChildrenEducationConfig.md) | Benefit information to provide for childrens&#39; primary, secondary, and tertiary schooling | [optional] 
**incomeConfig** | [**[IncomeConfig]**](IncomeConfig.md) | Information on replacement income for beneficiaries | [optional] 
**beneficiaryBequestConfig** | [**[BeneficiaryBequestConfig]**](BeneficiaryBequestConfig.md) | Information on bequests for beneficiaries | [optional] 


