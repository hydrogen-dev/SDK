# NucleusApi::PerformanceApi

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
> Object get_account_performance_using_get(account_id, opts)

Account Performance

Get information on the performance of an account using IRR (Internal Rate of Return). You must provide the unique account_id.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::PerformanceApi.new

account_id = 'account_id_example' # String | Account Id -/account

opts = { 
  active_premium_period: 'active_premium_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  annualized_return_period: 'annualized_return_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  benchmark_id: 'benchmark_id_example', # String | Client Benchmark or Tenant Benchmark id -/benchmark
  end_date: Date.parse('2013-10-20'), # Date | end date
  hist_factor: 1.2, # Float | Histogram factor- (statId: 39, default: 5)
  mar_down_side_deviation: 1.2, # Float | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  max_percentile_monte_carlo: 1.2, # Float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  mean_percentile_monte_carlo: 1.2, # Float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  min_percentile_monte_carlo: 1.2, # Float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  moving_average_n_day: 56, # Integer | number of days for moving average n-day - (statId: 18, default: 7)
  n_day_returns: 56, # Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  n_path_monte_carlo: 56, # Integer | number of points for a simulation- (statId: 62, default: 100)
  n_rolling_max_drawdown: 56, # Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  n_rolling_volatility: 56, # Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  num_sim_monte_carlo: 56, # Integer | number of simulations - (statId: 62, default: 1000) 
  period_type: 'period_type_example', # String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  risk_free_alpha: 1.2, # Float | risk free val alpha - (statId: 52, default: 0)
  risk_free_sharpe: 1.2, # Float | risk free val sharpe- (statId: 49, default: 0) 
  risk_free_sortino: 1.2, # Float | risk free val sortino - (statId: 56, default: 0)
  risk_free_treynor: 1.2, # Float | risk free val treynor- (statId: 51, default: 0) 
  start_date: Date.parse('2013-10-20'), # Date | start date
  stat: 'stat_example', # String | A stat type - /statistics
  var_conf_interval: 1.2 # Float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
}

