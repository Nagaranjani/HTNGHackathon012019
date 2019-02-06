
# RoomStay

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**roomNumber** | **String** | room number for stay |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | current status of reservation |  [optional]
**guestId** | **String** | id of guest associated to stay |  [optional]
**roomType** | **String** | code identifying the type of room associated to stay |  [optional]
**rateCode** | **String** | code identifying rate for stay |  [optional]
**marketCode** | **String** | code identifying marketing type for rate |  [optional]
**channelCode** | **String** | code identifying source of reservation |  [optional]
**sourceCode** | **String** | code identifying source of rate associated to stay |  [optional]
**blockCode** | **String** | group block code |  [optional]
**roomCount** | **Integer** | number of rooms associated to stay |  [optional]
**paymentMethod** | **String** | payment method used in the reservation |  [optional]
**compYN** | **String** | is reservation complimentary |  [optional]
**rates** | [**List&lt;RoomRate&gt;**](RoomRate.md) |  |  [optional]
**revenue** | [**List&lt;Revenue&gt;**](Revenue.md) |  |  [optional]
**services** | [**List&lt;Service&gt;**](Service.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
REQUESTED | &quot;REQUESTED&quot;
RESERVED | &quot;RESERVED&quot;
IN_HOUSE | &quot;IN_HOUSE&quot;
CANCELLED | &quot;CANCELLED&quot;
CHECKED_OUT | &quot;CHECKED_OUT&quot;
NO_SHOW | &quot;NO_SHOW&quot;
WAIT_LIST | &quot;WAIT_LIST&quot;
UNKNOWN | &quot;UNKNOWN&quot;



