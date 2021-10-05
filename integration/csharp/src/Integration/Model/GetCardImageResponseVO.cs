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
    /// GetCardImageResponseVO
    /// </summary>
    [DataContract]
    public partial class GetCardImageResponseVO :  IEquatable<GetCardImageResponseVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetCardImageResponseVO" /> class.
        /// </summary>
        /// <param name="imageUrl">imageUrl.</param>
        /// <param name="message">message.</param>
        /// <param name="nucleusCardId">nucleusCardId.</param>
        /// <param name="vendorName">vendorName.</param>
        /// <param name="vendorResponse">vendorResponse.</param>
        public GetCardImageResponseVO(string imageUrl = default(string), string message = default(string), Guid? nucleusCardId = default(Guid?), string vendorName = default(string), Object vendorResponse = default(Object))
        {
            this.ImageUrl = imageUrl;
            this.Message = message;
            this.NucleusCardId = nucleusCardId;
            this.VendorName = vendorName;
            this.VendorResponse = vendorResponse;
        }
        
        /// <summary>
        /// Gets or Sets ImageUrl
        /// </summary>
        [DataMember(Name="image_url", EmitDefaultValue=false)]
        public string ImageUrl { get; set; }

        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Gets or Sets NucleusCardId
        /// </summary>
        [DataMember(Name="nucleus_card_id", EmitDefaultValue=false)]
        public Guid? NucleusCardId { get; set; }

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
            sb.Append("class GetCardImageResponseVO {\n");
            sb.Append("  ImageUrl: ").Append(ImageUrl).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  NucleusCardId: ").Append(NucleusCardId).Append("\n");
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
            return this.Equals(input as GetCardImageResponseVO);
        }

        /// <summary>
        /// Returns true if GetCardImageResponseVO instances are equal
        /// </summary>
        /// <param name="input">Instance of GetCardImageResponseVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetCardImageResponseVO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ImageUrl == input.ImageUrl ||
                    (this.ImageUrl != null &&
                    this.ImageUrl.Equals(input.ImageUrl))
                ) && 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
                ) && 
                (
                    this.NucleusCardId == input.NucleusCardId ||
                    (this.NucleusCardId != null &&
                    this.NucleusCardId.Equals(input.NucleusCardId))
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
                if (this.ImageUrl != null)
                    hashCode = hashCode * 59 + this.ImageUrl.GetHashCode();
                if (this.Message != null)
                    hashCode = hashCode * 59 + this.Message.GetHashCode();
                if (this.NucleusCardId != null)
                    hashCode = hashCode * 59 + this.NucleusCardId.GetHashCode();
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
