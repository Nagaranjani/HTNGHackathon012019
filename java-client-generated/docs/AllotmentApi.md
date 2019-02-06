# AllotmentApi

All URIs are relative to *https://repository-dev.hapicloud.io/api/v2/repository*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllotment**](AllotmentApi.md#getAllotment) | **GET** /allotments/{propertyCode}/{id} | Get allotments of specified hotel that defined by chainCode / propertyCode (HAPI internal property identifier) and by blockCode and effectiveDate (Allotment external identifier)
[**searchAllotments**](AllotmentApi.md#searchAllotments) | **POST** /allotments/search/{strategy} | Search allotments by date range. Paging is included. Maximum value of returned allotments is 1000


<a name="getAllotment"></a>
# **getAllotment**
> Allotment getAllotment(propertyCode, id)

Get allotments of specified hotel that defined by chainCode / propertyCode (HAPI internal property identifier) and by blockCode and effectiveDate (Allotment external identifier)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AllotmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AllotmentApi apiInstance = new AllotmentApi();
String propertyCode = "propertyCode_example"; // String | Property code as designated in the PMS
String id = "id_example"; // String | Identifier of allotment record in the external system
try {
    Allotment result = apiInstance.getAllotment(propertyCode, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllotmentApi#getAllotment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyCode** | **String**| Property code as designated in the PMS |
 **id** | **String**| Identifier of allotment record in the external system |

### Return type

[**Allotment**](Allotment.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="searchAllotments"></a>
# **searchAllotments**
> InlineResponse200 searchAllotments(strategy, searchRequest)

Search allotments by date range. Paging is included. Maximum value of returned allotments is 1000

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AllotmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AllotmentApi apiInstance = new AllotmentApi();
String strategy = "strategy_example"; // String | Type of the search strategy. Could be range or update.<br>In a case of range strategy records will be searched by their effectiveDate / expireDate instead of searching by updated field in a case of update strategy
SearchRequest searchRequest = new SearchRequest(); // SearchRequest | 
try {
    InlineResponse200 result = apiInstance.searchAllotments(strategy, searchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllotmentApi#searchAllotments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strategy** | **String**| Type of the search strategy. Could be range or update.&lt;br&gt;In a case of range strategy records will be searched by their effectiveDate / expireDate instead of searching by updated field in a case of update strategy |
 **searchRequest** | [**SearchRequest**](SearchRequest.md)|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

