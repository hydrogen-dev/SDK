
# AccountStatusPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | [**UUID**](UUID.md) | The ID of the account to which the status belongs | 
**status** | **String** | Status of the account such as “Signed Up” or “Awaiting Payment” | 
**stageId** | [**UUID**](UUID.md) | Refers to the stage the client is in. Useful for sign-up funnels | 
**comments** | **String** | Comments for the client regarding the status of their account |  [optional]
**secondaryId** | **String** |  |  [optional]



