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
    /// Order Object
    /// </summary>
    [DataContract]
    public partial class Order :  IEquatable<Order>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Order" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Order() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Order" /> class.
        /// </summary>
        /// <param name="accountId">accountId.</param>
        /// <param name="amount">amount.</param>
        /// <param name="commission">commission.</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="date">date (required).</param>
        /// <param name="id">id.</param>
        /// <param name="isRead">isRead.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="modelId">modelId.</param>
        /// <param name="orderBulkId">orderBulkId.</param>
        /// <param name="orderTicketId">orderTicketId (required).</param>
        /// <param name="orderType">orderType.</param>
        /// <param name="portfolioId">portfolioId.</param>
        /// <param name="price">price.</param>
        /// <param name="quantity">quantity.</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="securityId">securityId (required).</param>
        /// <param name="tmpTrackerId">tmpTrackerId.</param>
        /// <param name="transactionCodeId">transactionCodeId (required).</param>
        /// <param name="updateDate">updateDate.</param>
        public Order(Guid? accountId = default(Guid?), double? amount = default(double?), double? commission = default(double?), DateTime? createDate = default(DateTime?), DateTime? date = default(DateTime?), Guid? id = default(Guid?), bool? isRead = default(bool?), Dictionary<string, string> metadata = default(Dictionary<string, string>), Guid? modelId = default(Guid?), Guid? orderBulkId = default(Guid?), Guid? orderTicketId = default(Guid?), string orderType = default(string), Guid? portfolioId = default(Guid?), double? price = default(double?), double? quantity = default(double?), string secondaryId = default(string), Guid? securityId = default(Guid?), Guid? tmpTrackerId = default(Guid?), Guid? transactionCodeId = default(Guid?), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "date" is required (not null)
            if (date == null)
            {
                throw new InvalidDataException("date is a required property for Order and cannot be null");
            }
            else
            {
                this.Date = date;
            }
            // to ensure "orderTicketId" is required (not null)
            if (orderTicketId == null)
            {
                throw new InvalidDataException("orderTicketId is a required property for Order and cannot be null");
            }
            else
            {
                this.OrderTicketId = orderTicketId;
            }
            // to ensure "securityId" is required (not null)
            if (securityId == null)
            {
                throw new InvalidDataException("securityId is a required property for Order and cannot be null");
            }
            else
            {
                this.SecurityId = securityId;
            }
            // to ensure "transactionCodeId" is required (not null)
            if (transactionCodeId == null)
            {
                throw new InvalidDataException("transactionCodeId is a required property for Order and cannot be null");
            }
            else
            {
                this.TransactionCodeId = transactionCodeId;
            }
            this.AccountId = accountId;
            this.Amount = amount;
            this.Commission = commission;
            this.CreateDate = createDate;
            this.Id = id;
            this.IsRead = isRead;
            this.Metadata = metadata;
            this.ModelId = modelId;
            this.OrderBulkId = orderBulkId;
            this.OrderType = orderType;
            this.PortfolioId = portfolioId;
            this.Price = price;
            this.Quantity = quantity;
            this.SecondaryId = secondaryId;
            this.TmpTrackerId = tmpTrackerId;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// accountId
        /// </summary>
        /// <value>accountId</value>
        [DataMember(Name="account_id", EmitDefaultValue=false)]
        public Guid? AccountId { get; set; }

        /// <summary>
        /// amount
        /// </summary>
        /// <value>amount</value>
        [DataMember(Name="amount", EmitDefaultValue=false)]
        public double? Amount { get; set; }

        /// <summary>
        /// commission
        /// </summary>
        /// <value>commission</value>
        [DataMember(Name="commission", EmitDefaultValue=false)]
        public double? Commission { get; set; }

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
        /// isRead
        /// </summary>
        /// <value>isRead</value>
        [DataMember(Name="is_read", EmitDefaultValue=false)]
        public bool? IsRead { get; set; }

        /// <summary>
        /// metadata
        /// </summary>
        /// <value>metadata</value>
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
        /// orderTicketId
        /// </summary>
        /// <value>orderTicketId</value>
        [DataMember(Name="order_ticket_id", EmitDefaultValue=false)]
        public Guid? OrderTicketId { get; set; }

        /// <summary>
        /// orderType
        /// </summary>
        /// <value>orderType</value>
        [DataMember(Name="order_type", EmitDefaultValue=false)]
        public string OrderType { get; set; }

        /// <summary>
        /// portfolioId
        /// </summary>
        /// <value>portfolioId</value>
        [DataMember(Name="portfolio_id", EmitDefaultValue=false)]
        public Guid? PortfolioId { get; set; }

        /// <summary>
        /// price
        /// </summary>
        /// <value>price</value>
        [DataMember(Name="price", EmitDefaultValue=false)]
        public double? Price { get; set; }

        /// <summary>
        /// quantity
        /// </summary>
        /// <value>quantity</value>
        [DataMember(Name="quantity", EmitDefaultValue=false)]
        public double? Quantity { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

        /// <summary>
        /// securityId
        /// </summary>
        /// <value>securityId</value>
        [DataMember(Name="security_id", EmitDefaultValue=false)]
        public Guid? SecurityId { get; set; }

        /// <summary>
        /// Gets or Sets TmpTrackerId
        /// </summary>
        [DataMember(Name="tmp_tracker_id", EmitDefaultValue=false)]
        public Guid? TmpTrackerId { get; set; }

        /// <summary>
        /// transactionCodeId
        /// </summary>
        /// <value>transactionCodeId</value>
        [DataMember(Name="transaction_code_id", EmitDefaultValue=false)]
        public Guid? TransactionCodeId { get; set; }

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
            sb.Append("class Order {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  Commission: ").Append(Commission).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsRead: ").Append(IsRead).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  ModelId: ").Append(ModelId).Append("\n");
            sb.Append("  OrderBulkId: ").Append(OrderBulkId).Append("\n");
            sb.Append("  OrderTicketId: ").Append(OrderTicketId).Append("\n");
            sb.Append("  OrderType: ").Append(OrderType).Append("\n");
            sb.Append("  PortfolioId: ").Append(PortfolioId).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Quantity: ").Append(Quantity).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  SecurityId: ").Append(SecurityId).Append("\n");
            sb.Append("  TmpTrackerId: ").Append(TmpTrackerId).Append("\n");
            sb.Append("  TransactionCodeId: ").Append(TransactionCodeId).Append("\n");
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
            return this.Equals(input as Order);
        }

        /// <summary>
        /// Returns true if Order instances are equal
        /// </summary>
        /// <param name="input">Instance of Order to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Order input)
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
                    this.Amount == input.Amount ||
                    (this.Amount != null &&
                    this.Amount.Equals(input.Amount))
                ) && 
                (
                    this.Commission == input.Commission ||
                    (this.Commission != null &&
                    this.Commission.Equals(input.Commission))
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
                    this.IsRead == input.IsRead ||
                    (this.IsRead != null &&
                    this.IsRead.Equals(input.IsRead))
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
                    this.OrderTicketId == input.OrderTicketId ||
                    (this.OrderTicketId != null &&
                    this.OrderTicketId.Equals(input.OrderTicketId))
                ) && 
                (
                    this.OrderType == input.OrderType ||
                    (this.OrderType != null &&
                    this.OrderType.Equals(input.OrderType))
                ) && 
                (
                    this.PortfolioId == input.PortfolioId ||
                    (this.PortfolioId != null &&
                    this.PortfolioId.Equals(input.PortfolioId))
                ) && 
                (
                    this.Price == input.Price ||
                    (this.Price != null &&
                    this.Price.Equals(input.Price))
                ) && 
                (
                    this.Quantity == input.Quantity ||
                    (this.Quantity != null &&
                    this.Quantity.Equals(input.Quantity))
                ) && 
                (
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
                ) && 
                (
                    this.SecurityId == input.SecurityId ||
                    (this.SecurityId != null &&
                    this.SecurityId.Equals(input.SecurityId))
                ) && 
                (
                    this.TmpTrackerId == input.TmpTrackerId ||
                    (this.TmpTrackerId != null &&
                    this.TmpTrackerId.Equals(input.TmpTrackerId))
                ) && 
                (
                    this.TransactionCodeId == input.TransactionCodeId ||
                    (this.TransactionCodeId != null &&
                    this.TransactionCodeId.Equals(input.TransactionCodeId))
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
                if (this.Amount != null)
                    hashCode = hashCode * 59 + this.Amount.GetHashCode();
                if (this.Commission != null)
                    hashCode = hashCode * 59 + this.Commission.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.IsRead != null)
                    hashCode = hashCode * 59 + this.IsRead.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.ModelId != null)
                    hashCode = hashCode * 59 + this.ModelId.GetHashCode();
                if (this.OrderBulkId != null)
                    hashCode = hashCode * 59 + this.OrderBulkId.GetHashCode();
                if (this.OrderTicketId != null)
                    hashCode = hashCode * 59 + this.OrderTicketId.GetHashCode();
                if (this.OrderType != null)
                    hashCode = hashCode * 59 + this.OrderType.GetHashCode();
                if (this.PortfolioId != null)
                    hashCode = hashCode * 59 + this.PortfolioId.GetHashCode();
                if (this.Price != null)
                    hashCode = hashCode * 59 + this.Price.GetHashCode();
                if (this.Quantity != null)
                    hashCode = hashCode * 59 + this.Quantity.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.SecurityId != null)
                    hashCode = hashCode * 59 + this.SecurityId.GetHashCode();
                if (this.TmpTrackerId != null)
                    hashCode = hashCode * 59 + this.TmpTrackerId.GetHashCode();
                if (this.TransactionCodeId != null)
                    hashCode = hashCode * 59 + this.TransactionCodeId.GetHashCode();
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
