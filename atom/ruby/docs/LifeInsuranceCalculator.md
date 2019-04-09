# AtomApi::LifeInsuranceCalculator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mortgage_balance** | **Float** | The outstanding mortgage balance | 
**other_debt** | **Float** | Other outstanding debt | 
**interest_rate** | **Float** | The interest rate earned once the benefit amount is received | 
**end_of_life_expenses** | **Float** | End-of-life expenses | [optional] 
**existing_life_insurance** | **Float** | Life insurance already held | [optional] 
**liquid_assets** | **Float** | Liquid assets held | [optional] 
**general_inflation_rate** | **Float** | The general inflation rate | [optional] 
**education_inflation_rate** | **Float** | The inflation rate for education | [optional] 
**tax_rate** | **Float** | The tax rate applied to earnings from the interest rate | [optional] 
**benefit_amount_rounding** | **Float** | A parameter to round the benefit amount up to a configurable number of digits | [optional] 
**margin_of_error** | **Float** | The margin of error to apply to the life insurance needed, before rounding | [optional] 
**children_education_config** | [**Array&lt;ChildrenEducationConfig&gt;**](ChildrenEducationConfig.md) | Benefit information to provide for childrens&#39; primary, secondary, and tertiary schooling | [optional] 
**income_config** | [**Array&lt;IncomeConfig&gt;**](IncomeConfig.md) | Information on replacement income for beneficiaries | [optional] 
**beneficiary_bequest_config** | [**Array&lt;BeneficiaryBequestConfig&gt;**](BeneficiaryBequestConfig.md) | Information on bequests for beneficiaries | [optional] 


