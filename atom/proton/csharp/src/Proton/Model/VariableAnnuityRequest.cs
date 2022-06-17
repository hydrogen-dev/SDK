/* 
 * Hydrogen Proton API
 *
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = Proton.Client.SwaggerDateConverter;

namespace Proton.ModelEntity
{
    /// <summary>
    /// VariableAnnuityRequest
    /// </summary>
    [DataContract]
    public partial class VariableAnnuityRequest :  IEquatable<VariableAnnuityRequest>, IValidatableObject
    {
        /// <summary>
        /// Defines ResultType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ResultTypeEnum
        {
            
            /// <summary>
            /// Enum Mean for value: mean
            /// </summary>
            [EnumMember(Value = "mean")]
            Mean = 1,
            
            /// <summary>
            /// Enum Median for value: median
            /// </summary>
            [EnumMember(Value = "median")]
            Median = 2,
            
            /// <summary>
            /// Enum Custom for value: custom
            /// </summary>
            [EnumMember(Value = "custom")]
            Custom = 3
        }

        /// <summary>
        /// Gets or Sets ResultType
        /// </summary>
        [DataMember(Name="result_type", EmitDefaultValue=false)]
        public ResultTypeEnum? ResultType { get; set; }
        /// <summary>
        /// Defines MarketDataSource
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum MarketDataSourceEnum
        {
            
            /// <summary>
            /// Enum Nucleus for value: nucleus
            /// </summary>
            [EnumMember(Value = "nucleus")]
            Nucleus = 1,
            
            /// <summary>
            /// Enum Integration for value: integration
            /// </summary>
            [EnumMember(Value = "integration")]
            Integration = 2
        }

        /// <summary>
        /// Gets or Sets MarketDataSource
        /// </summary>
        [DataMember(Name="market_data_source", EmitDefaultValue=false)]
        public MarketDataSourceEnum? MarketDataSource { get; set; }
        /// <summary>
        /// Defines FrequencyInterval
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum FrequencyIntervalEnum
        {
            
            /// <summary>
            /// Enum Year for value: year
            /// </summary>
            [EnumMember(Value = "year")]
            Year = 1,
            
            /// <summary>
            /// Enum Quarter for value: quarter
            /// </summary>
            [EnumMember(Value = "quarter")]
            Quarter = 2,
            
            /// <summary>
            /// Enum Month for value: month
            /// </summary>
            [EnumMember(Value = "month")]
            Month = 3,
            
            /// <summary>
            /// Enum Week for value: week
            /// </summary>
            [EnumMember(Value = "week")]
            Week = 4,
            
            /// <summary>
            /// Enum Day for value: day
            /// </summary>
            [EnumMember(Value = "day")]
            Day = 5
        }

        /// <summary>
        /// Gets or Sets FrequencyInterval
        /// </summary>
        [DataMember(Name="frequency_interval", EmitDefaultValue=false)]
        public FrequencyIntervalEnum? FrequencyInterval { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="VariableAnnuityRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected VariableAnnuityRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="VariableAnnuityRequest" /> class.
        /// </summary>
        /// <param name="p">p.</param>
        /// <param name="allocationId">allocationId.</param>
        /// <param name="decumulationHorizon">decumulationHorizon (required).</param>
        /// <param name="accumulationHorizon">accumulationHorizon (required).</param>
        /// <param name="annuitizationRate">annuitizationRate (default to 0.0F).</param>
        /// <param name="guaranteedRateBenefit">guaranteedRateBenefit.</param>
        /// <param name="modelId">modelId.</param>
        /// <param name="portfolioTickers">portfolioTickers.</param>
        /// <param name="createLog">createLog (default to false).</param>
        /// <param name="inflationRate">inflationRate (default to 0.0F).</param>
        /// <param name="aggregationAccountId">aggregationAccountId.</param>
        /// <param name="n">n (default to 1000).</param>
        /// <param name="guaranteedAccumulationBenefit">guaranteedAccumulationBenefit (default to 0.0F).</param>
        /// <param name="endDate">endDate.</param>
        /// <param name="taxRate">taxRate (default to 0.0F).</param>
        /// <param name="startDate">startDate.</param>
        /// <param name="removeOutliers">removeOutliers (default to false).</param>
        /// <param name="portfolioWeights">portfolioWeights.</param>
        /// <param name="portfolioId">portfolioId.</param>
        /// <param name="resultType">resultType (default to ResultTypeEnum.Median).</param>
        /// <param name="accountId">accountId.</param>
        /// <param name="tradingDaysPerYear">tradingDaysPerYear (default to 252).</param>
        /// <param name="useProxyData">useProxyData (default to false).</param>
        /// <param name="initialBalance">initialBalance (default to 0.0F).</param>
        /// <param name="marketDataSource">marketDataSource (default to MarketDataSourceEnum.Nucleus).</param>
        /// <param name="frequencyInterval">frequencyInterval (default to FrequencyIntervalEnum.Year).</param>
        /// <param name="depositSchedule">depositSchedule.</param>
        public VariableAnnuityRequest(decimal? p = default(decimal?), Guid? allocationId = default(Guid?), int? decumulationHorizon = default(int?), int? accumulationHorizon = default(int?), float? annuitizationRate = 0.0F, List<GuaranteedRateBenefit> guaranteedRateBenefit = default(List<GuaranteedRateBenefit>), Guid? modelId = default(Guid?), List<string> portfolioTickers = default(List<string>), bool? createLog = false, float? inflationRate = 0.0F, Guid? aggregationAccountId = default(Guid?), int? n = 1000, float? guaranteedAccumulationBenefit = 0.0F, string endDate = default(string), float? taxRate = 0.0F, string startDate = default(string), bool? removeOutliers = false, List<float?> portfolioWeights = default(List<float?>), Guid? portfolioId = default(Guid?), ResultTypeEnum? resultType = ResultTypeEnum.Median, Guid? accountId = default(Guid?), int? tradingDaysPerYear = 252, bool? useProxyData = false, float? initialBalance = 0.0F, MarketDataSourceEnum? marketDataSource = MarketDataSourceEnum.Nucleus, FrequencyIntervalEnum? frequencyInterval = FrequencyIntervalEnum.Year, AnnuityDepositSchedule depositSchedule = default(AnnuityDepositSchedule))
        {
            // to ensure "decumulationHorizon" is required (not null)
            if (decumulationHorizon == null)
            {
                throw new InvalidDataException("decumulationHorizon is a required property for VariableAnnuityRequest and cannot be null");
            }
            else
            {
                this.DecumulationHorizon = decumulationHorizon;
            }
            // to ensure "accumulationHorizon" is required (not null)
            if (accumulationHorizon == null)
            {
                throw new InvalidDataException("accumulationHorizon is a required property for VariableAnnuityRequest and cannot be null");
            }
            else
            {
                this.AccumulationHorizon = accumulationHorizon;
            }
            this.P = p;
            this.AllocationId = allocationId;
            // use default value if no "annuitizationRate" provided
            if (annuitizationRate == null)
            {
                this.AnnuitizationRate = 0.0F;
            }
            else
            {
                this.AnnuitizationRate = annuitizationRate;
            }
            this.GuaranteedRateBenefit = guaranteedRateBenefit;
            this.ModelId = modelId;
            this.PortfolioTickers = portfolioTickers;
            // use default value if no "createLog" provided
            if (createLog == null)
            {
                this.CreateLog = false;
            }
            else
            {
                this.CreateLog = createLog;
            }
            // use default value if no "inflationRate" provided
            if (inflationRate == null)
            {
                this.InflationRate = 0.0F;
            }
            else
            {
                this.InflationRate = inflationRate;
            }
            this.AggregationAccountId = aggregationAccountId;
            // use default value if no "n" provided
            if (n == null)
            {
                this.N = 1000;
            }
            else
            {
                this.N = n;
            }
            // use default value if no "guaranteedAccumulationBenefit" provided
            if (guaranteedAccumulationBenefit == null)
            {
                this.GuaranteedAccumulationBenefit = 0.0F;
            }
            else
            {
                this.GuaranteedAccumulationBenefit = guaranteedAccumulationBenefit;
            }
            this.EndDate = endDate;
            // use default value if no "taxRate" provided
            if (taxRate == null)
            {
                this.TaxRate = 0.0F;
            }
            else
            {
                this.TaxRate = taxRate;
            }
            this.StartDate = startDate;
            // use default value if no "removeOutliers" provided
            if (removeOutliers == null)
            {
                this.RemoveOutliers = false;
            }
            else
            {
                this.RemoveOutliers = removeOutliers;
            }
            this.PortfolioWeights = portfolioWeights;
            this.PortfolioId = portfolioId;
            // use default value if no "resultType" provided
            if (resultType == null)
            {
                this.ResultType = ResultTypeEnum.Median;
            }
            else
            {
                this.ResultType = resultType;
            }
            this.AccountId = accountId;
            // use default value if no "tradingDaysPerYear" provided
            if (tradingDaysPerYear == null)
            {
                this.TradingDaysPerYear = 252;
            }
            else
            {
                this.TradingDaysPerYear = tradingDaysPerYear;
            }
            // use default value if no "useProxyData" provided
            if (useProxyData == null)
            {
                this.UseProxyData = false;
            }
            else
            {
                this.UseProxyData = useProxyData;
            }
            // use default value if no "initialBalance" provided
            if (initialBalance == null)
            {
                this.InitialBalance = 0.0F;
            }
            else
            {
                this.InitialBalance = initialBalance;
            }
            // use default value if no "marketDataSource" provided
            if (marketDataSource == null)
            {
                this.MarketDataSource = MarketDataSourceEnum.Nucleus;
            }
            else
            {
                this.MarketDataSource = marketDataSource;
            }
            // use default value if no "frequencyInterval" provided
            if (frequencyInterval == null)
            {
                this.FrequencyInterval = FrequencyIntervalEnum.Year;
            }
            else
            {
                this.FrequencyInterval = frequencyInterval;
            }
            this.DepositSchedule = depositSchedule;
        }
        
        /// <summary>
        /// Gets or Sets P
        /// </summary>
        [DataMember(Name="p", EmitDefaultValue=false)]
        public decimal? P { get; set; }

        /// <summary>
        /// Gets or Sets AllocationId
        /// </summary>
        [DataMember(Name="allocation_id", EmitDefaultValue=false)]
        public Guid? AllocationId { get; set; }

        /// <summary>
        /// Gets or Sets DecumulationHorizon
        /// </summary>
        [DataMember(Name="decumulation_horizon", EmitDefaultValue=false)]
        public int? DecumulationHorizon { get; set; }

        /// <summary>
        /// Gets or Sets AccumulationHorizon
        /// </summary>
        [DataMember(Name="accumulation_horizon", EmitDefaultValue=false)]
        public int? AccumulationHorizon { get; set; }

        /// <summary>
        /// Gets or Sets AnnuitizationRate
        /// </summary>
        [DataMember(Name="annuitization_rate", EmitDefaultValue=false)]
        public float? AnnuitizationRate { get; set; }

        /// <summary>
        /// Gets or Sets GuaranteedRateBenefit
        /// </summary>
        [DataMember(Name="guaranteed_rate_benefit", EmitDefaultValue=false)]
        public List<GuaranteedRateBenefit> GuaranteedRateBenefit { get; set; }

        /// <summary>
        /// Gets or Sets ModelId
        /// </summary>
        [DataMember(Name="model_id", EmitDefaultValue=false)]
        public Guid? ModelId { get; set; }

        /// <summary>
        /// Gets or Sets PortfolioTickers
        /// </summary>
        [DataMember(Name="portfolio_tickers", EmitDefaultValue=false)]
        public List<string> PortfolioTickers { get; set; }

        /// <summary>
        /// Gets or Sets CreateLog
        /// </summary>
        [DataMember(Name="create_log", EmitDefaultValue=false)]
        public bool? CreateLog { get; set; }

        /// <summary>
        /// Gets or Sets InflationRate
        /// </summary>
        [DataMember(Name="inflation_rate", EmitDefaultValue=false)]
        public float? InflationRate { get; set; }

        /// <summary>
        /// Gets or Sets AggregationAccountId
        /// </summary>
        [DataMember(Name="aggregation_account_id", EmitDefaultValue=false)]
        public Guid? AggregationAccountId { get; set; }

        /// <summary>
        /// Gets or Sets N
        /// </summary>
        [DataMember(Name="n", EmitDefaultValue=false)]
        public int? N { get; set; }

        /// <summary>
        /// Gets or Sets GuaranteedAccumulationBenefit
        /// </summary>
        [DataMember(Name="guaranteed_accumulation_benefit", EmitDefaultValue=false)]
        public float? GuaranteedAccumulationBenefit { get; set; }

        /// <summary>
        /// Gets or Sets EndDate
        /// </summary>
        [DataMember(Name="end_date", EmitDefaultValue=false)]
        public string EndDate { get; set; }

        /// <summary>
        /// Gets or Sets TaxRate
        /// </summary>
        [DataMember(Name="tax_rate", EmitDefaultValue=false)]
        public float? TaxRate { get; set; }

        /// <summary>
        /// Gets or Sets StartDate
        /// </summary>
        [DataMember(Name="start_date", EmitDefaultValue=false)]
        public string StartDate { get; set; }

        /// <summary>
        /// Gets or Sets RemoveOutliers
        /// </summary>
        [DataMember(Name="remove_outliers", EmitDefaultValue=false)]
        public bool? RemoveOutliers { get; set; }

        /// <summary>
        /// Gets or Sets PortfolioWeights
        /// </summary>
        [DataMember(Name="portfolio_weights", EmitDefaultValue=false)]
        public List<float?> PortfolioWeights { get; set; }

        /// <summary>
        /// Gets or Sets PortfolioId
        /// </summary>
        [DataMember(Name="portfolio_id", EmitDefaultValue=false)]
        public Guid? PortfolioId { get; set; }


        /// <summary>
        /// Gets or Sets AccountId
        /// </summary>
        [DataMember(Name="account_id", EmitDefaultValue=false)]
        public Guid? AccountId { get; set; }

        /// <summary>
        /// Gets or Sets TradingDaysPerYear
        /// </summary>
        [DataMember(Name="trading_days_per_year", EmitDefaultValue=false)]
        public int? TradingDaysPerYear { get; set; }

        /// <summary>
        /// Gets or Sets UseProxyData
        /// </summary>
        [DataMember(Name="use_proxy_data", EmitDefaultValue=false)]
        public bool? UseProxyData { get; set; }

        /// <summary>
        /// Gets or Sets InitialBalance
        /// </summary>
        [DataMember(Name="initial_balance", EmitDefaultValue=false)]
        public float? InitialBalance { get; set; }



        /// <summary>
        /// Gets or Sets DepositSchedule
        /// </summary>
        [DataMember(Name="deposit_schedule", EmitDefaultValue=false)]
        public AnnuityDepositSchedule DepositSchedule { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VariableAnnuityRequest {\n");
            sb.Append("  P: ").Append(P).Append("\n");
            sb.Append("  AllocationId: ").Append(AllocationId).Append("\n");
            sb.Append("  DecumulationHorizon: ").Append(DecumulationHorizon).Append("\n");
            sb.Append("  AccumulationHorizon: ").Append(AccumulationHorizon).Append("\n");
            sb.Append("  AnnuitizationRate: ").Append(AnnuitizationRate).Append("\n");
            sb.Append("  GuaranteedRateBenefit: ").Append(GuaranteedRateBenefit).Append("\n");
            sb.Append("  ModelId: ").Append(ModelId).Append("\n");
            sb.Append("  PortfolioTickers: ").Append(PortfolioTickers).Append("\n");
            sb.Append("  CreateLog: ").Append(CreateLog).Append("\n");
            sb.Append("  InflationRate: ").Append(InflationRate).Append("\n");
            sb.Append("  AggregationAccountId: ").Append(AggregationAccountId).Append("\n");
            sb.Append("  N: ").Append(N).Append("\n");
            sb.Append("  GuaranteedAccumulationBenefit: ").Append(GuaranteedAccumulationBenefit).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  TaxRate: ").Append(TaxRate).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  RemoveOutliers: ").Append(RemoveOutliers).Append("\n");
            sb.Append("  PortfolioWeights: ").Append(PortfolioWeights).Append("\n");
            sb.Append("  PortfolioId: ").Append(PortfolioId).Append("\n");
            sb.Append("  ResultType: ").Append(ResultType).Append("\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  TradingDaysPerYear: ").Append(TradingDaysPerYear).Append("\n");
            sb.Append("  UseProxyData: ").Append(UseProxyData).Append("\n");
            sb.Append("  InitialBalance: ").Append(InitialBalance).Append("\n");
            sb.Append("  MarketDataSource: ").Append(MarketDataSource).Append("\n");
            sb.Append("  FrequencyInterval: ").Append(FrequencyInterval).Append("\n");
            sb.Append("  DepositSchedule: ").Append(DepositSchedule).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as VariableAnnuityRequest);
        }

        /// <summary>
        /// Returns true if VariableAnnuityRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of VariableAnnuityRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VariableAnnuityRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.P == input.P ||
                    (this.P != null &&
                    this.P.Equals(input.P))
                ) && 
                (
                    this.AllocationId == input.AllocationId ||
                    (this.AllocationId != null &&
                    this.AllocationId.Equals(input.AllocationId))
                ) && 
                (
                    this.DecumulationHorizon == input.DecumulationHorizon ||
                    (this.DecumulationHorizon != null &&
                    this.DecumulationHorizon.Equals(input.DecumulationHorizon))
                ) && 
                (
                    this.AccumulationHorizon == input.AccumulationHorizon ||
                    (this.AccumulationHorizon != null &&
                    this.AccumulationHorizon.Equals(input.AccumulationHorizon))
                ) && 
                (
                    this.AnnuitizationRate == input.AnnuitizationRate ||
                    (this.AnnuitizationRate != null &&
                    this.AnnuitizationRate.Equals(input.AnnuitizationRate))
                ) && 
                (
                    this.GuaranteedRateBenefit == input.GuaranteedRateBenefit ||
                    this.GuaranteedRateBenefit != null &&
                    this.GuaranteedRateBenefit.SequenceEqual(input.GuaranteedRateBenefit)
                ) && 
                (
                    this.ModelId == input.ModelId ||
                    (this.ModelId != null &&
                    this.ModelId.Equals(input.ModelId))
                ) && 
                (
                    this.PortfolioTickers == input.PortfolioTickers ||
                    this.PortfolioTickers != null &&
                    this.PortfolioTickers.SequenceEqual(input.PortfolioTickers)
                ) && 
                (
                    this.CreateLog == input.CreateLog ||
                    (this.CreateLog != null &&
                    this.CreateLog.Equals(input.CreateLog))
                ) && 
                (
                    this.InflationRate == input.InflationRate ||
                    (this.InflationRate != null &&
                    this.InflationRate.Equals(input.InflationRate))
                ) && 
                (
                    this.AggregationAccountId == input.AggregationAccountId ||
                    (this.AggregationAccountId != null &&
                    this.AggregationAccountId.Equals(input.AggregationAccountId))
                ) && 
                (
                    this.N == input.N ||
                    (this.N != null &&
                    this.N.Equals(input.N))
                ) && 
                (
                    this.GuaranteedAccumulationBenefit == input.GuaranteedAccumulationBenefit ||
                    (this.GuaranteedAccumulationBenefit != null &&
                    this.GuaranteedAccumulationBenefit.Equals(input.GuaranteedAccumulationBenefit))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.TaxRate == input.TaxRate ||
                    (this.TaxRate != null &&
                    this.TaxRate.Equals(input.TaxRate))
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.RemoveOutliers == input.RemoveOutliers ||
                    (this.RemoveOutliers != null &&
                    this.RemoveOutliers.Equals(input.RemoveOutliers))
                ) && 
                (
                    this.PortfolioWeights == input.PortfolioWeights ||
                    this.PortfolioWeights != null &&
                    this.PortfolioWeights.SequenceEqual(input.PortfolioWeights)
                ) && 
                (
                    this.PortfolioId == input.PortfolioId ||
                    (this.PortfolioId != null &&
                    this.PortfolioId.Equals(input.PortfolioId))
                ) && 
                (
                    this.ResultType == input.ResultType ||
                    (this.ResultType != null &&
                    this.ResultType.Equals(input.ResultType))
                ) && 
                (
                    this.AccountId == input.AccountId ||
                    (this.AccountId != null &&
                    this.AccountId.Equals(input.AccountId))
                ) && 
                (
                    this.TradingDaysPerYear == input.TradingDaysPerYear ||
                    (this.TradingDaysPerYear != null &&
                    this.TradingDaysPerYear.Equals(input.TradingDaysPerYear))
                ) && 
                (
                    this.UseProxyData == input.UseProxyData ||
                    (this.UseProxyData != null &&
                    this.UseProxyData.Equals(input.UseProxyData))
                ) && 
                (
                    this.InitialBalance == input.InitialBalance ||
                    (this.InitialBalance != null &&
                    this.InitialBalance.Equals(input.InitialBalance))
                ) && 
                (
                    this.MarketDataSource == input.MarketDataSource ||
                    (this.MarketDataSource != null &&
                    this.MarketDataSource.Equals(input.MarketDataSource))
                ) && 
                (
                    this.FrequencyInterval == input.FrequencyInterval ||
                    (this.FrequencyInterval != null &&
                    this.FrequencyInterval.Equals(input.FrequencyInterval))
                ) && 
                (
                    this.DepositSchedule == input.DepositSchedule ||
                    (this.DepositSchedule != null &&
                    this.DepositSchedule.Equals(input.DepositSchedule))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.P != null)
                    hashCode = hashCode * 59 + this.P.GetHashCode();
                if (this.AllocationId != null)
                    hashCode = hashCode * 59 + this.AllocationId.GetHashCode();
                if (this.DecumulationHorizon != null)
                    hashCode = hashCode * 59 + this.DecumulationHorizon.GetHashCode();
                if (this.AccumulationHorizon != null)
                    hashCode = hashCode * 59 + this.AccumulationHorizon.GetHashCode();
                if (this.AnnuitizationRate != null)
                    hashCode = hashCode * 59 + this.AnnuitizationRate.GetHashCode();
                if (this.GuaranteedRateBenefit != null)
                    hashCode = hashCode * 59 + this.GuaranteedRateBenefit.GetHashCode();
                if (this.ModelId != null)
                    hashCode = hashCode * 59 + this.ModelId.GetHashCode();
                if (this.PortfolioTickers != null)
                    hashCode = hashCode * 59 + this.PortfolioTickers.GetHashCode();
                if (this.CreateLog != null)
                    hashCode = hashCode * 59 + this.CreateLog.GetHashCode();
                if (this.InflationRate != null)
                    hashCode = hashCode * 59 + this.InflationRate.GetHashCode();
                if (this.AggregationAccountId != null)
                    hashCode = hashCode * 59 + this.AggregationAccountId.GetHashCode();
                if (this.N != null)
                    hashCode = hashCode * 59 + this.N.GetHashCode();
                if (this.GuaranteedAccumulationBenefit != null)
                    hashCode = hashCode * 59 + this.GuaranteedAccumulationBenefit.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                if (this.TaxRate != null)
                    hashCode = hashCode * 59 + this.TaxRate.GetHashCode();
                if (this.StartDate != null)
                    hashCode = hashCode * 59 + this.StartDate.GetHashCode();
                if (this.RemoveOutliers != null)
                    hashCode = hashCode * 59 + this.RemoveOutliers.GetHashCode();
                if (this.PortfolioWeights != null)
                    hashCode = hashCode * 59 + this.PortfolioWeights.GetHashCode();
                if (this.PortfolioId != null)
                    hashCode = hashCode * 59 + this.PortfolioId.GetHashCode();
                if (this.ResultType != null)
                    hashCode = hashCode * 59 + this.ResultType.GetHashCode();
                if (this.AccountId != null)
                    hashCode = hashCode * 59 + this.AccountId.GetHashCode();
                if (this.TradingDaysPerYear != null)
                    hashCode = hashCode * 59 + this.TradingDaysPerYear.GetHashCode();
                if (this.UseProxyData != null)
                    hashCode = hashCode * 59 + this.UseProxyData.GetHashCode();
                if (this.InitialBalance != null)
                    hashCode = hashCode * 59 + this.InitialBalance.GetHashCode();
                if (this.MarketDataSource != null)
                    hashCode = hashCode * 59 + this.MarketDataSource.GetHashCode();
                if (this.FrequencyInterval != null)
                    hashCode = hashCode * 59 + this.FrequencyInterval.GetHashCode();
                if (this.DepositSchedule != null)
                    hashCode = hashCode * 59 + this.DepositSchedule.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // P (decimal?) maximum
            if(this.P > (decimal?)100)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for P, must be a value less than or equal to 100.", new [] { "P" });
            }

            // P (decimal?) minimum
            if(this.P < (decimal?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for P, must be a value greater than or equal to 0.", new [] { "P" });
            }

            // DecumulationHorizon (int?) minimum
            if(this.DecumulationHorizon < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DecumulationHorizon, must be a value greater than or equal to 1.", new [] { "DecumulationHorizon" });
            }

            // AccumulationHorizon (int?) minimum
            if(this.AccumulationHorizon < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AccumulationHorizon, must be a value greater than or equal to 0.", new [] { "AccumulationHorizon" });
            }

            // AnnuitizationRate (float?) minimum
            if(this.AnnuitizationRate < (float?)-1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AnnuitizationRate, must be a value greater than or equal to -1.", new [] { "AnnuitizationRate" });
            }

            // InflationRate (float?) maximum
            if(this.InflationRate > (float?)20)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for InflationRate, must be a value less than or equal to 20.", new [] { "InflationRate" });
            }

            // InflationRate (float?) minimum
            if(this.InflationRate < (float?)-1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for InflationRate, must be a value greater than or equal to -1.", new [] { "InflationRate" });
            }

            // N (int?) minimum
            if(this.N < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for N, must be a value greater than or equal to 1.", new [] { "N" });
            }

            // GuaranteedAccumulationBenefit (float?) minimum
            if(this.GuaranteedAccumulationBenefit < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for GuaranteedAccumulationBenefit, must be a value greater than or equal to 0.", new [] { "GuaranteedAccumulationBenefit" });
            }

            // TaxRate (float?) maximum
            if(this.TaxRate > (float?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TaxRate, must be a value less than or equal to 1.", new [] { "TaxRate" });
            }

            // TaxRate (float?) minimum
            if(this.TaxRate < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TaxRate, must be a value greater than or equal to 0.", new [] { "TaxRate" });
            }

            // TradingDaysPerYear (int?) minimum
            if(this.TradingDaysPerYear < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TradingDaysPerYear, must be a value greater than or equal to 1.", new [] { "TradingDaysPerYear" });
            }

            // InitialBalance (float?) minimum
            if(this.InitialBalance < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for InitialBalance, must be a value greater than or equal to 0.", new [] { "InitialBalance" });
            }

            yield break;
        }
    }

}
