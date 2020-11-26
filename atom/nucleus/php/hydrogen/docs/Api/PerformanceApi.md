# com\hydrogen\nucleus\PerformanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountPerformanceUsingGet**](PerformanceApi.md#getAccountPerformanceUsingGet) | **GET** /account/{account_id}/performance | Account Performance
[**getAllocationPerformanceUsingGet**](PerformanceApi.md#getAllocationPerformanceUsingGet) | **GET** /allocation/{allocation_id}/performance | Allocation Performance
[**getBenchmarkPerformanceUsingGet**](PerformanceApi.md#getBenchmarkPerformanceUsingGet) | **GET** /benchmark/{benchmark_id}/performance | Benchmark Performance
[**getClientPerformanceUsingGet**](PerformanceApi.md#getClientPerformanceUsingGet) | **GET** /client/{client_id}/performance | Client Performance
[**getGoalPerformanceUsingGet**](PerformanceApi.md#getGoalPerformanceUsingGet) | **GET** /goal/{goal_id}/performance | Goal Performance
[**getHouseholdClientPerformanceUsingGet**](PerformanceApi.md#getHouseholdClientPerformanceUsingGet) | **GET** /household/{household_id}/performance | Household Performance
[**getModelPerformanceUsingGet**](PerformanceApi.md#getModelPerformanceUsingGet) | **GET** /model/{model_id}/performance | Model Performance
[**getPortfolioPerformanceUsingGet**](PerformanceApi.md#getPortfolioPerformanceUsingGet) | **GET** /portfolio/{portfolio_id}/performance | Portfolio Performance
[**getSecurityPerformanceUsingGet**](PerformanceApi.md#getSecurityPerformanceUsingGet) | **GET** /security/{security_id}/performance | Security Performance


# **getAccountPerformanceUsingGet**
> object getAccountPerformanceUsingGet($account_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval)

Account Performance

Get information on the performance of an account using IRR (Internal Rate of Return). You must provide the unique account_id.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\PerformanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$account_id = "account_id_example"; // string | Account Id -/account
$active_premium_period = "active_premium_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$annualized_return_period = "annualized_return_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$benchmark_id = "benchmark_id_example"; // string | Client Benchmark or Tenant Benchmark id -/benchmark
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$hist_factor = 1.2; // double | Histogram factor- (statId: 39, default: 5)
$mar_down_side_deviation = 1.2; // double | minimum acceptable return for downside deviation - (statId: 58, default: 0)
$max_percentile_monte_carlo = 1.2; // double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
$mean_percentile_monte_carlo = 1.2; // double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
$min_percentile_monte_carlo = 1.2; // double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
$moving_average_n_day = 56; // int | number of days for moving average n-day - (statId: 18, default: 7)
$n_day_returns = 56; // int | number of days for Rolling n-day returns - (statId: 2, default: 7)
$n_path_monte_carlo = 56; // int | number of points for a simulation- (statId: 62, default: 100)
$n_rolling_max_drawdown = 56; // int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
$n_rolling_volatility = 56; // int | number of days for Rolling n-day volatility- (statId: 34, default: 7)
$num_sim_monte_carlo = 56; // int | number of simulations - (statId: 62, default: 1000)
$period_type = "period_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
$risk_free_alpha = 1.2; // double | risk free val alpha - (statId: 52, default: 0)
$risk_free_sharpe = 1.2; // double | risk free val sharpe- (statId: 49, default: 0)
$risk_free_sortino = 1.2; // double | risk free val sortino - (statId: 56, default: 0)
$risk_free_treynor = 1.2; // double | risk free val treynor- (statId: 51, default: 0)
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date
$stat = "stat_example"; // string | A stat type - /statistics
$var_conf_interval = 1.2; // double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)

try {
    $result = $apiInstance->getAccountPerformanceUsingGet($account_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PerformanceApi->getAccountPerformanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**string**](../Model/.md)| Account Id -/account |
 **active_premium_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualized_return_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmark_id** | [**string**](../Model/.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional]
 **end_date** | **\DateTime**| end date | [optional]
 **hist_factor** | **double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **mar_down_side_deviation** | **double**| minimum acceptable return for downside deviation - (statId: 58, default: 0) | [optional]
 **max_percentile_monte_carlo** | **double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **mean_percentile_monte_carlo** | **double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **min_percentile_monte_carlo** | **double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7) | [optional]
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000) | [optional]
 **period_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **risk_free_alpha** | **double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **risk_free_sharpe** | **double**| risk free val sharpe- (statId: 49, default: 0) | [optional]
 **risk_free_sortino** | **double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **risk_free_treynor** | **double**| risk free val treynor- (statId: 51, default: 0) | [optional]
 **start_date** | **\DateTime**| start date | [optional]
 **stat** | **string**| A stat type - /statistics | [optional]
 **var_conf_interval** | **double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**object**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllocationPerformanceUsingGet**
> map[string,object] getAllocationPerformanceUsingGet($allocation_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $is_current_weight, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval)

Allocation Performance

Get information on the performance of an allocation using TWR (Time Weighted Return). You must provide the unique allocation_id.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\PerformanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$allocation_id = "allocation_id_example"; // string | Allocation Id -/allocation
$active_premium_period = "active_premium_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$annualized_return_period = "annualized_return_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$benchmark_id = "benchmark_id_example"; // string | Tenant Benchmark Id -/benchmark
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$hist_factor = 1.2; // double | Histogram factor- (statId: 39, default: 5)
$is_current_weight = true; // bool | is_current_weight
$mar_down_side_deviation = 1.2; // double | minimum acceptable return for downside deviation - (statId: 58, default: 0)
$max_percentile_monte_carlo = 1.2; // double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
$mean_percentile_monte_carlo = 1.2; // double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
$min_percentile_monte_carlo = 1.2; // double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
$moving_average_n_day = 56; // int | number of days for moving average n-day - (statId: 18, default: 7)
$n_day_returns = 56; // int | number of days for Rolling n-day returns - (statId: 2, default: 7)
$n_path_monte_carlo = 56; // int | number of points for a simulation- (statId: 62, default: 100)
$n_rolling_max_drawdown = 56; // int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
$n_rolling_volatility = 56; // int | number of days for Rolling n-day volatility- (statId: 34, default: 7)
$num_sim_monte_carlo = 56; // int | number of simulations - (statId: 62, default: 1000)
$period_type = "period_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
$risk_free_alpha = 1.2; // double | risk free val alpha - (statId: 52, default: 0)
$risk_free_sharpe = 1.2; // double | risk free val sharpe- (statId: 49, default: 0)
$risk_free_sortino = 1.2; // double | risk free val sortino - (statId: 56, default: 0)
$risk_free_treynor = 1.2; // double | risk free val treynor- (statId: 51, default: 0)
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date
$stat = "stat_example"; // string | A stat type found under the Statistics banner
$var_conf_interval = 1.2; // double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)

try {
    $result = $apiInstance->getAllocationPerformanceUsingGet($allocation_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $is_current_weight, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PerformanceApi->getAllocationPerformanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**string**](../Model/.md)| Allocation Id -/allocation |
 **active_premium_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualized_return_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmark_id** | [**string**](../Model/.md)| Tenant Benchmark Id -/benchmark | [optional]
 **end_date** | **\DateTime**| end date | [optional]
 **hist_factor** | **double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **is_current_weight** | **bool**| is_current_weight | [optional] [default to true]
 **mar_down_side_deviation** | **double**| minimum acceptable return for downside deviation - (statId: 58, default: 0) | [optional]
 **max_percentile_monte_carlo** | **double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **mean_percentile_monte_carlo** | **double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **min_percentile_monte_carlo** | **double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7) | [optional]
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000) | [optional]
 **period_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **risk_free_alpha** | **double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **risk_free_sharpe** | **double**| risk free val sharpe- (statId: 49, default: 0) | [optional]
 **risk_free_sortino** | **double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **risk_free_treynor** | **double**| risk free val treynor- (statId: 51, default: 0) | [optional]
 **start_date** | **\DateTime**| start date | [optional]
 **stat** | **string**| A stat type found under the Statistics banner | [optional]
 **var_conf_interval** | **double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**map[string,object]**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getBenchmarkPerformanceUsingGet**
> object getBenchmarkPerformanceUsingGet($benchmark_id, $active_premium_period, $annualized_return_period, $comparison_benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval)

Benchmark Performance

Get information on the performance of a benchmark using TWR (Time Weighted Return). You must provide the unique benchmark_id.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\PerformanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$benchmark_id = "benchmark_id_example"; // string | Benchmark Id - /benchmark
$active_premium_period = "active_premium_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$annualized_return_period = "annualized_return_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$comparison_benchmark_id = "comparison_benchmark_id_example"; // string | comparison_benchmark_id
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$hist_factor = 1.2; // double | Histogram factor- (statId: 39, default: 5)
$mar_down_side_deviation = 1.2; // double | minimum acceptable return for downside deviation - (statId: 58, default: 0)
$max_percentile_monte_carlo = 1.2; // double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
$mean_percentile_monte_carlo = 1.2; // double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
$min_percentile_monte_carlo = 1.2; // double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
$moving_average_n_day = 56; // int | number of days for moving average n-day - (statId: 18, default: 7)
$n_day_returns = 56; // int | number of days for Rolling n-day returns - (statId: 2, default: 7)
$n_path_monte_carlo = 56; // int | number of points for a simulation- (statId: 62, default: 100)
$n_rolling_max_drawdown = 56; // int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
$n_rolling_volatility = 56; // int | number of days for Rolling n-day volatility- (statId: 34, default: 7)
$num_sim_monte_carlo = 56; // int | number of simulations - (statId: 62, default: 1000)
$period_type = "period_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
$risk_free_alpha = 1.2; // double | risk free val alpha - (statId: 52, default: 0)
$risk_free_sharpe = 1.2; // double | risk free val sharpe- (statId: 49, default: 0)
$risk_free_sortino = 1.2; // double | risk free val sortino - (statId: 56, default: 0)
$risk_free_treynor = 1.2; // double | risk free val treynor- (statId: 51, default: 0)
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date
$stat = "stat_example"; // string | Stat type - /statistics endpoint
$var_conf_interval = 1.2; // double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)

try {
    $result = $apiInstance->getBenchmarkPerformanceUsingGet($benchmark_id, $active_premium_period, $annualized_return_period, $comparison_benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PerformanceApi->getBenchmarkPerformanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_id** | [**string**](../Model/.md)| Benchmark Id - /benchmark |
 **active_premium_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualized_return_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **comparison_benchmark_id** | [**string**](../Model/.md)| comparison_benchmark_id | [optional]
 **end_date** | **\DateTime**| end date | [optional]
 **hist_factor** | **double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **mar_down_side_deviation** | **double**| minimum acceptable return for downside deviation - (statId: 58, default: 0) | [optional]
 **max_percentile_monte_carlo** | **double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **mean_percentile_monte_carlo** | **double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **min_percentile_monte_carlo** | **double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7) | [optional]
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000) | [optional]
 **period_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **risk_free_alpha** | **double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **risk_free_sharpe** | **double**| risk free val sharpe- (statId: 49, default: 0) | [optional]
 **risk_free_sortino** | **double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **risk_free_treynor** | **double**| risk free val treynor- (statId: 51, default: 0) | [optional]
 **start_date** | **\DateTime**| start date | [optional]
 **stat** | **string**| Stat type - /statistics endpoint | [optional]
 **var_conf_interval** | **double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**object**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getClientPerformanceUsingGet**
> object getClientPerformanceUsingGet($client_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval)

Client Performance

Get information on the performance of a client using IRR (Internal Rate of Return). You must provide the unique client_id.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\PerformanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_id = "client_id_example"; // string | Client Id -/client
$active_premium_period = "active_premium_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$annualized_return_period = "annualized_return_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$benchmark_id = "benchmark_id_example"; // string | Client Benchmark or Tenant Benchmark id -/benchmark
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$hist_factor = 1.2; // double | Histogram factor- (statId: 39, default: 5)
$mar_down_side_deviation = 1.2; // double | minimum acceptable return for downside deviation - (statId: 58, default: 0)
$max_percentile_monte_carlo = 1.2; // double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
$mean_percentile_monte_carlo = 1.2; // double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
$min_percentile_monte_carlo = 1.2; // double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
$moving_average_n_day = 56; // int | number of days for moving average n-day - (statId: 18, default: 7)
$n_day_returns = 56; // int | number of days for Rolling n-day returns - (statId: 2, default: 7)
$n_path_monte_carlo = 56; // int | number of points for a simulation- (statId: 62, default: 100)
$n_rolling_max_drawdown = 56; // int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
$n_rolling_volatility = 56; // int | number of days for Rolling n-day volatility- (statId: 34, default: 7)
$num_sim_monte_carlo = 56; // int | number of simulations - (statId: 62, default: 1000)
$period_type = "period_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
$risk_free_alpha = 1.2; // double | risk free val alpha - (statId: 52, default: 0)
$risk_free_sharpe = 1.2; // double | risk free val sharpe- (statId: 49, default: 0)
$risk_free_sortino = 1.2; // double | risk free val sortino - (statId: 56, default: 0)
$risk_free_treynor = 1.2; // double | risk free val treynor- (statId: 51, default: 0)
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date
$stat = "stat_example"; // string | A stat type -- /statistics
$var_conf_interval = 1.2; // double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)

try {
    $result = $apiInstance->getClientPerformanceUsingGet($client_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PerformanceApi->getClientPerformanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**string**](../Model/.md)| Client Id -/client |
 **active_premium_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualized_return_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmark_id** | [**string**](../Model/.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional]
 **end_date** | **\DateTime**| end date | [optional]
 **hist_factor** | **double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **mar_down_side_deviation** | **double**| minimum acceptable return for downside deviation - (statId: 58, default: 0) | [optional]
 **max_percentile_monte_carlo** | **double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **mean_percentile_monte_carlo** | **double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **min_percentile_monte_carlo** | **double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7) | [optional]
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000) | [optional]
 **period_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **risk_free_alpha** | **double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **risk_free_sharpe** | **double**| risk free val sharpe- (statId: 49, default: 0) | [optional]
 **risk_free_sortino** | **double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **risk_free_treynor** | **double**| risk free val treynor- (statId: 51, default: 0) | [optional]
 **start_date** | **\DateTime**| start date | [optional]
 **stat** | **string**| A stat type -- /statistics | [optional]
 **var_conf_interval** | **double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**object**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getGoalPerformanceUsingGet**
> object getGoalPerformanceUsingGet($client_id, $goal_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $portfolio_goal, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval)

Goal Performance

Get information on the performance of a goal using IRR (Internal Rate of Return). You must provide the unique goal_id.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\PerformanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$client_id = "client_id_example"; // string | client_id
$goal_id = "goal_id_example"; // string | Goal Id - /account
$active_premium_period = "active_premium_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$annualized_return_period = "annualized_return_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$benchmark_id = "benchmark_id_example"; // string | Client Benchmark or Tenant Benchmark id -/benchmark
$end_date = new \DateTime("null"); // \DateTime | end date
$hist_factor = 1.2; // double | Histogram factor- (statId: 39, default: 5)
$mar_down_side_deviation = 1.2; // double | minimum acceptable return for downside deviation - (statId: 58, default: 0)
$max_percentile_monte_carlo = 1.2; // double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
$mean_percentile_monte_carlo = 1.2; // double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
$min_percentile_monte_carlo = 1.2; // double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
$moving_average_n_day = 56; // int | number of days for moving average n-day - (statId: 18, default: 7)
$n_day_returns = 56; // int | number of days for Rolling n-day returns - (statId: 2, default: 7)
$n_path_monte_carlo = 56; // int | number of points for a simulation- (statId: 62, default: 100)
$n_rolling_max_drawdown = 56; // int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
$n_rolling_volatility = 56; // int | number of days for Rolling n-day volatility- (statId: 34, default: 7)
$num_sim_monte_carlo = 56; // int | number of simulations - (statId: 62, default: 1000)
$period_type = "period_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
$portfolio_goal = false; // bool | portfolio_goal
$risk_free_alpha = 1.2; // double | risk free val alpha - (statId: 52, default: 0)
$risk_free_sharpe = 1.2; // double | risk free val sharpe- (statId: 49, default: 0)
$risk_free_sortino = 1.2; // double | risk free val sortino - (statId: 56, default: 0)
$risk_free_treynor = 1.2; // double | risk free val treynor- (statId: 51, default: 0)
$start_date = new \DateTime("null"); // \DateTime | start date
$stat = "stat_example"; // string | A stat type - /statistics
$var_conf_interval = 1.2; // double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)

try {
    $result = $apiInstance->getGoalPerformanceUsingGet($client_id, $goal_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $portfolio_goal, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PerformanceApi->getGoalPerformanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**string**](../Model/.md)| client_id |
 **goal_id** | [**string**](../Model/.md)| Goal Id - /account |
 **active_premium_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualized_return_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmark_id** | [**string**](../Model/.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional]
 **end_date** | **\DateTime**| end date | [optional] [default to null]
 **hist_factor** | **double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **mar_down_side_deviation** | **double**| minimum acceptable return for downside deviation - (statId: 58, default: 0) | [optional]
 **max_percentile_monte_carlo** | **double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **mean_percentile_monte_carlo** | **double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **min_percentile_monte_carlo** | **double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7) | [optional]
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000) | [optional]
 **period_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **portfolio_goal** | **bool**| portfolio_goal | [optional] [default to false]
 **risk_free_alpha** | **double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **risk_free_sharpe** | **double**| risk free val sharpe- (statId: 49, default: 0) | [optional]
 **risk_free_sortino** | **double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **risk_free_treynor** | **double**| risk free val treynor- (statId: 51, default: 0) | [optional]
 **start_date** | **\DateTime**| start date | [optional] [default to null]
 **stat** | **string**| A stat type - /statistics | [optional]
 **var_conf_interval** | **double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**object**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getHouseholdClientPerformanceUsingGet**
> object getHouseholdClientPerformanceUsingGet($household_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval)

Household Performance

Get information on the performance of a Household using IRR (Internal Rate of Return). You must provide the unique household_id.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\PerformanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$household_id = "household_id_example"; // string | Household Id -/household
$active_premium_period = "active_premium_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$annualized_return_period = "annualized_return_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$benchmark_id = "benchmark_id_example"; // string | Client Benchmark or Tenant Benchmark id -/benchmark
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$hist_factor = 1.2; // double | Histogram factor- (statId: 39, default: 5)
$mar_down_side_deviation = 1.2; // double | minimum acceptable return for downside deviation - (statId: 58, default: 0)
$max_percentile_monte_carlo = 1.2; // double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
$mean_percentile_monte_carlo = 1.2; // double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
$min_percentile_monte_carlo = 1.2; // double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
$moving_average_n_day = 56; // int | number of days for moving average n-day - (statId: 18, default: 7)
$n_day_returns = 56; // int | number of days for Rolling n-day returns - (statId: 2, default: 7)
$n_path_monte_carlo = 56; // int | number of points for a simulation- (statId: 62, default: 100)
$n_rolling_max_drawdown = 56; // int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
$n_rolling_volatility = 56; // int | number of days for Rolling n-day volatility- (statId: 34, default: 7)
$num_sim_monte_carlo = 56; // int | number of simulations - (statId: 62, default: 1000)
$period_type = "period_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
$risk_free_alpha = 1.2; // double | risk free val alpha - (statId: 52, default: 0)
$risk_free_sharpe = 1.2; // double | risk free val sharpe- (statId: 49, default: 0)
$risk_free_sortino = 1.2; // double | risk free val sortino - (statId: 56, default: 0)
$risk_free_treynor = 1.2; // double | risk free val treynor- (statId: 51, default: 0)
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date
$stat = "stat_example"; // string | A stat type -- /statistics
$var_conf_interval = 1.2; // double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)

try {
    $result = $apiInstance->getHouseholdClientPerformanceUsingGet($household_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PerformanceApi->getHouseholdClientPerformanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**string**](../Model/.md)| Household Id -/household |
 **active_premium_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualized_return_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmark_id** | [**string**](../Model/.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional]
 **end_date** | **\DateTime**| end date | [optional]
 **hist_factor** | **double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **mar_down_side_deviation** | **double**| minimum acceptable return for downside deviation - (statId: 58, default: 0) | [optional]
 **max_percentile_monte_carlo** | **double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **mean_percentile_monte_carlo** | **double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **min_percentile_monte_carlo** | **double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7) | [optional]
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000) | [optional]
 **period_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **risk_free_alpha** | **double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **risk_free_sharpe** | **double**| risk free val sharpe- (statId: 49, default: 0) | [optional]
 **risk_free_sortino** | **double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **risk_free_treynor** | **double**| risk free val treynor- (statId: 51, default: 0) | [optional]
 **start_date** | **\DateTime**| start date | [optional]
 **stat** | **string**| A stat type -- /statistics | [optional]
 **var_conf_interval** | **double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**object**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getModelPerformanceUsingGet**
> object getModelPerformanceUsingGet($model_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval)

Model Performance

Get information on the performance of a model using TWR (Time Weighted Return). You must provide the unique model_id.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\PerformanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$model_id = "model_id_example"; // string | Model Id - /model
$active_premium_period = "active_premium_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$annualized_return_period = "annualized_return_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$benchmark_id = "benchmark_id_example"; // string | Tenant Benchmark Id -/benchmark
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$hist_factor = 1.2; // double | Histogram factor- (statId: 39, default: 5)
$mar_down_side_deviation = 1.2; // double | minimum acceptable return for downside deviation - (statId: 58, default: 0)
$max_percentile_monte_carlo = 1.2; // double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
$mean_percentile_monte_carlo = 1.2; // double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
$min_percentile_monte_carlo = 1.2; // double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
$moving_average_n_day = 56; // int | number of days for moving average n-day - (statId: 18, default: 7)
$n_day_returns = 56; // int | number of days for Rolling n-day returns - (statId: 2, default: 7)
$n_path_monte_carlo = 56; // int | number of points for a simulation- (statId: 62, default: 100)
$n_rolling_max_drawdown = 56; // int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
$n_rolling_volatility = 56; // int | number of days for Rolling n-day volatility- (statId: 34, default: 7)
$num_sim_monte_carlo = 56; // int | number of simulations - (statId: 62, default: 1000)
$period_type = "period_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
$risk_free_alpha = 1.2; // double | risk free val alpha - (statId: 52, default: 0)
$risk_free_sharpe = 1.2; // double | risk free val sharpe- (statId: 49, default: 0)
$risk_free_sortino = 1.2; // double | risk free val sortino - (statId: 56, default: 0)
$risk_free_treynor = 1.2; // double | risk free val treynor- (statId: 51, default: 0)
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date
$stat = "stat_example"; // string | Stat Type
$var_conf_interval = 1.2; // double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)

try {
    $result = $apiInstance->getModelPerformanceUsingGet($model_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PerformanceApi->getModelPerformanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_id** | [**string**](../Model/.md)| Model Id - /model |
 **active_premium_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualized_return_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmark_id** | [**string**](../Model/.md)| Tenant Benchmark Id -/benchmark | [optional]
 **end_date** | **\DateTime**| end date | [optional]
 **hist_factor** | **double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **mar_down_side_deviation** | **double**| minimum acceptable return for downside deviation - (statId: 58, default: 0) | [optional]
 **max_percentile_monte_carlo** | **double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **mean_percentile_monte_carlo** | **double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **min_percentile_monte_carlo** | **double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7) | [optional]
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000) | [optional]
 **period_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **risk_free_alpha** | **double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **risk_free_sharpe** | **double**| risk free val sharpe- (statId: 49, default: 0) | [optional]
 **risk_free_sortino** | **double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **risk_free_treynor** | **double**| risk free val treynor- (statId: 51, default: 0) | [optional]
 **start_date** | **\DateTime**| start date | [optional]
 **stat** | **string**| Stat Type | [optional]
 **var_conf_interval** | **double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**object**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPortfolioPerformanceUsingGet**
> object getPortfolioPerformanceUsingGet($portfolio_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval)

Portfolio Performance

Get information on the performance of a portfolio using IRR (Internal Rate of Return). You must provide the unique portfolio_id.

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\PerformanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$portfolio_id = "portfolio_id_example"; // string | Portfolio Id -/portoflio
$active_premium_period = "active_premium_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$annualized_return_period = "annualized_return_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$benchmark_id = "benchmark_id_example"; // string | Benchmark Id - benchmarkId or clientBenchmarkId -/benchmark
$end_date = new \DateTime("2013-10-20"); // \DateTime | end date
$hist_factor = 1.2; // double | Histogram factor- (statId: 39, default: 5)
$mar_down_side_deviation = 1.2; // double | minimum acceptable return for downside deviation - (statId: 58, default: 0)
$max_percentile_monte_carlo = 1.2; // double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
$mean_percentile_monte_carlo = 1.2; // double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
$min_percentile_monte_carlo = 1.2; // double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
$moving_average_n_day = 56; // int | number of days for moving average n-day - (statId: 18, default: 7)
$n_day_returns = 56; // int | number of days for Rolling n-day returns - (statId: 2, default: 7)
$n_path_monte_carlo = 56; // int | number of points for a simulation- (statId: 62, default: 100)
$n_rolling_max_drawdown = 56; // int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
$n_rolling_volatility = 56; // int | number of days for Rolling n-day volatility- (statId: 34, default: 7)
$num_sim_monte_carlo = 56; // int | number of simulations - (statId: 62, default: 1000)
$period_type = "period_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
$risk_free_alpha = 1.2; // double | risk free val alpha - (statId: 52, default: 0)
$risk_free_sharpe = 1.2; // double | risk free val sharpe- (statId: 49, default: 0)
$risk_free_sortino = 1.2; // double | risk free val sortino - (statId: 56, default: 0)
$risk_free_treynor = 1.2; // double | risk free val treynor- (statId: 51, default: 0)
$start_date = new \DateTime("2013-10-20"); // \DateTime | start date
$stat = "stat_example"; // string | A stat type - /statistics endpoint to get types
$var_conf_interval = 1.2; // double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)

try {
    $result = $apiInstance->getPortfolioPerformanceUsingGet($portfolio_id, $active_premium_period, $annualized_return_period, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $var_conf_interval);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PerformanceApi->getPortfolioPerformanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**string**](../Model/.md)| Portfolio Id -/portoflio |
 **active_premium_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualized_return_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmark_id** | [**string**](../Model/.md)| Benchmark Id - benchmarkId or clientBenchmarkId -/benchmark | [optional]
 **end_date** | **\DateTime**| end date | [optional]
 **hist_factor** | **double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **mar_down_side_deviation** | **double**| minimum acceptable return for downside deviation - (statId: 58, default: 0) | [optional]
 **max_percentile_monte_carlo** | **double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **mean_percentile_monte_carlo** | **double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **min_percentile_monte_carlo** | **double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7) | [optional]
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000) | [optional]
 **period_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **risk_free_alpha** | **double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **risk_free_sharpe** | **double**| risk free val sharpe- (statId: 49, default: 0) | [optional]
 **risk_free_sortino** | **double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **risk_free_treynor** | **double**| risk free val treynor- (statId: 51, default: 0) | [optional]
 **start_date** | **\DateTime**| start date | [optional]
 **stat** | **string**| A stat type - /statistics endpoint to get types | [optional]
 **var_conf_interval** | **double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**object**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSecurityPerformanceUsingGet**
> object getSecurityPerformanceUsingGet($security_id, $active_premium_period, $annualized_return_period, $bench_ticker, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $ticker, $var_conf_interval)

Security Performance

Get performance statistics for a security using TWR (Time Weighted Return). You must provide the unique security_id

### Example
```php
<?php
require_once('../vendor/autoload.php');
try {
// Use one of the below method to generate oauth token
// 1) Generate Token for client credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
            ->createClientCredential("MYCLIENTID",
             "MYCLIENTSECRET");
// 2) Generate Token for password credentials
$config =
        \com\hydrogen\nucleus\AuthApiClient::
        getDefaultConfiguration()->createPasswordCredential("MYCLIENTID","MYCLIENTSECRET"
                      ,"MYUSERNAME", "MYPASSWORD");
// 3) Generate Token for client_token
$config = \com\hydrogen\nucleus\AuthApiClient::getDefaultConfiguration()
                ->createClientTokenCredential("MYCLIENTID","MYCLIENTSECRET", "CLIENT_TOKEN");
} catch (\com\hydrogen\nucleus\ApiException $e) {
    print_r($e);
}
$apiInstance = new com\hydrogen\nucleus\Api\PerformanceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$security_id = "security_id_example"; // string | security_id
$active_premium_period = "active_premium_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$annualized_return_period = "annualized_return_period_example"; // string | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
$bench_ticker = "bench_ticker_example"; // string | Bench Ticker for security - (default: ^GSPC)
$benchmark_id = "benchmark_id_example"; // string | benchmark_id
$end_date = new \DateTime("2013-10-20"); // \DateTime | Ending parameter for time window
$hist_factor = 1.2; // double | Histogram factor- (statId: 39, default: 5)
$mar_down_side_deviation = 1.2; // double | minimum acceptable return for downside deviation - (statId: 58, default: 0)
$max_percentile_monte_carlo = 1.2; // double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
$mean_percentile_monte_carlo = 1.2; // double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
$min_percentile_monte_carlo = 1.2; // double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
$moving_average_n_day = 56; // int | number of days for moving average n-day - (statId: 18, default: 7)
$n_day_returns = 56; // int | number of days for Rolling n-day returns - (statId: 2, default: 7)
$n_path_monte_carlo = 56; // int | number of points for a simulation- (statId: 62, default: 100)
$n_rolling_max_drawdown = 56; // int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
$n_rolling_volatility = 56; // int | number of days for Rolling n-day volatility- (statId: 34, default: 7)
$num_sim_monte_carlo = 56; // int | number of simulations - (statId: 62, default: 1000)
$period_type = "period_type_example"; // string | Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
$risk_free_alpha = 1.2; // double | risk free val alpha - (statId: 52, default: 0)
$risk_free_sharpe = 1.2; // double | risk free val sharpe- (statId: 49, default: 0)
$risk_free_sortino = 1.2; // double | risk free val sortino - (statId: 56, default: 0)
$risk_free_treynor = 1.2; // double | risk free val treynor- (statId: 51, default: 0)
$start_date = new \DateTime("2013-10-20"); // \DateTime | Starting parameter for time window
$stat = "stat_example"; // string | A stat type - /statistics endpoint
$ticker = "ticker_example"; // string | Ticker for security
$var_conf_interval = 1.2; // double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)

try {
    $result = $apiInstance->getSecurityPerformanceUsingGet($security_id, $active_premium_period, $annualized_return_period, $bench_ticker, $benchmark_id, $end_date, $hist_factor, $mar_down_side_deviation, $max_percentile_monte_carlo, $mean_percentile_monte_carlo, $min_percentile_monte_carlo, $moving_average_n_day, $n_day_returns, $n_path_monte_carlo, $n_rolling_max_drawdown, $n_rolling_volatility, $num_sim_monte_carlo, $period_type, $risk_free_alpha, $risk_free_sharpe, $risk_free_sortino, $risk_free_treynor, $start_date, $stat, $ticker, $var_conf_interval);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PerformanceApi->getSecurityPerformanceUsingGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_id** | [**string**](../Model/.md)| security_id |
 **active_premium_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualized_return_period** | **string**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **bench_ticker** | **string**| Bench Ticker for security - (default: ^GSPC) | [optional]
 **benchmark_id** | [**string**](../Model/.md)| benchmark_id | [optional]
 **end_date** | **\DateTime**| Ending parameter for time window | [optional]
 **hist_factor** | **double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **mar_down_side_deviation** | **double**| minimum acceptable return for downside deviation - (statId: 58, default: 0) | [optional]
 **max_percentile_monte_carlo** | **double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **mean_percentile_monte_carlo** | **double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **min_percentile_monte_carlo** | **double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7) | [optional]
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000) | [optional]
 **period_type** | **string**| Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **risk_free_alpha** | **double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **risk_free_sharpe** | **double**| risk free val sharpe- (statId: 49, default: 0) | [optional]
 **risk_free_sortino** | **double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **risk_free_treynor** | **double**| risk free val treynor- (statId: 51, default: 0) | [optional]
 **start_date** | **\DateTime**| Starting parameter for time window | [optional]
 **stat** | **string**| A stat type - /statistics endpoint | [optional]
 **ticker** | **string**| Ticker for security | [optional]
 **var_conf_interval** | **double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**object**

### Authorization

[oauth2](../../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

