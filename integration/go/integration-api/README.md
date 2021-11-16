# Hydrogen Integration API

Hydrogen Integration API
- API version: 1.3.1
  - Build date: 12-11-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)

## Documentation

https://www.hydrogenplatform.com/docs/integration/v1

## Installation
Put the package under your project folder and add the following in import:
```golang
import 	sw "integration_api"
```

## Documentation For Authorization

## oauth2
- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A

```golang
import "./integration_api"
```

Example
```golang
package main

import (
	"bytes"
	"encoding/json"
	"fmt"
	"golang.org/x/net/context"
	sw1 "integration-api"
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
	// Hello world, the web server
	var authConfigService = sw1.AuthConfigurationService{};
	auth := context.WithValue(context.Background(), sw1.ContextAccessToken, nil)
	r1, _, _ := authConfigService.CreateClientCredential(auth, "TestUser", "eIDan^(U3vJ#BAJ2whoRBtC8CoLow)Mj",
		sw1.SANDBOX)
	tokenSettingAuth := context.WithValue(context.Background(), sw1.ContextAccessToken, r1.AccessToken)
	tokenSettingAuth = context.WithValue(tokenSettingAuth, "BasePath", sw1.SANDBOX)
	b11, _ := PrettyJson(r1)
	fmt.Printf("%s",b11)
	var webhookService = sw1.WebhookApiService{}
	s1, _, _ :=  webhookService.GetWebhookAllUsingGet(tokenSettingAuth, new(sw1.WebhookApiGetWebhookAllUsingGetOpts))
	b12, _ := PrettyJson(s1)
	fmt.Printf("%s",b12)
}
```

## Author

info@hydrogenplatform.com

