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
    /// BankLink Object
    /// </summary>
    [DataContract]
    public partial class BankLink :  IEquatable<BankLink>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BankLink" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BankLink() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BankLink" /> class.
        /// </summary>
        /// <param name="accountId">accountId.</param>
        /// <param name="availableBalance">availableBalance.</param>
        /// <param name="balance">balance.</param>
        /// <param name="bankAccountHolder">bankAccountHolder (required).</param>
        /// <param name="bankAccountName">bankAccountName.</param>
        /// <param name="bankAccountNumber">bankAccountNumber (required).</param>
        /// <param name="businessId">businessId.</param>
        /// <param name="clientId">clientId.</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="currencyCode">currencyCode.</param>
        /// <param name="id">id.</param>
        /// <param name="institutionId">institutionId.</param>
        /// <param name="institutionName">institutionName (required).</param>
        /// <param name="isActive">isActive.</param>
        /// <param name="isDefault">isDefault.</param>
        /// <param name="isLinkVerified">isLinkVerified.</param>
        /// <param name="linkVerifiedDate">linkVerifiedDate.</param>
        /// <param name="mask">mask.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="routing">routing (required).</param>
        /// <param name="routingWire">routingWire.</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="type">type.</param>
        /// <param name="updateDate">updateDate.</param>
        public BankLink(Guid? accountId = default(Guid?), double? availableBalance = default(double?), double? balance = default(double?), string bankAccountHolder = default(string), string bankAccountName = default(string), string bankAccountNumber = default(string), Guid? businessId = default(Guid?), Guid? clientId = default(Guid?), DateTime? createDate = default(DateTime?), string currencyCode = default(string), Guid? id = default(Guid?), Guid? institutionId = default(Guid?), string institutionName = default(string), bool? isActive = default(bool?), bool? isDefault = default(bool?), bool? isLinkVerified = default(bool?), DateTime? linkVerifiedDate = default(DateTime?), string mask = default(string), Dictionary<string, string> metadata = default(Dictionary<string, string>), string routing = default(string), string routingWire = default(string), string secondaryId = default(string), string type = default(string), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "bankAccountHolder" is required (not null)
            if (bankAccountHolder == null)
            {
                throw new InvalidDataException("bankAccountHolder is a required property for BankLink and cannot be null");
            }
            else
            {
                this.BankAccountHolder = bankAccountHolder;
            }
            // to ensure "bankAccountNumber" is required (not null)
            if (bankAccountNumber == null)
            {
                throw new InvalidDataException("bankAccountNumber is a required property for BankLink and cannot be null");
            }
            else
            {
                this.BankAccountNumber = bankAccountNumber;
            }
            // to ensure "institutionName" is required (not null)
            if (institutionName == null)
            {
                throw new InvalidDataException("institutionName is a required property for BankLink and cannot be null");
            }
            else
            {
                this.InstitutionName = institutionName;
            }
            // to ensure "routing" is required (not null)
            if (routing == null)
            {
                throw new InvalidDataException("routing is a required property for BankLink and cannot be null");
            }
            else
            {
                this.Routing = routing;
            }
            this.AccountId = accountId;
            this.AvailableBalance = availableBalance;
            this.Balance = balance;
            this.BankAccountName = bankAccountName;
            this.BusinessId = businessId;
            this.ClientId = clientId;
            this.CreateDate = createDate;
            this.CurrencyCode = currencyCode;
            this.Id = id;
            this.InstitutionId = institutionId;
            this.IsActive = isActive;
            this.IsDefault = isDefault;
            this.IsLinkVerified = isLinkVerified;
            this.LinkVerifiedDate = linkVerifiedDate;
            this.Mask = mask;
            this.Metadata = metadata;
            this.RoutingWire = routingWire;
            this.SecondaryId = secondaryId;
            this.Type = type;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// accountId
        /// </summary>
        /// <value>accountId</value>
        [DataMember(Name="account_id", EmitDefaultValue=false)]
        public Guid? AccountId { get; set; }

        /// <summary>
        /// availableBalance
        /// </summary>
        /// <value>availableBalance</value>
        [DataMember(Name="available_balance", EmitDefaultValue=false)]
        public double? AvailableBalance { get; set; }

        /// <summary>
        /// balance
        /// </summary>
        /// <value>balance</value>
        [DataMember(Name="balance", EmitDefaultValue=false)]
        public double? Balance { get; set; }

        /// <summary>
        /// bankAccountHolder
        /// </summary>
        /// <value>bankAccountHolder</value>
        [DataMember(Name="bank_account_holder", EmitDefaultValue=false)]
        public string BankAccountHolder { get; set; }

        /// <summary>
        /// bankAccountName
        /// </summary>
        /// <value>bankAccountName</value>
        [DataMember(Name="bank_account_name", EmitDefaultValue=false)]
        public string BankAccountName { get; set; }

        /// <summary>
        /// bankAccountNumber
        /// </summary>
        /// <value>bankAccountNumber</value>
        [DataMember(Name="bank_account_number", EmitDefaultValue=false)]
        public string BankAccountNumber { get; set; }

        /// <summary>
        /// businessId
        /// </summary>
        /// <value>businessId</value>
        [DataMember(Name="business_id", EmitDefaultValue=false)]
        public Guid? BusinessId { get; set; }

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
        /// currencyCode
        /// </summary>
        /// <value>currencyCode</value>
        [DataMember(Name="currency_code", EmitDefaultValue=false)]
        public string CurrencyCode { get; set; }

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
        /// isActive
        /// </summary>
        /// <value>isActive</value>
        [DataMember(Name="is_active", EmitDefaultValue=false)]
        public bool? IsActive { get; set; }

        /// <summary>
        /// isDefault
        /// </summary>
        /// <value>isDefault</value>
        [DataMember(Name="is_default", EmitDefaultValue=false)]
        public bool? IsDefault { get; set; }

        /// <summary>
        /// isLinkVerified
        /// </summary>
        /// <value>isLinkVerified</value>
        [DataMember(Name="is_link_verified", EmitDefaultValue=false)]
        public bool? IsLinkVerified { get; set; }

        /// <summary>
        /// linkVerifiedDate
        /// </summary>
        /// <value>linkVerifiedDate</value>
        [DataMember(Name="link_verified_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? LinkVerifiedDate { get; set; }

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
        /// routing
        /// </summary>
        /// <value>routing</value>
        [DataMember(Name="routing", EmitDefaultValue=false)]
        public string Routing { get; set; }

        /// <summary>
        /// routingWire
        /// </summary>
        /// <value>routingWire</value>
        [DataMember(Name="routing_wire", EmitDefaultValue=false)]
        public string RoutingWire { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

        /// <summary>
        /// type
        /// </summary>
        /// <value>type</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

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
            sb.Append("class BankLink {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  AvailableBalance: ").Append(AvailableBalance).Append("\n");
            sb.Append("  Balance: ").Append(Balance).Append("\n");
            sb.Append("  BankAccountHolder: ").Append(BankAccountHolder).Append("\n");
            sb.Append("  BankAccountName: ").Append(BankAccountName).Append("\n");
            sb.Append("  BankAccountNumber: ").Append(BankAccountNumber).Append("\n");
            sb.Append("  BusinessId: ").Append(BusinessId).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  CurrencyCode: ").Append(CurrencyCode).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  InstitutionId: ").Append(InstitutionId).Append("\n");
            sb.Append("  InstitutionName: ").Append(InstitutionName).Append("\n");
            sb.Append("  IsActive: ").Append(IsActive).Append("\n");
            sb.Append("  IsDefault: ").Append(IsDefault).Append("\n");
            sb.Append("  IsLinkVerified: ").Append(IsLinkVerified).Append("\n");
            sb.Append("  LinkVerifiedDate: ").Append(LinkVerifiedDate).Append("\n");
            sb.Append("  Mask: ").Append(Mask).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  Routing: ").Append(Routing).Append("\n");
            sb.Append("  RoutingWire: ").Append(RoutingWire).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return this.Equals(input as BankLink);
        }

        /// <summary>
        /// Returns true if BankLink instances are equal
        /// </summary>
        /// <param name="input">Instance of BankLink to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BankLink input)
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
                    this.AvailableBalance == input.AvailableBalance ||
                    (this.AvailableBalance != null &&
                    this.AvailableBalance.Equals(input.AvailableBalance))
                ) && 
                (
                    this.Balance == input.Balance ||
                    (this.Balance != null &&
                    this.Balance.Equals(input.Balance))
                ) && 
                (
                    this.BankAccountHolder == input.BankAccountHolder ||
                    (this.BankAccountHolder != null &&
                    this.BankAccountHolder.Equals(input.BankAccountHolder))
                ) && 
                (
                    this.BankAccountName == input.BankAccountName ||
                    (this.BankAccountName != null &&
                    this.BankAccountName.Equals(input.BankAccountName))
                ) && 
                (
                    this.BankAccountNumber == input.BankAccountNumber ||
                    (this.BankAccountNumber != null &&
                    this.BankAccountNumber.Equals(input.BankAccountNumber))
                ) && 
                (
                    this.BusinessId == input.BusinessId ||
                    (this.BusinessId != null &&
                    this.BusinessId.Equals(input.BusinessId))
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
                    this.CurrencyCode == input.CurrencyCode ||
                    (this.CurrencyCode != null &&
                    this.CurrencyCode.Equals(input.CurrencyCode))
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
                    this.IsDefault == input.IsDefault ||
                    (this.IsDefault != null &&
                    this.IsDefault.Equals(input.IsDefault))
                ) && 
                (
                    this.IsLinkVerified == input.IsLinkVerified ||
                    (this.IsLinkVerified != null &&
                    this.IsLinkVerified.Equals(input.IsLinkVerified))
                ) && 
                (
                    this.LinkVerifiedDate == input.LinkVerifiedDate ||
                    (this.LinkVerifiedDate != null &&
                    this.LinkVerifiedDate.Equals(input.LinkVerifiedDate))
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
                    this.Routing == input.Routing ||
                    (this.Routing != null &&
                    this.Routing.Equals(input.Routing))
                ) && 
                (
                    this.RoutingWire == input.RoutingWire ||
                    (this.RoutingWire != null &&
                    this.RoutingWire.Equals(input.RoutingWire))
                ) && 
                (
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
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
                if (this.AvailableBalance != null)
                    hashCode = hashCode * 59 + this.AvailableBalance.GetHashCode();
                if (this.Balance != null)
                    hashCode = hashCode * 59 + this.Balance.GetHashCode();
                if (this.BankAccountHolder != null)
                    hashCode = hashCode * 59 + this.BankAccountHolder.GetHashCode();
                if (this.BankAccountName != null)
                    hashCode = hashCode * 59 + this.BankAccountName.GetHashCode();
                if (this.BankAccountNumber != null)
                    hashCode = hashCode * 59 + this.BankAccountNumber.GetHashCode();
                if (this.BusinessId != null)
                    hashCode = hashCode * 59 + this.BusinessId.GetHashCode();
                if (this.ClientId != null)
                    hashCode = hashCode * 59 + this.ClientId.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.CurrencyCode != null)
                    hashCode = hashCode * 59 + this.CurrencyCode.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.InstitutionId != null)
                    hashCode = hashCode * 59 + this.InstitutionId.GetHashCode();
                if (this.InstitutionName != null)
                    hashCode = hashCode * 59 + this.InstitutionName.GetHashCode();
                if (this.IsActive != null)
                    hashCode = hashCode * 59 + this.IsActive.GetHashCode();
                if (this.IsDefault != null)
                    hashCode = hashCode * 59 + this.IsDefault.GetHashCode();
                if (this.IsLinkVerified != null)
                    hashCode = hashCode * 59 + this.IsLinkVerified.GetHashCode();
                if (this.LinkVerifiedDate != null)
                    hashCode = hashCode * 59 + this.LinkVerifiedDate.GetHashCode();
                if (this.Mask != null)
                    hashCode = hashCode * 59 + this.Mask.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.Routing != null)
                    hashCode = hashCode * 59 + this.Routing.GetHashCode();
                if (this.RoutingWire != null)
                    hashCode = hashCode * 59 + this.RoutingWire.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
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
