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
    /// MerchantCategoryCode Object
    /// </summary>
    [DataContract]
    public partial class MerchantCategoryCode :  IEquatable<MerchantCategoryCode>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MerchantCategoryCode" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MerchantCategoryCode() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MerchantCategoryCode" /> class.
        /// </summary>
        /// <param name="category">category.</param>
        /// <param name="description">description.</param>
        /// <param name="mcc">mcc.</param>
        /// <param name="subcategory">subcategory.</param>
        /// <param name="transactionCategoryId">TransactionCategory id (required).</param>
        public MerchantCategoryCode(string category = default(string), string description = default(string), int? mcc = default(int?), string subcategory = default(string), Guid? transactionCategoryId = default(Guid?))
        {
            // to ensure "transactionCategoryId" is required (not null)
            if (transactionCategoryId == null)
            {
                throw new InvalidDataException("transactionCategoryId is a required property for MerchantCategoryCode and cannot be null");
            }
            else
            {
                this.TransactionCategoryId = transactionCategoryId;
            }
            this.Category = category;
            this.Description = description;
            this.Mcc = mcc;
            this.Subcategory = subcategory;
        }
        
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
        /// mcc
        /// </summary>
        /// <value>mcc</value>
        [DataMember(Name="mcc", EmitDefaultValue=false)]
        public int? Mcc { get; set; }

        /// <summary>
        /// subcategory
        /// </summary>
        /// <value>subcategory</value>
        [DataMember(Name="subcategory", EmitDefaultValue=false)]
        public string Subcategory { get; set; }

        /// <summary>
        /// TransactionCategory id
        /// </summary>
        /// <value>TransactionCategory id</value>
        [DataMember(Name="transaction_category_id", EmitDefaultValue=false)]
        public Guid? TransactionCategoryId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MerchantCategoryCode {\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Mcc: ").Append(Mcc).Append("\n");
            sb.Append("  Subcategory: ").Append(Subcategory).Append("\n");
            sb.Append("  TransactionCategoryId: ").Append(TransactionCategoryId).Append("\n");
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
            return this.Equals(input as MerchantCategoryCode);
        }

        /// <summary>
        /// Returns true if MerchantCategoryCode instances are equal
        /// </summary>
        /// <param name="input">Instance of MerchantCategoryCode to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MerchantCategoryCode input)
        {
            if (input == null)
                return false;

            return 
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
                    this.Mcc == input.Mcc ||
                    (this.Mcc != null &&
                    this.Mcc.Equals(input.Mcc))
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
                if (this.Category != null)
                    hashCode = hashCode * 59 + this.Category.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Mcc != null)
                    hashCode = hashCode * 59 + this.Mcc.GetHashCode();
                if (this.Subcategory != null)
                    hashCode = hashCode * 59 + this.Subcategory.GetHashCode();
                if (this.TransactionCategoryId != null)
                    hashCode = hashCode * 59 + this.TransactionCategoryId.GetHashCode();
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
