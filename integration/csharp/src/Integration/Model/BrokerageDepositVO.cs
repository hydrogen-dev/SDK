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
    /// BrokerageDepositVO
    /// </summary>
    [DataContract]
    public partial class BrokerageDepositVO :  IEquatable<BrokerageDepositVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BrokerageDepositVO" /> class.
        /// </summary>
        /// <param name="message">message.</param>
        /// <param name="nucleusFundingId">nucleusFundingId.</param>
        /// <param name="status">status.</param>
        /// <param name="vendorName">vendorName.</param>
        /// <param name="vendorResponse">vendorResponse.</param>
        public BrokerageDepositVO(string message = default(string), Guid? nucleusFundingId = default(Guid?), string status = default(string), string vendorName = default(string), Object vendorResponse = default(Object))
        {
            this.Message = message;
            this.NucleusFundingId = nucleusFundingId;
            this.Status = status;
            this.VendorName = vendorName;
            this.VendorResponse = vendorResponse;
        }
        
        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Gets or Sets NucleusFundingId
        /// </summary>
        [DataMember(Name="nucleus_funding_id", EmitDefaultValue=false)]
        public Guid? NucleusFundingId { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// Gets or Sets VendorName
        /// </summary>
        [DataMember(Name="vendor_name", EmitDefaultValue=false)]
        public string VendorName { get; set; }

        /// <summary>
        /// Gets or Sets VendorResponse
        /// </summary>
        [DataMember(Name="vendor_response", EmitDefaultValue=false)]
        public Object VendorResponse { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BrokerageDepositVO {\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  NucleusFundingId: ").Append(NucleusFundingId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  VendorName: ").Append(VendorName).Append("\n");
            sb.Append("  VendorResponse: ").Append(VendorResponse).Append("\n");
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
            return this.Equals(input as BrokerageDepositVO);
        }

        /// <summary>
        /// Returns true if BrokerageDepositVO instances are equal
        /// </summary>
        /// <param name="input">Instance of BrokerageDepositVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BrokerageDepositVO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
                ) && 
                (
                    this.NucleusFundingId == input.NucleusFundingId ||
                    (this.NucleusFundingId != null &&
                    this.NucleusFundingId.Equals(input.NucleusFundingId))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.VendorName == input.VendorName ||
                    (this.VendorName != null &&
                    this.VendorName.Equals(input.VendorName))
                ) && 
                (
                    this.VendorResponse == input.VendorResponse ||
                    (this.VendorResponse != null &&
                    this.VendorResponse.Equals(input.VendorResponse))
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
                if (this.Message != null)
                    hashCode = hashCode * 59 + this.Message.GetHashCode();
                if (this.NucleusFundingId != null)
                    hashCode = hashCode * 59 + this.NucleusFundingId.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.VendorName != null)
                    hashCode = hashCode * 59 + this.VendorName.GetHashCode();
                if (this.VendorResponse != null)
                    hashCode = hashCode * 59 + this.VendorResponse.GetHashCode();
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
