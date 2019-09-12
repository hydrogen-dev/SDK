# LifeInsuranceCalculator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mortgage_balance** | **float** | The outstanding mortgage balance | 
**other_debt** | **float** | Other outstanding debt | 
**interest_rate** | **float** | The interest rate earned once the benefit amount is received | 
**end_of_life_expenses** | **float** | End-of-life expenses | [optional] 
**existing_life_insurance** | **float** | Life insurance already held | [optional] 
**liquid_assets** | **float** | Liquid assets held | [optional] 
**general_inflation_rate** | **float** | The general inflation rate | [optional] 
**education_inflation_rate** | **float** | The inflation rate for education | [optional] 
**tax_rate** | **float** | The tax rate applied to earnings from the interest rate | [optional] 
**benefit_amount_rounding** | **float** | A parameter to round the benefit amount up to a configurable number of digits | [optional] 
**margin_of_error** | **float** | The margin of error to apply to the life insurance needed, before rounding | [optional] 
**children_education_config** | [**list[ChildrenEducationConfig]**](ChildrenEducationConfig.md) | Benefit information to provide for childrens&#39; primary, secondary, and tertiary schooling | [optional] 
**income_config** | [**list[IncomeConfig]**](IncomeConfig.md) | Information on replacement income for beneficiaries | [optional] 
**beneficiary_bequest_config** | [**list[BeneficiaryBequestConfig]**](BeneficiaryBequestConfig.md) | Information on bequests for beneficiaries | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


