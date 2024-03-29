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
    /// OrderBulk
    /// </summary>
    [DataContract]
    public partial class OrderBulk :  IEquatable<OrderBulk>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderBulk" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OrderBulk() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderBulk" /> class.
        /// </summary>
        /// <param name="accountId">accountId (required).</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="date">date (required).</param>
        /// <param name="id">id.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="modelId">modelId (required).</param>
        /// <param name="orderBulkId">orderBulkId (required).</param>
        /// <param name="orderId">orderId (required).</param>
        /// <param name="portfolioId">portfolioId (required).</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="updateDate">updateDate.</param>
        public OrderBulk(Guid? accountId = default(Guid?), DateTime? createDate = default(DateTime?), DateTime? date = default(DateTime?), Guid? id = default(Guid?), Dictionary<string, string> metadata = default(Dictionary<string, string>), Guid? modelId = default(Guid?), Guid? orderBulkId = default(Guid?), Guid? orderId = default(Guid?), Guid? portfolioId = default(Guid?), string secondaryId = default(string), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "accountId" is required (not null)
            if (accountId == null)
            {
                throw new InvalidDataException("accountId is a required property for OrderBulk and cannot be null");
            }
            else
            {
                this.AccountId = accountId;
            }
            // to ensure "date" is required (not null)
            if (date == null)
            {
                throw new InvalidDataException("date is a required property for OrderBulk and cannot be null");
            }
            else
            {
                this.Date = date;
            }
            // to ensure "modelId" is required (not null)
            if (modelId == null)
            {
                throw new InvalidDataException("modelId is a required property for OrderBulk and cannot be null");
            }
            else
            {
                this.ModelId = modelId;
            }
            // to ensure "orderBulkId" is required (not null)
            if (orderBulkId == null)
            {
                throw new InvalidDataException("orderBulkId is a required property for OrderBulk and cannot be null");
            }
            else
            {
                this.OrderBulkId = orderBulkId;
            }
            // to ensure "orderId" is required (not null)
            if (orderId == null)
            {
                throw new InvalidDataException("orderId is a required property for OrderBulk and cannot be null");
            }
            else
            {
                this.OrderId = orderId;
            }
            // to ensure "portfolioId" is required (not null)
            if (portfolioId == null)
            {
                throw new InvalidDataException("portfolioId is a required property for OrderBulk and cannot be null");
            }
            else
            {
                this.PortfolioId = portfolioId;
            }
            this.CreateDate = createDate;
            this.Id = id;
            this.Metadata = metadata;
            this.SecondaryId = secondaryId;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// accountId
        /// </summary>
        /// <value>accountId</value>
        [DataMember(Name="account_id", EmitDefaultValue=false)]
        public Guid? AccountId { get; set; }

        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// date
        /// </summary>
        /// <value>date</value>
        [DataMember(Name="date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? Date { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public Guid? Id { get; set; }

        /// <summary>
        /// Gets or Sets Metadata
        /// </summary>
        [DataMember(Name="metadata", EmitDefaultValue=false)]
        public Dictionary<string, string> Metadata { get; set; }

        /// <summary>
        /// modelId
        /// </summary>
        /// <value>modelId</value>
        [DataMember(Name="model_id", EmitDefaultValue=false)]
        public Guid? ModelId { get; set; }

        /// <summary>
        /// orderBulkId
        /// </summary>
        /// <value>orderBulkId</value>
        [DataMember(Name="order_bulk_id", EmitDefaultValue=false)]
        public Guid? OrderBulkId { get; set; }

        /// <summary>
        /// orderId
        /// </summary>
        /// <value>orderId</value>
        [DataMember(Name="order_id", EmitDefaultValue=false)]
        public Guid? OrderId { get; set; }

        /// <summary>
        /// portfolioId
        /// </summary>
        /// <value>portfolioId</value>
        [DataMember(Name="portfolio_id", EmitDefaultValue=false)]
        public Guid? PortfolioId { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

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
            sb.Append("class OrderBulk {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  ModelId: ").Append(ModelId).Append("\n");
            sb.Append("  OrderBulkId: ").Append(OrderBulkId).Append("\n");
            sb.Append("  OrderId: ").Append(OrderId).Append("\n");
            sb.Append("  PortfolioId: ").Append(PortfolioId).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
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
            return this.Equals(input as OrderBulk);
        }

        /// <summary>
        /// Returns true if OrderBulk instances are equal
        /// </summary>
        /// <param name="input">Instance of OrderBulk to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrderBulk input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AccountId == input.AccountId ||
                    (this.AccountId != null &&
                    this.AccountId.Equals(input.AccountId))
                ) && 
                (
                    this.CreateDate == input.CreateDate ||
                    (this.CreateDate != null &&
                    this.CreateDate.Equals(input.CreateDate))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Metadata == input.Metadata ||
                    this.Metadata != null &&
                    this.Metadata.SequenceEqual(input.Metadata)
                ) && 
                (
                    this.ModelId == input.ModelId ||
                    (this.ModelId != null &&
                    this.ModelId.Equals(input.ModelId))
                ) && 
                (
                    this.OrderBulkId == input.OrderBulkId ||
                    (this.OrderBulkId != null &&
                    this.OrderBulkId.Equals(input.OrderBulkId))
                ) && 
                (
                    this.OrderId == input.OrderId ||
                    (this.OrderId != null &&
                    this.OrderId.Equals(input.OrderId))
                ) && 
                (
                    this.PortfolioId == input.PortfolioId ||
                    (this.PortfolioId != null &&
                    this.PortfolioId.Equals(input.PortfolioId))
                ) && 
                (
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
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
                if (this.AccountId != null)
                    hashCode = hashCode * 59 + this.AccountId.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.ModelId != null)
                    hashCode = hashCode * 59 + this.ModelId.GetHashCode();
                if (this.OrderBulkId != null)
                    hashCode = hashCode * 59 + this.OrderBulkId.GetHashCode();
                if (this.OrderId != null)
                    hashCode = hashCode * 59 + this.OrderId.GetHashCode();
                if (this.PortfolioId != null)
                    hashCode = hashCode * 59 + this.PortfolioId.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
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
