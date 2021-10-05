# Hydrogen Nucleus API

Hydrogen Nucleus API
- API version: 1.9.4
  - Build date: 01-07-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)


## Documentation

https://www.hydrogenplatform.com/docs/nucleus/v1

## Requirements

Building the API client library requires:
- .NET 4.0 or later
- Windows Phone 7.1 (Mango)



## Dependencies

- [RestSharp](https://www.nuget.org/packages/RestSharp) - 105.1.0 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 7.0.0 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.2.0 or later

The DLLs included in the package may not be the latest version. We recommend
using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:

```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail.
See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742)


## Installation

Run the following command to generate the DLL

- [Mac/Linux] `/bin/sh build.sh`
- [Windows] `build.bat`

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:

```csharp
using Nucleus.Api;
using Nucleus.Client;
using Nucleus.ModelEntity;
```

## Getting Started
### Base URL
Create an authentication object(**AuthApiClient**) with environment parameter.

**Sandbox URL**

AuthApiClient api = new AuthApiClient(Nucleus.Client.EnumTest.SANDBOX);

**Production URL**

AuthApiClient api = new AuthApiClient(Nucleus.Client.EnumTest.PRODUCTION);

### Sample Code
Now you are ready to execute the following csharp code:

```csharp
using System;
using System.Diagnostics;
using Nucleus.Api;
using Nucleus.Client;
using Nucleus.ModelEntityEntity;

namespace Example
{
    public class Example
    {
        public void main()
        {

            AuthApiClient api = new AuthApiClient(Nucleus.Client.EnumTest.PRODUCTION);
            api.createClientCredential("CLIENT_ID", "CLIENT_SECRET");

            var apiInstance = new AccountApi();
            var allocRequest = new AccountAllocationMapping(); // AccountAllocationMapping | allocRequest

            try
            {
                // Create an account allocation
                AccountAllocationMapping result = apiInstance.CreateAccountAllocationMappingUsingPost(allocRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountApi.CreateAccountAllocationMappingUsingPost: " + e.Message );
            }

        }
    }
}
```
## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com

*Generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*
