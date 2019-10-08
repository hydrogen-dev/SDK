# AtomApi::GetAggregationAccountHoldingsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**last** | **BOOLEAN** | If true, the last record in the result set is shown | [optional] 
**total_pages** | **Integer** | Total number of pages in the result set | [optional] 
**total_elements** | **Integer** | Total number of elements in the result set | [optional] 
**sort** | [**Array&lt;PaginationSort&gt;**](PaginationSort.md) | Details of the sort | [optional] 
**first** | **BOOLEAN** | If true, the first record in the result set is shown | [optional] 
**number_of_elements** | **Integer** | Number of elements per page | [optional] 
**size** | **Integer** | The number or records to be included per page. The default is 25. There is no max value. | [optional] 
**number** | **Integer** | Number of the first result shown | [optional] 
**content** | [**Array&lt;SpecificAggregationAccountHoldingResponse&gt;**](SpecificAggregationAccountHoldingResponse.md) |  | [optional] 


