# Hydrogen Proton API

Hydrogen Proton API
- API version: 1.9.2
  - Build date: 10-11-2021

For more information, please visit [https://www.hydrogenplatform.com/apis](https://www.hydrogenplatform.com/apis)


## Documentation

https://www.hydrogenplatform.com/docs/proton/v1
## Installation
Put the package under your project folder and add the following in import:
```golang
import 	sw "proton_api"
```

## Documentation For Authorization

## oauth2
- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A

```golang
import "./proton_api"
```

Example
```golang
package main

import (
	"bytes"
	"encoding/json"
	"fmt"
	"golang.org/x/net/context"
	sw1 "proton_api"
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
	var ratioTargets1 = sw1.RatioTargets1{}
	ratioTargets1.ProfitMargin = 0.1
	ratioTargets1.ReturnOnAssets = 0.05
	ratioTargets1.ReturnOnEquity = 0.15
	ratioTargets1.DebtToEquity = 1.5
	ratioTargets1.AssetTurnover = 1.0
	var businessFinancialManagementService = sw1.BusinessFinancialManagementApiService{}
	var businessFinancialHealthCheckRequest = sw1.BusinessFinancialHealthCheckRequest{
		RatioTargets:	ratioTargets1,
	}
	businessFinancialHealthCheckRequest.NetIncome = 10000
	businessFinancialHealthCheckRequest.TotalRevenue = 50000
	businessFinancialHealthCheckRequest.TotalAssets = 122141
	businessFinancialHealthCheckRequest.TotalLiabilities = 132542
	businessFinancialHealthCheckRequest.TotalEquity = 555
	r11, _, _ := businessFinancialManagementService.BusinessFinancialHealthCheck(
		tokenSettingAuth, businessFinancialHealthCheckRequest)
	b11, _ := PrettyJson(r11)
	fmt.Printf("%s",b11)
}
```

## Author

info@hydrogenplatform.com

