
# CreateAccountStatusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The ID for the specific account status record for the account_id provided |  [optional]
**accountId** | [**UUID**](UUID.md) | The ID of the account to which the status belongs |  [optional]
**status** | **String** | Status of the account such as “Signed Up” or “Awaiting Payment” |  [optional]
**stageId** | [**UUID**](UUID.md) | Refers to the stage the client is in. Useful for sign-up funnels |  [optional]
**comments** | **String** | Comments for the client regarding the status of their account |  [optional]
**secondaryId** | **String** |  |  [optional]
**createDate** | **String** | Datetime the account status record was created |  [optional]



