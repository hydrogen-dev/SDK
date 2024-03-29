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
    /// ScenarioAnalysisRequest
    /// </summary>
    [DataContract]
    public partial class ScenarioAnalysisRequest :  IEquatable<ScenarioAnalysisRequest>, IValidatableObject
    {
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
        public FrequencyIntervalEnum FrequencyInterval { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ScenarioAnalysisRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ScenarioAnalysisRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ScenarioAnalysisRequest" /> class.
        /// </summary>
        /// <param name="scenario">scenario (required).</param>
        /// <param name="allocationId">allocationId.</param>
        /// <param name="endDate">endDate.</param>
        /// <param name="marketDataSource">marketDataSource (default to MarketDataSourceEnum.Nucleus).</param>
        /// <param name="modelId">modelId.</param>
        /// <param name="accountId">accountId.</param>
        /// <param name="startDate">startDate.</param>
        /// <param name="frequencyInterval">frequencyInterval (required).</param>
        /// <param name="tradingDaysPerYear">tradingDaysPerYear (default to 252).</param>
        /// <param name="useProxyData">useProxyData (default to false).</param>
        /// <param name="portfolioWeights">portfolioWeights.</param>
        /// <param name="portfolioTickers">portfolioTickers.</param>
        /// <param name="createLog">createLog (default to false).</param>
        /// <param name="aggregationAccountId">aggregationAccountId.</param>
        /// <param name="portfolioId">portfolioId.</param>
        public ScenarioAnalysisRequest(List<SensitivityFactor> scenario = default(List<SensitivityFactor>), Guid? allocationId = default(Guid?), DateTime? endDate = default(DateTime?), MarketDataSourceEnum? marketDataSource = MarketDataSourceEnum.Nucleus, Guid? modelId = default(Guid?), Guid? accountId = default(Guid?), DateTime? startDate = default(DateTime?), FrequencyIntervalEnum frequencyInterval = default(FrequencyIntervalEnum), int? tradingDaysPerYear = 252, bool? useProxyData = false, List<float?> portfolioWeights = default(List<float?>), List<string> portfolioTickers = default(List<string>), bool? createLog = false, Guid? aggregationAccountId = default(Guid?), Guid? portfolioId = default(Guid?))
        {
            // to ensure "scenario" is required (not null)
            if (scenario == null)
            {
                throw new InvalidDataException("scenario is a required property for ScenarioAnalysisRequest and cannot be null");
            }
            else
            {
                this.Scenario = scenario;
            }
            // to ensure "frequencyInterval" is required (not null)
            if (frequencyInterval == null)
            {
                throw new InvalidDataException("frequencyInterval is a required property for ScenarioAnalysisRequest and cannot be null");
            }
            else
            {
                this.FrequencyInterval = frequencyInterval;
            }
            this.AllocationId = allocationId;
            this.EndDate = endDate;
            // use default value if no "marketDataSource" provided
            if (marketDataSource == null)
            {
                this.MarketDataSource = MarketDataSourceEnum.Nucleus;
            }
            else
            {
                this.MarketDataSource = marketDataSource;
            }
            this.ModelId = modelId;
            this.AccountId = accountId;
            this.StartDate = startDate;
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
            this.PortfolioWeights = portfolioWeights;
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
            this.AggregationAccountId = aggregationAccountId;
            this.PortfolioId = portfolioId;
        }
        
        /// <summary>
        /// Gets or Sets Scenario
        /// </summary>
        [DataMember(Name="scenario", EmitDefaultValue=false)]
        public List<SensitivityFactor> Scenario { get; set; }

        /// <summary>
        /// Gets or Sets AllocationId
        /// </summary>
        [DataMember(Name="allocation_id", EmitDefaultValue=false)]
        public Guid? AllocationId { get; set; }

        /// <summary>
        /// Gets or Sets EndDate
        /// </summary>
        [DataMember(Name="end_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? EndDate { get; set; }


        /// <summary>
        /// Gets or Sets ModelId
        /// </summary>
        [DataMember(Name="model_id", EmitDefaultValue=false)]
        public Guid? ModelId { get; set; }

        /// <summary>
        /// Gets or Sets AccountId
        /// </summary>
        [DataMember(Name="account_id", EmitDefaultValue=false)]
        public Guid? AccountId { get; set; }

        /// <summary>
        /// Gets or Sets StartDate
        /// </summary>
        [DataMember(Name="start_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? StartDate { get; set; }


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
        /// Gets or Sets PortfolioWeights
        /// </summary>
        [DataMember(Name="portfolio_weights", EmitDefaultValue=false)]
        public List<float?> PortfolioWeights { get; set; }

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
        /// Gets or Sets AggregationAccountId
        /// </summary>
        [DataMember(Name="aggregation_account_id", EmitDefaultValue=false)]
        public Guid? AggregationAccountId { get; set; }

        /// <summary>
        /// Gets or Sets PortfolioId
        /// </summary>
        [DataMember(Name="portfolio_id", EmitDefaultValue=false)]
        public Guid? PortfolioId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ScenarioAnalysisRequest {\n");
            sb.Append("  Scenario: ").Append(Scenario).Append("\n");
            sb.Append("  AllocationId: ").Append(AllocationId).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  MarketDataSource: ").Append(MarketDataSource).Append("\n");
            sb.Append("  ModelId: ").Append(ModelId).Append("\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  FrequencyInterval: ").Append(FrequencyInterval).Append("\n");
            sb.Append("  TradingDaysPerYear: ").Append(TradingDaysPerYear).Append("\n");
            sb.Append("  UseProxyData: ").Append(UseProxyData).Append("\n");
            sb.Append("  PortfolioWeights: ").Append(PortfolioWeights).Append("\n");
            sb.Append("  PortfolioTickers: ").Append(PortfolioTickers).Append("\n");
            sb.Append("  CreateLog: ").Append(CreateLog).Append("\n");
            sb.Append("  AggregationAccountId: ").Append(AggregationAccountId).Append("\n");
            sb.Append("  PortfolioId: ").Append(PortfolioId).Append("\n");
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
            return this.Equals(input as ScenarioAnalysisRequest);
        }

        /// <summary>
        /// Returns true if ScenarioAnalysisRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of ScenarioAnalysisRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ScenarioAnalysisRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Scenario == input.Scenario ||
                    this.Scenario != null &&
                    this.Scenario.SequenceEqual(input.Scenario)
                ) && 
                (
                    this.AllocationId == input.AllocationId ||
                    (this.AllocationId != null &&
                    this.AllocationId.Equals(input.AllocationId))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.MarketDataSource == input.MarketDataSource ||
                    (this.MarketDataSource != null &&
                    this.MarketDataSource.Equals(input.MarketDataSource))
                ) && 
                (
                    this.ModelId == input.ModelId ||
                    (this.ModelId != null &&
                    this.ModelId.Equals(input.ModelId))
                ) && 
                (
                    this.AccountId == input.AccountId ||
                    (this.AccountId != null &&
                    this.AccountId.Equals(input.AccountId))
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.FrequencyInterval == input.FrequencyInterval ||
                    (this.FrequencyInterval != null &&
                    this.FrequencyInterval.Equals(input.FrequencyInterval))
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
                    this.PortfolioWeights == input.PortfolioWeights ||
                    this.PortfolioWeights != null &&
                    this.PortfolioWeights.SequenceEqual(input.PortfolioWeights)
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
                    this.AggregationAccountId == input.AggregationAccountId ||
                    (this.AggregationAccountId != null &&
                    this.AggregationAccountId.Equals(input.AggregationAccountId))
                ) && 
                (
                    this.PortfolioId == input.PortfolioId ||
                    (this.PortfolioId != null &&
                    this.PortfolioId.Equals(input.PortfolioId))
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
                if (this.Scenario != null)
                    hashCode = hashCode * 59 + this.Scenario.GetHashCode();
                if (this.AllocationId != null)
                    hashCode = hashCode * 59 + this.AllocationId.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                if (this.MarketDataSource != null)
                    hashCode = hashCode * 59 + this.MarketDataSource.GetHashCode();
                if (this.ModelId != null)
                    hashCode = hashCode * 59 + this.ModelId.GetHashCode();
                if (this.AccountId != null)
                    hashCode = hashCode * 59 + this.AccountId.GetHashCode();
                if (this.StartDate != null)
                    hashCode = hashCode * 59 + this.StartDate.GetHashCode();
                if (this.FrequencyInterval != null)
                    hashCode = hashCode * 59 + this.FrequencyInterval.GetHashCode();
                if (this.TradingDaysPerYear != null)
                    hashCode = hashCode * 59 + this.TradingDaysPerYear.GetHashCode();
                if (this.UseProxyData != null)
                    hashCode = hashCode * 59 + this.UseProxyData.GetHashCode();
                if (this.PortfolioWeights != null)
                    hashCode = hashCode * 59 + this.PortfolioWeights.GetHashCode();
                if (this.PortfolioTickers != null)
                    hashCode = hashCode * 59 + this.PortfolioTickers.GetHashCode();
                if (this.CreateLog != null)
                    hashCode = hashCode * 59 + this.CreateLog.GetHashCode();
                if (this.AggregationAccountId != null)
                    hashCode = hashCode * 59 + this.AggregationAccountId.GetHashCode();
                if (this.PortfolioId != null)
                    hashCode = hashCode * 59 + this.PortfolioId.GetHashCode();
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
            // TradingDaysPerYear (int?) maximum
            if(this.TradingDaysPerYear > (int?)365)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TradingDaysPerYear, must be a value less than or equal to 365.", new [] { "TradingDaysPerYear" });
            }

            // TradingDaysPerYear (int?) minimum
            if(this.TradingDaysPerYear < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TradingDaysPerYear, must be a value greater than or equal to 1.", new [] { "TradingDaysPerYear" });
            }

            yield break;
        }
    }

}
