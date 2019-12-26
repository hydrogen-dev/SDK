
# TokenRestrictionsPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minAge** | [**BigDecimal**](BigDecimal.md) | Investors older than this age will be allowed to invest |  [optional]
**maxAge** | [**BigDecimal**](BigDecimal.md) | Investors younger than this age will be allowed to invest |  [optional]
**minAnnualIncome** | [**BigDecimal**](BigDecimal.md) | Investors with an annual income higher than this number will be allowed to invest |  [optional]
**maxAnnualIncome** | [**BigDecimal**](BigDecimal.md) | Investors with an annual income lower than this number will be allowed to invest |  [optional]
**minHouseholdIncome** | [**BigDecimal**](BigDecimal.md) | Investors with an household income higher than this number will be allowed to invest |  [optional]
**maxHouseholdIncome** | [**BigDecimal**](BigDecimal.md) | Investors with an household income lower than this number will be allowed to invest |  [optional]
**minNetWorth** | [**BigDecimal**](BigDecimal.md) | Investors with a net worth higher than this number will be allowed to invest |  [optional]
**maxNetWorth** | [**BigDecimal**](BigDecimal.md) | Investors with a net worth lower than this number will be allowed to invest |  [optional]
**minCreditScore** | [**BigDecimal**](BigDecimal.md) | Investors with a credit score higher than this number will be allowed to invest |  [optional]
**maxCreditScore** | [**BigDecimal**](BigDecimal.md) | Investors with a credit score lower than this number will be allowed to invest |  [optional]
**accreditationRequired** | **Boolean** | Only accredited investors will be allowed to invest |  [optional]
**kycRequired** | **Boolean** | Investors who are verified by a Know-Your-Customer vendor will be allowed to invest |  [optional]
**includeCountry** | **List&lt;String&gt;** | Investors residing in these countries will be allowed to invest |  [optional]
**excludeCountry** | **List&lt;String&gt;** | Investors residing outside of these countries will be allowed to invest |  [optional]



