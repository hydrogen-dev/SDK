# Invoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** | client_id | [optional] 
**create_date** | **datetime** |  | [optional] 
**currency_code** | **str** | currency_code | 
**customer_id** | **str** | invoice_number | 
**department** | **str** | department | [optional] 
**description** | **str** | description | [optional] 
**document_id** | **str** | document_id | [optional] 
**due_date** | **datetime** | due_date | 
**id** | **str** |  | [optional] 
**invoice_date** | **date** | invoice_date | 
**invoice_name** | **str** | invoice_name | [optional] 
**invoice_number** | **str** | invoice_number | 
**is_active** | **bool** | is_active | [optional] 
**line_items** | [**list[LineItems]**](LineItems.md) | lineItems | [optional] 
**metadata** | **dict(str, str)** |  | [optional] 
**payment_instructions** | **str** | paymentInstructions | [optional] 
**payment_terms** | **str** | paymentTerms | [optional] 
**secondary_id** | **str** |  | [optional] 
**status** | **str** | status | [optional] 
**total_amount** | **float** | totalAmount | 
**total_discount** | **float** | totalDiscount | [optional] 
**total_due** | **float** | totalDue | [optional] 
**total_subtotal** | **float** | totalSubtotal | [optional] 
**total_tax** | **float** | totalTax | [optional] 
**update_date** | **datetime** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


