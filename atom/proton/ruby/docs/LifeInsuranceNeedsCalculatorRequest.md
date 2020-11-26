# ProtonApi::LifeInsuranceNeedsCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**existing_life_insurance** | **Float** |  | [optional] 
**mortgage_balance** | **Float** |  | [optional] 
**general_inflation_rate** | **Float** |  | [optional] [default to 0.0]
**education_inflation_rate** | **Float** |  | [optional] [default to 0.0]
**client_id** | **String** |  | [optional] 
**beneficiary_bequest_config** | [**Array&lt;BeneficiaryBequestConfig&gt;**](BeneficiaryBequestConfig.md) |  | [optional] 
**liquid_assets** | **Float** |  | [optional] 
**end_of_life_expenses** | **Float** |  | [optional] 
**interest_rate** | **Float** |  | 
**children_education_config** | [**Array&lt;ChildrenEducationConfig&gt;**](ChildrenEducationConfig.md) |  | [optional] 
**income_config** | [**Array&lt;IncomeConfig&gt;**](IncomeConfig.md) |  | [optional] 
**tax_rate** | **Float** |  | [optional] [default to 0.0]
**margin_of_error** | **Float** |  | [optional] [default to 0.0]
**benefit_amount_rounding** | **Integer** |  | [optional] [default to 0]
**other_debt** | **Float** |  | [optional] 


