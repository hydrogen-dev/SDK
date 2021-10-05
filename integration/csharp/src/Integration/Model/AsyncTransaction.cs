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
    /// AsyncTransaction
    /// </summary>
    [DataContract]
    public partial class AsyncTransaction :  IEquatable<AsyncTransaction>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AsyncTransaction" /> class.
        /// </summary>
        /// <param name="createDate">createDate.</param>
        /// <param name="id">id.</param>
        /// <param name="response">response.</param>
        /// <param name="status">status.</param>
        /// <param name="updateDate">updateDate.</param>
        public AsyncTransaction(DateTime? createDate = default(DateTime?), Guid? id = default(Guid?), Object response = default(Object), string status = default(string), DateTime? updateDate = default(DateTime?))
        {
            this.CreateDate = createDate;
            this.Id = id;
            this.Response = response;
            this.Status = status;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public Guid? Id { get; set; }

        /// <summary>
        /// Gets or Sets Response
        /// </summary>
        [DataMember(Name="response", EmitDefaultValue=false)]
        public Object Response { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// Gets or Sets UpdateDate
        /// </summary>
        [DataMember(Name="update_date", EmitDefaultValue=false)]
        public DateTime? UpdateDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AsyncTransaction {\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Response: ").Append(Response).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  UpdateDate: ").Append(UpdateDate).Append("\n");
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
            return this.Equals(input as AsyncTransaction);
        }

        /// <summary>
        /// Returns true if AsyncTransaction instances are equal
        /// </summary>
        /// <param name="input">Instance of AsyncTransaction to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AsyncTransaction input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CreateDate == input.CreateDate ||
                    (this.CreateDate != null &&
                    this.CreateDate.Equals(input.CreateDate))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Response == input.Response ||
                    (this.Response != null &&
                    this.Response.Equals(input.Response))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.UpdateDate == input.UpdateDate ||
                    (this.UpdateDate != null &&
                    this.UpdateDate.Equals(input.UpdateDate))
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
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Response != null)
                    hashCode = hashCode * 59 + this.Response.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.UpdateDate != null)
                    hashCode = hashCode * 59 + this.UpdateDate.GetHashCode();
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
