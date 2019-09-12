# PortfolioHoldingPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_date** | **date** | Date for this security holding record | 
**portfolio_id** | **str** | The ID of the portfolio to which the holding record belongs | 
**security_id** | **str** | The ID of the security included in the holding record | 
**shares** | **float** | The quantity of shares of the security being held | 
**amount** | **float** | Total monetary value of the security being held. Used to calculate weights | [optional] 
**weight** | **int** | Weight of the holding as a percentage of a portfolio’s total monetary value; ex. 20 representing 20%. If the security is the only one, enter 100 | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


