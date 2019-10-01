# Energy Australia Coding Challenge

Energy Australia Coding Test API
- API version: v1
  - Build date: 2019-09-30T22:42:27.997+10:00[Australia/Melbourne]

## Assumption

As mentioned in Coding challenge description - I have not followed my best coding practices as the main aim mentioned was just to see the result in any form by using any language or coding platform.
## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

## Program Execution
After mvn install, run java main program called FestivalsApiExecutor.java and you should be able to see the result fetched from given GET API Url.
###In case of API is down :
Go to FestivalsApi.java and serach for string "//TODO" - uncomment the line and you shall see the repsonse being mocked or Code reviewer can add his test data/cases there 

###Change in API URL
Go to ApiClient.java - search for "this.setBasePath" and here you can set the host name to connect to.

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.FestivalsApi;

import java.io.File;
import java.util.*;

public class FestivalsApiExample {

    public static void main(String[] args) {
        
        FestivalsApi apiInstance = new FestivalsApi();
        try {
            List<MusicFestival> result = apiInstance.aPIFestivalsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FestivalsApi#aPIFestivalsGet");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to */*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FestivalsApi* | [**aPIFestivalsGet**](docs/FestivalsApi.md#aPIFestivalsGet) | **GET** /api/v1/festivals | 

## Documentation for Models

 - [Band](docs/Band.md)
 - [MusicFestival](docs/MusicFestival.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author
Yogesh Jadhav


