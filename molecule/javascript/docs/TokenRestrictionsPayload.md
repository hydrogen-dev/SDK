# molecule_api.TokenRestrictionsPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minAge** | **Number** | Investors older than this age will be allowed to invest | [optional] 
**maxAge** | **Number** | Investors younger than this age will be allowed to invest | [optional] 
**minAnnualIncome** | **Number** | Investors with an annual income higher than this number will be allowed to invest | [optional] 
**maxAnnualIncome** | **Number** | Investors with an annual income lower than this number will be allowed to invest | [optional] 
**minHouseholdIncome** | **Number** | Investors with an household income higher than this number will be allowed to invest | [optional] 
**maxHouseholdIncome** | **Number** | Investors with an household income lower than this number will be allowed to invest | [optional] 
**minNetWorth** | **Number** | Investors with a net worth higher than this number will be allowed to invest | [optional] 
**maxNetWorth** | **Number** | Investors with a net worth lower than this number will be allowed to invest | [optional] 
**minCreditScore** | **Number** | Investors with a credit score higher than this number will be allowed to invest | [optional] 
**maxCreditScore** | **Number** | Investors with a credit score lower than this number will be allowed to invest | [optional] 
**accreditationRequired** | **Boolean** | Only accredited investors will be allowed to invest | [optional] 
**kycRequired** | **Boolean** | Investors who are verified by a Know-Your-Customer vendor will be allowed to invest | [optional] 
**includeCountry** | **[String]** | Investors residing in these countries will be allowed to invest | [optional] 
**excludeCountry** | **[String]** | Investors residing outside of these countries will be allowed to invest | [optional] 


