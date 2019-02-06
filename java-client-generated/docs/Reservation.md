
# Reservation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyId** | [**PropertyId**](PropertyId.md) |  |  [optional]
**id** | **String** | reservation identifier and object key |  [optional]
**bookingConfirmationId** | **String** | unique confirmation id within given hotel |  [optional]
**arrivalDate** | **String** | check-in date, in YYYY-MM-DD format |  [optional]
**arrivalTime** | **String** | estimated check-in time |  [optional]
**departureDate** | **String** | check-out date, in YYYY-MM-DD format |  [optional]
**creator** | **String** | user or interface who created the reservation |  [optional]
**createdDate** | **String** | read-only reservation create date in hotel, in YYYY-MM-DDThh:mm:ss.sss format |  [optional]
**cancelledDate** | **String** | Reservation cancellation date in hotel, in YYYY-MM-DDThh:mm:ss.sss format |  [optional]
**cancellationNumber** | **String** | cancellation number for reservation. may be supplied externally or returned from pms |  [optional]
**adults** | **Integer** |  |  [optional]
**children** | **Integer** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | current status of reservation |  [optional]
**guests** | [**List&lt;Guest&gt;**](Guest.md) |  |  [optional]
**profiles** | [**List&lt;Profile&gt;**](Profile.md) |  |  [optional]
**roomStays** | [**List&lt;RoomStay&gt;**](RoomStay.md) |  |  [optional]
**comments** | [**List&lt;Comment&gt;**](Comment.md) |  |  [optional]
**repositoryCreated** | **String** | repository create date in YYYY-MM-DDThh:mm:ss.sss format |  [optional]
**repositoryUpdated** | **String** | repository update date in YYYY-MM-DDThh:mm:ss.sss format |  [optional]


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



