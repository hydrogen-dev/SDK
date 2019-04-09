# atom_api.PortfolioHoldingPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_date** | **Date** | Date for this security holding record | 
**portfolioId** | **String** | The ID of the portfolio to which the holding record belongs | 
**securityId** | **String** | The ID of the security included in the holding record | 
**shares** | **Number** | The quantity of shares of the security being held | 
**amount** | **Number** | Total monetary value of the security being held. Used to calculate weights | [optional] 
**weight** | **Number** | Weight of the holding as a percentage of a portfolio’s total monetary value; ex. 20 representing 20%. If the security is the only one, enter 100 | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


