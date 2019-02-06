# StayApi

All URIs are relative to *https://repository-dev.hapicloud.io/api/v2/repository*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStays**](StayApi.md#getStays) | **GET** /stays/{propertyCode}/{reservationId} | Get stays by reservation number
[**searchStays**](StayApi.md#searchStays) | **POST** /stays/search | Get stays by date range. Paging is included. Maximum value of returned stays is 1000


<a name="getStays"></a>
# **getStays**
> Stay getStays(propertyCode, reservationId)

Get stays by reservation number

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StayApi apiInstance = new StayApi();
String propertyCode = "propertyCode_example"; // String | Property code as designated in the PMS
String reservationId = "reservationId_example"; // String | PMS Reservation id
try {
    Stay result = apiInstance.getStays(propertyCode, reservationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StayApi#getStays");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyCode** | **String**| Property code as designated in the PMS |
 **reservationId** | **String**| PMS Reservation id |

### Return type

[**Stay**](Stay.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="searchStays"></a>
# **searchStays**
> InlineResponse200 searchStays(searchRequest)

Get stays by date range. Paging is included. Maximum value of returned stays is 1000

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StayApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

StayApi apiInstance = new StayApi();
SearchRequest searchRequest = new SearchRequest(); // SearchRequest | 
try {
    InlineResponse200 result = apiInstance.searchStays(searchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StayApi#searchStays");
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

