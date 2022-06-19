# Hydrogen Web Components - GO SDK

Installing this SDK in your project will give you the following functionality:

- (OAuth 2.0 Authorization)(https://www.hydrogenplatform.com/docs/nucleus/v1/#OAuth-2-0-Authorization) of Web Components and WebViews
- Generate [App Tokens](https://www.hydrogenplatform.com/docs/web-component/v1/#App-Tokens) to authenticate Web Components and WebViews
- Retrieve Nucleus [Client](https://www.hydrogenplatform.com/docs/nucleus/v1/#Client) and [Card](https://www.hydrogenplatform.com/docs/nucleus/v1/#Card) data used in Web Component and WebView embed codes as data attributes

For more information, please visit our documentation [https://www.hydrogenplatform.com/docs/web-component/v1](https://www.hydrogenplatform.com/docs/web-component/v1)

## Installation
Put the package under your project folder and add the following in import:
```golang
import 	sw "go-client"
```

## Getting Started

Please first follow the [installation](#installation) instructions.

### Parameters

| Parameter |  Description |
| ----------------------- | ----------------------------------------------- |
| `Attributes`| This parameter is used to set the Attributes |
| `AppName` | This parameter is used to set the list of apps you are retrieving a token for, such as `card_balance` or `card_issuance` |
| `AuthType` | This parameter is used to set the OAuth grant type. Valid values are `client_credentials`, `password_credentials`, `client_token`  |
| `BasePath` | This parameter is used to set the base path. Valid values are `https://api.hydrogenplatform.com` |
| `ClientId` | This parameter is used to set your OAuth `client_id` to authenticate if you don't pass in the JWT Access Token |
| `ClientSecret` | This Parameter is used to set your OAuth `client_secret` to authenticate if you don't pass in the JWT Access Token |
| `Username` | This parameter is used to pass in the Nucleus Client `username` of the user to authenticate `password` grant apps |
| `Password` |  This parameter is used to pass in the Nucleus Client `password` of the user to authenticate `password` grant apps |
| `IsEmbed` | This parameter is used to return an HTML embed code in the response, including all passed data attributes. Valid values are `true` or `false` |

### Sample Code

```golang
package main

import (
	sw "go-client"
	"golang.org/x/net/context"
	"encoding/json"
    "bytes"
	"fmt"
	 "github.com/lunux2008/xulu"
)

const (
    empty = ""
    tab   = "\t"
)

func PrettyJson(data interface{}) (string, error) {
    buffer := new(bytes.Buffer)
    encoder := json.NewEncoder(buffer)
    encoder.SetIndent(empty, tab)

    err := encoder.Encode(data)
    if err != nil {
       return empty, err
    }
    return buffer.String(), nil
}
func main() {

  auth := context.WithValue(context.Background(), sw.ContextAccessToken, nil)
	var a = sw.AutoGenerateAppTokenApiService{}
	var appTokenConfig = sw.AppTokenConfig{};
	var appConfig = sw.AppConfig{};
	appConfig.AppName = "card_issuance";
	appTokenConfig.AuthType = "client_credentials";
	var tagAttributes = sw.TagAttributes{};
	tagAttributes.Name = "<client_id>";
	tagAttributes.Value = "<client_id_value>";
	appTokenConfig.BasePath = "https://api.hydrogenplatform.com";
	appTokenConfig.ClientId = "xxxx";
	appTokenConfig.ClientSecret = "xxxx";
	appTokenConfig.AppNames = []sw.AppConfig{appConfig}
	appTokenConfig.Attributes = []sw.TagAttributes{tagAttributes}
	appTokenConfig.IsEmbed = true;

	r, res, err :=a.GetAppTokenUsingGET(auth, appTokenConfig)
	fmt.Printf("%s",err)
	fmt.Printf("%s",res)
	var result = r[0]
	b, _ := PrettyJson(result["card_issuance"])
        fmt.Printf("%s",result["card_issuance"])
	xulu.Use(res, err, b)
}
```

## Author
The Hydrogen Technology Corporation

https://www.hydrogenplatform.com
