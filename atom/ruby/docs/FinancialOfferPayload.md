# AtomApi::FinancialOfferPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the financial offer | 
**institution_name** | **String** | Name of the financial institution | 
**offer_link** | **String** | Link to the associated financial offer | 
**category** | **String** | Category of the financial offer. Value may be credit_card, savings, mortgage, loan, investment, tax, real_estate, brokerage, and other. | [optional] 
**subcategory** | **String** | Subcategory of the financial offer | [optional] 
**description** | **String** | Description of the financial offer | [optional] 
**image** | **String** | An image associated with the financial offer | [optional] 
**currency_code** | **String** | Alphabetic currency code for the base currency of the entity, limited to 3 characters. | [optional] 
**financial_rate** | **Float** | The financial rate associated with the financial offer | [optional] 
**financial_rate_type** | **String** | The financial rate type associated with the financial offer (i.e. percentage/ dollar amount) | [optional] 
**financial_rate_term** | **Float** | The fixed time period of the financial rate associated with the financial offer (i.e. 90) | [optional] 
**financial_rate_term_unit** | **String** | The term unit of the financial rate. Value may be year, quarter, month, week, day | [optional] 
**fee_amount** | **Float** | Amount of the financial offer fee | [optional] 
**fee_type** | **String** | Type of financial offer fee | [optional] 
**offer_term** | **Float** | The fixed time period for which the offer is intended to last, once it is accepted | [optional] 
**offer_term_unit** | **String** | The term unit of the offer term. Value may be year, quarter, month, week, day | [optional] 
**minimum_contribution** | **Float** | The minimum contribution amount in order to receive the financial_incentive associated with the financial offer | [optional] 
**minimum_contribution_term** | **Float** | The fixed time period in which the customer must contribute the minimum contribution, in order to receive the financial incentive associated with the financial offer (i.e. 90) | [optional] 
**minimum_contribution_term_unit** | **String** | The term unit of the minimum contribution. Value may be year, quarter, month, week, day | [optional] 
**prerequisite** | **String** | Prerequisite associated with the financial offer | [optional] 
**prerequisite_type** | **String** | Prerequisite associated with the financial offer (i.e. credit score threshold, income threshold) | [optional] 
**affiliate_rate** | **Float** | The payment value which will be received from the affiliate when the user purchases the offer | [optional] 
**client_review** | **String** | Average of client reviews of the product | [optional] 
**rating** | **String** | The rating of the product by the site displaying the offer | [optional] 
**document_id** | **String** | Unique ID of the document associated with the financial offer | [optional] 
**campaign_id** | **String** | Unique ID of the marketing campaign associated with the financial offer | [optional] 
**metadata** | **Object** | Custom information associated with the budget in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


