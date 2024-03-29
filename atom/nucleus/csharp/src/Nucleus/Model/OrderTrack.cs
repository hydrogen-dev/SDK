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
    /// OrderTrack Object
    /// </summary>
    [DataContract]
    public partial class OrderTrack :  IEquatable<OrderTrack>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderTrack" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OrderTrack() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderTrack" /> class.
        /// </summary>
        /// <param name="commission">commission.</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="date">date (required).</param>
        /// <param name="externalTrackId">externalTrackId.</param>
        /// <param name="fee">fee.</param>
        /// <param name="id">id.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="orderId">orderId (required).</param>
        /// <param name="orderStatusId">orderStatusId (required).</param>
        /// <param name="price">price.</param>
        /// <param name="quantity">quantity.</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="updateDate">updateDate.</param>
        public OrderTrack(double? commission = default(double?), DateTime? createDate = default(DateTime?), DateTime? date = default(DateTime?), string externalTrackId = default(string), double? fee = default(double?), Guid? id = default(Guid?), Dictionary<string, string> metadata = default(Dictionary<string, string>), Guid? orderId = default(Guid?), Guid? orderStatusId = default(Guid?), double? price = default(double?), double? quantity = default(double?), string secondaryId = default(string), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "date" is required (not null)
            if (date == null)
            {
                throw new InvalidDataException("date is a required property for OrderTrack and cannot be null");
            }
            else
            {
                this.Date = date;
            }
            // to ensure "orderId" is required (not null)
            if (orderId == null)
            {
                throw new InvalidDataException("orderId is a required property for OrderTrack and cannot be null");
            }
            else
            {
                this.OrderId = orderId;
            }
            // to ensure "orderStatusId" is required (not null)
            if (orderStatusId == null)
            {
                throw new InvalidDataException("orderStatusId is a required property for OrderTrack and cannot be null");
            }
            else
            {
                this.OrderStatusId = orderStatusId;
            }
            this.Commission = commission;
            this.CreateDate = createDate;
            this.ExternalTrackId = externalTrackId;
            this.Fee = fee;
            this.Id = id;
            this.Metadata = metadata;
            this.Price = price;
            this.Quantity = quantity;
            this.SecondaryId = secondaryId;
            this.UpdateDate = updateDate;
        }
        
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
        /// externalTrackId
        /// </summary>
        /// <value>externalTrackId</value>
        [DataMember(Name="external_track_id", EmitDefaultValue=false)]
        public string ExternalTrackId { get; set; }

        /// <summary>
        /// fee
        /// </summary>
        /// <value>fee</value>
        [DataMember(Name="fee", EmitDefaultValue=false)]
        public double? Fee { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public Guid? Id { get; set; }

        /// <summary>
        /// metadata
        /// </summary>
        /// <value>metadata</value>
        [DataMember(Name="metadata", EmitDefaultValue=false)]
        public Dictionary<string, string> Metadata { get; set; }

        /// <summary>
        /// orderId
        /// </summary>
        /// <value>orderId</value>
        [DataMember(Name="order_id", EmitDefaultValue=false)]
        public Guid? OrderId { get; set; }

        /// <summary>
        /// orderStatusId
        /// </summary>
        /// <value>orderStatusId</value>
        [DataMember(Name="order_status_id", EmitDefaultValue=false)]
        public Guid? OrderStatusId { get; set; }

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
            sb.Append("class OrderTrack {\n");
            sb.Append("  Commission: ").Append(Commission).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  ExternalTrackId: ").Append(ExternalTrackId).Append("\n");
            sb.Append("  Fee: ").Append(Fee).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  OrderId: ").Append(OrderId).Append("\n");
            sb.Append("  OrderStatusId: ").Append(OrderStatusId).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Quantity: ").Append(Quantity).Append("\n");
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
            return this.Equals(input as OrderTrack);
        }

        /// <summary>
        /// Returns true if OrderTrack instances are equal
        /// </summary>
        /// <param name="input">Instance of OrderTrack to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrderTrack input)
        {
            if (input == null)
                return false;

            return 
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
                    this.ExternalTrackId == input.ExternalTrackId ||
                    (this.ExternalTrackId != null &&
                    this.ExternalTrackId.Equals(input.ExternalTrackId))
                ) && 
                (
                    this.Fee == input.Fee ||
                    (this.Fee != null &&
                    this.Fee.Equals(input.Fee))
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
                    this.OrderId == input.OrderId ||
                    (this.OrderId != null &&
                    this.OrderId.Equals(input.OrderId))
                ) && 
                (
                    this.OrderStatusId == input.OrderStatusId ||
                    (this.OrderStatusId != null &&
                    this.OrderStatusId.Equals(input.OrderStatusId))
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
                if (this.Commission != null)
                    hashCode = hashCode * 59 + this.Commission.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.ExternalTrackId != null)
                    hashCode = hashCode * 59 + this.ExternalTrackId.GetHashCode();
                if (this.Fee != null)
                    hashCode = hashCode * 59 + this.Fee.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.OrderId != null)
                    hashCode = hashCode * 59 + this.OrderId.GetHashCode();
                if (this.OrderStatusId != null)
                    hashCode = hashCode * 59 + this.OrderStatusId.GetHashCode();
                if (this.Price != null)
                    hashCode = hashCode * 59 + this.Price.GetHashCode();
                if (this.Quantity != null)
                    hashCode = hashCode * 59 + this.Quantity.GetHashCode();
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
