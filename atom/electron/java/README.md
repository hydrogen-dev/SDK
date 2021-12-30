# Hydrogen Electron API

Hydrogen Electron API
- API version: 1.3.1
  - Build date: 23-12-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)
## Documentation

https://www.hydrogenplatform.com/docs/electron/v1


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
  <artifactId>hydrogen-electron-api</artifactId>
  <version>1.3.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.hydrogenplatform:hydrogen-electron-api:1.3.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/hydrogen-electron-api-1.3.1.jar`
* `target/lib/*.jar`
## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

### Base URL
Create an authentication object(**AuthApiClient**) with environment parameter.

**Sandbox URL**

AuthApiClient authApiClient = new AuthApiClient(Environment.SANDBOX);

**Production URL**

AuthApiClient authApiClient = new AuthApiClient(Environment.PRODUCTION);

### Sample Code
Now you are ready to execute the following Java code:
```java

import com.hydrogen.electron.ApiClient;
import com.hydrogen.electron.ApiException;
import com.hydrogen.electron.Configuration;
import com.hydrogen.electron.AuthApiClient;
import com.hydrogen.electron.Environment;
import com.hydrogen.electron.model.AchCardRequestCO;
import com.hydrogen.electron.model.AchCardResponseVO;
import com.hydrogen.electron.api.AchApi;
public class AchApiExample {

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

        AchApi apiInstance = new AchApi();
        AchCardRequestCO achCardRequestCO = new AchCardRequestCO(); // AchCardRequestCO | achCardRequestCO
        try {
            AchCardResponseVO result = apiInstance.fundCardUsingPost(achCardRequestCO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AchApi#fundCardUsingPost");
            e.printStackTrace();
        }
    }
}

```


## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*