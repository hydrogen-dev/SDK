# atom_api.FinancialOfferPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the financial offer | 
**institutionName** | **String** | Name of the financial institution | 
**offerLink** | **String** | Link to the associated financial offer | 
**category** | **String** | Category of the financial offer. Value may be credit_card, savings, mortgage, loan, investment, tax, real_estate, brokerage, and other. | [optional] 
**subcategory** | **String** | Subcategory of the financial offer | [optional] 
**description** | **String** | Description of the financial offer | [optional] 
**image** | **String** | An image associated with the financial offer | [optional] 
**currencyCode** | **String** | Alphabetic currency code for the base currency of the entity, limited to 3 characters. | [optional] 
**financialRate** | **Number** | The financial rate associated with the financial offer | [optional] 
**financialRateType** | **String** | The financial rate type associated with the financial offer (i.e. percentage/ dollar amount) | [optional] 
**financialRateTerm** | **Number** | The fixed time period of the financial rate associated with the financial offer (i.e. 90) | [optional] 
**financialRateTermUnit** | **String** | The term unit of the financial rate. Value may be year, quarter, month, week, day | [optional] 
**feeAmount** | **Number** | Amount of the financial offer fee | [optional] 
**feeType** | **String** | Type of financial offer fee | [optional] 
**offerTerm** | **Number** | The fixed time period for which the offer is intended to last, once it is accepted | [optional] 
**offerTermUnit** | **String** | The term unit of the offer term. Value may be year, quarter, month, week, day | [optional] 
**minimumContribution** | **Number** | The minimum contribution amount in order to receive the financial_incentive associated with the financial offer | [optional] 
**minimumContributionTerm** | **Number** | The fixed time period in which the customer must contribute the minimum contribution, in order to receive the financial incentive associated with the financial offer (i.e. 90) | [optional] 
**minimumContributionTermUnit** | **String** | The term unit of the minimum contribution. Value may be year, quarter, month, week, day | [optional] 
**prerequisite** | **String** | Prerequisite associated with the financial offer | [optional] 
**prerequisiteType** | **String** | Prerequisite associated with the financial offer (i.e. credit score threshold, income threshold) | [optional] 
**affiliateRate** | **Number** | The payment value which will be received from the affiliate when the user purchases the offer | [optional] 
**clientReview** | **String** | Average of client reviews of the product | [optional] 
**rating** | **String** | The rating of the product by the site displaying the offer | [optional] 
**documentId** | **String** | Unique ID of the document associated with the financial offer | [optional] 
**campaignId** | **String** | Unique ID of the marketing campaign associated with the financial offer | [optional] 
**metadata** | **Object** | Custom information associated with the budget in the format key:value | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


<a name="CategoryEnum"></a>
## Enum: CategoryEnum


* `credit_card` (value: `"credit_card"`)

* `savings` (value: `"savings"`)

* `mortgage` (value: `"mortgage"`)

* `loan` (value: `"loan"`)

* `investment` (value: `"investment"`)

* `tax` (value: `"tax"`)

* `real_estate` (value: `"real_estate"`)

* `brokerage` (value: `"brokerage"`)

* `other` (value: `"other"`)




<a name="FinancialRateTermUnitEnum"></a>
## Enum: FinancialRateTermUnitEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




<a name="OfferTermUnitEnum"></a>
## Enum: OfferTermUnitEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




<a name="MinimumContributionTermUnitEnum"></a>
## Enum: MinimumContributionTermUnitEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




