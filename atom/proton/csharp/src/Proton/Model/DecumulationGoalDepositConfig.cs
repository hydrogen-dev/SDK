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
    /// DecumulationGoalDepositConfig
    /// </summary>
    [DataContract]
    public partial class DecumulationGoalDepositConfig :  IEquatable<DecumulationGoalDepositConfig>, IValidatableObject
    {
        /// <summary>
        /// Defines DepEndReference
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DepEndReferenceEnum
        {
            
            /// <summary>
            /// Enum Astart for value: a_start
            /// </summary>
            [EnumMember(Value = "a_start")]
            Astart = 1,
            
            /// <summary>
            /// Enum Aend for value: a_end
            /// </summary>
            [EnumMember(Value = "a_end")]
            Aend = 2,
            
            /// <summary>
            /// Enum Dend for value: d_end
            /// </summary>
            [EnumMember(Value = "d_end")]
            Dend = 3
        }

        /// <summary>
        /// Gets or Sets DepEndReference
        /// </summary>
        [DataMember(Name="dep_end_reference", EmitDefaultValue=false)]
        public DepEndReferenceEnum? DepEndReference { get; set; }
        /// <summary>
        /// Defines DepFrequency
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DepFrequencyEnum
        {
            
            /// <summary>
            /// Enum Year for value: year
            /// </summary>
            [EnumMember(Value = "year")]
            Year = 1,
            
            /// <summary>
            /// Enum Sixmonths for value: six_months
            /// </summary>
            [EnumMember(Value = "six_months")]
            Sixmonths = 2,
            
            /// <summary>
            /// Enum Quarter for value: quarter
            /// </summary>
            [EnumMember(Value = "quarter")]
            Quarter = 3,
            
            /// <summary>
            /// Enum Month for value: month
            /// </summary>
            [EnumMember(Value = "month")]
            Month = 4,
            
            /// <summary>
            /// Enum Twoweeks for value: two_weeks
            /// </summary>
            [EnumMember(Value = "two_weeks")]
            Twoweeks = 5,
            
            /// <summary>
            /// Enum Week for value: week
            /// </summary>
            [EnumMember(Value = "week")]
            Week = 6,
            
            /// <summary>
            /// Enum Day for value: day
            /// </summary>
            [EnumMember(Value = "day")]
            Day = 7
        }

        /// <summary>
        /// Gets or Sets DepFrequency
        /// </summary>
        [DataMember(Name="dep_frequency", EmitDefaultValue=false)]
        public DepFrequencyEnum? DepFrequency { get; set; }
        /// <summary>
        /// Defines DepStartReference
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DepStartReferenceEnum
        {
            
            /// <summary>
            /// Enum Astart for value: a_start
            /// </summary>
            [EnumMember(Value = "a_start")]
            Astart = 1,
            
            /// <summary>
            /// Enum Aend for value: a_end
            /// </summary>
            [EnumMember(Value = "a_end")]
            Aend = 2,
            
            /// <summary>
            /// Enum Dend for value: d_end
            /// </summary>
            [EnumMember(Value = "d_end")]
            Dend = 3
        }

        /// <summary>
        /// Gets or Sets DepStartReference
        /// </summary>
        [DataMember(Name="dep_start_reference", EmitDefaultValue=false)]
        public DepStartReferenceEnum? DepStartReference { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="DecumulationGoalDepositConfig" /> class.
        /// </summary>
        /// <param name="depEndPeriod">depEndPeriod (default to 0).</param>
        /// <param name="depAmount">depAmount.</param>
        /// <param name="depEndReference">depEndReference (default to DepEndReferenceEnum.Aend).</param>
        /// <param name="depStartPeriod">depStartPeriod (default to 0).</param>
        /// <param name="depFrequency">depFrequency (default to DepFrequencyEnum.Year).</param>
        /// <param name="depInflation">depInflation (default to 0.0F).</param>
        /// <param name="depStartReference">depStartReference (default to DepStartReferenceEnum.Astart).</param>
        public DecumulationGoalDepositConfig(int? depEndPeriod = 0, decimal? depAmount = default(decimal?), DepEndReferenceEnum? depEndReference = DepEndReferenceEnum.Aend, int? depStartPeriod = 0, DepFrequencyEnum? depFrequency = DepFrequencyEnum.Year, float? depInflation = 0.0F, DepStartReferenceEnum? depStartReference = DepStartReferenceEnum.Astart)
        {
            // use default value if no "depEndPeriod" provided
            if (depEndPeriod == null)
            {
                this.DepEndPeriod = 0;
            }
            else
            {
                this.DepEndPeriod = depEndPeriod;
            }
            this.DepAmount = depAmount;
            // use default value if no "depEndReference" provided
            if (depEndReference == null)
            {
                this.DepEndReference = DepEndReferenceEnum.Aend;
            }
            else
            {
                this.DepEndReference = depEndReference;
            }
            // use default value if no "depStartPeriod" provided
            if (depStartPeriod == null)
            {
                this.DepStartPeriod = 0;
            }
            else
            {
                this.DepStartPeriod = depStartPeriod;
            }
            // use default value if no "depFrequency" provided
            if (depFrequency == null)
            {
                this.DepFrequency = DepFrequencyEnum.Year;
            }
            else
            {
                this.DepFrequency = depFrequency;
            }
            // use default value if no "depInflation" provided
            if (depInflation == null)
            {
                this.DepInflation = 0.0F;
            }
            else
            {
                this.DepInflation = depInflation;
            }
            // use default value if no "depStartReference" provided
            if (depStartReference == null)
            {
                this.DepStartReference = DepStartReferenceEnum.Astart;
            }
            else
            {
                this.DepStartReference = depStartReference;
            }
        }
        
        /// <summary>
        /// Gets or Sets DepEndPeriod
        /// </summary>
        [DataMember(Name="dep_end_period", EmitDefaultValue=false)]
        public int? DepEndPeriod { get; set; }

        /// <summary>
        /// Gets or Sets DepAmount
        /// </summary>
        [DataMember(Name="dep_amount", EmitDefaultValue=false)]
        public decimal? DepAmount { get; set; }


        /// <summary>
        /// Gets or Sets DepStartPeriod
        /// </summary>
        [DataMember(Name="dep_start_period", EmitDefaultValue=false)]
        public int? DepStartPeriod { get; set; }


        /// <summary>
        /// Gets or Sets DepInflation
        /// </summary>
        [DataMember(Name="dep_inflation", EmitDefaultValue=false)]
        public float? DepInflation { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DecumulationGoalDepositConfig {\n");
            sb.Append("  DepEndPeriod: ").Append(DepEndPeriod).Append("\n");
            sb.Append("  DepAmount: ").Append(DepAmount).Append("\n");
            sb.Append("  DepEndReference: ").Append(DepEndReference).Append("\n");
            sb.Append("  DepStartPeriod: ").Append(DepStartPeriod).Append("\n");
            sb.Append("  DepFrequency: ").Append(DepFrequency).Append("\n");
            sb.Append("  DepInflation: ").Append(DepInflation).Append("\n");
            sb.Append("  DepStartReference: ").Append(DepStartReference).Append("\n");
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
            return this.Equals(input as DecumulationGoalDepositConfig);
        }

        /// <summary>
        /// Returns true if DecumulationGoalDepositConfig instances are equal
        /// </summary>
        /// <param name="input">Instance of DecumulationGoalDepositConfig to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DecumulationGoalDepositConfig input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DepEndPeriod == input.DepEndPeriod ||
                    (this.DepEndPeriod != null &&
                    this.DepEndPeriod.Equals(input.DepEndPeriod))
                ) && 
                (
                    this.DepAmount == input.DepAmount ||
                    (this.DepAmount != null &&
                    this.DepAmount.Equals(input.DepAmount))
                ) && 
                (
                    this.DepEndReference == input.DepEndReference ||
                    (this.DepEndReference != null &&
                    this.DepEndReference.Equals(input.DepEndReference))
                ) && 
                (
                    this.DepStartPeriod == input.DepStartPeriod ||
                    (this.DepStartPeriod != null &&
                    this.DepStartPeriod.Equals(input.DepStartPeriod))
                ) && 
                (
                    this.DepFrequency == input.DepFrequency ||
                    (this.DepFrequency != null &&
                    this.DepFrequency.Equals(input.DepFrequency))
                ) && 
                (
                    this.DepInflation == input.DepInflation ||
                    (this.DepInflation != null &&
                    this.DepInflation.Equals(input.DepInflation))
                ) && 
                (
                    this.DepStartReference == input.DepStartReference ||
                    (this.DepStartReference != null &&
                    this.DepStartReference.Equals(input.DepStartReference))
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
                if (this.DepEndPeriod != null)
                    hashCode = hashCode * 59 + this.DepEndPeriod.GetHashCode();
                if (this.DepAmount != null)
                    hashCode = hashCode * 59 + this.DepAmount.GetHashCode();
                if (this.DepEndReference != null)
                    hashCode = hashCode * 59 + this.DepEndReference.GetHashCode();
                if (this.DepStartPeriod != null)
                    hashCode = hashCode * 59 + this.DepStartPeriod.GetHashCode();
                if (this.DepFrequency != null)
                    hashCode = hashCode * 59 + this.DepFrequency.GetHashCode();
                if (this.DepInflation != null)
                    hashCode = hashCode * 59 + this.DepInflation.GetHashCode();
                if (this.DepStartReference != null)
                    hashCode = hashCode * 59 + this.DepStartReference.GetHashCode();
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
            // DepAmount (decimal?) minimum
            if(this.DepAmount < (decimal?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DepAmount, must be a value greater than or equal to 0.", new [] { "DepAmount" });
            }

            // DepInflation (float?) minimum
            if(this.DepInflation < (float?)-1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DepInflation, must be a value greater than or equal to -1.", new [] { "DepInflation" });
            }

            yield break;
        }
    }

}
