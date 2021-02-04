
# Webhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**integrationService** | [**List&lt;IntegrationServiceEnum&gt;**](#List&lt;IntegrationServiceEnum&gt;) | integration_service |  [optional]
**isActive** | **Boolean** | isActive |  [optional]
**secondaryId** | **String** |  |  [optional]
**secret** | **String** |  |  [optional]
**updateDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**url** | **String** | url | 


<a name="List<IntegrationServiceEnum>"></a>
## Enum: List&lt;IntegrationServiceEnum&gt;
Name | Value
---- | -----
KYC | &quot;kyc&quot;
KYC_STATUS | &quot;kyc_status&quot;
ASYNC_ACCOUNTING_CUSTOMER | &quot;async_accounting_customer&quot;
ASYNC_ACCOUNTING_CUSTOMER_REVENUE | &quot;async_accounting_customer_revenue&quot;
ASYNC_ACCOUNTING_INVOICE | &quot;async_accounting_invoice&quot;
ASYNC_ACCOUNTING_INVOICE_PAYMENT | &quot;async_accounting_invoice_payment&quot;
ASYNC_AGGREGATION_ACCOUNT | &quot;async_aggregation_account&quot;
ASYNC_AGGREGATION_ACCOUNT_TRANSACTION | &quot;async_aggregation_account_transaction&quot;
ASYNC_AGGREGATION_ACCOUNT_HOLDING | &quot;async_aggregation_account_holding&quot;



