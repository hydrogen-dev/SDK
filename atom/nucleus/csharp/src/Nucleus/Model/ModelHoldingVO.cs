/* 
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
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
using SwaggerDateConverter = Nucleus.Client.SwaggerDateConverter;

namespace Nucleus.ModelEntity
{
    /// <summary>
    /// ModelHoldingVO
    /// </summary>
    [DataContract]
    public partial class ModelHoldingVO :  IEquatable<ModelHoldingVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelHoldingVO" /> class.
        /// </summary>
        /// <param name="currentWeight">currentWeight.</param>
        /// <param name="date">date.</param>
        /// <param name="securityId">securityId.</param>
        /// <param name="strategicWeight">strategicWeight.</param>
        public ModelHoldingVO(double? currentWeight = default(double?), DateTime? date = default(DateTime?), Guid? securityId = default(Guid?), double? strategicWeight = default(double?))
        {
            this.CurrentWeight = currentWeight;
            this.Date = date;
            this.SecurityId = securityId;
            this.StrategicWeight = strategicWeight;
        }
        
        /// <summary>
        /// Gets or Sets CurrentWeight
        /// </summary>
        [DataMember(Name="current_weight", EmitDefaultValue=false)]
        public double? CurrentWeight { get; set; }

        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name="date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? Date { get; set; }

        /// <summary>
        /// Gets or Sets SecurityId
        /// </summary>
        [DataMember(Name="security_id", EmitDefaultValue=false)]
        public Guid? SecurityId { get; set; }

        /// <summary>
        /// Gets or Sets StrategicWeight
        /// </summary>
        [DataMember(Name="strategic_weight", EmitDefaultValue=false)]
        public double? StrategicWeight { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ModelHoldingVO {\n");
            sb.Append("  CurrentWeight: ").Append(CurrentWeight).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  SecurityId: ").Append(SecurityId).Append("\n");
            sb.Append("  StrategicWeight: ").Append(StrategicWeight).Append("\n");
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
            return this.Equals(input as ModelHoldingVO);
        }

        /// <summary>
        /// Returns true if ModelHoldingVO instances are equal
        /// </summary>
        /// <param name="input">Instance of ModelHoldingVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ModelHoldingVO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CurrentWeight == input.CurrentWeight ||
                    (this.CurrentWeight != null &&
                    this.CurrentWeight.Equals(input.CurrentWeight))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.SecurityId == input.SecurityId ||
                    (this.SecurityId != null &&
                    this.SecurityId.Equals(input.SecurityId))
                ) && 
                (
                    this.StrategicWeight == input.StrategicWeight ||
                    (this.StrategicWeight != null &&
                    this.StrategicWeight.Equals(input.StrategicWeight))
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
                if (this.CurrentWeight != null)
                    hashCode = hashCode * 59 + this.CurrentWeight.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.SecurityId != null)
                    hashCode = hashCode * 59 + this.SecurityId.GetHashCode();
                if (this.StrategicWeight != null)
                    hashCode = hashCode * 59 + this.StrategicWeight.GetHashCode();
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
