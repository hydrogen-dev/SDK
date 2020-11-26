# NucleusApi::Invoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **String** | client_id | [optional] 
**create_date** | **DateTime** |  | [optional] 
**currency_code** | **String** | currency_code | 
**customer_id** | **String** | invoice_number | 
**department** | **String** | department | [optional] 
**description** | **String** | description | [optional] 
**document_id** | **String** | document_id | [optional] 
**due_date** | **DateTime** | due_date | 
**id** | **String** |  | [optional] 
**invoice_date** | **Date** | invoice_date | 
**invoice_name** | **String** | invoice_name | [optional] 
**invoice_number** | **String** | invoice_number | 
**is_active** | **BOOLEAN** | is_active | [optional] 
**line_items** | [**Array&lt;LineItems&gt;**](LineItems.md) | lineItems | [optional] 
**metadata** | **Hash&lt;String, String&gt;** |  | [optional] 
**payment_instructions** | **String** | paymentInstructions | [optional] 
**payment_terms** | **String** | paymentTerms | [optional] 
**secondary_id** | **String** |  | [optional] 
**status** | **String** | status | [optional] 
**total_amount** | **Float** | totalAmount | 
**total_discount** | **Float** | totalDiscount | [optional] 
**total_due** | **Float** | totalDue | [optional] 
**total_subtotal** | **Float** | totalSubtotal | [optional] 
**total_tax** | **Float** | totalTax | [optional] 
**update_date** | **DateTime** |  | [optional] 


