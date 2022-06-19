# Hydrogen Web Components - Java SDK

Installing this SDK in your project will give you the following functionality:

- (OAuth 2.0 Authorization)(https://www.hydrogenplatform.com/docs/nucleus/v1/#OAuth-2-0-Authorization) of Web Components and WebViews
- Generate [App Tokens](https://www.hydrogenplatform.com/docs/web-component/v1/#App-Tokens) to authenticate Web Components and WebViews
- Retrieve Nucleus [Client](https://www.hydrogenplatform.com/docs/nucleus/v1/#Client) and [Card](https://www.hydrogenplatform.com/docs/nucleus/v1/#Card) data used in Web Component and WebView embed codes as data attributes

For more information, please visit our documentation [https://www.hydrogenplatform.com/docs/web-component/v1](https://www.hydrogenplatform.com/docs/web-component/v1)

## Requirements
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.hydrogenplatform</groupId>
  <artifactId>app-token-api</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL.

### Base URL
Follow steps to verify the base URL path:

1. Go to ApiClient file located under src folder.
2. Search for basePath and change/verify the URL according to the environment.

**Base URL**
https://api.hydrogenplatform.com

### Parameters

| Parameter |  Description |
| ----------------------- | ----------------------------------------------- |
| `setAttributes()`| This parameter is used to set the Attributes |
| `setAppNames()` | This parameter is used to set the list of apps you are retrieving a token for, such as `card_balance` or `card_issuance` |
| `setAuthType()` | This parameter is used to set the OAuth type. Valid values may be `AuthType.CLIENT` (client_credentials grant), `AuthType.PASSWORD` (password grant), `AuthType.CLIENT_TOKEN` (custom client-token grant) |
| `setBasePath()` | This parameter is used to set the base path of the environment. Valid values may be `Environment.PRODUCTION` (https://api.hydrogenplatform.com) |
| `setAccessToken()` | This parameter is used to pass in the JWT Access Token if you authenticate outside of the SDK |
| `setClientToken()` | This parameter is used to pass in the JWT Access Token for Custom Client Token apps if you authenticate outside of the SDK |
| `setClientId()` | This parameter is used to set your OAuth `client_id` to authenticate if you don't pass in the JWT Access Token |
| `setClientSecret()` | This Parameter is used to set your OAuth `client_secret` to authenticate if you don't pass in the JWT Access Token |
| `setUsername` | This parameter is used to pass in the Nucleus Client `username` of the user to authenticate `password` grant apps |
| `setPassword` |  This parameter is used to pass in the Nucleus Client `password` of the user to authenticate `password` grant apps |
| `setIsEmbed()` | This parameter is used to return an HTML embed code in the response, including all passed data attributes. Valid values are `true` or `false` |

### Sample Code
Now you are ready to execute the following Java code:

```java

public class AppTokenApiExample {

    public static void main(String[] args) {
        AppTokenConfig appTokenConfig = new AppTokenConfig()
            .setClientId("xxxx")
            .setClientSecret("xxxx")
            .setUsername("xxxx")
            .setPassword("xxxx")
            .setAuthType(AuthType.PASSWORD)
            .setAppNames(asList(new AppConfig().setAppName("card_issuance"), new AppConfig().setAppName("card_balance")))
            .setBasePath(Environment.PRODUCTION);
              .setAttributes(asList(
                  new TagAttributes().setName("card-id").setValue("xxxxx")
                  ,new TagAttributes().setName("client-id").setValue("xxxxx"))
              )
              .setIsEmbed(true);
      AutoGenerateAppTokenApi appTokenApi = new AutoGenerateAppTokenApi(appTokenConfig);
      List<Map<String, String>> appTokenUsingGET = appTokenApi.getAppTokenUsingGET();
      System.out.println(appTokenUsingGET);
    }
}

```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com
