# RateApi

All URIs are relative to *https://repository-dev.hapicloud.io/api/v2/repository*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRate**](RateApi.md#getRate) | **GET** /rates/{propertyCode}/{rateCode} | Get rate by rateCode
[**getRates**](RateApi.md#getRates) | **POST** /rates/search | Get rates by date range. Paging is included. Maximum value of returned rates is 1000


<a name="getRate"></a>
# **getRate**
> Rate getRate(propertyCode, rateCode)

Get rate by rateCode

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

RateApi apiInstance = new RateApi();
String propertyCode = "propertyCode_example"; // String | Property code as designated in the PMS
String rateCode = "rateCode_example"; // String | Rate code
try {
    Rate result = apiInstance.getRate(propertyCode, rateCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RateApi#getRate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyCode** | **String**| Property code as designated in the PMS |
 **rateCode** | **String**| Rate code |

### Return type

[**Rate**](Rate.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRates"></a>
# **getRates**
> InlineResponse200 getRates(searchRequest)

Get rates by date range. Paging is included. Maximum value of returned rates is 1000

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

RateApi apiInstance = new RateApi();
SearchRequest searchRequest = new SearchRequest(); // SearchRequest | 
try {
    InlineResponse200 result = apiInstance.getRates(searchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RateApi#getRates");
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

