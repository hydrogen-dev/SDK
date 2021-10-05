/* 
 * Hydrogen Integration API
 *
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.1
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
using SwaggerDateConverter = Integration.Client.SwaggerDateConverter;

namespace Integration.ModelEntity
{
    /// <summary>
    /// CardBusinessRequestCO
    /// </summary>
    [DataContract]
    public partial class CardBusinessRequestCO :  IEquatable<CardBusinessRequestCO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CardBusinessRequestCO" /> class.
        /// </summary>
        /// <param name="nucleusBusinessId">nucleusBusinessId.</param>
        public CardBusinessRequestCO(Guid? nucleusBusinessId = default(Guid?))
        {
            this.NucleusBusinessId = nucleusBusinessId;
        }
        
        /// <summary>
        /// Gets or Sets NucleusBusinessId
        /// </summary>
        [DataMember(Name="nucleus_business_id", EmitDefaultValue=false)]
        public Guid? NucleusBusinessId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CardBusinessRequestCO {\n");
            sb.Append("  NucleusBusinessId: ").Append(NucleusBusinessId).Append("\n");
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
            return this.Equals(input as CardBusinessRequestCO);
        }

        /// <summary>
        /// Returns true if CardBusinessRequestCO instances are equal
        /// </summary>
        /// <param name="input">Instance of CardBusinessRequestCO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CardBusinessRequestCO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.NucleusBusinessId == input.NucleusBusinessId ||
                    (this.NucleusBusinessId != null &&
                    this.NucleusBusinessId.Equals(input.NucleusBusinessId))
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
                if (this.NucleusBusinessId != null)
                    hashCode = hashCode * 59 + this.NucleusBusinessId.GetHashCode();
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
