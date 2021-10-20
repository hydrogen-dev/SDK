/* 
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
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
    /// OrderReconcileReturnObject
    /// </summary>
    [DataContract]
    public partial class OrderReconcileReturnObject :  IEquatable<OrderReconcileReturnObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderReconcileReturnObject" /> class.
        /// </summary>
        /// <param name="accountId">accountId.</param>
        /// <param name="portfolioAssetSizeId">portfolioAssetSizeId.</param>
        /// <param name="portfolioHoldingId">portfolioHoldingId.</param>
        /// <param name="portfolioId">portfolioId.</param>
        /// <param name="portfolioTransactionId">portfolioTransactionId.</param>
        public OrderReconcileReturnObject(List<Guid?> accountId = default(List<Guid?>), List<Guid?> portfolioAssetSizeId = default(List<Guid?>), List<Guid?> portfolioHoldingId = default(List<Guid?>), List<Guid?> portfolioId = default(List<Guid?>), List<Guid?> portfolioTransactionId = default(List<Guid?>))
        {
            this.AccountId = accountId;
            this.PortfolioAssetSizeId = portfolioAssetSizeId;
            this.PortfolioHoldingId = portfolioHoldingId;
            this.PortfolioId = portfolioId;
            this.PortfolioTransactionId = portfolioTransactionId;
        }
        
        /// <summary>
        /// Gets or Sets AccountId
        /// </summary>
        [DataMember(Name="account_id", EmitDefaultValue=false)]
        public List<Guid?> AccountId { get; set; }

        /// <summary>
        /// Gets or Sets PortfolioAssetSizeId
        /// </summary>
        [DataMember(Name="portfolio_asset_size_id", EmitDefaultValue=false)]
        public List<Guid?> PortfolioAssetSizeId { get; set; }

        /// <summary>
        /// Gets or Sets PortfolioHoldingId
        /// </summary>
        [DataMember(Name="portfolio_holding_id", EmitDefaultValue=false)]
        public List<Guid?> PortfolioHoldingId { get; set; }

        /// <summary>
        /// Gets or Sets PortfolioId
        /// </summary>
        [DataMember(Name="portfolio_id", EmitDefaultValue=false)]
        public List<Guid?> PortfolioId { get; set; }

        /// <summary>
        /// Gets or Sets PortfolioTransactionId
        /// </summary>
        [DataMember(Name="portfolio_transaction_id", EmitDefaultValue=false)]
        public List<Guid?> PortfolioTransactionId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OrderReconcileReturnObject {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  PortfolioAssetSizeId: ").Append(PortfolioAssetSizeId).Append("\n");
            sb.Append("  PortfolioHoldingId: ").Append(PortfolioHoldingId).Append("\n");
            sb.Append("  PortfolioId: ").Append(PortfolioId).Append("\n");
            sb.Append("  PortfolioTransactionId: ").Append(PortfolioTransactionId).Append("\n");
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
            return this.Equals(input as OrderReconcileReturnObject);
        }

        /// <summary>
        /// Returns true if OrderReconcileReturnObject instances are equal
        /// </summary>
        /// <param name="input">Instance of OrderReconcileReturnObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrderReconcileReturnObject input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AccountId == input.AccountId ||
                    this.AccountId != null &&
                    this.AccountId.SequenceEqual(input.AccountId)
                ) && 
                (
                    this.PortfolioAssetSizeId == input.PortfolioAssetSizeId ||
                    this.PortfolioAssetSizeId != null &&
                    this.PortfolioAssetSizeId.SequenceEqual(input.PortfolioAssetSizeId)
                ) && 
                (
                    this.PortfolioHoldingId == input.PortfolioHoldingId ||
                    this.PortfolioHoldingId != null &&
                    this.PortfolioHoldingId.SequenceEqual(input.PortfolioHoldingId)
                ) && 
                (
                    this.PortfolioId == input.PortfolioId ||
                    this.PortfolioId != null &&
                    this.PortfolioId.SequenceEqual(input.PortfolioId)
                ) && 
                (
                    this.PortfolioTransactionId == input.PortfolioTransactionId ||
                    this.PortfolioTransactionId != null &&
                    this.PortfolioTransactionId.SequenceEqual(input.PortfolioTransactionId)
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
                if (this.PortfolioAssetSizeId != null)
                    hashCode = hashCode * 59 + this.PortfolioAssetSizeId.GetHashCode();
                if (this.PortfolioHoldingId != null)
                    hashCode = hashCode * 59 + this.PortfolioHoldingId.GetHashCode();
                if (this.PortfolioId != null)
                    hashCode = hashCode * 59 + this.PortfolioId.GetHashCode();
                if (this.PortfolioTransactionId != null)
                    hashCode = hashCode * 59 + this.PortfolioTransactionId.GetHashCode();
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