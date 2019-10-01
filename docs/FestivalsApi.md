# FestivalsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aPIFestivalsGet**](FestivalsApi.md#aPIFestivalsGet) | **GET** /api/v1/festivals | 

<a name="aPIFestivalsGet"></a>
# **aPIFestivalsGet**
> List&lt;MusicFestival&gt; aPIFestivalsGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FestivalsApi;


FestivalsApi apiInstance = new FestivalsApi();
try {
    List<MusicFestival> result = apiInstance.aPIFestivalsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FestivalsApi#aPIFestivalsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;MusicFestival&gt;**](MusicFestival.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

