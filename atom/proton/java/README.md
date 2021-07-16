# Hydrogen Proton API

Hydrogen Proton API
- API version: 1.9.2
  - Build date: 01-07-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)


## Documentation

https://www.hydrogenplatform.com/docs/proton/v1

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
  <groupId>com.hydrogenplatform</groupId>
  <artifactId>hydrogen-proton-api</artifactId>
  <version>1.9.2</version>
  <scope>compile</scope>
</dependency>
```
### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.hydrogenplatform:hydrogen-proton-api:1.9.2"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/hydrogen-proton-api-1.9.2.jar`
* `target/lib/*.jar`


## Getting Started

Please first follow the [installation](#installation) instructions. Then make sure you use the proper base URL:

### Base URL
Create an authentication object(**AuthApiClient**) with environment parameter.

**Sandbox URL**

AuthApiClient authApiClient = new AuthApiClient(Environment.SANDBOX);

**Production URL**

AuthApiClient authApiClient = new AuthApiClient(Environment.PRODUCTION);

### Sample Code
Now you are ready to execute the following Java code:

```java

import com.hydrogen.proton.ApiClient;
import com.hydrogen.proton.ApiException;
import com.hydrogen.proton.Environment;
import com.hydrogen.proton.model.AnnuityCalculatorAccumulationHorizonRequest;
import com.hydrogen.proton.api.AnnuitiesApi;

import java.util.*;

public class AnnuitiesApiExample {

    public static void main(String[] args) {
        AuthApiClient authApiClient = new AuthApiClient(Environment.PRODUCTION);
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
        AnnuitiesApi apiInstance = new AnnuitiesApi();
        AnnuityCalculatorAccumulationHorizonRequest annuityCalculatorAccumulationHorizonRequest =
             new AnnuityCalculatorAccumulationHorizonRequest(); // AnnuityCalculatorAccumulationHorizonRequest | Request payload for Annuity Calculator - Accumulation Horizon
        try {
            Map<String, Object> result = apiInstance
                .annuityCalculatorAccumulationHorizon(annuityCalculatorAccumulationHorizonRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnuitiesApi#annuityCalculatorAccumulationHorizon");
            e.printStackTrace();
        }
    }
}

```



## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*