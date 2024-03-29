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
    /// Budget Object
    /// </summary>
    [DataContract]
    public partial class Budget :  IEquatable<Budget>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Budget" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Budget() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Budget" /> class.
        /// </summary>
        /// <param name="accountId">accountId.</param>
        /// <param name="aggregationAccounts">aggregationAccounts.</param>
        /// <param name="budget">budget.</param>
        /// <param name="cardId">cardId.</param>
        /// <param name="clientId">clientId (required).</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="currencyCode">currencyCode (required).</param>
        /// <param name="endDate">endDate.</param>
        /// <param name="frequency">frequency.</param>
        /// <param name="frequencyUnit">frequencyUnit (required).</param>
        /// <param name="goalId">goalId.</param>
        /// <param name="id">id.</param>
        /// <param name="isActive">is_active.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="name">name (required).</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="startDate">startDate.</param>
        /// <param name="totalValue">totalValue.</param>
        /// <param name="updateDate">updateDate.</param>
        public Budget(Guid? accountId = default(Guid?), List<BudgetAggregationAccount> aggregationAccounts = default(List<BudgetAggregationAccount>), List<BudgetObject> budget = default(List<BudgetObject>), Guid? cardId = default(Guid?), Guid? clientId = default(Guid?), DateTime? createDate = default(DateTime?), string currencyCode = default(string), DateTime? endDate = default(DateTime?), int? frequency = default(int?), string frequencyUnit = default(string), Guid? goalId = default(Guid?), Guid? id = default(Guid?), bool? isActive = default(bool?), Dictionary<string, string> metadata = default(Dictionary<string, string>), string name = default(string), string secondaryId = default(string), DateTime? startDate = default(DateTime?), double? totalValue = default(double?), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "clientId" is required (not null)
            if (clientId == null)
            {
                throw new InvalidDataException("clientId is a required property for Budget and cannot be null");
            }
            else
            {
                this.ClientId = clientId;
            }
            // to ensure "currencyCode" is required (not null)
            if (currencyCode == null)
            {
                throw new InvalidDataException("currencyCode is a required property for Budget and cannot be null");
            }
            else
            {
                this.CurrencyCode = currencyCode;
            }
            // to ensure "frequencyUnit" is required (not null)
            if (frequencyUnit == null)
            {
                throw new InvalidDataException("frequencyUnit is a required property for Budget and cannot be null");
            }
            else
            {
                this.FrequencyUnit = frequencyUnit;
            }
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new InvalidDataException("name is a required property for Budget and cannot be null");
            }
            else
            {
                this.Name = name;
            }
            this.AccountId = accountId;
            this.AggregationAccounts = aggregationAccounts;
            this._Budget = budget;
            this.CardId = cardId;
            this.CreateDate = createDate;
            this.EndDate = endDate;
            this.Frequency = frequency;
            this.GoalId = goalId;
            this.Id = id;
            this.IsActive = isActive;
            this.Metadata = metadata;
            this.SecondaryId = secondaryId;
            this.StartDate = startDate;
            this.TotalValue = totalValue;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// accountId
        /// </summary>
        /// <value>accountId</value>
        [DataMember(Name="account_id", EmitDefaultValue=false)]
        public Guid? AccountId { get; set; }

        /// <summary>
        /// Gets or Sets AggregationAccounts
        /// </summary>
        [DataMember(Name="aggregation_accounts", EmitDefaultValue=false)]
        public List<BudgetAggregationAccount> AggregationAccounts { get; set; }

        /// <summary>
        /// Gets or Sets _Budget
        /// </summary>
        [DataMember(Name="budget", EmitDefaultValue=false)]
        public List<BudgetObject> _Budget { get; set; }

        /// <summary>
        /// cardId
        /// </summary>
        /// <value>cardId</value>
        [DataMember(Name="card_id", EmitDefaultValue=false)]
        public Guid? CardId { get; set; }

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
        /// endDate
        /// </summary>
        /// <value>endDate</value>
        [DataMember(Name="end_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? EndDate { get; set; }

        /// <summary>
        /// frequency
        /// </summary>
        /// <value>frequency</value>
        [DataMember(Name="frequency", EmitDefaultValue=false)]
        public int? Frequency { get; set; }

        /// <summary>
        /// frequencyUnit
        /// </summary>
        /// <value>frequencyUnit</value>
        [DataMember(Name="frequency_unit", EmitDefaultValue=false)]
        public string FrequencyUnit { get; set; }

        /// <summary>
        /// goalId
        /// </summary>
        /// <value>goalId</value>
        [DataMember(Name="goal_id", EmitDefaultValue=false)]
        public Guid? GoalId { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public Guid? Id { get; set; }

        /// <summary>
        /// is_active
        /// </summary>
        /// <value>is_active</value>
        [DataMember(Name="is_active", EmitDefaultValue=false)]
        public bool? IsActive { get; set; }

        /// <summary>
        /// Gets or Sets Metadata
        /// </summary>
        [DataMember(Name="metadata", EmitDefaultValue=false)]
        public Dictionary<string, string> Metadata { get; set; }

        /// <summary>
        /// name
        /// </summary>
        /// <value>name</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

        /// <summary>
        /// startDate
        /// </summary>
        /// <value>startDate</value>
        [DataMember(Name="start_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? StartDate { get; set; }

        /// <summary>
        /// totalValue
        /// </summary>
        /// <value>totalValue</value>
        [DataMember(Name="total_value", EmitDefaultValue=false)]
        public double? TotalValue { get; set; }

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
            sb.Append("class Budget {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  AggregationAccounts: ").Append(AggregationAccounts).Append("\n");
            sb.Append("  _Budget: ").Append(_Budget).Append("\n");
            sb.Append("  CardId: ").Append(CardId).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  CurrencyCode: ").Append(CurrencyCode).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
            sb.Append("  FrequencyUnit: ").Append(FrequencyUnit).Append("\n");
            sb.Append("  GoalId: ").Append(GoalId).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsActive: ").Append(IsActive).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  TotalValue: ").Append(TotalValue).Append("\n");
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
            return this.Equals(input as Budget);
        }

        /// <summary>
        /// Returns true if Budget instances are equal
        /// </summary>
        /// <param name="input">Instance of Budget to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Budget input)
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
                    this.AggregationAccounts == input.AggregationAccounts ||
                    this.AggregationAccounts != null &&
                    this.AggregationAccounts.SequenceEqual(input.AggregationAccounts)
                ) && 
                (
                    this._Budget == input._Budget ||
                    this._Budget != null &&
                    this._Budget.SequenceEqual(input._Budget)
                ) && 
                (
                    this.CardId == input.CardId ||
                    (this.CardId != null &&
                    this.CardId.Equals(input.CardId))
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
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.Frequency == input.Frequency ||
                    (this.Frequency != null &&
                    this.Frequency.Equals(input.Frequency))
                ) && 
                (
                    this.FrequencyUnit == input.FrequencyUnit ||
                    (this.FrequencyUnit != null &&
                    this.FrequencyUnit.Equals(input.FrequencyUnit))
                ) && 
                (
                    this.GoalId == input.GoalId ||
                    (this.GoalId != null &&
                    this.GoalId.Equals(input.GoalId))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.IsActive == input.IsActive ||
                    (this.IsActive != null &&
                    this.IsActive.Equals(input.IsActive))
                ) && 
                (
                    this.Metadata == input.Metadata ||
                    this.Metadata != null &&
                    this.Metadata.SequenceEqual(input.Metadata)
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.TotalValue == input.TotalValue ||
                    (this.TotalValue != null &&
                    this.TotalValue.Equals(input.TotalValue))
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
                if (this.AggregationAccounts != null)
                    hashCode = hashCode * 59 + this.AggregationAccounts.GetHashCode();
                if (this._Budget != null)
                    hashCode = hashCode * 59 + this._Budget.GetHashCode();
                if (this.CardId != null)
                    hashCode = hashCode * 59 + this.CardId.GetHashCode();
                if (this.ClientId != null)
                    hashCode = hashCode * 59 + this.ClientId.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.CurrencyCode != null)
                    hashCode = hashCode * 59 + this.CurrencyCode.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                if (this.Frequency != null)
                    hashCode = hashCode * 59 + this.Frequency.GetHashCode();
                if (this.FrequencyUnit != null)
                    hashCode = hashCode * 59 + this.FrequencyUnit.GetHashCode();
                if (this.GoalId != null)
                    hashCode = hashCode * 59 + this.GoalId.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.IsActive != null)
                    hashCode = hashCode * 59 + this.IsActive.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.StartDate != null)
                    hashCode = hashCode * 59 + this.StartDate.GetHashCode();
                if (this.TotalValue != null)
                    hashCode = hashCode * 59 + this.TotalValue.GetHashCode();
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
