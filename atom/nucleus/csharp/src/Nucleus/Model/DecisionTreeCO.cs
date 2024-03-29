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
    /// DecisionTreeCO
    /// </summary>
    [DataContract]
    public partial class DecisionTreeCO :  IEquatable<DecisionTreeCO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DecisionTreeCO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DecisionTreeCO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DecisionTreeCO" /> class.
        /// </summary>
        /// <param name="answers">answers (required).</param>
        /// <param name="entityType">entityType (required).</param>
        public DecisionTreeCO(List<AnswerMap> answers = default(List<AnswerMap>), string entityType = default(string))
        {
            // to ensure "answers" is required (not null)
            if (answers == null)
            {
                throw new InvalidDataException("answers is a required property for DecisionTreeCO and cannot be null");
            }
            else
            {
                this.Answers = answers;
            }
            // to ensure "entityType" is required (not null)
            if (entityType == null)
            {
                throw new InvalidDataException("entityType is a required property for DecisionTreeCO and cannot be null");
            }
            else
            {
                this.EntityType = entityType;
            }
        }
        
        /// <summary>
        /// Gets or Sets Answers
        /// </summary>
        [DataMember(Name="answers", EmitDefaultValue=false)]
        public List<AnswerMap> Answers { get; set; }

        /// <summary>
        /// Gets or Sets EntityType
        /// </summary>
        [DataMember(Name="entity_type", EmitDefaultValue=false)]
        public string EntityType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DecisionTreeCO {\n");
            sb.Append("  Answers: ").Append(Answers).Append("\n");
            sb.Append("  EntityType: ").Append(EntityType).Append("\n");
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
            return this.Equals(input as DecisionTreeCO);
        }

        /// <summary>
        /// Returns true if DecisionTreeCO instances are equal
        /// </summary>
        /// <param name="input">Instance of DecisionTreeCO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DecisionTreeCO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Answers == input.Answers ||
                    this.Answers != null &&
                    this.Answers.SequenceEqual(input.Answers)
                ) && 
                (
                    this.EntityType == input.EntityType ||
                    (this.EntityType != null &&
                    this.EntityType.Equals(input.EntityType))
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
                if (this.Answers != null)
                    hashCode = hashCode * 59 + this.Answers.GetHashCode();
                if (this.EntityType != null)
                    hashCode = hashCode * 59 + this.EntityType.GetHashCode();
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
