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
    /// Ownership Object
    /// </summary>
    [DataContract]
    public partial class Ownership :  IEquatable<Ownership>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Ownership" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Ownership() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Ownership" /> class.
        /// </summary>
        /// <param name="clientId">client_id (required).</param>
        /// <param name="isBeneficial">is_beneficial.</param>
        /// <param name="isPrimary">is_primary.</param>
        /// <param name="percentOwnership">percent_ownership.</param>
        /// <param name="role">role (required).</param>
        public Ownership(Guid? clientId = default(Guid?), bool? isBeneficial = default(bool?), bool? isPrimary = default(bool?), double? percentOwnership = default(double?), string role = default(string))
        {
            // to ensure "clientId" is required (not null)
            if (clientId == null)
            {
                throw new InvalidDataException("clientId is a required property for Ownership and cannot be null");
            }
            else
            {
                this.ClientId = clientId;
            }
            // to ensure "role" is required (not null)
            if (role == null)
            {
                throw new InvalidDataException("role is a required property for Ownership and cannot be null");
            }
            else
            {
                this.Role = role;
            }
            this.IsBeneficial = isBeneficial;
            this.IsPrimary = isPrimary;
            this.PercentOwnership = percentOwnership;
        }
        
        /// <summary>
        /// client_id
        /// </summary>
        /// <value>client_id</value>
        [DataMember(Name="client_id", EmitDefaultValue=false)]
        public Guid? ClientId { get; set; }

        /// <summary>
        /// is_beneficial
        /// </summary>
        /// <value>is_beneficial</value>
        [DataMember(Name="is_beneficial", EmitDefaultValue=false)]
        public bool? IsBeneficial { get; set; }

        /// <summary>
        /// is_primary
        /// </summary>
        /// <value>is_primary</value>
        [DataMember(Name="is_primary", EmitDefaultValue=false)]
        public bool? IsPrimary { get; set; }

        /// <summary>
        /// percent_ownership
        /// </summary>
        /// <value>percent_ownership</value>
        [DataMember(Name="percent_ownership", EmitDefaultValue=false)]
        public double? PercentOwnership { get; set; }

        /// <summary>
        /// role
        /// </summary>
        /// <value>role</value>
        [DataMember(Name="role", EmitDefaultValue=false)]
        public string Role { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Ownership {\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  IsBeneficial: ").Append(IsBeneficial).Append("\n");
            sb.Append("  IsPrimary: ").Append(IsPrimary).Append("\n");
            sb.Append("  PercentOwnership: ").Append(PercentOwnership).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
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
            return this.Equals(input as Ownership);
        }

        /// <summary>
        /// Returns true if Ownership instances are equal
        /// </summary>
        /// <param name="input">Instance of Ownership to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Ownership input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
                ) && 
                (
                    this.IsBeneficial == input.IsBeneficial ||
                    (this.IsBeneficial != null &&
                    this.IsBeneficial.Equals(input.IsBeneficial))
                ) && 
                (
                    this.IsPrimary == input.IsPrimary ||
                    (this.IsPrimary != null &&
                    this.IsPrimary.Equals(input.IsPrimary))
                ) && 
                (
                    this.PercentOwnership == input.PercentOwnership ||
                    (this.PercentOwnership != null &&
                    this.PercentOwnership.Equals(input.PercentOwnership))
                ) && 
                (
                    this.Role == input.Role ||
                    (this.Role != null &&
                    this.Role.Equals(input.Role))
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
                if (this.ClientId != null)
                    hashCode = hashCode * 59 + this.ClientId.GetHashCode();
                if (this.IsBeneficial != null)
                    hashCode = hashCode * 59 + this.IsBeneficial.GetHashCode();
                if (this.IsPrimary != null)
                    hashCode = hashCode * 59 + this.IsPrimary.GetHashCode();
                if (this.PercentOwnership != null)
                    hashCode = hashCode * 59 + this.PercentOwnership.GetHashCode();
                if (this.Role != null)
                    hashCode = hashCode * 59 + this.Role.GetHashCode();
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
