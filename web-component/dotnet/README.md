# Hydrogen Web Components - .NET SDK

Installing this SDK in your project will give you the following functionality:

- (OAuth 2.0 Authorization)(https://www.hydrogenplatform.com/docs/nucleus/v1/#OAuth-2-0-Authorization) of Web Components and WebViews
- Generate [App Tokens](https://www.hydrogenplatform.com/docs/web-component/v1/#App-Tokens) to authenticate Web Components and WebViews
- Retrieve Nucleus [Client](https://www.hydrogenplatform.com/docs/nucleus/v1/#Client) and [Card](https://www.hydrogenplatform.com/docs/nucleus/v1/#Card) data used in Web Component and WebView embed codes as data attributes

For more information, please visit our documentation [https://www.hydrogenplatform.com/docs/web-component/v1](https://www.hydrogenplatform.com/docs/web-component/v1)

## Requirements
- .NET 2.0

## Dependencies
- Mono compiler
- Newtonsoft.Json.7.0.1
- RestSharp.Net2.1.1.11

Note: NuGet is downloaded by the mono compilation script and packages are installed with it. No dependency DLLs are bundled with this generator

## Installation

Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh compile-mono.sh`
- [Windows] TODO

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;
```

## Getting Started

Please first follow the [installation](#installation) instructions.

### Parameters

| Parameter |  Description |
| ----------------------- | ----------------------------------------------- |
| `attributes`| This parameter is used to set the Attributes |
| `appNames` | This parameter is used to set the list of apps you are retrieving a token for, such as `card_balance` or `card_issuance` |
| `authType` | This parameter is used to set the OAuth grant type. Valid values are `client_credentials`, `password_credentials`, `client_token`  |
| `basePath` | This parameter is used to set the base path. Valid values are `https://api.hydrogenplatform.com` |
| `clientId` | This parameter is used to set your OAuth `client_id` to authenticate if you don't pass in the JWT Access Token |
| `clientSecret` | This Parameter is used to set your OAuth `client_secret` to authenticate if you don't pass in the JWT Access Token |
| `username` | This parameter is used to pass in the Nucleus Client `username` of the user to authenticate `password` grant apps |
| `password` |  This parameter is used to pass in the Nucleus Client `password` of the user to authenticate `password` grant apps |
| `isEmbed` | This parameter is used to return an HTML embed code in the response, including all passed data attributes. Valid values are `true` or `false` |

### Sample Code

```csharp
using System;
using IO.Swagger.Api;
using IO.Swagger.Model;
using System.Collections.Generic;
using Newtonsoft.Json;
namespace csharp_dotnet2_demo
{
    class Program
    {
        static void Main(string[] args)
        {
             AppTokenConfig appTokenConfig = new IO.Swagger.Model.AppTokenConfig();
             AppConfig appConfig = new IO.Swagger.Model.AppConfig();
             appConfig.appName = "card_issuance";
             appConfig.authType = "client_credentials";
             TagAttributes tagAttributes = new IO.Swagger.Model.TagAttributes();
             tagAttributes.name = "client_id";
             tagAttributes.value = "client_id_value";
             appTokenConfig.basePath = "https://api.hydrogenplatform.com/admin/v1";
             appTokenConfig.clientId = "xxxx";
             appTokenConfig.clientSecret = "xxxx";
             appTokenConfig.appNames = new List<AppConfig>{appConfig};
             appTokenConfig.attributes = new List<TagAttributes>{tagAttributes};
             appTokenConfig.isEmbed = true;
             appTokenConfig.username = null;
             appTokenConfig.password = null;

            var apiInstance = new AutoGenerateAppTokenApi(appTokenConfig);
            try
            {
                List<Dictionary<string, string>> result = apiInstance.GetAppTokenUsingGET();
                Console.WriteLine(JsonConvert.SerializeObject(result));

            }
            catch (Exception e)
            {
                Console.WriteLine("Exception when calling AutoGenerateAppTokenApi.GetAppTokenUsingGET: " + e);
            }

        }
    }
}

```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com
