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
  <groupId>com.hydrogen</groupId>
  <artifactId>hydrogen-app-token-api</artifactId>
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
https://sandbox.hydrogenplatform.com/admin/v1

**Production Base URL**
https://api.hydrogenplatform.com/admin/v1

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
                        .setAppNames(asList("pfm_cash_flow"))
                        .setBasePath("https://api.hydrogenplatform.com/admin/v1")
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
