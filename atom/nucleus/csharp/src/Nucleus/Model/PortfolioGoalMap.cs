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
    /// PortfolioGoalMap
    /// </summary>
    [DataContract]
    public partial class PortfolioGoalMap :  IEquatable<PortfolioGoalMap>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PortfolioGoalMap" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PortfolioGoalMap() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PortfolioGoalMap" /> class.
        /// </summary>
        /// <param name="goalId">goal_id (required).</param>
        /// <param name="weight">weight (required).</param>
        public PortfolioGoalMap(Guid? goalId = default(Guid?), double? weight = default(double?))
        {
            // to ensure "goalId" is required (not null)
            if (goalId == null)
            {
                throw new InvalidDataException("goalId is a required property for PortfolioGoalMap and cannot be null");
            }
            else
            {
                this.GoalId = goalId;
            }
            // to ensure "weight" is required (not null)
            if (weight == null)
            {
                throw new InvalidDataException("weight is a required property for PortfolioGoalMap and cannot be null");
            }
            else
            {
                this.Weight = weight;
            }
        }
        
        /// <summary>
        /// goal_id
        /// </summary>
        /// <value>goal_id</value>
        [DataMember(Name="goal_id", EmitDefaultValue=false)]
        public Guid? GoalId { get; set; }

        /// <summary>
        /// weight
        /// </summary>
        /// <value>weight</value>
        [DataMember(Name="weight", EmitDefaultValue=false)]
        public double? Weight { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PortfolioGoalMap {\n");
            sb.Append("  GoalId: ").Append(GoalId).Append("\n");
            sb.Append("  Weight: ").Append(Weight).Append("\n");
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
            return this.Equals(input as PortfolioGoalMap);
        }

        /// <summary>
        /// Returns true if PortfolioGoalMap instances are equal
        /// </summary>
        /// <param name="input">Instance of PortfolioGoalMap to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PortfolioGoalMap input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.GoalId == input.GoalId ||
                    (this.GoalId != null &&
                    this.GoalId.Equals(input.GoalId))
                ) && 
                (
                    this.Weight == input.Weight ||
                    (this.Weight != null &&
                    this.Weight.Equals(input.Weight))
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
                if (this.GoalId != null)
                    hashCode = hashCode * 59 + this.GoalId.GetHashCode();
                if (this.Weight != null)
                    hashCode = hashCode * 59 + this.Weight.GetHashCode();
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
