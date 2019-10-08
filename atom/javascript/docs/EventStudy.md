# atom_api.EventStudy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **[String]** | Tickers of portfolio holdings | 
**portfolioWeights** | **[Number]** | Weights of portfolio holdings | 
**events** | **[String]** | Historical events to analyze | [optional] 
**useProxyData** | **Boolean** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to false]


<a name="[EventsEnum]"></a>
## Enum: [EventsEnum]


* `dot_com_bubble` (value: `"dot_com_bubble"`)

* `2008_financial_crisis` (value: `"2008_financial_crisis"`)

* `brexit` (value: `"brexit"`)

* `2011_black_monday` (value: `"2011_black_monday"`)

* `september_eleventh` (value: `"september_eleventh"`)

* `1987_black_monday` (value: `"1987_black_monday"`)

* `1992_black_wednesday` (value: `"1992_black_wednesday"`)

* `1997_asian_financial_crisis` (value: `"1997_asian_financial_crisis"`)




