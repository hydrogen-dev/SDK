# Hydrogen Web Components

For more information, please visit [https://www.hydrogenplatform.com/no-code](https://www.hydrogenplatform.com/no-code)

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

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL
Follow steps to verify the base URL path:

1. Go to ApiClient file located under src folder.
2. Search for basePath and change/verify the URL according to the environment.

**Sandbox Base URL**
https://sandbox.hydrogenplatform.com

**Production Base URL**
https://api.hydrogenplatform.com

### Parameters Definition

| Parameter |  Description |
| ----------------------- | ----------------------------------------------- |
| `setClientId()` | This parameter is used to set the Client ID |
| `setClientSecret()` | This Parameter is used to set the Client Secret |
| `setUsername()` | This parameter is used to set the Username |
| `setPassword()` | This parameter is used to set the Password |
| `setAccessToken()` | This parameter is used to set the User Access Token  |
| `setPublicKey()` | This parameter is used to set the Public Key |
| `setClientToken()` | This parameter is used to set the Client Token |
| `setAppNames()` | This parameter is used to set the list of App Names |
| `setAuthType()` | This parameter is used to set the Auth type like `AuthType.PASSWORD` |
| `setBasePath()` | This parameter is used to set the base path which should be enter in ENUM values like `Environment.PRODUCTION` |
| `setAttributes()`| This parameter is used to set the Attributes |
| `setIsEmbed()` | This parameter accepts boolean values, you can pass `true` or `false` |

### Sample Code
Now you are ready to execute the following Java code:

```java

public class AppTokenApiExample {

    public static void main(String[] args) {
        AppTokenConfig appTokenConfig = new AppTokenConfig()
                        .setClientId("xxxxx")
                        .setClientSecret("xxxxx")
                        .setIsCredsPassed(true)
                        .setUserAccessToken("xxxxx")
                        .setUsername("xxxxx")
                        .setPassword("xxxxx")
                        .setPublicKey("xxxxx")
                        .setAppNames(asList(new AppConfig().setAppName("pfm_cash_flow").setAuthType("password_credentials")))
                        .setBasePath(Environment.PRODUCTION)
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

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*
