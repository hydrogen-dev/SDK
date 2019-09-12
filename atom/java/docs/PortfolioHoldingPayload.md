
# PortfolioHoldingPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**LocalDate**](LocalDate.md) | Date for this security holding record | 
**portfolioId** | [**UUID**](UUID.md) | The ID of the portfolio to which the holding record belongs | 
**securityId** | [**UUID**](UUID.md) | The ID of the security included in the holding record | 
**shares** | **Double** | The quantity of shares of the security being held | 
**amount** | **Double** | Total monetary value of the security being held. Used to calculate weights |  [optional]
**weight** | **Integer** | Weight of the holding as a percentage of a portfolio’s total monetary value; ex. 20 representing 20%. If the security is the only one, enter 100 |  [optional]
**secondaryId** | **String** |  |  [optional]



