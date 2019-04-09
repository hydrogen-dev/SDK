# AtomApi::CreatePortfolioHoldingResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **Date** | Date for this security holding record | 
**portfolio_id** | **String** | The ID of the portfolio to which the holding record belongs | 
**security_id** | **String** | The ID of the security included in the holding record | 
**shares** | **Float** | The quantity of shares of the security being held | 
**amount** | **Float** | Total monetary value of the security being held. Used to calculate weights | [optional] 
**weight** | **Integer** | Weight of the holding as a percentage of a portfolio’s total monetary value; ex. 20 representing 20%. If the security is the only one, enter 100 | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | ID of the portfolio holding record | [optional] 
**create_date** | **String** | Datetime the portfolio holding record was created | [optional] 


