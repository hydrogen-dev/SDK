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
    /// IncomeConfig
    /// </summary>
    [DataContract]
    public partial class IncomeConfig :  IEquatable<IncomeConfig>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IncomeConfig" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected IncomeConfig() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="IncomeConfig" /> class.
        /// </summary>
        /// <param name="annualNetTakeHomePay">annualNetTakeHomePay (required).</param>
        /// <param name="incomeBenefitDuration">incomeBenefitDuration (default to 10).</param>
        /// <param name="percentageOfIncomeCovered">percentageOfIncomeCovered (default to 1.0F).</param>
        public IncomeConfig(decimal? annualNetTakeHomePay = default(decimal?), int? incomeBenefitDuration = 10, float? percentageOfIncomeCovered = 1.0F)
        {
            // to ensure "annualNetTakeHomePay" is required (not null)
            if (annualNetTakeHomePay == null)
            {
                throw new InvalidDataException("annualNetTakeHomePay is a required property for IncomeConfig and cannot be null");
            }
            else
            {
                this.AnnualNetTakeHomePay = annualNetTakeHomePay;
            }
            // use default value if no "incomeBenefitDuration" provided
            if (incomeBenefitDuration == null)
            {
                this.IncomeBenefitDuration = 10;
            }
            else
            {
                this.IncomeBenefitDuration = incomeBenefitDuration;
            }
            // use default value if no "percentageOfIncomeCovered" provided
            if (percentageOfIncomeCovered == null)
            {
                this.PercentageOfIncomeCovered = 1.0F;
            }
            else
            {
                this.PercentageOfIncomeCovered = percentageOfIncomeCovered;
            }
        }
        
        /// <summary>
        /// Gets or Sets AnnualNetTakeHomePay
        /// </summary>
        [DataMember(Name="annual_net_take_home_pay", EmitDefaultValue=false)]
        public decimal? AnnualNetTakeHomePay { get; set; }

        /// <summary>
        /// Gets or Sets IncomeBenefitDuration
        /// </summary>
        [DataMember(Name="income_benefit_duration", EmitDefaultValue=false)]
        public int? IncomeBenefitDuration { get; set; }

        /// <summary>
        /// Gets or Sets PercentageOfIncomeCovered
        /// </summary>
        [DataMember(Name="percentage_of_income_covered", EmitDefaultValue=false)]
        public float? PercentageOfIncomeCovered { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IncomeConfig {\n");
            sb.Append("  AnnualNetTakeHomePay: ").Append(AnnualNetTakeHomePay).Append("\n");
            sb.Append("  IncomeBenefitDuration: ").Append(IncomeBenefitDuration).Append("\n");
            sb.Append("  PercentageOfIncomeCovered: ").Append(PercentageOfIncomeCovered).Append("\n");
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
            return this.Equals(input as IncomeConfig);
        }

        /// <summary>
        /// Returns true if IncomeConfig instances are equal
        /// </summary>
        /// <param name="input">Instance of IncomeConfig to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IncomeConfig input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AnnualNetTakeHomePay == input.AnnualNetTakeHomePay ||
                    (this.AnnualNetTakeHomePay != null &&
                    this.AnnualNetTakeHomePay.Equals(input.AnnualNetTakeHomePay))
                ) && 
                (
                    this.IncomeBenefitDuration == input.IncomeBenefitDuration ||
                    (this.IncomeBenefitDuration != null &&
                    this.IncomeBenefitDuration.Equals(input.IncomeBenefitDuration))
                ) && 
                (
                    this.PercentageOfIncomeCovered == input.PercentageOfIncomeCovered ||
                    (this.PercentageOfIncomeCovered != null &&
                    this.PercentageOfIncomeCovered.Equals(input.PercentageOfIncomeCovered))
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
                if (this.AnnualNetTakeHomePay != null)
                    hashCode = hashCode * 59 + this.AnnualNetTakeHomePay.GetHashCode();
                if (this.IncomeBenefitDuration != null)
                    hashCode = hashCode * 59 + this.IncomeBenefitDuration.GetHashCode();
                if (this.PercentageOfIncomeCovered != null)
                    hashCode = hashCode * 59 + this.PercentageOfIncomeCovered.GetHashCode();
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
            // AnnualNetTakeHomePay (decimal?) minimum
            if(this.AnnualNetTakeHomePay < (decimal?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AnnualNetTakeHomePay, must be a value greater than or equal to 0.", new [] { "AnnualNetTakeHomePay" });
            }

            // IncomeBenefitDuration (int?) minimum
            if(this.IncomeBenefitDuration < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for IncomeBenefitDuration, must be a value greater than or equal to 1.", new [] { "IncomeBenefitDuration" });
            }

            // PercentageOfIncomeCovered (float?) maximum
            if(this.PercentageOfIncomeCovered > (float?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PercentageOfIncomeCovered, must be a value less than or equal to 1.", new [] { "PercentageOfIncomeCovered" });
            }

            // PercentageOfIncomeCovered (float?) minimum
            if(this.PercentageOfIncomeCovered < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PercentageOfIncomeCovered, must be a value greater than or equal to 0.", new [] { "PercentageOfIncomeCovered" });
            }

            yield break;
        }
    }

}
