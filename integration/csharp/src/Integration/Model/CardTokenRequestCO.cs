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
    /// CardTokenRequestCO
    /// </summary>
    [DataContract]
    public partial class CardTokenRequestCO :  IEquatable<CardTokenRequestCO>, IValidatableObject
    {
        /// <summary>
        /// Defines Wallet
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum WalletEnum
        {
            
            /// <summary>
            /// Enum Google for value: google
            /// </summary>
            [EnumMember(Value = "google")]
            Google = 1,
            
            /// <summary>
            /// Enum Apple for value: apple
            /// </summary>
            [EnumMember(Value = "apple")]
            Apple = 2,
            
            /// <summary>
            /// Enum Samsung for value: samsung
            /// </summary>
            [EnumMember(Value = "samsung")]
            Samsung = 3,
            
            /// <summary>
            /// Enum Other for value: other
            /// </summary>
            [EnumMember(Value = "other")]
            Other = 4
        }

        /// <summary>
        /// Gets or Sets Wallet
        /// </summary>
        [DataMember(Name="wallet", EmitDefaultValue=false)]
        public WalletEnum? Wallet { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CardTokenRequestCO" /> class.
        /// </summary>
        /// <param name="nucleusCardId">nucleusCardId.</param>
        /// <param name="reason">reason.</param>
        /// <param name="vendorRequest">vendorRequest.</param>
        /// <param name="wallet">wallet.</param>
        public CardTokenRequestCO(Guid? nucleusCardId = default(Guid?), string reason = default(string), Object vendorRequest = default(Object), WalletEnum? wallet = default(WalletEnum?))
        {
            this.NucleusCardId = nucleusCardId;
            this.Reason = reason;
            this.VendorRequest = vendorRequest;
            this.Wallet = wallet;
        }
        
        /// <summary>
        /// Gets or Sets NucleusCardId
        /// </summary>
        [DataMember(Name="nucleus_card_id", EmitDefaultValue=false)]
        public Guid? NucleusCardId { get; set; }

        /// <summary>
        /// Gets or Sets Reason
        /// </summary>
        [DataMember(Name="reason", EmitDefaultValue=false)]
        public string Reason { get; set; }

        /// <summary>
        /// Gets or Sets VendorRequest
        /// </summary>
        [DataMember(Name="vendor_request", EmitDefaultValue=false)]
        public Object VendorRequest { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CardTokenRequestCO {\n");
            sb.Append("  NucleusCardId: ").Append(NucleusCardId).Append("\n");
            sb.Append("  Reason: ").Append(Reason).Append("\n");
            sb.Append("  VendorRequest: ").Append(VendorRequest).Append("\n");
            sb.Append("  Wallet: ").Append(Wallet).Append("\n");
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
            return this.Equals(input as CardTokenRequestCO);
        }

        /// <summary>
        /// Returns true if CardTokenRequestCO instances are equal
        /// </summary>
        /// <param name="input">Instance of CardTokenRequestCO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CardTokenRequestCO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.NucleusCardId == input.NucleusCardId ||
                    (this.NucleusCardId != null &&
                    this.NucleusCardId.Equals(input.NucleusCardId))
                ) && 
                (
                    this.Reason == input.Reason ||
                    (this.Reason != null &&
                    this.Reason.Equals(input.Reason))
                ) && 
                (
                    this.VendorRequest == input.VendorRequest ||
                    (this.VendorRequest != null &&
                    this.VendorRequest.Equals(input.VendorRequest))
                ) && 
                (
                    this.Wallet == input.Wallet ||
                    (this.Wallet != null &&
                    this.Wallet.Equals(input.Wallet))
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
                if (this.NucleusCardId != null)
                    hashCode = hashCode * 59 + this.NucleusCardId.GetHashCode();
                if (this.Reason != null)
                    hashCode = hashCode * 59 + this.Reason.GetHashCode();
                if (this.VendorRequest != null)
                    hashCode = hashCode * 59 + this.VendorRequest.GetHashCode();
                if (this.Wallet != null)
                    hashCode = hashCode * 59 + this.Wallet.GetHashCode();
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