# Hydrogen Nucleus API

Hydrogen Nucleus API
- API version: 1.9.4
  - Build date: 01-07-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)

## Documentation

https://www.hydrogenplatform.com/docs/nucleus/v1

## Installation
Put the package under your project folder and add the following in import:
```golang
import 	sw "nucleus_api"
```

## Documentation For Authorization

## oauth2
- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A

```golang
import "./nucleus_api"
```

Example
```golang
package main

import (
	"bytes"
	"encoding/json"
	"fmt"
	"github.com/lunux2008/xulu"
	"golang.org/x/net/context"
	sw "nucleus_api"
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
	var authConfigService = sw.AuthConfigurationService{};
	auth := context.WithValue(context.Background(), sw.ContextAccessToken, nil)
	r1, _, _ := authConfigService.CreateClientCredential(auth, "CLIENT_ID", "CLIENT_PASSWORD",
		sw.PRODUCTION)
	tokenSettingAuth := context.WithValue(context.Background(), sw.ContextAccessToken, r1.AccessToken)
    tokenSettingAuth = context.WithValue(tokenSettingAuth, "BasePath", sw.PRODUCTION)

	//var authConfigurationService = sw.AuthConfigurationService{}
	//r, res, err := authConfigurationService.
	var a = sw.AccountApiService{}
	r, res, err :=a.GetAccountAllUsingGet(tokenSettingAuth, new(sw.AccountApiGetAccountAllUsingGetOpts))
	b, _ := PrettyJson(r)
	fmt.Printf("%s",b)
	xulu.Use(res, err, r)
}
```

## Author

info@hydrogenplatform.com

