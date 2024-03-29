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
    /// ExternalAccountTransfer
    /// </summary>
    [DataContract]
    public partial class ExternalAccountTransfer :  IEquatable<ExternalAccountTransfer>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ExternalAccountTransfer" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ExternalAccountTransfer() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ExternalAccountTransfer" /> class.
        /// </summary>
        /// <param name="accountHolder">External Account Transfer accountHolder (required).</param>
        /// <param name="accountId">External Account Transfer account id (required).</param>
        /// <param name="accountNumber">External Account Transfer account number (required).</param>
        /// <param name="accountTypeId">External Account Transfer account type id (required).</param>
        /// <param name="amount">External Account Transfer amount.</param>
        /// <param name="comment">External Account Transfer comment.</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="currencyCode">currencyCode.</param>
        /// <param name="dtcNumber">External Account Transfer dtcNumber.</param>
        /// <param name="firmName">External Account Transfer firm name (required).</param>
        /// <param name="id">id.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="receivedDate">receivedDate.</param>
        /// <param name="rothFiveYear">External Account Transfer roth five year.</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="status">External Account Transfer status.</param>
        /// <param name="statusTimeStamp">statusTimeStamp.</param>
        /// <param name="transferAllCash">External Account Transfer transfer all cash (required).</param>
        /// <param name="transferDate">External Account Transfer account transfer date (required).</param>
        /// <param name="transferType">External Account Transfer transfer type.</param>
        /// <param name="updateDate">updateDate.</param>
        public ExternalAccountTransfer(string accountHolder = default(string), Guid? accountId = default(Guid?), string accountNumber = default(string), Guid? accountTypeId = default(Guid?), double? amount = default(double?), string comment = default(string), DateTime? createDate = default(DateTime?), string currencyCode = default(string), string dtcNumber = default(string), string firmName = default(string), Guid? id = default(Guid?), Dictionary<string, string> metadata = default(Dictionary<string, string>), DateTime? receivedDate = default(DateTime?), int? rothFiveYear = default(int?), string secondaryId = default(string), string status = default(string), DateTime? statusTimeStamp = default(DateTime?), bool? transferAllCash = default(bool?), DateTime? transferDate = default(DateTime?), string transferType = default(string), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "accountHolder" is required (not null)
            if (accountHolder == null)
            {
                throw new InvalidDataException("accountHolder is a required property for ExternalAccountTransfer and cannot be null");
            }
            else
            {
                this.AccountHolder = accountHolder;
            }
            // to ensure "accountId" is required (not null)
            if (accountId == null)
            {
                throw new InvalidDataException("accountId is a required property for ExternalAccountTransfer and cannot be null");
            }
            else
            {
                this.AccountId = accountId;
            }
            // to ensure "accountNumber" is required (not null)
            if (accountNumber == null)
            {
                throw new InvalidDataException("accountNumber is a required property for ExternalAccountTransfer and cannot be null");
            }
            else
            {
                this.AccountNumber = accountNumber;
            }
            // to ensure "accountTypeId" is required (not null)
            if (accountTypeId == null)
            {
                throw new InvalidDataException("accountTypeId is a required property for ExternalAccountTransfer and cannot be null");
            }
            else
            {
                this.AccountTypeId = accountTypeId;
            }
            // to ensure "firmName" is required (not null)
            if (firmName == null)
            {
                throw new InvalidDataException("firmName is a required property for ExternalAccountTransfer and cannot be null");
            }
            else
            {
                this.FirmName = firmName;
            }
            // to ensure "transferAllCash" is required (not null)
            if (transferAllCash == null)
            {
                throw new InvalidDataException("transferAllCash is a required property for ExternalAccountTransfer and cannot be null");
            }
            else
            {
                this.TransferAllCash = transferAllCash;
            }
            // to ensure "transferDate" is required (not null)
            if (transferDate == null)
            {
                throw new InvalidDataException("transferDate is a required property for ExternalAccountTransfer and cannot be null");
            }
            else
            {
                this.TransferDate = transferDate;
            }
            this.Amount = amount;
            this.Comment = comment;
            this.CreateDate = createDate;
            this.CurrencyCode = currencyCode;
            this.DtcNumber = dtcNumber;
            this.Id = id;
            this.Metadata = metadata;
            this.ReceivedDate = receivedDate;
            this.RothFiveYear = rothFiveYear;
            this.SecondaryId = secondaryId;
            this.Status = status;
            this.StatusTimeStamp = statusTimeStamp;
            this.TransferType = transferType;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// External Account Transfer accountHolder
        /// </summary>
        /// <value>External Account Transfer accountHolder</value>
        [DataMember(Name="account_holder", EmitDefaultValue=false)]
        public string AccountHolder { get; set; }

        /// <summary>
        /// External Account Transfer account id
        /// </summary>
        /// <value>External Account Transfer account id</value>
        [DataMember(Name="account_id", EmitDefaultValue=false)]
        public Guid? AccountId { get; set; }

        /// <summary>
        /// External Account Transfer account number
        /// </summary>
        /// <value>External Account Transfer account number</value>
        [DataMember(Name="account_number", EmitDefaultValue=false)]
        public string AccountNumber { get; set; }

        /// <summary>
        /// External Account Transfer account type id
        /// </summary>
        /// <value>External Account Transfer account type id</value>
        [DataMember(Name="account_type_id", EmitDefaultValue=false)]
        public Guid? AccountTypeId { get; set; }

        /// <summary>
        /// External Account Transfer amount
        /// </summary>
        /// <value>External Account Transfer amount</value>
        [DataMember(Name="amount", EmitDefaultValue=false)]
        public double? Amount { get; set; }

        /// <summary>
        /// External Account Transfer comment
        /// </summary>
        /// <value>External Account Transfer comment</value>
        [DataMember(Name="comment", EmitDefaultValue=false)]
        public string Comment { get; set; }

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
        /// External Account Transfer dtcNumber
        /// </summary>
        /// <value>External Account Transfer dtcNumber</value>
        [DataMember(Name="dtc_number", EmitDefaultValue=false)]
        public string DtcNumber { get; set; }

        /// <summary>
        /// External Account Transfer firm name
        /// </summary>
        /// <value>External Account Transfer firm name</value>
        [DataMember(Name="firm_name", EmitDefaultValue=false)]
        public string FirmName { get; set; }

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
        /// Gets or Sets ReceivedDate
        /// </summary>
        [DataMember(Name="received_date", EmitDefaultValue=false)]
        public DateTime? ReceivedDate { get; set; }

        /// <summary>
        /// External Account Transfer roth five year
        /// </summary>
        /// <value>External Account Transfer roth five year</value>
        [DataMember(Name="roth_five_year", EmitDefaultValue=false)]
        public int? RothFiveYear { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

        /// <summary>
        /// External Account Transfer status
        /// </summary>
        /// <value>External Account Transfer status</value>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// Gets or Sets StatusTimeStamp
        /// </summary>
        [DataMember(Name="status_time_stamp", EmitDefaultValue=false)]
        public DateTime? StatusTimeStamp { get; set; }

        /// <summary>
        /// External Account Transfer transfer all cash
        /// </summary>
        /// <value>External Account Transfer transfer all cash</value>
        [DataMember(Name="transfer_all_cash", EmitDefaultValue=false)]
        public bool? TransferAllCash { get; set; }

        /// <summary>
        /// External Account Transfer account transfer date
        /// </summary>
        /// <value>External Account Transfer account transfer date</value>
        [DataMember(Name="transfer_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? TransferDate { get; set; }

        /// <summary>
        /// External Account Transfer transfer type
        /// </summary>
        /// <value>External Account Transfer transfer type</value>
        [DataMember(Name="transfer_type", EmitDefaultValue=false)]
        public string TransferType { get; set; }

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
            sb.Append("class ExternalAccountTransfer {\n");
            sb.Append("  AccountHolder: ").Append(AccountHolder).Append("\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  AccountNumber: ").Append(AccountNumber).Append("\n");
            sb.Append("  AccountTypeId: ").Append(AccountTypeId).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  CurrencyCode: ").Append(CurrencyCode).Append("\n");
            sb.Append("  DtcNumber: ").Append(DtcNumber).Append("\n");
            sb.Append("  FirmName: ").Append(FirmName).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  ReceivedDate: ").Append(ReceivedDate).Append("\n");
            sb.Append("  RothFiveYear: ").Append(RothFiveYear).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  StatusTimeStamp: ").Append(StatusTimeStamp).Append("\n");
            sb.Append("  TransferAllCash: ").Append(TransferAllCash).Append("\n");
            sb.Append("  TransferDate: ").Append(TransferDate).Append("\n");
            sb.Append("  TransferType: ").Append(TransferType).Append("\n");
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
            return this.Equals(input as ExternalAccountTransfer);
        }

        /// <summary>
        /// Returns true if ExternalAccountTransfer instances are equal
        /// </summary>
        /// <param name="input">Instance of ExternalAccountTransfer to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ExternalAccountTransfer input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AccountHolder == input.AccountHolder ||
                    (this.AccountHolder != null &&
                    this.AccountHolder.Equals(input.AccountHolder))
                ) && 
                (
                    this.AccountId == input.AccountId ||
                    (this.AccountId != null &&
                    this.AccountId.Equals(input.AccountId))
                ) && 
                (
                    this.AccountNumber == input.AccountNumber ||
                    (this.AccountNumber != null &&
                    this.AccountNumber.Equals(input.AccountNumber))
                ) && 
                (
                    this.AccountTypeId == input.AccountTypeId ||
                    (this.AccountTypeId != null &&
                    this.AccountTypeId.Equals(input.AccountTypeId))
                ) && 
                (
                    this.Amount == input.Amount ||
                    (this.Amount != null &&
                    this.Amount.Equals(input.Amount))
                ) && 
                (
                    this.Comment == input.Comment ||
                    (this.Comment != null &&
                    this.Comment.Equals(input.Comment))
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
                    this.DtcNumber == input.DtcNumber ||
                    (this.DtcNumber != null &&
                    this.DtcNumber.Equals(input.DtcNumber))
                ) && 
                (
                    this.FirmName == input.FirmName ||
                    (this.FirmName != null &&
                    this.FirmName.Equals(input.FirmName))
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
                    this.ReceivedDate == input.ReceivedDate ||
                    (this.ReceivedDate != null &&
                    this.ReceivedDate.Equals(input.ReceivedDate))
                ) && 
                (
                    this.RothFiveYear == input.RothFiveYear ||
                    (this.RothFiveYear != null &&
                    this.RothFiveYear.Equals(input.RothFiveYear))
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
                    this.StatusTimeStamp == input.StatusTimeStamp ||
                    (this.StatusTimeStamp != null &&
                    this.StatusTimeStamp.Equals(input.StatusTimeStamp))
                ) && 
                (
                    this.TransferAllCash == input.TransferAllCash ||
                    (this.TransferAllCash != null &&
                    this.TransferAllCash.Equals(input.TransferAllCash))
                ) && 
                (
                    this.TransferDate == input.TransferDate ||
                    (this.TransferDate != null &&
                    this.TransferDate.Equals(input.TransferDate))
                ) && 
                (
                    this.TransferType == input.TransferType ||
                    (this.TransferType != null &&
                    this.TransferType.Equals(input.TransferType))
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
                if (this.AccountHolder != null)
                    hashCode = hashCode * 59 + this.AccountHolder.GetHashCode();
                if (this.AccountId != null)
                    hashCode = hashCode * 59 + this.AccountId.GetHashCode();
                if (this.AccountNumber != null)
                    hashCode = hashCode * 59 + this.AccountNumber.GetHashCode();
                if (this.AccountTypeId != null)
                    hashCode = hashCode * 59 + this.AccountTypeId.GetHashCode();
                if (this.Amount != null)
                    hashCode = hashCode * 59 + this.Amount.GetHashCode();
                if (this.Comment != null)
                    hashCode = hashCode * 59 + this.Comment.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.CurrencyCode != null)
                    hashCode = hashCode * 59 + this.CurrencyCode.GetHashCode();
                if (this.DtcNumber != null)
                    hashCode = hashCode * 59 + this.DtcNumber.GetHashCode();
                if (this.FirmName != null)
                    hashCode = hashCode * 59 + this.FirmName.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.ReceivedDate != null)
                    hashCode = hashCode * 59 + this.ReceivedDate.GetHashCode();
                if (this.RothFiveYear != null)
                    hashCode = hashCode * 59 + this.RothFiveYear.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.StatusTimeStamp != null)
                    hashCode = hashCode * 59 + this.StatusTimeStamp.GetHashCode();
                if (this.TransferAllCash != null)
                    hashCode = hashCode * 59 + this.TransferAllCash.GetHashCode();
                if (this.TransferDate != null)
                    hashCode = hashCode * 59 + this.TransferDate.GetHashCode();
                if (this.TransferType != null)
                    hashCode = hashCode * 59 + this.TransferType.GetHashCode();
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
