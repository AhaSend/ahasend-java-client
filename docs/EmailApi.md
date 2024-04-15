# EmailApi

All URIs are relative to *https://api.ahasend.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendEmail**](EmailApi.md#sendEmail) | **POST** /email/send | Send emails

<a name="sendEmail"></a>
# **sendEmail**
> SuccessfulResponse sendEmail(body, contentType)

Send emails

You can send emails to up to 100 recipients using this API at the same time.

### Example
```java
// Import classes:
//import com.ahasend.client.ApiClient;
//import com.ahasend.client.ApiException;
//import com.ahasend.client.Configuration;
//import com.ahasend.client.auth.*;
//import com.ahasend.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailApi apiInstance = new EmailApi();
Email body = new Email(); // Email | Email object.
String contentType = "contentType_example"; // String | Only application/json is supported
try {
    SuccessfulResponse result = apiInstance.sendEmail(body, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#sendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Email**](Email.md)| Email object. |
 **contentType** | **String**| Only application/json is supported | [optional]

### Return type

[**SuccessfulResponse**](SuccessfulResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

