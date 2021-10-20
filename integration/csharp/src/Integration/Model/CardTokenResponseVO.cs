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
    /// CardTokenResponseVO
    /// </summary>
    [DataContract]
    public partial class CardTokenResponseVO :  IEquatable<CardTokenResponseVO>, IValidatableObject
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
        /// Initializes a new instance of the <see cref="CardTokenResponseVO" /> class.
        /// </summary>
        /// <param name="applePayload">applePayload.</param>
        /// <param name="googlePayload">googlePayload.</param>
        /// <param name="message">message.</param>
        /// <param name="nucleusCardId">nucleusCardId.</param>
        /// <param name="samsungPayload">samsungPayload.</param>
        /// <param name="vendorName">vendorName.</param>
        /// <param name="vendorResponse">vendorResponse.</param>
        /// <param name="wallet">wallet.</param>
        public CardTokenResponseVO(ApplePayload applePayload = default(ApplePayload), GooglePayload googlePayload = default(GooglePayload), string message = default(string), Guid? nucleusCardId = default(Guid?), SamsungPayload samsungPayload = default(SamsungPayload), string vendorName = default(string), Object vendorResponse = default(Object), WalletEnum? wallet = default(WalletEnum?))
        {
            this.ApplePayload = applePayload;
            this.GooglePayload = googlePayload;
            this.Message = message;
            this.NucleusCardId = nucleusCardId;
            this.SamsungPayload = samsungPayload;
            this.VendorName = vendorName;
            this.VendorResponse = vendorResponse;
            this.Wallet = wallet;
        }
        
        /// <summary>
        /// Gets or Sets ApplePayload
        /// </summary>
        [DataMember(Name="apple_payload", EmitDefaultValue=false)]
        public ApplePayload ApplePayload { get; set; }

        /// <summary>
        /// Gets or Sets GooglePayload
        /// </summary>
        [DataMember(Name="google_payload", EmitDefaultValue=false)]
        public GooglePayload GooglePayload { get; set; }

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
        /// Gets or Sets SamsungPayload
        /// </summary>
        [DataMember(Name="samsung_payload", EmitDefaultValue=false)]
        public SamsungPayload SamsungPayload { get; set; }

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
            sb.Append("class CardTokenResponseVO {\n");
            sb.Append("  ApplePayload: ").Append(ApplePayload).Append("\n");
            sb.Append("  GooglePayload: ").Append(GooglePayload).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  NucleusCardId: ").Append(NucleusCardId).Append("\n");
            sb.Append("  SamsungPayload: ").Append(SamsungPayload).Append("\n");
            sb.Append("  VendorName: ").Append(VendorName).Append("\n");
            sb.Append("  VendorResponse: ").Append(VendorResponse).Append("\n");
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
            return this.Equals(input as CardTokenResponseVO);
        }

        /// <summary>
        /// Returns true if CardTokenResponseVO instances are equal
        /// </summary>
        /// <param name="input">Instance of CardTokenResponseVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CardTokenResponseVO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ApplePayload == input.ApplePayload ||
                    (this.ApplePayload != null &&
                    this.ApplePayload.Equals(input.ApplePayload))
                ) && 
                (
                    this.GooglePayload == input.GooglePayload ||
                    (this.GooglePayload != null &&
                    this.GooglePayload.Equals(input.GooglePayload))
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
                    this.SamsungPayload == input.SamsungPayload ||
                    (this.SamsungPayload != null &&
                    this.SamsungPayload.Equals(input.SamsungPayload))
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
                if (this.ApplePayload != null)
                    hashCode = hashCode * 59 + this.ApplePayload.GetHashCode();
                if (this.GooglePayload != null)
                    hashCode = hashCode * 59 + this.GooglePayload.GetHashCode();
                if (this.Message != null)
                    hashCode = hashCode * 59 + this.Message.GetHashCode();
                if (this.NucleusCardId != null)
                    hashCode = hashCode * 59 + this.NucleusCardId.GetHashCode();
                if (this.SamsungPayload != null)
                    hashCode = hashCode * 59 + this.SamsungPayload.GetHashCode();
                if (this.VendorName != null)
                    hashCode = hashCode * 59 + this.VendorName.GetHashCode();
                if (this.VendorResponse != null)
                    hashCode = hashCode * 59 + this.VendorResponse.GetHashCode();
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