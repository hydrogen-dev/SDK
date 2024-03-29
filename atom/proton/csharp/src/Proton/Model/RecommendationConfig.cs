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
    /// RecommendationConfig
    /// </summary>
    [DataContract]
    public partial class RecommendationConfig :  IEquatable<RecommendationConfig>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RecommendationConfig" /> class.
        /// </summary>
        /// <param name="horizonMax">horizonMax (default to 64).</param>
        /// <param name="depMin">depMin.</param>
        /// <param name="invMax">invMax.</param>
        /// <param name="invMin">invMin.</param>
        /// <param name="recommendedInflation">recommendedInflation (default to 0.0F).</param>
        /// <param name="horizonMin">horizonMin (default to 1).</param>
        /// <param name="recommend">recommend (default to true).</param>
        /// <param name="depMax">depMax.</param>
        public RecommendationConfig(int? horizonMax = 64, decimal? depMin = default(decimal?), decimal? invMax = default(decimal?), decimal? invMin = default(decimal?), float? recommendedInflation = 0.0F, int? horizonMin = 1, bool? recommend = true, decimal? depMax = default(decimal?))
        {
            // use default value if no "horizonMax" provided
            if (horizonMax == null)
            {
                this.HorizonMax = 64;
            }
            else
            {
                this.HorizonMax = horizonMax;
            }
            this.DepMin = depMin;
            this.InvMax = invMax;
            this.InvMin = invMin;
            // use default value if no "recommendedInflation" provided
            if (recommendedInflation == null)
            {
                this.RecommendedInflation = 0.0F;
            }
            else
            {
                this.RecommendedInflation = recommendedInflation;
            }
            // use default value if no "horizonMin" provided
            if (horizonMin == null)
            {
                this.HorizonMin = 1;
            }
            else
            {
                this.HorizonMin = horizonMin;
            }
            // use default value if no "recommend" provided
            if (recommend == null)
            {
                this.Recommend = true;
            }
            else
            {
                this.Recommend = recommend;
            }
            this.DepMax = depMax;
        }
        
        /// <summary>
        /// Gets or Sets HorizonMax
        /// </summary>
        [DataMember(Name="horizon_max", EmitDefaultValue=false)]
        public int? HorizonMax { get; set; }

        /// <summary>
        /// Gets or Sets DepMin
        /// </summary>
        [DataMember(Name="dep_min", EmitDefaultValue=false)]
        public decimal? DepMin { get; set; }

        /// <summary>
        /// Gets or Sets InvMax
        /// </summary>
        [DataMember(Name="inv_max", EmitDefaultValue=false)]
        public decimal? InvMax { get; set; }

        /// <summary>
        /// Gets or Sets InvMin
        /// </summary>
        [DataMember(Name="inv_min", EmitDefaultValue=false)]
        public decimal? InvMin { get; set; }

        /// <summary>
        /// Gets or Sets RecommendedInflation
        /// </summary>
        [DataMember(Name="recommended_inflation", EmitDefaultValue=false)]
        public float? RecommendedInflation { get; set; }

        /// <summary>
        /// Gets or Sets HorizonMin
        /// </summary>
        [DataMember(Name="horizon_min", EmitDefaultValue=false)]
        public int? HorizonMin { get; set; }

        /// <summary>
        /// Gets or Sets Recommend
        /// </summary>
        [DataMember(Name="recommend", EmitDefaultValue=false)]
        public bool? Recommend { get; set; }

        /// <summary>
        /// Gets or Sets DepMax
        /// </summary>
        [DataMember(Name="dep_max", EmitDefaultValue=false)]
        public decimal? DepMax { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RecommendationConfig {\n");
            sb.Append("  HorizonMax: ").Append(HorizonMax).Append("\n");
            sb.Append("  DepMin: ").Append(DepMin).Append("\n");
            sb.Append("  InvMax: ").Append(InvMax).Append("\n");
            sb.Append("  InvMin: ").Append(InvMin).Append("\n");
            sb.Append("  RecommendedInflation: ").Append(RecommendedInflation).Append("\n");
            sb.Append("  HorizonMin: ").Append(HorizonMin).Append("\n");
            sb.Append("  Recommend: ").Append(Recommend).Append("\n");
            sb.Append("  DepMax: ").Append(DepMax).Append("\n");
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
            return this.Equals(input as RecommendationConfig);
        }

        /// <summary>
        /// Returns true if RecommendationConfig instances are equal
        /// </summary>
        /// <param name="input">Instance of RecommendationConfig to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RecommendationConfig input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.HorizonMax == input.HorizonMax ||
                    (this.HorizonMax != null &&
                    this.HorizonMax.Equals(input.HorizonMax))
                ) && 
                (
                    this.DepMin == input.DepMin ||
                    (this.DepMin != null &&
                    this.DepMin.Equals(input.DepMin))
                ) && 
                (
                    this.InvMax == input.InvMax ||
                    (this.InvMax != null &&
                    this.InvMax.Equals(input.InvMax))
                ) && 
                (
                    this.InvMin == input.InvMin ||
                    (this.InvMin != null &&
                    this.InvMin.Equals(input.InvMin))
                ) && 
                (
                    this.RecommendedInflation == input.RecommendedInflation ||
                    (this.RecommendedInflation != null &&
                    this.RecommendedInflation.Equals(input.RecommendedInflation))
                ) && 
                (
                    this.HorizonMin == input.HorizonMin ||
                    (this.HorizonMin != null &&
                    this.HorizonMin.Equals(input.HorizonMin))
                ) && 
                (
                    this.Recommend == input.Recommend ||
                    (this.Recommend != null &&
                    this.Recommend.Equals(input.Recommend))
                ) && 
                (
                    this.DepMax == input.DepMax ||
                    (this.DepMax != null &&
                    this.DepMax.Equals(input.DepMax))
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
                if (this.HorizonMax != null)
                    hashCode = hashCode * 59 + this.HorizonMax.GetHashCode();
                if (this.DepMin != null)
                    hashCode = hashCode * 59 + this.DepMin.GetHashCode();
                if (this.InvMax != null)
                    hashCode = hashCode * 59 + this.InvMax.GetHashCode();
                if (this.InvMin != null)
                    hashCode = hashCode * 59 + this.InvMin.GetHashCode();
                if (this.RecommendedInflation != null)
                    hashCode = hashCode * 59 + this.RecommendedInflation.GetHashCode();
                if (this.HorizonMin != null)
                    hashCode = hashCode * 59 + this.HorizonMin.GetHashCode();
                if (this.Recommend != null)
                    hashCode = hashCode * 59 + this.Recommend.GetHashCode();
                if (this.DepMax != null)
                    hashCode = hashCode * 59 + this.DepMax.GetHashCode();
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
            // HorizonMax (int?) minimum
            if(this.HorizonMax < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for HorizonMax, must be a value greater than or equal to 0.", new [] { "HorizonMax" });
            }

            // DepMin (decimal?) minimum
            if(this.DepMin < (decimal?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DepMin, must be a value greater than or equal to 0.", new [] { "DepMin" });
            }

            // InvMax (decimal?) minimum
            if(this.InvMax < (decimal?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for InvMax, must be a value greater than or equal to 0.", new [] { "InvMax" });
            }

            // InvMin (decimal?) minimum
            if(this.InvMin < (decimal?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for InvMin, must be a value greater than or equal to 0.", new [] { "InvMin" });
            }

            // RecommendedInflation (float?) minimum
            if(this.RecommendedInflation < (float?)-1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RecommendedInflation, must be a value greater than or equal to -1.", new [] { "RecommendedInflation" });
            }

            // HorizonMin (int?) minimum
            if(this.HorizonMin < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for HorizonMin, must be a value greater than or equal to 0.", new [] { "HorizonMin" });
            }

            // DepMax (decimal?) minimum
            if(this.DepMax < (decimal?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DepMax, must be a value greater than or equal to 0.", new [] { "DepMax" });
            }

            yield break;
        }
    }

}
