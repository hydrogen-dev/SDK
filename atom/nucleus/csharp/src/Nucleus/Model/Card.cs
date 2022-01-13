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
    /// Card Object
    /// </summary>
    [DataContract]
    public partial class Card :  IEquatable<Card>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Card" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Card() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Card" /> class.
        /// </summary>
        /// <param name="address">address.</param>
        /// <param name="businessId">businessId.</param>
        /// <param name="cardHolderName">cardHolderName (required).</param>
        /// <param name="cardImage">card_image.</param>
        /// <param name="cardIssuance">cardIssuance (required).</param>
        /// <param name="cardName">cardName (required).</param>
        /// <param name="cardNetwork">cardNetwork.</param>
        /// <param name="cardProgramId">cardProgramId.</param>
        /// <param name="cardType">cardType (required).</param>
        /// <param name="clientId">clientId.</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="creditLimit">creditLimit.</param>
        /// <param name="currencyCode">currencyCode.</param>
        /// <param name="expiryDate">expiryDate.</param>
        /// <param name="fulfillment">fulfillment.</param>
        /// <param name="id">id.</param>
        /// <param name="institutionId">institutionId.</param>
        /// <param name="institutionName">institutionName.</param>
        /// <param name="isActive">is_active.</param>
        /// <param name="isPinSet">is_pin_set.</param>
        /// <param name="isPrimary">is_primary.</param>
        /// <param name="isReloadable">is_reloadable.</param>
        /// <param name="mask">mask.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="phoneNumber">phoneNumber.</param>
        /// <param name="portfolioId">portfolioId (required).</param>
        /// <param name="prepaidAmount">prepaidAmount.</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="status">status.</param>
        /// <param name="updateDate">updateDate.</param>
        public Card(List<CardAddress> address = default(List<CardAddress>), Guid? businessId = default(Guid?), string cardHolderName = default(string), string cardImage = default(string), string cardIssuance = default(string), string cardName = default(string), string cardNetwork = default(string), Guid? cardProgramId = default(Guid?), string cardType = default(string), Guid? clientId = default(Guid?), DateTime? createDate = default(DateTime?), double? creditLimit = default(double?), string currencyCode = default(string), DateTime? expiryDate = default(DateTime?), string fulfillment = default(string), Guid? id = default(Guid?), Guid? institutionId = default(Guid?), string institutionName = default(string), bool? isActive = default(bool?), bool? isPinSet = default(bool?), bool? isPrimary = default(bool?), bool? isReloadable = default(bool?), string mask = default(string), Dictionary<string, string> metadata = default(Dictionary<string, string>), string phoneNumber = default(string), Guid? portfolioId = default(Guid?), float? prepaidAmount = default(float?), string secondaryId = default(string), string status = default(string), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "cardHolderName" is required (not null)
            if (cardHolderName == null)
            {
                throw new InvalidDataException("cardHolderName is a required property for Card and cannot be null");
            }
            else
            {
                this.CardHolderName = cardHolderName;
            }
            // to ensure "cardIssuance" is required (not null)
            if (cardIssuance == null)
            {
                throw new InvalidDataException("cardIssuance is a required property for Card and cannot be null");
            }
            else
            {
                this.CardIssuance = cardIssuance;
            }
            // to ensure "cardName" is required (not null)
            if (cardName == null)
            {
                throw new InvalidDataException("cardName is a required property for Card and cannot be null");
            }
            else
            {
                this.CardName = cardName;
            }
            // to ensure "cardType" is required (not null)
            if (cardType == null)
            {
                throw new InvalidDataException("cardType is a required property for Card and cannot be null");
            }
            else
            {
                this.CardType = cardType;
            }
            // to ensure "portfolioId" is required (not null)
            if (portfolioId == null)
            {
                throw new InvalidDataException("portfolioId is a required property for Card and cannot be null");
            }
            else
            {
                this.PortfolioId = portfolioId;
            }
            this.Address = address;
            this.BusinessId = businessId;
            this.CardImage = cardImage;
            this.CardNetwork = cardNetwork;
            this.CardProgramId = cardProgramId;
            this.ClientId = clientId;
            this.CreateDate = createDate;
            this.CreditLimit = creditLimit;
            this.CurrencyCode = currencyCode;
            this.ExpiryDate = expiryDate;
            this.Fulfillment = fulfillment;
            this.Id = id;
            this.InstitutionId = institutionId;
            this.InstitutionName = institutionName;
            this.IsActive = isActive;
            this.IsPinSet = isPinSet;
            this.IsPrimary = isPrimary;
            this.IsReloadable = isReloadable;
            this.Mask = mask;
            this.Metadata = metadata;
            this.PhoneNumber = phoneNumber;
            this.PrepaidAmount = prepaidAmount;
            this.SecondaryId = secondaryId;
            this.Status = status;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name="address", EmitDefaultValue=false)]
        public List<CardAddress> Address { get; set; }

        /// <summary>
        /// businessId
        /// </summary>
        /// <value>businessId</value>
        [DataMember(Name="business_id", EmitDefaultValue=false)]
        public Guid? BusinessId { get; set; }

        /// <summary>
        /// cardHolderName
        /// </summary>
        /// <value>cardHolderName</value>
        [DataMember(Name="card_holder_name", EmitDefaultValue=false)]
        public string CardHolderName { get; set; }

        /// <summary>
        /// card_image
        /// </summary>
        /// <value>card_image</value>
        [DataMember(Name="card_image", EmitDefaultValue=false)]
        public string CardImage { get; set; }

        /// <summary>
        /// cardIssuance
        /// </summary>
        /// <value>cardIssuance</value>
        [DataMember(Name="card_issuance", EmitDefaultValue=false)]
        public string CardIssuance { get; set; }

        /// <summary>
        /// cardName
        /// </summary>
        /// <value>cardName</value>
        [DataMember(Name="card_name", EmitDefaultValue=false)]
        public string CardName { get; set; }

        /// <summary>
        /// cardNetwork
        /// </summary>
        /// <value>cardNetwork</value>
        [DataMember(Name="card_network", EmitDefaultValue=false)]
        public string CardNetwork { get; set; }

        /// <summary>
        /// cardProgramId
        /// </summary>
        /// <value>cardProgramId</value>
        [DataMember(Name="card_program_id", EmitDefaultValue=false)]
        public Guid? CardProgramId { get; set; }

        /// <summary>
        /// cardType
        /// </summary>
        /// <value>cardType</value>
        [DataMember(Name="card_type", EmitDefaultValue=false)]
        public string CardType { get; set; }

        /// <summary>
        /// clientId
        /// </summary>
        /// <value>clientId</value>
        [DataMember(Name="client_id", EmitDefaultValue=false)]
        public Guid? ClientId { get; set; }

        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// creditLimit
        /// </summary>
        /// <value>creditLimit</value>
        [DataMember(Name="credit_limit", EmitDefaultValue=false)]
        public double? CreditLimit { get; set; }

        /// <summary>
        /// currencyCode
        /// </summary>
        /// <value>currencyCode</value>
        [DataMember(Name="currency_code", EmitDefaultValue=false)]
        public string CurrencyCode { get; set; }

        /// <summary>
        /// expiryDate
        /// </summary>
        /// <value>expiryDate</value>
        [DataMember(Name="expiry_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? ExpiryDate { get; set; }

        /// <summary>
        /// fulfillment
        /// </summary>
        /// <value>fulfillment</value>
        [DataMember(Name="fulfillment", EmitDefaultValue=false)]
        public string Fulfillment { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public Guid? Id { get; set; }

        /// <summary>
        /// institutionId
        /// </summary>
        /// <value>institutionId</value>
        [DataMember(Name="institution_id", EmitDefaultValue=false)]
        public Guid? InstitutionId { get; set; }

        /// <summary>
        /// institutionName
        /// </summary>
        /// <value>institutionName</value>
        [DataMember(Name="institution_name", EmitDefaultValue=false)]
        public string InstitutionName { get; set; }

        /// <summary>
        /// is_active
        /// </summary>
        /// <value>is_active</value>
        [DataMember(Name="is_active", EmitDefaultValue=false)]
        public bool? IsActive { get; set; }

        /// <summary>
        /// is_pin_set
        /// </summary>
        /// <value>is_pin_set</value>
        [DataMember(Name="is_pin_set", EmitDefaultValue=false)]
        public bool? IsPinSet { get; set; }

        /// <summary>
        /// is_primary
        /// </summary>
        /// <value>is_primary</value>
        [DataMember(Name="is_primary", EmitDefaultValue=false)]
        public bool? IsPrimary { get; set; }

        /// <summary>
        /// is_reloadable
        /// </summary>
        /// <value>is_reloadable</value>
        [DataMember(Name="is_reloadable", EmitDefaultValue=false)]
        public bool? IsReloadable { get; set; }

        /// <summary>
        /// mask
        /// </summary>
        /// <value>mask</value>
        [DataMember(Name="mask", EmitDefaultValue=false)]
        public string Mask { get; set; }

        /// <summary>
        /// Gets or Sets Metadata
        /// </summary>
        [DataMember(Name="metadata", EmitDefaultValue=false)]
        public Dictionary<string, string> Metadata { get; set; }

        /// <summary>
        /// phoneNumber
        /// </summary>
        /// <value>phoneNumber</value>
        [DataMember(Name="phone_number", EmitDefaultValue=false)]
        public string PhoneNumber { get; set; }

        /// <summary>
        /// portfolioId
        /// </summary>
        /// <value>portfolioId</value>
        [DataMember(Name="portfolio_id", EmitDefaultValue=false)]
        public Guid? PortfolioId { get; set; }

        /// <summary>
        /// prepaidAmount
        /// </summary>
        /// <value>prepaidAmount</value>
        [DataMember(Name="prepaid_amount", EmitDefaultValue=false)]
        public float? PrepaidAmount { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

        /// <summary>
        /// status
        /// </summary>
        /// <value>status</value>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }

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
            sb.Append("class Card {\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  BusinessId: ").Append(BusinessId).Append("\n");
            sb.Append("  CardHolderName: ").Append(CardHolderName).Append("\n");
            sb.Append("  CardImage: ").Append(CardImage).Append("\n");
            sb.Append("  CardIssuance: ").Append(CardIssuance).Append("\n");
            sb.Append("  CardName: ").Append(CardName).Append("\n");
            sb.Append("  CardNetwork: ").Append(CardNetwork).Append("\n");
            sb.Append("  CardProgramId: ").Append(CardProgramId).Append("\n");
            sb.Append("  CardType: ").Append(CardType).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  CreditLimit: ").Append(CreditLimit).Append("\n");
            sb.Append("  CurrencyCode: ").Append(CurrencyCode).Append("\n");
            sb.Append("  ExpiryDate: ").Append(ExpiryDate).Append("\n");
            sb.Append("  Fulfillment: ").Append(Fulfillment).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  InstitutionId: ").Append(InstitutionId).Append("\n");
            sb.Append("  InstitutionName: ").Append(InstitutionName).Append("\n");
            sb.Append("  IsActive: ").Append(IsActive).Append("\n");
            sb.Append("  IsPinSet: ").Append(IsPinSet).Append("\n");
            sb.Append("  IsPrimary: ").Append(IsPrimary).Append("\n");
            sb.Append("  IsReloadable: ").Append(IsReloadable).Append("\n");
            sb.Append("  Mask: ").Append(Mask).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  PhoneNumber: ").Append(PhoneNumber).Append("\n");
            sb.Append("  PortfolioId: ").Append(PortfolioId).Append("\n");
            sb.Append("  PrepaidAmount: ").Append(PrepaidAmount).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
            return this.Equals(input as Card);
        }

        /// <summary>
        /// Returns true if Card instances are equal
        /// </summary>
        /// <param name="input">Instance of Card to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Card input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Address == input.Address ||
                    this.Address != null &&
                    this.Address.SequenceEqual(input.Address)
                ) && 
                (
                    this.BusinessId == input.BusinessId ||
                    (this.BusinessId != null &&
                    this.BusinessId.Equals(input.BusinessId))
                ) && 
                (
                    this.CardHolderName == input.CardHolderName ||
                    (this.CardHolderName != null &&
                    this.CardHolderName.Equals(input.CardHolderName))
                ) && 
                (
                    this.CardImage == input.CardImage ||
                    (this.CardImage != null &&
                    this.CardImage.Equals(input.CardImage))
                ) && 
                (
                    this.CardIssuance == input.CardIssuance ||
                    (this.CardIssuance != null &&
                    this.CardIssuance.Equals(input.CardIssuance))
                ) && 
                (
                    this.CardName == input.CardName ||
                    (this.CardName != null &&
                    this.CardName.Equals(input.CardName))
                ) && 
                (
                    this.CardNetwork == input.CardNetwork ||
                    (this.CardNetwork != null &&
                    this.CardNetwork.Equals(input.CardNetwork))
                ) && 
                (
                    this.CardProgramId == input.CardProgramId ||
                    (this.CardProgramId != null &&
                    this.CardProgramId.Equals(input.CardProgramId))
                ) && 
                (
                    this.CardType == input.CardType ||
                    (this.CardType != null &&
                    this.CardType.Equals(input.CardType))
                ) && 
                (
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
                ) && 
                (
                    this.CreateDate == input.CreateDate ||
                    (this.CreateDate != null &&
                    this.CreateDate.Equals(input.CreateDate))
                ) && 
                (
                    this.CreditLimit == input.CreditLimit ||
                    (this.CreditLimit != null &&
                    this.CreditLimit.Equals(input.CreditLimit))
                ) && 
                (
                    this.CurrencyCode == input.CurrencyCode ||
                    (this.CurrencyCode != null &&
                    this.CurrencyCode.Equals(input.CurrencyCode))
                ) && 
                (
                    this.ExpiryDate == input.ExpiryDate ||
                    (this.ExpiryDate != null &&
                    this.ExpiryDate.Equals(input.ExpiryDate))
                ) && 
                (
                    this.Fulfillment == input.Fulfillment ||
                    (this.Fulfillment != null &&
                    this.Fulfillment.Equals(input.Fulfillment))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.InstitutionId == input.InstitutionId ||
                    (this.InstitutionId != null &&
                    this.InstitutionId.Equals(input.InstitutionId))
                ) && 
                (
                    this.InstitutionName == input.InstitutionName ||
                    (this.InstitutionName != null &&
                    this.InstitutionName.Equals(input.InstitutionName))
                ) && 
                (
                    this.IsActive == input.IsActive ||
                    (this.IsActive != null &&
                    this.IsActive.Equals(input.IsActive))
                ) && 
                (
                    this.IsPinSet == input.IsPinSet ||
                    (this.IsPinSet != null &&
                    this.IsPinSet.Equals(input.IsPinSet))
                ) && 
                (
                    this.IsPrimary == input.IsPrimary ||
                    (this.IsPrimary != null &&
                    this.IsPrimary.Equals(input.IsPrimary))
                ) && 
                (
                    this.IsReloadable == input.IsReloadable ||
                    (this.IsReloadable != null &&
                    this.IsReloadable.Equals(input.IsReloadable))
                ) && 
                (
                    this.Mask == input.Mask ||
                    (this.Mask != null &&
                    this.Mask.Equals(input.Mask))
                ) && 
                (
                    this.Metadata == input.Metadata ||
                    this.Metadata != null &&
                    this.Metadata.SequenceEqual(input.Metadata)
                ) && 
                (
                    this.PhoneNumber == input.PhoneNumber ||
                    (this.PhoneNumber != null &&
                    this.PhoneNumber.Equals(input.PhoneNumber))
                ) && 
                (
                    this.PortfolioId == input.PortfolioId ||
                    (this.PortfolioId != null &&
                    this.PortfolioId.Equals(input.PortfolioId))
                ) && 
                (
                    this.PrepaidAmount == input.PrepaidAmount ||
                    (this.PrepaidAmount != null &&
                    this.PrepaidAmount.Equals(input.PrepaidAmount))
                ) && 
                (
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
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
                if (this.Address != null)
                    hashCode = hashCode * 59 + this.Address.GetHashCode();
                if (this.BusinessId != null)
                    hashCode = hashCode * 59 + this.BusinessId.GetHashCode();
                if (this.CardHolderName != null)
                    hashCode = hashCode * 59 + this.CardHolderName.GetHashCode();
                if (this.CardImage != null)
                    hashCode = hashCode * 59 + this.CardImage.GetHashCode();
                if (this.CardIssuance != null)
                    hashCode = hashCode * 59 + this.CardIssuance.GetHashCode();
                if (this.CardName != null)
                    hashCode = hashCode * 59 + this.CardName.GetHashCode();
                if (this.CardNetwork != null)
                    hashCode = hashCode * 59 + this.CardNetwork.GetHashCode();
                if (this.CardProgramId != null)
                    hashCode = hashCode * 59 + this.CardProgramId.GetHashCode();
                if (this.CardType != null)
                    hashCode = hashCode * 59 + this.CardType.GetHashCode();
                if (this.ClientId != null)
                    hashCode = hashCode * 59 + this.ClientId.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.CreditLimit != null)
                    hashCode = hashCode * 59 + this.CreditLimit.GetHashCode();
                if (this.CurrencyCode != null)
                    hashCode = hashCode * 59 + this.CurrencyCode.GetHashCode();
                if (this.ExpiryDate != null)
                    hashCode = hashCode * 59 + this.ExpiryDate.GetHashCode();
                if (this.Fulfillment != null)
                    hashCode = hashCode * 59 + this.Fulfillment.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.InstitutionId != null)
                    hashCode = hashCode * 59 + this.InstitutionId.GetHashCode();
                if (this.InstitutionName != null)
                    hashCode = hashCode * 59 + this.InstitutionName.GetHashCode();
                if (this.IsActive != null)
                    hashCode = hashCode * 59 + this.IsActive.GetHashCode();
                if (this.IsPinSet != null)
                    hashCode = hashCode * 59 + this.IsPinSet.GetHashCode();
                if (this.IsPrimary != null)
                    hashCode = hashCode * 59 + this.IsPrimary.GetHashCode();
                if (this.IsReloadable != null)
                    hashCode = hashCode * 59 + this.IsReloadable.GetHashCode();
                if (this.Mask != null)
                    hashCode = hashCode * 59 + this.Mask.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.PhoneNumber != null)
                    hashCode = hashCode * 59 + this.PhoneNumber.GetHashCode();
                if (this.PortfolioId != null)
                    hashCode = hashCode * 59 + this.PortfolioId.GetHashCode();
                if (this.PrepaidAmount != null)
                    hashCode = hashCode * 59 + this.PrepaidAmount.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
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
