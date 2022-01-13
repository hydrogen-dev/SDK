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
    /// AccountPermissionVO Object
    /// </summary>
    [DataContract]
    public partial class AccountPermissionVO :  IEquatable<AccountPermissionVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountPermissionVO" /> class.
        /// </summary>
        /// <param name="accountId">accountId.</param>
        /// <param name="clients">PermissionVO.</param>
        public AccountPermissionVO(Guid? accountId = default(Guid?), List<PermissionVO> clients = default(List<PermissionVO>))
        {
            this.AccountId = accountId;
            this.Clients = clients;
        }
        
        /// <summary>
        /// accountId
        /// </summary>
        /// <value>accountId</value>
        [DataMember(Name="account_id", EmitDefaultValue=false)]
        public Guid? AccountId { get; set; }

        /// <summary>
        /// PermissionVO
        /// </summary>
        /// <value>PermissionVO</value>
        [DataMember(Name="clients", EmitDefaultValue=false)]
        public List<PermissionVO> Clients { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AccountPermissionVO {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  Clients: ").Append(Clients).Append("\n");
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
            return this.Equals(input as AccountPermissionVO);
        }

        /// <summary>
        /// Returns true if AccountPermissionVO instances are equal
        /// </summary>
        /// <param name="input">Instance of AccountPermissionVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AccountPermissionVO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AccountId == input.AccountId ||
                    (this.AccountId != null &&
                    this.AccountId.Equals(input.AccountId))
                ) && 
                (
                    this.Clients == input.Clients ||
                    this.Clients != null &&
                    this.Clients.SequenceEqual(input.Clients)
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
                if (this.AccountId != null)
                    hashCode = hashCode * 59 + this.AccountId.GetHashCode();
                if (this.Clients != null)
                    hashCode = hashCode * 59 + this.Clients.GetHashCode();
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
