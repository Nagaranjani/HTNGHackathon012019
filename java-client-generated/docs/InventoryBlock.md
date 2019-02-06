
# InventoryBlock

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**roomType** | **String** | Room type |  [optional]
**rateCode** | **String** | code identifying rate for block |  [optional]
**dates** | [**TimeSpan**](TimeSpan.md) |  |  [optional]
**cutoffDate** | **String** | used to determine when the inventory block is released back into house inventory |  [optional]
**numberToBlock** | **Integer** | number of rooms for this block per day per room type |  [optional]
**numberSold** | **Integer** | number of rooms sold in block |  [optional]
**compRoomsNumber** | **Integer** | number of comp rooms available in block |  [optional]
**currencyCode** | **String** | code identifying type of currency associated to rate |  [optional]
**rates** | [**List&lt;BlockRate&gt;**](BlockRate.md) | rate and occupancy detail for room type in block |  [optional]



