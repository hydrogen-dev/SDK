
# Invoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | [**UUID**](UUID.md) | client_id |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**currencyCode** | **String** | currency_code | 
**customerId** | [**UUID**](UUID.md) | customer_id | 
**department** | **String** | department |  [optional]
**description** | **String** | description |  [optional]
**documentId** | [**UUID**](UUID.md) | document_id |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | due_date | 
**id** | [**UUID**](UUID.md) |  |  [optional]
**invoiceDate** | [**OffsetDateTime**](OffsetDateTime.md) | invoice_date | 
**invoiceName** | **String** | invoice_name |  [optional]
**invoiceNumber** | **String** | invoice_number | 
**isActive** | **Boolean** | is_active |  [optional]
**lineItems** | [**List&lt;LineItems&gt;**](LineItems.md) | lineItems |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**paymentInstructions** | **String** | paymentInstructions |  [optional]
**paymentTerms** | **String** | paymentTerms |  [optional]
**secondaryId** | **String** |  |  [optional]
**status** | **String** | status |  [optional]
**totalAmount** | **Double** | totalAmount | 
**totalDiscount** | **Double** | totalDiscount |  [optional]
**totalDue** | **Double** | totalDue |  [optional]
**totalSubtotal** | **Double** | totalSubtotal |  [optional]
**totalTax** | **Double** | totalTax |  [optional]
**updateDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]



