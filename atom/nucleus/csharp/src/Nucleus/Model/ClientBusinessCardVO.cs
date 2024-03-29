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
    /// Client/Business Card Mapping Object
    /// </summary>
    [DataContract]
    public partial class ClientBusinessCardVO :  IEquatable<ClientBusinessCardVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientBusinessCardVO" /> class.
        /// </summary>
        /// <param name="businessDetails">businessDetails.</param>
        /// <param name="cardDetails">cardDetails.</param>
        /// <param name="clientDetails">clientDetails.</param>
        /// <param name="totalBalance">totalBalance.</param>
        public ClientBusinessCardVO(BusinessDetailsVO businessDetails = default(BusinessDetailsVO), List<CardDetailsVO> cardDetails = default(List<CardDetailsVO>), ClientCardVO clientDetails = default(ClientCardVO), List<ClientBusinessTotalCardBalanceVO> totalBalance = default(List<ClientBusinessTotalCardBalanceVO>))
        {
            this.BusinessDetails = businessDetails;
            this.CardDetails = cardDetails;
            this.ClientDetails = clientDetails;
            this.TotalBalance = totalBalance;
        }
        
        /// <summary>
        /// businessDetails
        /// </summary>
        /// <value>businessDetails</value>
        [DataMember(Name="business_details", EmitDefaultValue=false)]
        public BusinessDetailsVO BusinessDetails { get; set; }

        /// <summary>
        /// cardDetails
        /// </summary>
        /// <value>cardDetails</value>
        [DataMember(Name="card_details", EmitDefaultValue=false)]
        public List<CardDetailsVO> CardDetails { get; set; }

        /// <summary>
        /// clientDetails
        /// </summary>
        /// <value>clientDetails</value>
        [DataMember(Name="client_details", EmitDefaultValue=false)]
        public ClientCardVO ClientDetails { get; set; }

        /// <summary>
        /// totalBalance
        /// </summary>
        /// <value>totalBalance</value>
        [DataMember(Name="total_balance", EmitDefaultValue=false)]
        public List<ClientBusinessTotalCardBalanceVO> TotalBalance { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ClientBusinessCardVO {\n");
            sb.Append("  BusinessDetails: ").Append(BusinessDetails).Append("\n");
            sb.Append("  CardDetails: ").Append(CardDetails).Append("\n");
            sb.Append("  ClientDetails: ").Append(ClientDetails).Append("\n");
            sb.Append("  TotalBalance: ").Append(TotalBalance).Append("\n");
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
            return this.Equals(input as ClientBusinessCardVO);
        }

        /// <summary>
        /// Returns true if ClientBusinessCardVO instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientBusinessCardVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientBusinessCardVO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.BusinessDetails == input.BusinessDetails ||
                    (this.BusinessDetails != null &&
                    this.BusinessDetails.Equals(input.BusinessDetails))
                ) && 
                (
                    this.CardDetails == input.CardDetails ||
                    this.CardDetails != null &&
                    this.CardDetails.SequenceEqual(input.CardDetails)
                ) && 
                (
                    this.ClientDetails == input.ClientDetails ||
                    (this.ClientDetails != null &&
                    this.ClientDetails.Equals(input.ClientDetails))
                ) && 
                (
                    this.TotalBalance == input.TotalBalance ||
                    this.TotalBalance != null &&
                    this.TotalBalance.SequenceEqual(input.TotalBalance)
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
                if (this.BusinessDetails != null)
                    hashCode = hashCode * 59 + this.BusinessDetails.GetHashCode();
                if (this.CardDetails != null)
                    hashCode = hashCode * 59 + this.CardDetails.GetHashCode();
                if (this.ClientDetails != null)
                    hashCode = hashCode * 59 + this.ClientDetails.GetHashCode();
                if (this.TotalBalance != null)
                    hashCode = hashCode * 59 + this.TotalBalance.GetHashCode();
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
