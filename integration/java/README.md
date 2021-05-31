# Hydrogen Integration API

Hydrogen Integration API
- API version: 1.3.0
  - Build date: 05-18-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)
## Documentation

https://www.hydrogenplatform.com/docs/integration/v1

## Requirements

Building the API client library requires:
1. Java 1.7+
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

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.hydrogen.integration</groupId>
  <artifactId>hydrogen-integration-api</artifactId>
  <version>1.3.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.hydrogen.integration:hydrogen-integration-api:1.3.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/hydrogen-integration-api-1.3.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

### Base URL
1. Go to ApiClient file located under src folder.
2. Search for basePath and change/verify the URL according to the environment.

**Sandbox Base URL**
https://sandbox.hydrogenplatform.com/integration/v1

**Production Base URL**
https://api.hydrogenplatform.com/integration/v1

### Sample Code
Now you are ready to execute the following Java code:

```java

import com.hydrogen.integration.ApiException;
import com.hydrogen.integration.AuthApiClient;
import com.hydrogen.integration.model.AccountingFinalResponseVO;
import com.hydrogen.integration.api.AccountingApi;


public class AccountingApiExample {

    public static void main(String[] args) {
        AuthApiClient authApiClient = new AuthApiClient();
        try {
            //          Use one of the below method to generate oauth token        
            //          Creating a token for grant_type=client_credentials            
            authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
            //          Creating a token for grant_type=password
            authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                                    "USERNAME", "PASSWORD");     
            //  Creating a token using client_token
            authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
                    "CLIENT_TOKEN");      
        } catch (ApiException e) {
            e.printStackTrace();
        }
        AccountingApi apiInstance = new AccountingApi();
        UUID nucleusClientId = new UUID(); // UUID | nucleus_client_id
        try {
            AccountingFinalResponseVO result = apiInstance.createOrUpdateCustomer(nucleusClientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountingApi#createOrUpdateCustomer");
            e.printStackTrace();
        }
    }
}

```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*