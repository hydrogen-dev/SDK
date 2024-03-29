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
    /// MvoRequest
    /// </summary>
    [DataContract]
    public partial class MvoRequest :  IEquatable<MvoRequest>, IValidatableObject
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
        /// Defines TgtType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TgtTypeEnum
        {
            
            /// <summary>
            /// Enum Risk for value: risk
            /// </summary>
            [EnumMember(Value = "risk")]
            Risk = 1,
            
            /// <summary>
            /// Enum Return for value: return
            /// </summary>
            [EnumMember(Value = "return")]
            Return = 2
        }

        /// <summary>
        /// Gets or Sets TgtType
        /// </summary>
        [DataMember(Name="tgt_type", EmitDefaultValue=false)]
        public TgtTypeEnum? TgtType { get; set; }
        /// <summary>
        /// Defines SecTypes
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SecTypesEnum
        {
            
            /// <summary>
            /// Enum Major for value: major
            /// </summary>
            [EnumMember(Value = "major")]
            Major = 1,
            
            /// <summary>
            /// Enum Minor for value: minor
            /// </summary>
            [EnumMember(Value = "minor")]
            Minor = 2,
            
            /// <summary>
            /// Enum Cash for value: cash
            /// </summary>
            [EnumMember(Value = "cash")]
            Cash = 3
        }


        /// <summary>
        /// Gets or Sets SecTypes
        /// </summary>
        [DataMember(Name="sec_types", EmitDefaultValue=false)]
        public List<SecTypesEnum> SecTypes { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="MvoRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MvoRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MvoRequest" /> class.
        /// </summary>
        /// <param name="tickers">tickers (required).</param>
        /// <param name="wConfig">wConfig (required).</param>
        /// <param name="minAssets">minAssets (required).</param>
        /// <param name="endDate">endDate.</param>
        /// <param name="marketDataSource">marketDataSource (default to MarketDataSourceEnum.Nucleus).</param>
        /// <param name="wAssetConfig">wAssetConfig.</param>
        /// <param name="startDate">startDate.</param>
        /// <param name="tgtType">tgtType.</param>
        /// <param name="useProxyData">useProxyData (default to false).</param>
        /// <param name="tgtVal">tgtVal (default to 0.0F).</param>
        /// <param name="secTypes">secTypes (required).</param>
        public MvoRequest(List<string> tickers = default(List<string>), WConfig wConfig = default(WConfig), int? minAssets = default(int?), DateTime? endDate = default(DateTime?), MarketDataSourceEnum? marketDataSource = MarketDataSourceEnum.Nucleus, Object wAssetConfig = default(Object), DateTime? startDate = default(DateTime?), TgtTypeEnum? tgtType = default(TgtTypeEnum?), bool? useProxyData = false, float? tgtVal = 0.0F, List<SecTypesEnum> secTypes = default(List<SecTypesEnum>))
        {
            // to ensure "tickers" is required (not null)
            if (tickers == null)
            {
                throw new InvalidDataException("tickers is a required property for MvoRequest and cannot be null");
            }
            else
            {
                this.Tickers = tickers;
            }
            // to ensure "wConfig" is required (not null)
            if (wConfig == null)
            {
                throw new InvalidDataException("wConfig is a required property for MvoRequest and cannot be null");
            }
            else
            {
                this.WConfig = wConfig;
            }
            // to ensure "minAssets" is required (not null)
            if (minAssets == null)
            {
                throw new InvalidDataException("minAssets is a required property for MvoRequest and cannot be null");
            }
            else
            {
                this.MinAssets = minAssets;
            }
            // to ensure "secTypes" is required (not null)
            if (secTypes == null)
            {
                throw new InvalidDataException("secTypes is a required property for MvoRequest and cannot be null");
            }
            else
            {
                this.SecTypes = secTypes;
            }
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
            this.WAssetConfig = wAssetConfig;
            this.StartDate = startDate;
            this.TgtType = tgtType;
            // use default value if no "useProxyData" provided
            if (useProxyData == null)
            {
                this.UseProxyData = false;
            }
            else
            {
                this.UseProxyData = useProxyData;
            }
            // use default value if no "tgtVal" provided
            if (tgtVal == null)
            {
                this.TgtVal = 0.0F;
            }
            else
            {
                this.TgtVal = tgtVal;
            }
        }
        
        /// <summary>
        /// Gets or Sets Tickers
        /// </summary>
        [DataMember(Name="tickers", EmitDefaultValue=false)]
        public List<string> Tickers { get; set; }

        /// <summary>
        /// Gets or Sets WConfig
        /// </summary>
        [DataMember(Name="w_config", EmitDefaultValue=false)]
        public WConfig WConfig { get; set; }

        /// <summary>
        /// Gets or Sets MinAssets
        /// </summary>
        [DataMember(Name="min_assets", EmitDefaultValue=false)]
        public int? MinAssets { get; set; }

        /// <summary>
        /// Gets or Sets EndDate
        /// </summary>
        [DataMember(Name="end_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? EndDate { get; set; }


        /// <summary>
        /// Gets or Sets WAssetConfig
        /// </summary>
        [DataMember(Name="w_asset_config", EmitDefaultValue=false)]
        public Object WAssetConfig { get; set; }

        /// <summary>
        /// Gets or Sets StartDate
        /// </summary>
        [DataMember(Name="start_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? StartDate { get; set; }


        /// <summary>
        /// Gets or Sets UseProxyData
        /// </summary>
        [DataMember(Name="use_proxy_data", EmitDefaultValue=false)]
        public bool? UseProxyData { get; set; }

        /// <summary>
        /// Gets or Sets TgtVal
        /// </summary>
        [DataMember(Name="tgt_val", EmitDefaultValue=false)]
        public float? TgtVal { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MvoRequest {\n");
            sb.Append("  Tickers: ").Append(Tickers).Append("\n");
            sb.Append("  WConfig: ").Append(WConfig).Append("\n");
            sb.Append("  MinAssets: ").Append(MinAssets).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  MarketDataSource: ").Append(MarketDataSource).Append("\n");
            sb.Append("  WAssetConfig: ").Append(WAssetConfig).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  TgtType: ").Append(TgtType).Append("\n");
            sb.Append("  UseProxyData: ").Append(UseProxyData).Append("\n");
            sb.Append("  TgtVal: ").Append(TgtVal).Append("\n");
            sb.Append("  SecTypes: ").Append(SecTypes).Append("\n");
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
            return this.Equals(input as MvoRequest);
        }

        /// <summary>
        /// Returns true if MvoRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of MvoRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MvoRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Tickers == input.Tickers ||
                    this.Tickers != null &&
                    this.Tickers.SequenceEqual(input.Tickers)
                ) && 
                (
                    this.WConfig == input.WConfig ||
                    (this.WConfig != null &&
                    this.WConfig.Equals(input.WConfig))
                ) && 
                (
                    this.MinAssets == input.MinAssets ||
                    (this.MinAssets != null &&
                    this.MinAssets.Equals(input.MinAssets))
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
                    this.WAssetConfig == input.WAssetConfig ||
                    (this.WAssetConfig != null &&
                    this.WAssetConfig.Equals(input.WAssetConfig))
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.TgtType == input.TgtType ||
                    (this.TgtType != null &&
                    this.TgtType.Equals(input.TgtType))
                ) && 
                (
                    this.UseProxyData == input.UseProxyData ||
                    (this.UseProxyData != null &&
                    this.UseProxyData.Equals(input.UseProxyData))
                ) && 
                (
                    this.TgtVal == input.TgtVal ||
                    (this.TgtVal != null &&
                    this.TgtVal.Equals(input.TgtVal))
                ) && 
                (
                    this.SecTypes == input.SecTypes ||
                    this.SecTypes != null &&
                    this.SecTypes.SequenceEqual(input.SecTypes)
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
                if (this.Tickers != null)
                    hashCode = hashCode * 59 + this.Tickers.GetHashCode();
                if (this.WConfig != null)
                    hashCode = hashCode * 59 + this.WConfig.GetHashCode();
                if (this.MinAssets != null)
                    hashCode = hashCode * 59 + this.MinAssets.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                if (this.MarketDataSource != null)
                    hashCode = hashCode * 59 + this.MarketDataSource.GetHashCode();
                if (this.WAssetConfig != null)
                    hashCode = hashCode * 59 + this.WAssetConfig.GetHashCode();
                if (this.StartDate != null)
                    hashCode = hashCode * 59 + this.StartDate.GetHashCode();
                if (this.TgtType != null)
                    hashCode = hashCode * 59 + this.TgtType.GetHashCode();
                if (this.UseProxyData != null)
                    hashCode = hashCode * 59 + this.UseProxyData.GetHashCode();
                if (this.TgtVal != null)
                    hashCode = hashCode * 59 + this.TgtVal.GetHashCode();
                if (this.SecTypes != null)
                    hashCode = hashCode * 59 + this.SecTypes.GetHashCode();
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
            // MinAssets (int?) minimum
            if(this.MinAssets < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MinAssets, must be a value greater than or equal to 1.", new [] { "MinAssets" });
            }

            yield break;
        }
    }

}
