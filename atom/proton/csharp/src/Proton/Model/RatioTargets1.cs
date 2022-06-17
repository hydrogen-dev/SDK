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
    /// RatioTargets1
    /// </summary>
    [DataContract]
    public partial class RatioTargets1 :  IEquatable<RatioTargets1>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RatioTargets1" /> class.
        /// </summary>
        /// <param name="returnOnEquity">returnOnEquity (default to 0.15F).</param>
        /// <param name="returnOnAssets">returnOnAssets (default to 0.05F).</param>
        /// <param name="debtToEquity">debtToEquity (default to 1.5F).</param>
        /// <param name="profitMargin">profitMargin (default to 0.1F).</param>
        /// <param name="debtRatio">debtRatio (default to 0.5F).</param>
        /// <param name="assetTurnover">assetTurnover (default to 1.0F).</param>
        public RatioTargets1(float? returnOnEquity = 0.15F, float? returnOnAssets = 0.05F, float? debtToEquity = 1.5F, float? profitMargin = 0.1F, float? debtRatio = 0.5F, float? assetTurnover = 1.0F)
        {
            // use default value if no "returnOnEquity" provided
            if (returnOnEquity == null)
            {
                this.ReturnOnEquity = 0.15F;
            }
            else
            {
                this.ReturnOnEquity = returnOnEquity;
            }
            // use default value if no "returnOnAssets" provided
            if (returnOnAssets == null)
            {
                this.ReturnOnAssets = 0.05F;
            }
            else
            {
                this.ReturnOnAssets = returnOnAssets;
            }
            // use default value if no "debtToEquity" provided
            if (debtToEquity == null)
            {
                this.DebtToEquity = 1.5F;
            }
            else
            {
                this.DebtToEquity = debtToEquity;
            }
            // use default value if no "profitMargin" provided
            if (profitMargin == null)
            {
                this.ProfitMargin = 0.1F;
            }
            else
            {
                this.ProfitMargin = profitMargin;
            }
            // use default value if no "debtRatio" provided
            if (debtRatio == null)
            {
                this.DebtRatio = 0.5F;
            }
            else
            {
                this.DebtRatio = debtRatio;
            }
            // use default value if no "assetTurnover" provided
            if (assetTurnover == null)
            {
                this.AssetTurnover = 1.0F;
            }
            else
            {
                this.AssetTurnover = assetTurnover;
            }
        }
        
        /// <summary>
        /// Gets or Sets ReturnOnEquity
        /// </summary>
        [DataMember(Name="return_on_equity", EmitDefaultValue=false)]
        public float? ReturnOnEquity { get; set; }

        /// <summary>
        /// Gets or Sets ReturnOnAssets
        /// </summary>
        [DataMember(Name="return_on_assets", EmitDefaultValue=false)]
        public float? ReturnOnAssets { get; set; }

        /// <summary>
        /// Gets or Sets DebtToEquity
        /// </summary>
        [DataMember(Name="debt_to_equity", EmitDefaultValue=false)]
        public float? DebtToEquity { get; set; }

        /// <summary>
        /// Gets or Sets ProfitMargin
        /// </summary>
        [DataMember(Name="profit_margin", EmitDefaultValue=false)]
        public float? ProfitMargin { get; set; }

        /// <summary>
        /// Gets or Sets DebtRatio
        /// </summary>
        [DataMember(Name="debt_ratio", EmitDefaultValue=false)]
        public float? DebtRatio { get; set; }

        /// <summary>
        /// Gets or Sets AssetTurnover
        /// </summary>
        [DataMember(Name="asset_turnover", EmitDefaultValue=false)]
        public float? AssetTurnover { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RatioTargets1 {\n");
            sb.Append("  ReturnOnEquity: ").Append(ReturnOnEquity).Append("\n");
            sb.Append("  ReturnOnAssets: ").Append(ReturnOnAssets).Append("\n");
            sb.Append("  DebtToEquity: ").Append(DebtToEquity).Append("\n");
            sb.Append("  ProfitMargin: ").Append(ProfitMargin).Append("\n");
            sb.Append("  DebtRatio: ").Append(DebtRatio).Append("\n");
            sb.Append("  AssetTurnover: ").Append(AssetTurnover).Append("\n");
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
            return this.Equals(input as RatioTargets1);
        }

        /// <summary>
        /// Returns true if RatioTargets1 instances are equal
        /// </summary>
        /// <param name="input">Instance of RatioTargets1 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RatioTargets1 input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ReturnOnEquity == input.ReturnOnEquity ||
                    (this.ReturnOnEquity != null &&
                    this.ReturnOnEquity.Equals(input.ReturnOnEquity))
                ) && 
                (
                    this.ReturnOnAssets == input.ReturnOnAssets ||
                    (this.ReturnOnAssets != null &&
                    this.ReturnOnAssets.Equals(input.ReturnOnAssets))
                ) && 
                (
                    this.DebtToEquity == input.DebtToEquity ||
                    (this.DebtToEquity != null &&
                    this.DebtToEquity.Equals(input.DebtToEquity))
                ) && 
                (
                    this.ProfitMargin == input.ProfitMargin ||
                    (this.ProfitMargin != null &&
                    this.ProfitMargin.Equals(input.ProfitMargin))
                ) && 
                (
                    this.DebtRatio == input.DebtRatio ||
                    (this.DebtRatio != null &&
                    this.DebtRatio.Equals(input.DebtRatio))
                ) && 
                (
                    this.AssetTurnover == input.AssetTurnover ||
                    (this.AssetTurnover != null &&
                    this.AssetTurnover.Equals(input.AssetTurnover))
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
                if (this.ReturnOnEquity != null)
                    hashCode = hashCode * 59 + this.ReturnOnEquity.GetHashCode();
                if (this.ReturnOnAssets != null)
                    hashCode = hashCode * 59 + this.ReturnOnAssets.GetHashCode();
                if (this.DebtToEquity != null)
                    hashCode = hashCode * 59 + this.DebtToEquity.GetHashCode();
                if (this.ProfitMargin != null)
                    hashCode = hashCode * 59 + this.ProfitMargin.GetHashCode();
                if (this.DebtRatio != null)
                    hashCode = hashCode * 59 + this.DebtRatio.GetHashCode();
                if (this.AssetTurnover != null)
                    hashCode = hashCode * 59 + this.AssetTurnover.GetHashCode();
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
            // ReturnOnEquity (float?) minimum
            if(this.ReturnOnEquity < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ReturnOnEquity, must be a value greater than or equal to 0.", new [] { "ReturnOnEquity" });
            }

            // ReturnOnAssets (float?) minimum
            if(this.ReturnOnAssets < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ReturnOnAssets, must be a value greater than or equal to 0.", new [] { "ReturnOnAssets" });
            }

            // DebtToEquity (float?) minimum
            if(this.DebtToEquity < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DebtToEquity, must be a value greater than or equal to 0.", new [] { "DebtToEquity" });
            }

            // ProfitMargin (float?) minimum
            if(this.ProfitMargin < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ProfitMargin, must be a value greater than or equal to 0.", new [] { "ProfitMargin" });
            }

            // DebtRatio (float?) minimum
            if(this.DebtRatio < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DebtRatio, must be a value greater than or equal to 0.", new [] { "DebtRatio" });
            }

            // AssetTurnover (float?) minimum
            if(this.AssetTurnover < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AssetTurnover, must be a value greater than or equal to 0.", new [] { "AssetTurnover" });
            }

            yield break;
        }
    }

}
