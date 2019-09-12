
# FinancialOfferPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the financial offer | 
**institutionName** | **String** | Name of the financial institution | 
**offerLink** | **String** | Link to the associated financial offer | 
**category** | [**CategoryEnum**](#CategoryEnum) | Category of the financial offer. Value may be credit_card, savings, mortgage, loan, investment, tax, real_estate, brokerage, and other. |  [optional]
**subcategory** | **String** | Subcategory of the financial offer |  [optional]
**description** | **String** | Description of the financial offer |  [optional]
**image** | **String** | An image associated with the financial offer |  [optional]
**currencyCode** | **String** | Alphabetic currency code for the base currency of the entity, limited to 3 characters. |  [optional]
**financialRate** | **Double** | The financial rate associated with the financial offer |  [optional]
**financialRateType** | **String** | The financial rate type associated with the financial offer (i.e. percentage/ dollar amount) |  [optional]
**financialRateTerm** | **Double** | The fixed time period of the financial rate associated with the financial offer (i.e. 90) |  [optional]
**financialRateTermUnit** | [**FinancialRateTermUnitEnum**](#FinancialRateTermUnitEnum) | The term unit of the financial rate. Value may be year, quarter, month, week, day |  [optional]
**feeAmount** | **Double** | Amount of the financial offer fee |  [optional]
**feeType** | **String** | Type of financial offer fee |  [optional]
**offerTerm** | **Double** | The fixed time period for which the offer is intended to last, once it is accepted |  [optional]
**offerTermUnit** | [**OfferTermUnitEnum**](#OfferTermUnitEnum) | The term unit of the offer term. Value may be year, quarter, month, week, day |  [optional]
**minimumContribution** | **Double** | The minimum contribution amount in order to receive the financial_incentive associated with the financial offer |  [optional]
**minimumContributionTerm** | **Double** | The fixed time period in which the customer must contribute the minimum contribution, in order to receive the financial incentive associated with the financial offer (i.e. 90) |  [optional]
**minimumContributionTermUnit** | [**MinimumContributionTermUnitEnum**](#MinimumContributionTermUnitEnum) | The term unit of the minimum contribution. Value may be year, quarter, month, week, day |  [optional]
**prerequisite** | **String** | Prerequisite associated with the financial offer |  [optional]
**prerequisiteType** | **String** | Prerequisite associated with the financial offer (i.e. credit score threshold, income threshold) |  [optional]
**affiliateRate** | **Double** | The payment value which will be received from the affiliate when the user purchases the offer |  [optional]
**clientReview** | **String** | Average of client reviews of the product |  [optional]
**rating** | **String** | The rating of the product by the site displaying the offer |  [optional]
**documentId** | **String** | Unique ID of the document associated with the financial offer |  [optional]
**campaignId** | [**UUID**](UUID.md) | Unique ID of the marketing campaign associated with the financial offer |  [optional]
**metadata** | **Object** | Custom information associated with the budget in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]


<a name="CategoryEnum"></a>
## Enum: CategoryEnum
Name | Value
---- | -----
CREDIT_CARD | &quot;credit_card&quot;
SAVINGS | &quot;savings&quot;
MORTGAGE | &quot;mortgage&quot;
LOAN | &quot;loan&quot;
INVESTMENT | &quot;investment&quot;
TAX | &quot;tax&quot;
REAL_ESTATE | &quot;real_estate&quot;
BROKERAGE | &quot;brokerage&quot;
OTHER | &quot;other&quot;


<a name="FinancialRateTermUnitEnum"></a>
## Enum: FinancialRateTermUnitEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;


<a name="OfferTermUnitEnum"></a>
## Enum: OfferTermUnitEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;


<a name="MinimumContributionTermUnitEnum"></a>
## Enum: MinimumContributionTermUnitEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



