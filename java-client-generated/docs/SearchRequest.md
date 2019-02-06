
# SearchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offset** | **Integer** | Offset from the beginning of retrieved values. If no offset value has provided then default (0) will be used |  [optional]
**limit** | **Integer** | Limit of records in the response. If no limit provided default (100) will be used |  [optional]
**fromDate** | [**OffsetDateTime**](OffsetDateTime.md) | Last update date (from) in YYYY-MM-DDThh:mm:ss.sssZ format | 
**toDate** | [**OffsetDateTime**](OffsetDateTime.md) | Last update date (to) in YYYY-MM-DDThh:mm:ss.sssZ format |  [optional]
**chainCode** | **String** | Hotel chain code. If left blank, no filtering will be used on this field. |  [optional]
**propertyCode** | **String** | Hotel property code. If left blank, no filtering will be used on this field. |  [optional]



