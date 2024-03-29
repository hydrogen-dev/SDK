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
    /// BankCredit Object
    /// </summary>
    [DataContract]
    public partial class BankCredit :  IEquatable<BankCredit>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BankCredit" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BankCredit() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BankCredit" /> class.
        /// </summary>
        /// <param name="amount">amount (required).</param>
        /// <param name="category">category.</param>
        /// <param name="description">description.</param>
        /// <param name="location">location.</param>
        /// <param name="memo">memo.</param>
        /// <param name="merchant">merchant.</param>
        /// <param name="merchantId">merchantId.</param>
        /// <param name="subcategory">subcategory.</param>
        /// <param name="transactionCategoryId">transactionCategoryId.</param>
        /// <param name="transactionType">transactionType (required).</param>
        public BankCredit(double? amount = default(double?), string category = default(string), string description = default(string), Location location = default(Location), string memo = default(string), string merchant = default(string), Guid? merchantId = default(Guid?), string subcategory = default(string), Guid? transactionCategoryId = default(Guid?), string transactionType = default(string))
        {
            // to ensure "amount" is required (not null)
            if (amount == null)
            {
                throw new InvalidDataException("amount is a required property for BankCredit and cannot be null");
            }
            else
            {
                this.Amount = amount;
            }
            // to ensure "transactionType" is required (not null)
            if (transactionType == null)
            {
                throw new InvalidDataException("transactionType is a required property for BankCredit and cannot be null");
            }
            else
            {
                this.TransactionType = transactionType;
            }
            this.Category = category;
            this.Description = description;
            this.Location = location;
            this.Memo = memo;
            this.Merchant = merchant;
            this.MerchantId = merchantId;
            this.Subcategory = subcategory;
            this.TransactionCategoryId = transactionCategoryId;
        }
        
        /// <summary>
        /// amount
        /// </summary>
        /// <value>amount</value>
        [DataMember(Name="amount", EmitDefaultValue=false)]
        public double? Amount { get; set; }

        /// <summary>
        /// category
        /// </summary>
        /// <value>category</value>
        [DataMember(Name="category", EmitDefaultValue=false)]
        public string Category { get; set; }

        /// <summary>
        /// description
        /// </summary>
        /// <value>description</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Location
        /// </summary>
        [DataMember(Name="location", EmitDefaultValue=false)]
        public Location Location { get; set; }

        /// <summary>
        /// memo
        /// </summary>
        /// <value>memo</value>
        [DataMember(Name="memo", EmitDefaultValue=false)]
        public string Memo { get; set; }

        /// <summary>
        /// merchant
        /// </summary>
        /// <value>merchant</value>
        [DataMember(Name="merchant", EmitDefaultValue=false)]
        public string Merchant { get; set; }

        /// <summary>
        /// merchantId
        /// </summary>
        /// <value>merchantId</value>
        [DataMember(Name="merchant_id", EmitDefaultValue=false)]
        public Guid? MerchantId { get; set; }

        /// <summary>
        /// subcategory
        /// </summary>
        /// <value>subcategory</value>
        [DataMember(Name="subcategory", EmitDefaultValue=false)]
        public string Subcategory { get; set; }

        /// <summary>
        /// transactionCategoryId
        /// </summary>
        /// <value>transactionCategoryId</value>
        [DataMember(Name="transaction_category_id", EmitDefaultValue=false)]
        public Guid? TransactionCategoryId { get; set; }

        /// <summary>
        /// transactionType
        /// </summary>
        /// <value>transactionType</value>
        [DataMember(Name="transaction_type", EmitDefaultValue=false)]
        public string TransactionType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BankCredit {\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Location: ").Append(Location).Append("\n");
            sb.Append("  Memo: ").Append(Memo).Append("\n");
            sb.Append("  Merchant: ").Append(Merchant).Append("\n");
            sb.Append("  MerchantId: ").Append(MerchantId).Append("\n");
            sb.Append("  Subcategory: ").Append(Subcategory).Append("\n");
            sb.Append("  TransactionCategoryId: ").Append(TransactionCategoryId).Append("\n");
            sb.Append("  TransactionType: ").Append(TransactionType).Append("\n");
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
            return this.Equals(input as BankCredit);
        }

        /// <summary>
        /// Returns true if BankCredit instances are equal
        /// </summary>
        /// <param name="input">Instance of BankCredit to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BankCredit input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Amount == input.Amount ||
                    (this.Amount != null &&
                    this.Amount.Equals(input.Amount))
                ) && 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Location == input.Location ||
                    (this.Location != null &&
                    this.Location.Equals(input.Location))
                ) && 
                (
                    this.Memo == input.Memo ||
                    (this.Memo != null &&
                    this.Memo.Equals(input.Memo))
                ) && 
                (
                    this.Merchant == input.Merchant ||
                    (this.Merchant != null &&
                    this.Merchant.Equals(input.Merchant))
                ) && 
                (
                    this.MerchantId == input.MerchantId ||
                    (this.MerchantId != null &&
                    this.MerchantId.Equals(input.MerchantId))
                ) && 
                (
                    this.Subcategory == input.Subcategory ||
                    (this.Subcategory != null &&
                    this.Subcategory.Equals(input.Subcategory))
                ) && 
                (
                    this.TransactionCategoryId == input.TransactionCategoryId ||
                    (this.TransactionCategoryId != null &&
                    this.TransactionCategoryId.Equals(input.TransactionCategoryId))
                ) && 
                (
                    this.TransactionType == input.TransactionType ||
                    (this.TransactionType != null &&
                    this.TransactionType.Equals(input.TransactionType))
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
                if (this.Amount != null)
                    hashCode = hashCode * 59 + this.Amount.GetHashCode();
                if (this.Category != null)
                    hashCode = hashCode * 59 + this.Category.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Location != null)
                    hashCode = hashCode * 59 + this.Location.GetHashCode();
                if (this.Memo != null)
                    hashCode = hashCode * 59 + this.Memo.GetHashCode();
                if (this.Merchant != null)
                    hashCode = hashCode * 59 + this.Merchant.GetHashCode();
                if (this.MerchantId != null)
                    hashCode = hashCode * 59 + this.MerchantId.GetHashCode();
                if (this.Subcategory != null)
                    hashCode = hashCode * 59 + this.Subcategory.GetHashCode();
                if (this.TransactionCategoryId != null)
                    hashCode = hashCode * 59 + this.TransactionCategoryId.GetHashCode();
                if (this.TransactionType != null)
                    hashCode = hashCode * 59 + this.TransactionType.GetHashCode();
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
