# atom_api.PerformanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_account_performance_using_get**](PerformanceApi.md#get_account_performance_using_get) | **GET** /account/{account_id}/performance | Account Performance
[**get_allocation_performance_using_get**](PerformanceApi.md#get_allocation_performance_using_get) | **GET** /allocation/{allocation_id}/performance | Allocation Performance
[**get_benchmark_performance_using_get**](PerformanceApi.md#get_benchmark_performance_using_get) | **GET** /benchmark/{benchmark_id}/performance | Benchmark Performance
[**get_client_performance_using_get**](PerformanceApi.md#get_client_performance_using_get) | **GET** /client/{client_id}/performance | Client Performance
[**get_goal_performance_using_get**](PerformanceApi.md#get_goal_performance_using_get) | **GET** /goal/{goal_id}/performance | Goal Performance
[**get_model_performance_using_get**](PerformanceApi.md#get_model_performance_using_get) | **GET** /model/{model_id}/performance | Model Performance
[**get_portfolio_performance_using_get**](PerformanceApi.md#get_portfolio_performance_using_get) | **GET** /portfolio/{portfolio_id}/performance | Portfolio Performance
[**get_security_performance_using_get**](PerformanceApi.md#get_security_performance_using_get) | **GET** /security/{security_id}/performance | Security Performance


# **get_account_performance_using_get**
> object get_account_performance_using_get(account_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)

Account Performance

Get information on the performance of an account using IRR (Internal Rate of Return). You must provide the unique account_id.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.PerformanceApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | Account Id -/account
active_premium_period = 'active_premium_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
annualized_return_period = 'annualized_return_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
benchmark_id = 'benchmark_id_example' # str | Client Benchmark or Tenant Benchmark id -/benchmark (optional)
end_date = '2013-10-20' # date | end date (optional)
hist_factor = 1.2 # float | Histogram factor- (statId: 39, default: 5) (optional)
mar_down_side_deviation = 1.2 # float | minimum acceptable return for downside deviation - (statId: 58, default: 0)  (optional)
max_percentile_monte_carlo = 1.2 # float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) (optional)
mean_percentile_monte_carlo = 1.2 # float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) (optional)
min_percentile_monte_carlo = 1.2 # float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) (optional)
moving_average_n_day = 56 # int | number of days for moving average n-day - (statId: 18, default: 7) (optional)
n_day_returns = 56 # int | number of days for Rolling n-day returns - (statId: 2, default: 7)   (optional)
n_path_monte_carlo = 56 # int | number of points for a simulation- (statId: 62, default: 100) (optional)
n_rolling_max_drawdown = 56 # int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7) (optional)
n_rolling_volatility = 56 # int | number of days for Rolling n-day volatility- (statId: 34, default: 7) (optional)
num_sim_monte_carlo = 56 # int | number of simulations - (statId: 62, default: 1000)  (optional)
period_type = 'period_type_example' # str |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D') (optional)
risk_free_alpha = 1.2 # float | risk free val alpha - (statId: 52, default: 0) (optional)
risk_free_sharpe = 1.2 # float | risk free val sharpe- (statId: 49, default: 0)  (optional)
risk_free_sortino = 1.2 # float | risk free val sortino - (statId: 56, default: 0) (optional)
risk_free_treynor = 1.2 # float | risk free val treynor- (statId: 51, default: 0)  (optional)
start_date = '2013-10-20' # date | start date (optional)
stat = 'stat_example' # str | A stat type - /statistics (optional)
var_conf_interval = 1.2 # float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) (optional)

try:
    # Account Performance
    api_response = api_instance.get_account_performance_using_get(account_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PerformanceApi->get_account_performance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| Account Id -/account | 
 **active_premium_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmark_id** | [**str**](.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional] 
 **end_date** | **date**| end date | [optional] 
 **hist_factor** | **float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **str**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **date**| start date | [optional] 
 **stat** | **str**| A stat type - /statistics | [optional] 
 **var_conf_interval** | **float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_allocation_performance_using_get**
> dict(str, object) get_allocation_performance_using_get(allocation_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, is_current_weight=is_current_weight, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)

Allocation Performance

Get information on the performance of an allocation using TWR (Time Weighted Return). You must provide the unique allocation_id.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.PerformanceApi(atom_api.ApiClient(configuration))
allocation_id = 'allocation_id_example' # str | Allocation Id -/allocation
active_premium_period = 'active_premium_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
annualized_return_period = 'annualized_return_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
benchmark_id = 'benchmark_id_example' # str | Tenant Benchmark Id -/benchmark (optional)
end_date = '2013-10-20' # date | end date (optional)
hist_factor = 1.2 # float | Histogram factor- (statId: 39, default: 5) (optional)
is_current_weight = true # bool | is_current_weight (optional) (default to true)
mar_down_side_deviation = 1.2 # float | minimum acceptable return for downside deviation - (statId: 58, default: 0)  (optional)
max_percentile_monte_carlo = 1.2 # float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) (optional)
mean_percentile_monte_carlo = 1.2 # float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) (optional)
min_percentile_monte_carlo = 1.2 # float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) (optional)
moving_average_n_day = 56 # int | number of days for moving average n-day - (statId: 18, default: 7) (optional)
n_day_returns = 56 # int | number of days for Rolling n-day returns - (statId: 2, default: 7)   (optional)
n_path_monte_carlo = 56 # int | number of points for a simulation- (statId: 62, default: 100) (optional)
n_rolling_max_drawdown = 56 # int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7) (optional)
n_rolling_volatility = 56 # int | number of days for Rolling n-day volatility- (statId: 34, default: 7) (optional)
num_sim_monte_carlo = 56 # int | number of simulations - (statId: 62, default: 1000)  (optional)
period_type = 'period_type_example' # str |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D') (optional)
risk_free_alpha = 1.2 # float | risk free val alpha - (statId: 52, default: 0) (optional)
risk_free_sharpe = 1.2 # float | risk free val sharpe- (statId: 49, default: 0)  (optional)
risk_free_sortino = 1.2 # float | risk free val sortino - (statId: 56, default: 0) (optional)
risk_free_treynor = 1.2 # float | risk free val treynor- (statId: 51, default: 0)  (optional)
start_date = '2013-10-20' # date | start date (optional)
stat = 'stat_example' # str | A stat type found under the Statistics banner (optional)
var_conf_interval = 1.2 # float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) (optional)

try:
    # Allocation Performance
    api_response = api_instance.get_allocation_performance_using_get(allocation_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, is_current_weight=is_current_weight, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PerformanceApi->get_allocation_performance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**str**](.md)| Allocation Id -/allocation | 
 **active_premium_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmark_id** | [**str**](.md)| Tenant Benchmark Id -/benchmark | [optional] 
 **end_date** | **date**| end date | [optional] 
 **hist_factor** | **float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **is_current_weight** | **bool**| is_current_weight | [optional] [default to true]
 **mar_down_side_deviation** | **float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **str**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **date**| start date | [optional] 
 **stat** | **str**| A stat type found under the Statistics banner | [optional] 
 **var_conf_interval** | **float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_benchmark_performance_using_get**
> object get_benchmark_performance_using_get(benchmark_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, comparison_benchmark_id=comparison_benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)

Benchmark Performance

Get information on the performance of a benchmark using TWR (Time Weighted Return). You must provide the unique benchmark_id.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.PerformanceApi(atom_api.ApiClient(configuration))
benchmark_id = 'benchmark_id_example' # str | Benchmark Id - /benchmark
active_premium_period = 'active_premium_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
annualized_return_period = 'annualized_return_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
comparison_benchmark_id = 'comparison_benchmark_id_example' # str | comparison_benchmark_id (optional)
end_date = '2013-10-20' # date | end date (optional)
hist_factor = 1.2 # float | Histogram factor- (statId: 39, default: 5) (optional)
mar_down_side_deviation = 1.2 # float | minimum acceptable return for downside deviation - (statId: 58, default: 0)  (optional)
max_percentile_monte_carlo = 1.2 # float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) (optional)
mean_percentile_monte_carlo = 1.2 # float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) (optional)
min_percentile_monte_carlo = 1.2 # float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) (optional)
moving_average_n_day = 56 # int | number of days for moving average n-day - (statId: 18, default: 7) (optional)
n_day_returns = 56 # int | number of days for Rolling n-day returns - (statId: 2, default: 7)   (optional)
n_path_monte_carlo = 56 # int | number of points for a simulation- (statId: 62, default: 100) (optional)
n_rolling_max_drawdown = 56 # int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7) (optional)
n_rolling_volatility = 56 # int | number of days for Rolling n-day volatility- (statId: 34, default: 7) (optional)
num_sim_monte_carlo = 56 # int | number of simulations - (statId: 62, default: 1000)  (optional)
period_type = 'period_type_example' # str |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D') (optional)
risk_free_alpha = 1.2 # float | risk free val alpha - (statId: 52, default: 0) (optional)
risk_free_sharpe = 1.2 # float | risk free val sharpe- (statId: 49, default: 0)  (optional)
risk_free_sortino = 1.2 # float | risk free val sortino - (statId: 56, default: 0) (optional)
risk_free_treynor = 1.2 # float | risk free val treynor- (statId: 51, default: 0)  (optional)
start_date = '2013-10-20' # date | start date (optional)
stat = 'stat_example' # str | Stat type - /statistics endpoint (optional)
var_conf_interval = 1.2 # float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) (optional)

try:
    # Benchmark Performance
    api_response = api_instance.get_benchmark_performance_using_get(benchmark_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, comparison_benchmark_id=comparison_benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PerformanceApi->get_benchmark_performance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_id** | [**str**](.md)| Benchmark Id - /benchmark | 
 **active_premium_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **comparison_benchmark_id** | [**str**](.md)| comparison_benchmark_id | [optional] 
 **end_date** | **date**| end date | [optional] 
 **hist_factor** | **float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **str**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **date**| start date | [optional] 
 **stat** | **str**| Stat type - /statistics endpoint | [optional] 
 **var_conf_interval** | **float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_performance_using_get**
> object get_client_performance_using_get(client_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)

Client Performance

Get information on the performance of a client using IRR (Internal Rate of Return). You must provide the unique client_id.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.PerformanceApi(atom_api.ApiClient(configuration))
client_id = 'client_id_example' # str | Client Id -/client
active_premium_period = 'active_premium_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
annualized_return_period = 'annualized_return_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
benchmark_id = 'benchmark_id_example' # str | Client Benchmark or Tenant Benchmark id -/benchmark (optional)
end_date = '2013-10-20' # date | end date (optional)
hist_factor = 1.2 # float | Histogram factor- (statId: 39, default: 5) (optional)
mar_down_side_deviation = 1.2 # float | minimum acceptable return for downside deviation - (statId: 58, default: 0)  (optional)
max_percentile_monte_carlo = 1.2 # float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) (optional)
mean_percentile_monte_carlo = 1.2 # float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) (optional)
min_percentile_monte_carlo = 1.2 # float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) (optional)
moving_average_n_day = 56 # int | number of days for moving average n-day - (statId: 18, default: 7) (optional)
n_day_returns = 56 # int | number of days for Rolling n-day returns - (statId: 2, default: 7)   (optional)
n_path_monte_carlo = 56 # int | number of points for a simulation- (statId: 62, default: 100) (optional)
n_rolling_max_drawdown = 56 # int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7) (optional)
n_rolling_volatility = 56 # int | number of days for Rolling n-day volatility- (statId: 34, default: 7) (optional)
num_sim_monte_carlo = 56 # int | number of simulations - (statId: 62, default: 1000)  (optional)
period_type = 'period_type_example' # str |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D') (optional)
risk_free_alpha = 1.2 # float | risk free val alpha - (statId: 52, default: 0) (optional)
risk_free_sharpe = 1.2 # float | risk free val sharpe- (statId: 49, default: 0)  (optional)
risk_free_sortino = 1.2 # float | risk free val sortino - (statId: 56, default: 0) (optional)
risk_free_treynor = 1.2 # float | risk free val treynor- (statId: 51, default: 0)  (optional)
start_date = '2013-10-20' # date | start date (optional)
stat = 'stat_example' # str | A stat type -- /statistics (optional)
var_conf_interval = 1.2 # float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) (optional)

try:
    # Client Performance
    api_response = api_instance.get_client_performance_using_get(client_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PerformanceApi->get_client_performance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| Client Id -/client | 
 **active_premium_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmark_id** | [**str**](.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional] 
 **end_date** | **date**| end date | [optional] 
 **hist_factor** | **float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **str**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **date**| start date | [optional] 
 **stat** | **str**| A stat type -- /statistics | [optional] 
 **var_conf_interval** | **float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_goal_performance_using_get**
> object get_goal_performance_using_get(client_id, goal_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, portfolio_goal=portfolio_goal, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)

Goal Performance

Get information on the performance of a goal using IRR (Internal Rate of Return). You must provide the unique goal_id.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.PerformanceApi(atom_api.ApiClient(configuration))
client_id = 'client_id_example' # str | Client associated with the account - /client
goal_id = 'goal_id_example' # str | Goal Id - /account
active_premium_period = 'active_premium_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
annualized_return_period = 'annualized_return_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
benchmark_id = 'benchmark_id_example' # str | Client Benchmark or Tenant Benchmark id -/benchmark (optional)
end_date = 'null' # date | end date (optional) (default to null)
hist_factor = 1.2 # float | Histogram factor- (statId: 39, default: 5) (optional)
mar_down_side_deviation = 1.2 # float | minimum acceptable return for downside deviation - (statId: 58, default: 0)  (optional)
max_percentile_monte_carlo = 1.2 # float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) (optional)
mean_percentile_monte_carlo = 1.2 # float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) (optional)
min_percentile_monte_carlo = 1.2 # float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) (optional)
moving_average_n_day = 56 # int | number of days for moving average n-day - (statId: 18, default: 7) (optional)
n_day_returns = 56 # int | number of days for Rolling n-day returns - (statId: 2, default: 7)   (optional)
n_path_monte_carlo = 56 # int | number of points for a simulation- (statId: 62, default: 100) (optional)
n_rolling_max_drawdown = 56 # int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7) (optional)
n_rolling_volatility = 56 # int | number of days for Rolling n-day volatility- (statId: 34, default: 7) (optional)
num_sim_monte_carlo = 56 # int | number of simulations - (statId: 62, default: 1000)  (optional)
period_type = 'period_type_example' # str |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D') (optional)
portfolio_goal = false # bool | portfolio_goal (optional) (default to false)
risk_free_alpha = 1.2 # float | risk free val alpha - (statId: 52, default: 0) (optional)
risk_free_sharpe = 1.2 # float | risk free val sharpe- (statId: 49, default: 0)  (optional)
risk_free_sortino = 1.2 # float | risk free val sortino - (statId: 56, default: 0) (optional)
risk_free_treynor = 1.2 # float | risk free val treynor- (statId: 51, default: 0)  (optional)
start_date = 'null' # date | start date (optional) (default to null)
stat = 'stat_example' # str | A stat type - /statistics (optional)
var_conf_interval = 1.2 # float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) (optional)

try:
    # Goal Performance
    api_response = api_instance.get_goal_performance_using_get(client_id, goal_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, portfolio_goal=portfolio_goal, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PerformanceApi->get_goal_performance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| Client associated with the account - /client | 
 **goal_id** | [**str**](.md)| Goal Id - /account | 
 **active_premium_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmark_id** | [**str**](.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional] 
 **end_date** | **date**| end date | [optional] [default to null]
 **hist_factor** | **float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **str**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **portfolio_goal** | **bool**| portfolio_goal | [optional] [default to false]
 **risk_free_alpha** | **float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **date**| start date | [optional] [default to null]
 **stat** | **str**| A stat type - /statistics | [optional] 
 **var_conf_interval** | **float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_model_performance_using_get**
> object get_model_performance_using_get(model_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)

Model Performance

Get information on the performance of a model using TWR (Time Weighted Return). You must provide the unique model_id.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.PerformanceApi(atom_api.ApiClient(configuration))
model_id = 'model_id_example' # str | Model Id - /model
active_premium_period = 'active_premium_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
annualized_return_period = 'annualized_return_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
benchmark_id = 'benchmark_id_example' # str | Tenant Benchmark Id -/benchmark (optional)
end_date = '2013-10-20' # date | end date (optional)
hist_factor = 1.2 # float | Histogram factor- (statId: 39, default: 5) (optional)
mar_down_side_deviation = 1.2 # float | minimum acceptable return for downside deviation - (statId: 58, default: 0)  (optional)
max_percentile_monte_carlo = 1.2 # float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) (optional)
mean_percentile_monte_carlo = 1.2 # float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) (optional)
min_percentile_monte_carlo = 1.2 # float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) (optional)
moving_average_n_day = 56 # int | number of days for moving average n-day - (statId: 18, default: 7) (optional)
n_day_returns = 56 # int | number of days for Rolling n-day returns - (statId: 2, default: 7)   (optional)
n_path_monte_carlo = 56 # int | number of points for a simulation- (statId: 62, default: 100) (optional)
n_rolling_max_drawdown = 56 # int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7) (optional)
n_rolling_volatility = 56 # int | number of days for Rolling n-day volatility- (statId: 34, default: 7) (optional)
num_sim_monte_carlo = 56 # int | number of simulations - (statId: 62, default: 1000)  (optional)
period_type = 'period_type_example' # str |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D') (optional)
risk_free_alpha = 1.2 # float | risk free val alpha - (statId: 52, default: 0) (optional)
risk_free_sharpe = 1.2 # float | risk free val sharpe- (statId: 49, default: 0)  (optional)
risk_free_sortino = 1.2 # float | risk free val sortino - (statId: 56, default: 0) (optional)
risk_free_treynor = 1.2 # float | risk free val treynor- (statId: 51, default: 0)  (optional)
start_date = '2013-10-20' # date | start date (optional)
stat = 'stat_example' # str | Stat Type (optional)
var_conf_interval = 1.2 # float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) (optional)

try:
    # Model Performance
    api_response = api_instance.get_model_performance_using_get(model_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PerformanceApi->get_model_performance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_id** | [**str**](.md)| Model Id - /model | 
 **active_premium_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmark_id** | [**str**](.md)| Tenant Benchmark Id -/benchmark | [optional] 
 **end_date** | **date**| end date | [optional] 
 **hist_factor** | **float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **str**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **date**| start date | [optional] 
 **stat** | **str**| Stat Type | [optional] 
 **var_conf_interval** | **float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_performance_using_get**
> object get_portfolio_performance_using_get(account_id, client_id, portfolio_id, portfolioid, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)

Portfolio Performance

Get information on the performance of a portfolio using IRR (Internal Rate of Return). You must provide the unique portfolio_id.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.PerformanceApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | Account Id -/account
client_id = 'client_id_example' # str | Client Id -/client
portfolio_id = 'portfolio_id_example' # str | portfolio_id
portfolioid = 'portfolioid_example' # str | Portfolio Id -/portoflio
active_premium_period = 'active_premium_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
annualized_return_period = 'annualized_return_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
benchmark_id = 'benchmark_id_example' # str | Benchmark Id - benchmarkId or clientBenchmarkId -/benchmark (optional)
end_date = '2013-10-20' # date | end date (optional)
hist_factor = 1.2 # float | Histogram factor- (statId: 39, default: 5) (optional)
mar_down_side_deviation = 1.2 # float | minimum acceptable return for downside deviation - (statId: 58, default: 0)  (optional)
max_percentile_monte_carlo = 1.2 # float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) (optional)
mean_percentile_monte_carlo = 1.2 # float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) (optional)
min_percentile_monte_carlo = 1.2 # float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) (optional)
moving_average_n_day = 56 # int | number of days for moving average n-day - (statId: 18, default: 7) (optional)
n_day_returns = 56 # int | number of days for Rolling n-day returns - (statId: 2, default: 7)   (optional)
n_path_monte_carlo = 56 # int | number of points for a simulation- (statId: 62, default: 100) (optional)
n_rolling_max_drawdown = 56 # int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7) (optional)
n_rolling_volatility = 56 # int | number of days for Rolling n-day volatility- (statId: 34, default: 7) (optional)
num_sim_monte_carlo = 56 # int | number of simulations - (statId: 62, default: 1000)  (optional)
period_type = 'period_type_example' # str |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D') (optional)
risk_free_alpha = 1.2 # float | risk free val alpha - (statId: 52, default: 0) (optional)
risk_free_sharpe = 1.2 # float | risk free val sharpe- (statId: 49, default: 0)  (optional)
risk_free_sortino = 1.2 # float | risk free val sortino - (statId: 56, default: 0) (optional)
risk_free_treynor = 1.2 # float | risk free val treynor- (statId: 51, default: 0)  (optional)
start_date = '2013-10-20' # date | start date (optional)
stat = 'stat_example' # str | A stat type - /statistics endpoint to get types (optional)
var_conf_interval = 1.2 # float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) (optional)

try:
    # Portfolio Performance
    api_response = api_instance.get_portfolio_performance_using_get(account_id, client_id, portfolio_id, portfolioid, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, var_conf_interval=var_conf_interval)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PerformanceApi->get_portfolio_performance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| Account Id -/account | 
 **client_id** | [**str**](.md)| Client Id -/client | 
 **portfolio_id** | [**str**](.md)| portfolio_id | 
 **portfolioid** | [**str**](.md)| Portfolio Id -/portoflio | 
 **active_premium_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmark_id** | [**str**](.md)| Benchmark Id - benchmarkId or clientBenchmarkId -/benchmark | [optional] 
 **end_date** | **date**| end date | [optional] 
 **hist_factor** | **float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **str**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **date**| start date | [optional] 
 **stat** | **str**| A stat type - /statistics endpoint to get types | [optional] 
 **var_conf_interval** | **float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_security_performance_using_get**
> object get_security_performance_using_get(security_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, bench_ticker=bench_ticker, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, ticker=ticker, var_conf_interval=var_conf_interval)

Security Performance

Get performance statistics for a security using TWR (Time Weighted Return). You must provide the unique security_id

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.PerformanceApi(atom_api.ApiClient(configuration))
security_id = 'security_id_example' # str | security_id
active_premium_period = 'active_premium_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
annualized_return_period = 'annualized_return_period_example' # str | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D') (optional)
bench_ticker = 'bench_ticker_example' # str | Bench Ticker for security - (default: ^GSPC)  (optional)
benchmark_id = 'benchmark_id_example' # str | benchmark_id (optional)
end_date = '2013-10-20' # date | Ending parameter for time window (optional)
hist_factor = 1.2 # float | Histogram factor- (statId: 39, default: 5) (optional)
mar_down_side_deviation = 1.2 # float | minimum acceptable return for downside deviation - (statId: 58, default: 0)  (optional)
max_percentile_monte_carlo = 1.2 # float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) (optional)
mean_percentile_monte_carlo = 1.2 # float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) (optional)
min_percentile_monte_carlo = 1.2 # float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) (optional)
moving_average_n_day = 56 # int | number of days for moving average n-day - (statId: 18, default: 7) (optional)
n_day_returns = 56 # int | number of days for Rolling n-day returns - (statId: 2, default: 7)   (optional)
n_path_monte_carlo = 56 # int | number of points for a simulation- (statId: 62, default: 100) (optional)
n_rolling_max_drawdown = 56 # int | number of days for Rolling n-day max drawdown- (statId: 46, default: 7) (optional)
n_rolling_volatility = 56 # int | number of days for Rolling n-day volatility- (statId: 34, default: 7) (optional)
num_sim_monte_carlo = 56 # int | number of simulations - (statId: 62, default: 1000)  (optional)
period_type = 'period_type_example' # str |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D') (optional)
risk_free_alpha = 1.2 # float | risk free val alpha - (statId: 52, default: 0) (optional)
risk_free_sharpe = 1.2 # float | risk free val sharpe- (statId: 49, default: 0)  (optional)
risk_free_sortino = 1.2 # float | risk free val sortino - (statId: 56, default: 0) (optional)
risk_free_treynor = 1.2 # float | risk free val treynor- (statId: 51, default: 0)  (optional)
start_date = '2013-10-20' # date | Starting parameter for time window (optional)
stat = 'stat_example' # str | A stat type - /statistics endpoint (optional)
ticker = 'ticker_example' # str | Ticker for security (optional)
var_conf_interval = 1.2 # float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) (optional)

try:
    # Security Performance
    api_response = api_instance.get_security_performance_using_get(security_id, active_premium_period=active_premium_period, annualized_return_period=annualized_return_period, bench_ticker=bench_ticker, benchmark_id=benchmark_id, end_date=end_date, hist_factor=hist_factor, mar_down_side_deviation=mar_down_side_deviation, max_percentile_monte_carlo=max_percentile_monte_carlo, mean_percentile_monte_carlo=mean_percentile_monte_carlo, min_percentile_monte_carlo=min_percentile_monte_carlo, moving_average_n_day=moving_average_n_day, n_day_returns=n_day_returns, n_path_monte_carlo=n_path_monte_carlo, n_rolling_max_drawdown=n_rolling_max_drawdown, n_rolling_volatility=n_rolling_volatility, num_sim_monte_carlo=num_sim_monte_carlo, period_type=period_type, risk_free_alpha=risk_free_alpha, risk_free_sharpe=risk_free_sharpe, risk_free_sortino=risk_free_sortino, risk_free_treynor=risk_free_treynor, start_date=start_date, stat=stat, ticker=ticker, var_conf_interval=var_conf_interval)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PerformanceApi->get_security_performance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_id** | [**str**](.md)| security_id | 
 **active_premium_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **str**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **bench_ticker** | **str**| Bench Ticker for security - (default: ^GSPC)  | [optional] 
 **benchmark_id** | [**str**](.md)| benchmark_id | [optional] 
 **end_date** | **date**| Ending parameter for time window | [optional] 
 **hist_factor** | **float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **int**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **int**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **int**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **int**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **int**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **int**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **str**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **date**| Starting parameter for time window | [optional] 
 **stat** | **str**| A stat type - /statistics endpoint | [optional] 
 **ticker** | **str**| Ticker for security | [optional] 
 **var_conf_interval** | **float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

