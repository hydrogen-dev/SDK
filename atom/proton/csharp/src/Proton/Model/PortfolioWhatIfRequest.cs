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
    /// PortfolioWhatIfRequest
    /// </summary>
    [DataContract]
    public partial class PortfolioWhatIfRequest :  IEquatable<PortfolioWhatIfRequest>, IValidatableObject
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
        /// Initializes a new instance of the <see cref="PortfolioWhatIfRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PortfolioWhatIfRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PortfolioWhatIfRequest" /> class.
        /// </summary>
        /// <param name="allocationId">allocationId.</param>
        /// <param name="endDate">endDate.</param>
        /// <param name="marketDataSource">marketDataSource (default to MarketDataSourceEnum.Nucleus).</param>
        /// <param name="modelId">modelId.</param>
        /// <param name="accountId">accountId.</param>
        /// <param name="startDate">startDate.</param>
        /// <param name="currentPortfolioWeights">currentPortfolioWeights.</param>
        /// <param name="useProxyData">useProxyData (default to false).</param>
        /// <param name="alteredPortfolioWeights">alteredPortfolioWeights (required).</param>
        /// <param name="createLog">createLog (default to false).</param>
        /// <param name="currentPortfolioTickers">currentPortfolioTickers.</param>
        /// <param name="aggregationAccountId">aggregationAccountId.</param>
        /// <param name="alteredPortfolioTickers">alteredPortfolioTickers.</param>
        /// <param name="portfolioId">portfolioId.</param>
        public PortfolioWhatIfRequest(Guid? allocationId = default(Guid?), string endDate = default(string), MarketDataSourceEnum? marketDataSource = MarketDataSourceEnum.Nucleus, Guid? modelId = default(Guid?), Guid? accountId = default(Guid?), string startDate = default(string), List<float?> currentPortfolioWeights = default(List<float?>), bool? useProxyData = false, List<float?> alteredPortfolioWeights = default(List<float?>), bool? createLog = false, List<string> currentPortfolioTickers = default(List<string>), Guid? aggregationAccountId = default(Guid?), List<string> alteredPortfolioTickers = default(List<string>), Guid? portfolioId = default(Guid?))
        {
            // to ensure "alteredPortfolioWeights" is required (not null)
            if (alteredPortfolioWeights == null)
            {
                throw new InvalidDataException("alteredPortfolioWeights is a required property for PortfolioWhatIfRequest and cannot be null");
            }
            else
            {
                this.AlteredPortfolioWeights = alteredPortfolioWeights;
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
            this.CurrentPortfolioWeights = currentPortfolioWeights;
            // use default value if no "useProxyData" provided
            if (useProxyData == null)
            {
                this.UseProxyData = false;
            }
            else
            {
                this.UseProxyData = useProxyData;
            }
            // use default value if no "createLog" provided
            if (createLog == null)
            {
                this.CreateLog = false;
            }
            else
            {
                this.CreateLog = createLog;
            }
            this.CurrentPortfolioTickers = currentPortfolioTickers;
            this.AggregationAccountId = aggregationAccountId;
            this.AlteredPortfolioTickers = alteredPortfolioTickers;
            this.PortfolioId = portfolioId;
        }
        
        /// <summary>
        /// Gets or Sets AllocationId
        /// </summary>
        [DataMember(Name="allocation_id", EmitDefaultValue=false)]
        public Guid? AllocationId { get; set; }

        /// <summary>
        /// Gets or Sets EndDate
        /// </summary>
        [DataMember(Name="end_date", EmitDefaultValue=false)]
        public string EndDate { get; set; }


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
        public string StartDate { get; set; }

        /// <summary>
        /// Gets or Sets CurrentPortfolioWeights
        /// </summary>
        [DataMember(Name="current_portfolio_weights", EmitDefaultValue=false)]
        public List<float?> CurrentPortfolioWeights { get; set; }

        /// <summary>
        /// Gets or Sets UseProxyData
        /// </summary>
        [DataMember(Name="use_proxy_data", EmitDefaultValue=false)]
        public bool? UseProxyData { get; set; }

        /// <summary>
        /// Gets or Sets AlteredPortfolioWeights
        /// </summary>
        [DataMember(Name="altered_portfolio_weights", EmitDefaultValue=false)]
        public List<float?> AlteredPortfolioWeights { get; set; }

        /// <summary>
        /// Gets or Sets CreateLog
        /// </summary>
        [DataMember(Name="create_log", EmitDefaultValue=false)]
        public bool? CreateLog { get; set; }

        /// <summary>
        /// Gets or Sets CurrentPortfolioTickers
        /// </summary>
        [DataMember(Name="current_portfolio_tickers", EmitDefaultValue=false)]
        public List<string> CurrentPortfolioTickers { get; set; }

        /// <summary>
        /// Gets or Sets AggregationAccountId
        /// </summary>
        [DataMember(Name="aggregation_account_id", EmitDefaultValue=false)]
        public Guid? AggregationAccountId { get; set; }

        /// <summary>
        /// Gets or Sets AlteredPortfolioTickers
        /// </summary>
        [DataMember(Name="altered_portfolio_tickers", EmitDefaultValue=false)]
        public List<string> AlteredPortfolioTickers { get; set; }

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
            sb.Append("class PortfolioWhatIfRequest {\n");
            sb.Append("  AllocationId: ").Append(AllocationId).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  MarketDataSource: ").Append(MarketDataSource).Append("\n");
            sb.Append("  ModelId: ").Append(ModelId).Append("\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  CurrentPortfolioWeights: ").Append(CurrentPortfolioWeights).Append("\n");
            sb.Append("  UseProxyData: ").Append(UseProxyData).Append("\n");
            sb.Append("  AlteredPortfolioWeights: ").Append(AlteredPortfolioWeights).Append("\n");
            sb.Append("  CreateLog: ").Append(CreateLog).Append("\n");
            sb.Append("  CurrentPortfolioTickers: ").Append(CurrentPortfolioTickers).Append("\n");
            sb.Append("  AggregationAccountId: ").Append(AggregationAccountId).Append("\n");
            sb.Append("  AlteredPortfolioTickers: ").Append(AlteredPortfolioTickers).Append("\n");
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
            return this.Equals(input as PortfolioWhatIfRequest);
        }

        /// <summary>
        /// Returns true if PortfolioWhatIfRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of PortfolioWhatIfRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PortfolioWhatIfRequest input)
        {
            if (input == null)
                return false;

            return 
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
                    this.CurrentPortfolioWeights == input.CurrentPortfolioWeights ||
                    this.CurrentPortfolioWeights != null &&
                    this.CurrentPortfolioWeights.SequenceEqual(input.CurrentPortfolioWeights)
                ) && 
                (
                    this.UseProxyData == input.UseProxyData ||
                    (this.UseProxyData != null &&
                    this.UseProxyData.Equals(input.UseProxyData))
                ) && 
                (
                    this.AlteredPortfolioWeights == input.AlteredPortfolioWeights ||
                    this.AlteredPortfolioWeights != null &&
                    this.AlteredPortfolioWeights.SequenceEqual(input.AlteredPortfolioWeights)
                ) && 
                (
                    this.CreateLog == input.CreateLog ||
                    (this.CreateLog != null &&
                    this.CreateLog.Equals(input.CreateLog))
                ) && 
                (
                    this.CurrentPortfolioTickers == input.CurrentPortfolioTickers ||
                    this.CurrentPortfolioTickers != null &&
                    this.CurrentPortfolioTickers.SequenceEqual(input.CurrentPortfolioTickers)
                ) && 
                (
                    this.AggregationAccountId == input.AggregationAccountId ||
                    (this.AggregationAccountId != null &&
                    this.AggregationAccountId.Equals(input.AggregationAccountId))
                ) && 
                (
                    this.AlteredPortfolioTickers == input.AlteredPortfolioTickers ||
                    this.AlteredPortfolioTickers != null &&
                    this.AlteredPortfolioTickers.SequenceEqual(input.AlteredPortfolioTickers)
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
                if (this.CurrentPortfolioWeights != null)
                    hashCode = hashCode * 59 + this.CurrentPortfolioWeights.GetHashCode();
                if (this.UseProxyData != null)
                    hashCode = hashCode * 59 + this.UseProxyData.GetHashCode();
                if (this.AlteredPortfolioWeights != null)
                    hashCode = hashCode * 59 + this.AlteredPortfolioWeights.GetHashCode();
                if (this.CreateLog != null)
                    hashCode = hashCode * 59 + this.CreateLog.GetHashCode();
                if (this.CurrentPortfolioTickers != null)
                    hashCode = hashCode * 59 + this.CurrentPortfolioTickers.GetHashCode();
                if (this.AggregationAccountId != null)
                    hashCode = hashCode * 59 + this.AggregationAccountId.GetHashCode();
                if (this.AlteredPortfolioTickers != null)
                    hashCode = hashCode * 59 + this.AlteredPortfolioTickers.GetHashCode();
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
            yield break;
        }
    }

}