begin
  #Account Performance
  result = api_instance.get_account_performance_using_get(account_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PerformanceApi->get_account_performance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| Account Id -/account | 
 **active_premium_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmark_id** | [**String**](.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional] 
 **end_date** | **Date**| end date | [optional] 
 **hist_factor** | **Float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **Float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **Float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **Float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **Float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **Float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **Float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **Float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **Float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **Date**| start date | [optional] 
 **stat** | **String**| A stat type - /statistics | [optional] 
 **var_conf_interval** | **Float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_allocation_performance_using_get**
> Hash&lt;String, Object&gt; get_allocation_performance_using_get(allocation_id, opts)

Allocation Performance

Get information on the performance of an allocation using TWR (Time Weighted Return). You must provide the unique allocation_id.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::PerformanceApi.new

allocation_id = 'allocation_id_example' # String | Allocation Id -/allocation

opts = { 
  active_premium_period: 'active_premium_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  annualized_return_period: 'annualized_return_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  benchmark_id: 'benchmark_id_example', # String | Tenant Benchmark Id -/benchmark
  end_date: Date.parse('2013-10-20'), # Date | end date
  hist_factor: 1.2, # Float | Histogram factor- (statId: 39, default: 5)
  is_current_weight: true, # BOOLEAN | is_current_weight
  mar_down_side_deviation: 1.2, # Float | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  max_percentile_monte_carlo: 1.2, # Float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  mean_percentile_monte_carlo: 1.2, # Float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  min_percentile_monte_carlo: 1.2, # Float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  moving_average_n_day: 56, # Integer | number of days for moving average n-day - (statId: 18, default: 7)
  n_day_returns: 56, # Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  n_path_monte_carlo: 56, # Integer | number of points for a simulation- (statId: 62, default: 100)
  n_rolling_max_drawdown: 56, # Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  n_rolling_volatility: 56, # Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  num_sim_monte_carlo: 56, # Integer | number of simulations - (statId: 62, default: 1000) 
  period_type: 'period_type_example', # String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  risk_free_alpha: 1.2, # Float | risk free val alpha - (statId: 52, default: 0)
  risk_free_sharpe: 1.2, # Float | risk free val sharpe- (statId: 49, default: 0) 
  risk_free_sortino: 1.2, # Float | risk free val sortino - (statId: 56, default: 0)
  risk_free_treynor: 1.2, # Float | risk free val treynor- (statId: 51, default: 0) 
  start_date: Date.parse('2013-10-20'), # Date | start date
  stat: 'stat_example', # String | A stat type found under the Statistics banner
  var_conf_interval: 1.2 # Float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
}

begin
  #Allocation Performance
  result = api_instance.get_allocation_performance_using_get(allocation_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PerformanceApi->get_allocation_performance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**String**](.md)| Allocation Id -/allocation | 
 **active_premium_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmark_id** | [**String**](.md)| Tenant Benchmark Id -/benchmark | [optional] 
 **end_date** | **Date**| end date | [optional] 
 **hist_factor** | **Float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **is_current_weight** | **BOOLEAN**| is_current_weight | [optional] [default to true]
 **mar_down_side_deviation** | **Float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **Float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **Float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **Float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **Float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **Float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **Float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **Float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **Date**| start date | [optional] 
 **stat** | **String**| A stat type found under the Statistics banner | [optional] 
 **var_conf_interval** | **Float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_benchmark_performance_using_get**
> Object get_benchmark_performance_using_get(benchmark_id, opts)

Benchmark Performance

Get information on the performance of a benchmark using TWR (Time Weighted Return). You must provide the unique benchmark_id.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::PerformanceApi.new

benchmark_id = 'benchmark_id_example' # String | Benchmark Id - /benchmark

opts = { 
  active_premium_period: 'active_premium_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  annualized_return_period: 'annualized_return_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  comparison_benchmark_id: 'comparison_benchmark_id_example', # String | comparison_benchmark_id
  end_date: Date.parse('2013-10-20'), # Date | end date
  hist_factor: 1.2, # Float | Histogram factor- (statId: 39, default: 5)
  mar_down_side_deviation: 1.2, # Float | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  max_percentile_monte_carlo: 1.2, # Float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  mean_percentile_monte_carlo: 1.2, # Float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  min_percentile_monte_carlo: 1.2, # Float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  moving_average_n_day: 56, # Integer | number of days for moving average n-day - (statId: 18, default: 7)
  n_day_returns: 56, # Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  n_path_monte_carlo: 56, # Integer | number of points for a simulation- (statId: 62, default: 100)
  n_rolling_max_drawdown: 56, # Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  n_rolling_volatility: 56, # Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  num_sim_monte_carlo: 56, # Integer | number of simulations - (statId: 62, default: 1000) 
  period_type: 'period_type_example', # String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  risk_free_alpha: 1.2, # Float | risk free val alpha - (statId: 52, default: 0)
  risk_free_sharpe: 1.2, # Float | risk free val sharpe- (statId: 49, default: 0) 
  risk_free_sortino: 1.2, # Float | risk free val sortino - (statId: 56, default: 0)
  risk_free_treynor: 1.2, # Float | risk free val treynor- (statId: 51, default: 0) 
  start_date: Date.parse('2013-10-20'), # Date | start date
  stat: 'stat_example', # String | Stat type - /statistics endpoint
  var_conf_interval: 1.2 # Float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
}

begin
  #Benchmark Performance
  result = api_instance.get_benchmark_performance_using_get(benchmark_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PerformanceApi->get_benchmark_performance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_id** | [**String**](.md)| Benchmark Id - /benchmark | 
 **active_premium_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **comparison_benchmark_id** | [**String**](.md)| comparison_benchmark_id | [optional] 
 **end_date** | **Date**| end date | [optional] 
 **hist_factor** | **Float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **Float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **Float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **Float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **Float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **Float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **Float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **Float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **Float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **Date**| start date | [optional] 
 **stat** | **String**| Stat type - /statistics endpoint | [optional] 
 **var_conf_interval** | **Float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_client_performance_using_get**
> Object get_client_performance_using_get(client_id, opts)

Client Performance

Get information on the performance of a client using IRR (Internal Rate of Return). You must provide the unique client_id.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::PerformanceApi.new

client_id = 'client_id_example' # String | Client Id -/client

opts = { 
  active_premium_period: 'active_premium_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  annualized_return_period: 'annualized_return_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  benchmark_id: 'benchmark_id_example', # String | Client Benchmark or Tenant Benchmark id -/benchmark
  end_date: Date.parse('2013-10-20'), # Date | end date
  hist_factor: 1.2, # Float | Histogram factor- (statId: 39, default: 5)
  mar_down_side_deviation: 1.2, # Float | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  max_percentile_monte_carlo: 1.2, # Float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  mean_percentile_monte_carlo: 1.2, # Float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  min_percentile_monte_carlo: 1.2, # Float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  moving_average_n_day: 56, # Integer | number of days for moving average n-day - (statId: 18, default: 7)
  n_day_returns: 56, # Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  n_path_monte_carlo: 56, # Integer | number of points for a simulation- (statId: 62, default: 100)
  n_rolling_max_drawdown: 56, # Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  n_rolling_volatility: 56, # Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  num_sim_monte_carlo: 56, # Integer | number of simulations - (statId: 62, default: 1000) 
  period_type: 'period_type_example', # String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  risk_free_alpha: 1.2, # Float | risk free val alpha - (statId: 52, default: 0)
  risk_free_sharpe: 1.2, # Float | risk free val sharpe- (statId: 49, default: 0) 
  risk_free_sortino: 1.2, # Float | risk free val sortino - (statId: 56, default: 0)
  risk_free_treynor: 1.2, # Float | risk free val treynor- (statId: 51, default: 0) 
  start_date: Date.parse('2013-10-20'), # Date | start date
  stat: 'stat_example', # String | A stat type -- /statistics
  var_conf_interval: 1.2 # Float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
}

begin
  #Client Performance
  result = api_instance.get_client_performance_using_get(client_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PerformanceApi->get_client_performance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| Client Id -/client | 
 **active_premium_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmark_id** | [**String**](.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional] 
 **end_date** | **Date**| end date | [optional] 
 **hist_factor** | **Float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **Float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **Float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **Float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **Float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **Float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **Float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **Float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **Float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **Date**| start date | [optional] 
 **stat** | **String**| A stat type -- /statistics | [optional] 
 **var_conf_interval** | **Float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_goal_performance_using_get**
> Object get_goal_performance_using_get(client_id, goal_id, opts)

Goal Performance

Get information on the performance of a goal using IRR (Internal Rate of Return). You must provide the unique goal_id.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::PerformanceApi.new

client_id = 'client_id_example' # String | Client associated with the account - /client

goal_id = 'goal_id_example' # String | Goal Id - /account

opts = { 
  active_premium_period: 'active_premium_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  annualized_return_period: 'annualized_return_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  benchmark_id: 'benchmark_id_example', # String | Client Benchmark or Tenant Benchmark id -/benchmark
  end_date: Date.parse('null'), # Date | end date
  hist_factor: 1.2, # Float | Histogram factor- (statId: 39, default: 5)
  mar_down_side_deviation: 1.2, # Float | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  max_percentile_monte_carlo: 1.2, # Float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  mean_percentile_monte_carlo: 1.2, # Float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  min_percentile_monte_carlo: 1.2, # Float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  moving_average_n_day: 56, # Integer | number of days for moving average n-day - (statId: 18, default: 7)
  n_day_returns: 56, # Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  n_path_monte_carlo: 56, # Integer | number of points for a simulation- (statId: 62, default: 100)
  n_rolling_max_drawdown: 56, # Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  n_rolling_volatility: 56, # Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  num_sim_monte_carlo: 56, # Integer | number of simulations - (statId: 62, default: 1000) 
  period_type: 'period_type_example', # String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  portfolio_goal: false, # BOOLEAN | portfolio_goal
  risk_free_alpha: 1.2, # Float | risk free val alpha - (statId: 52, default: 0)
  risk_free_sharpe: 1.2, # Float | risk free val sharpe- (statId: 49, default: 0) 
  risk_free_sortino: 1.2, # Float | risk free val sortino - (statId: 56, default: 0)
  risk_free_treynor: 1.2, # Float | risk free val treynor- (statId: 51, default: 0) 
  start_date: Date.parse('null'), # Date | start date
  stat: 'stat_example', # String | A stat type - /statistics
  var_conf_interval: 1.2 # Float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
}

begin
  #Goal Performance
  result = api_instance.get_goal_performance_using_get(client_id, goal_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PerformanceApi->get_goal_performance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**String**](.md)| Client associated with the account - /client | 
 **goal_id** | [**String**](.md)| Goal Id - /account | 
 **active_premium_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmark_id** | [**String**](.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional] 
 **end_date** | **Date**| end date | [optional] [default to null]
 **hist_factor** | **Float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **Float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **Float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **Float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **Float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **portfolio_goal** | **BOOLEAN**| portfolio_goal | [optional] [default to false]
 **risk_free_alpha** | **Float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **Float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **Float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **Float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **Date**| start date | [optional] [default to null]
 **stat** | **String**| A stat type - /statistics | [optional] 
 **var_conf_interval** | **Float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_model_performance_using_get**
> Object get_model_performance_using_get(model_id, opts)

Model Performance

Get information on the performance of a model using TWR (Time Weighted Return). You must provide the unique model_id.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::PerformanceApi.new

model_id = 'model_id_example' # String | Model Id - /model

opts = { 
  active_premium_period: 'active_premium_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  annualized_return_period: 'annualized_return_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  benchmark_id: 'benchmark_id_example', # String | Tenant Benchmark Id -/benchmark
  end_date: Date.parse('2013-10-20'), # Date | end date
  hist_factor: 1.2, # Float | Histogram factor- (statId: 39, default: 5)
  mar_down_side_deviation: 1.2, # Float | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  max_percentile_monte_carlo: 1.2, # Float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  mean_percentile_monte_carlo: 1.2, # Float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  min_percentile_monte_carlo: 1.2, # Float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  moving_average_n_day: 56, # Integer | number of days for moving average n-day - (statId: 18, default: 7)
  n_day_returns: 56, # Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  n_path_monte_carlo: 56, # Integer | number of points for a simulation- (statId: 62, default: 100)
  n_rolling_max_drawdown: 56, # Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  n_rolling_volatility: 56, # Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  num_sim_monte_carlo: 56, # Integer | number of simulations - (statId: 62, default: 1000) 
  period_type: 'period_type_example', # String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  risk_free_alpha: 1.2, # Float | risk free val alpha - (statId: 52, default: 0)
  risk_free_sharpe: 1.2, # Float | risk free val sharpe- (statId: 49, default: 0) 
  risk_free_sortino: 1.2, # Float | risk free val sortino - (statId: 56, default: 0)
  risk_free_treynor: 1.2, # Float | risk free val treynor- (statId: 51, default: 0) 
  start_date: Date.parse('2013-10-20'), # Date | start date
  stat: 'stat_example', # String | Stat Type
  var_conf_interval: 1.2 # Float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
}

begin
  #Model Performance
  result = api_instance.get_model_performance_using_get(model_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PerformanceApi->get_model_performance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_id** | [**String**](.md)| Model Id - /model | 
 **active_premium_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmark_id** | [**String**](.md)| Tenant Benchmark Id -/benchmark | [optional] 
 **end_date** | **Date**| end date | [optional] 
 **hist_factor** | **Float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **Float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **Float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **Float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **Float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **Float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **Float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **Float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **Float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **Date**| start date | [optional] 
 **stat** | **String**| Stat Type | [optional] 
 **var_conf_interval** | **Float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_performance_using_get**
> Object get_portfolio_performance_using_get(account_id, client_id, portfolio_id, portfolioid, opts)

Portfolio Performance

Get information on the performance of a portfolio using IRR (Internal Rate of Return). You must provide the unique portfolio_id.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::PerformanceApi.new

account_id = 'account_id_example' # String | Account Id -/account

client_id = 'client_id_example' # String | Client Id -/client

portfolio_id = 'portfolio_id_example' # String | portfolio_id

portfolioid = 'portfolioid_example' # String | Portfolio Id -/portoflio

opts = { 
  active_premium_period: 'active_premium_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  annualized_return_period: 'annualized_return_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  benchmark_id: 'benchmark_id_example', # String | Benchmark Id - benchmarkId or clientBenchmarkId -/benchmark
  end_date: Date.parse('2013-10-20'), # Date | end date
  hist_factor: 1.2, # Float | Histogram factor- (statId: 39, default: 5)
  mar_down_side_deviation: 1.2, # Float | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  max_percentile_monte_carlo: 1.2, # Float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  mean_percentile_monte_carlo: 1.2, # Float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  min_percentile_monte_carlo: 1.2, # Float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  moving_average_n_day: 56, # Integer | number of days for moving average n-day - (statId: 18, default: 7)
  n_day_returns: 56, # Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  n_path_monte_carlo: 56, # Integer | number of points for a simulation- (statId: 62, default: 100)
  n_rolling_max_drawdown: 56, # Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  n_rolling_volatility: 56, # Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  num_sim_monte_carlo: 56, # Integer | number of simulations - (statId: 62, default: 1000) 
  period_type: 'period_type_example', # String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  risk_free_alpha: 1.2, # Float | risk free val alpha - (statId: 52, default: 0)
  risk_free_sharpe: 1.2, # Float | risk free val sharpe- (statId: 49, default: 0) 
  risk_free_sortino: 1.2, # Float | risk free val sortino - (statId: 56, default: 0)
  risk_free_treynor: 1.2, # Float | risk free val treynor- (statId: 51, default: 0) 
  start_date: Date.parse('2013-10-20'), # Date | start date
  stat: 'stat_example', # String | A stat type - /statistics endpoint to get types
  var_conf_interval: 1.2 # Float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
}

begin
  #Portfolio Performance
  result = api_instance.get_portfolio_performance_using_get(account_id, client_id, portfolio_id, portfolioid, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PerformanceApi->get_portfolio_performance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| Account Id -/account | 
 **client_id** | [**String**](.md)| Client Id -/client | 
 **portfolio_id** | [**String**](.md)| portfolio_id | 
 **portfolioid** | [**String**](.md)| Portfolio Id -/portoflio | 
 **active_premium_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmark_id** | [**String**](.md)| Benchmark Id - benchmarkId or clientBenchmarkId -/benchmark | [optional] 
 **end_date** | **Date**| end date | [optional] 
 **hist_factor** | **Float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **Float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **Float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **Float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **Float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **Float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **Float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **Float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **Float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **Date**| start date | [optional] 
 **stat** | **String**| A stat type - /statistics endpoint to get types | [optional] 
 **var_conf_interval** | **Float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_security_performance_using_get**
> Object get_security_performance_using_get(security_id, opts)

Security Performance

Get performance statistics for a security using TWR (Time Weighted Return). You must provide the unique security_id

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::PerformanceApi.new

security_id = 'security_id_example' # String | security_id

opts = { 
  active_premium_period: 'active_premium_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  annualized_return_period: 'annualized_return_period_example', # String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  bench_ticker: 'bench_ticker_example', # String | Bench Ticker for security - (default: ^GSPC) 
  benchmark_id: 'benchmark_id_example', # String | benchmark_id
  end_date: Date.parse('2013-10-20'), # Date | Ending parameter for time window
  hist_factor: 1.2, # Float | Histogram factor- (statId: 39, default: 5)
  mar_down_side_deviation: 1.2, # Float | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  max_percentile_monte_carlo: 1.2, # Float | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  mean_percentile_monte_carlo: 1.2, # Float | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  min_percentile_monte_carlo: 1.2, # Float | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  moving_average_n_day: 56, # Integer | number of days for moving average n-day - (statId: 18, default: 7)
  n_day_returns: 56, # Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  n_path_monte_carlo: 56, # Integer | number of points for a simulation- (statId: 62, default: 100)
  n_rolling_max_drawdown: 56, # Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  n_rolling_volatility: 56, # Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  num_sim_monte_carlo: 56, # Integer | number of simulations - (statId: 62, default: 1000) 
  period_type: 'period_type_example', # String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  risk_free_alpha: 1.2, # Float | risk free val alpha - (statId: 52, default: 0)
  risk_free_sharpe: 1.2, # Float | risk free val sharpe- (statId: 49, default: 0) 
  risk_free_sortino: 1.2, # Float | risk free val sortino - (statId: 56, default: 0)
  risk_free_treynor: 1.2, # Float | risk free val treynor- (statId: 51, default: 0) 
  start_date: Date.parse('2013-10-20'), # Date | Starting parameter for time window
  stat: 'stat_example', # String | A stat type - /statistics endpoint
  ticker: 'ticker_example', # String | Ticker for security
  var_conf_interval: 1.2 # Float | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
}

begin
  #Security Performance
  result = api_instance.get_security_performance_using_get(security_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling PerformanceApi->get_security_performance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_id** | [**String**](.md)| security_id | 
 **active_premium_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualized_return_period** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **bench_ticker** | **String**| Bench Ticker for security - (default: ^GSPC)  | [optional] 
 **benchmark_id** | [**String**](.md)| benchmark_id | [optional] 
 **end_date** | **Date**| Ending parameter for time window | [optional] 
 **hist_factor** | **Float**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **mar_down_side_deviation** | **Float**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **max_percentile_monte_carlo** | **Float**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **mean_percentile_monte_carlo** | **Float**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **min_percentile_monte_carlo** | **Float**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **moving_average_n_day** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **n_day_returns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **n_path_monte_carlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **n_rolling_max_drawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **n_rolling_volatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **num_sim_monte_carlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **period_type** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **risk_free_alpha** | **Float**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **risk_free_sharpe** | **Float**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **risk_free_sortino** | **Float**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **risk_free_treynor** | **Float**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **start_date** | **Date**| Starting parameter for time window | [optional] 
 **stat** | **String**| A stat type - /statistics endpoint | [optional] 
 **ticker** | **String**| Ticker for security | [optional] 
 **var_conf_interval** | **Float**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



