# ProfileApi

All URIs are relative to *https://repository-dev.hapicloud.io/api/v2/repository*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProfile**](ProfileApi.md#getProfile) | **GET** /profiles/{propertyCode}/{id} | Get profile by id
[**getProfiles**](ProfileApi.md#getProfiles) | **POST** /profiles/search | Get profiles by date range. Paging is included. Maximum value of returned profiles is 1000


<a name="getProfile"></a>
# **getProfile**
> Profile getProfile(propertyCode, id)

Get profile by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ProfileApi apiInstance = new ProfileApi();
String propertyCode = "propertyCode_example"; // String | Property code as designated in the PMS
String id = "id_example"; // String | PMS profile id
try {
    Profile result = apiInstance.getProfile(propertyCode, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#getProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyCode** | **String**| Property code as designated in the PMS |
 **id** | **String**| PMS profile id |

### Return type

[**Profile**](Profile.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getProfiles"></a>
# **getProfiles**
> InlineResponse200 getProfiles(searchRequest)

Get profiles by date range. Paging is included. Maximum value of returned profiles is 1000

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ProfileApi apiInstance = new ProfileApi();
SearchRequest searchRequest = new SearchRequest(); // SearchRequest | 
try {
    InlineResponse200 result = apiInstance.getProfiles(searchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#getProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchRequest** | [**SearchRequest**](SearchRequest.md)|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

