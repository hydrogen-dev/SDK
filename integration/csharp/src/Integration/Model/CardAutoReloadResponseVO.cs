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
    /// CardAutoReloadResponseVO
    /// </summary>
    [DataContract]
    public partial class CardAutoReloadResponseVO :  IEquatable<CardAutoReloadResponseVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CardAutoReloadResponseVO" /> class.
        /// </summary>
        /// <param name="message">message.</param>
        /// <param name="nucleusClientId">nucleusClientId.</param>
        /// <param name="reloadAmount">reloadAmount.</param>
        /// <param name="thresholdAmount">thresholdAmount.</param>
        /// <param name="vendorName">vendorName.</param>
        /// <param name="vendorResponse">vendorResponse.</param>
        public CardAutoReloadResponseVO(string message = default(string), Guid? nucleusClientId = default(Guid?), double? reloadAmount = default(double?), double? thresholdAmount = default(double?), string vendorName = default(string), Object vendorResponse = default(Object))
        {
            this.Message = message;
            this.NucleusClientId = nucleusClientId;
            this.ReloadAmount = reloadAmount;
            this.ThresholdAmount = thresholdAmount;
            this.VendorName = vendorName;
            this.VendorResponse = vendorResponse;
        }
        
        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Gets or Sets NucleusClientId
        /// </summary>
        [DataMember(Name="nucleus_client_id", EmitDefaultValue=false)]
        public Guid? NucleusClientId { get; set; }

        /// <summary>
        /// Gets or Sets ReloadAmount
        /// </summary>
        [DataMember(Name="reload_amount", EmitDefaultValue=false)]
        public double? ReloadAmount { get; set; }

        /// <summary>
        /// Gets or Sets ThresholdAmount
        /// </summary>
        [DataMember(Name="threshold_amount", EmitDefaultValue=false)]
        public double? ThresholdAmount { get; set; }

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
            sb.Append("class CardAutoReloadResponseVO {\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  NucleusClientId: ").Append(NucleusClientId).Append("\n");
            sb.Append("  ReloadAmount: ").Append(ReloadAmount).Append("\n");
            sb.Append("  ThresholdAmount: ").Append(ThresholdAmount).Append("\n");
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
            return this.Equals(input as CardAutoReloadResponseVO);
        }

        /// <summary>
        /// Returns true if CardAutoReloadResponseVO instances are equal
        /// </summary>
        /// <param name="input">Instance of CardAutoReloadResponseVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CardAutoReloadResponseVO input)
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
                    this.NucleusClientId == input.NucleusClientId ||
                    (this.NucleusClientId != null &&
                    this.NucleusClientId.Equals(input.NucleusClientId))
                ) && 
                (
                    this.ReloadAmount == input.ReloadAmount ||
                    (this.ReloadAmount != null &&
                    this.ReloadAmount.Equals(input.ReloadAmount))
                ) && 
                (
                    this.ThresholdAmount == input.ThresholdAmount ||
                    (this.ThresholdAmount != null &&
                    this.ThresholdAmount.Equals(input.ThresholdAmount))
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
                if (this.NucleusClientId != null)
                    hashCode = hashCode * 59 + this.NucleusClientId.GetHashCode();
                if (this.ReloadAmount != null)
                    hashCode = hashCode * 59 + this.ReloadAmount.GetHashCode();
                if (this.ThresholdAmount != null)
                    hashCode = hashCode * 59 + this.ThresholdAmount.GetHashCode();
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