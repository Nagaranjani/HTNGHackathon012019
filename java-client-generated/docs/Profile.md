
# Profile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyId** | [**PropertyId**](PropertyId.md) |  |  [optional]
**id** | **String** | reservation identifier |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | type of profile |  [optional]
**name** | [**Name**](Name.md) |  |  [optional]
**company** | **String** | used to provide company name when name field is used for contact info |  [optional]
**dateOfBirth** | **String** |  |  [optional]
**emails** | [**List&lt;Email&gt;**](Email.md) |  |  [optional]
**phones** | [**List&lt;Phone&gt;**](Phone.md) |  |  [optional]
**addresses** | [**List&lt;Address&gt;**](Address.md) |  |  [optional]
**idDocuments** | [**List&lt;IdDocument&gt;**](IdDocument.md) |  |  [optional]
**loyaltyPrograms** | [**List&lt;LoyaltyProgram&gt;**](LoyaltyProgram.md) |  |  [optional]
**creator** | **String** | user or interface who created the profile |  [optional]
**createdDate** | **String** | read-only date and time the profile was created |  [optional]
**travelAgentId** | **String** | IATA number |  [optional]
**repositoryCreated** | **String** | repository create date in YYYY-MM-DDThh:mm:ss.sss format |  [optional]
**repositoryUpdated** | **String** | repository update date in YYYY-MM-DDThh:mm:ss.sss format |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PERSON | &quot;PERSON&quot;
COMPANY | &quot;COMPANY&quot;
TRAVEL_AGENT | &quot;TRAVEL_AGENT&quot;
GROUP_PROFILE | &quot;GROUP_PROFILE&quot;
OTHER | &quot;OTHER&quot;



