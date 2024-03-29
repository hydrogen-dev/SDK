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
    /// AccountAllocationMapping Object
    /// </summary>
    [DataContract]
    public partial class AccountAllocationMapping :  IEquatable<AccountAllocationMapping>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountAllocationMapping" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AccountAllocationMapping() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountAllocationMapping" /> class.
        /// </summary>
        /// <param name="accountId">accountId (required).</param>
        /// <param name="allocationId">allocationId (required).</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="currentWeight">currentWeight (required).</param>
        /// <param name="date">date (required).</param>
        /// <param name="goalId">goalId.</param>
        /// <param name="id">id.</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="strategicWeight">strategicWeight (required).</param>
        /// <param name="updateDate">updateDate.</param>
        public AccountAllocationMapping(Guid? accountId = default(Guid?), Guid? allocationId = default(Guid?), DateTime? createDate = default(DateTime?), double? currentWeight = default(double?), DateTime? date = default(DateTime?), Guid? goalId = default(Guid?), Guid? id = default(Guid?), string secondaryId = default(string), double? strategicWeight = default(double?), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "accountId" is required (not null)
            if (accountId == null)
            {
                throw new InvalidDataException("accountId is a required property for AccountAllocationMapping and cannot be null");
            }
            else
            {
                this.AccountId = accountId;
            }
            // to ensure "allocationId" is required (not null)
            if (allocationId == null)
            {
                throw new InvalidDataException("allocationId is a required property for AccountAllocationMapping and cannot be null");
            }
            else
            {
                this.AllocationId = allocationId;
            }
            // to ensure "currentWeight" is required (not null)
            if (currentWeight == null)
            {
                throw new InvalidDataException("currentWeight is a required property for AccountAllocationMapping and cannot be null");
            }
            else
            {
                this.CurrentWeight = currentWeight;
            }
            // to ensure "date" is required (not null)
            if (date == null)
            {
                throw new InvalidDataException("date is a required property for AccountAllocationMapping and cannot be null");
            }
            else
            {
                this.Date = date;
            }
            // to ensure "strategicWeight" is required (not null)
            if (strategicWeight == null)
            {
                throw new InvalidDataException("strategicWeight is a required property for AccountAllocationMapping and cannot be null");
            }
            else
            {
                this.StrategicWeight = strategicWeight;
            }
            this.CreateDate = createDate;
            this.GoalId = goalId;
            this.Id = id;
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
        /// allocationId
        /// </summary>
        /// <value>allocationId</value>
        [DataMember(Name="allocation_id", EmitDefaultValue=false)]
        public Guid? AllocationId { get; set; }

        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// currentWeight
        /// </summary>
        /// <value>currentWeight</value>
        [DataMember(Name="current_weight", EmitDefaultValue=false)]
        public double? CurrentWeight { get; set; }

        /// <summary>
        /// date
        /// </summary>
        /// <value>date</value>
        [DataMember(Name="date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? Date { get; set; }

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
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

        /// <summary>
        /// strategicWeight
        /// </summary>
        /// <value>strategicWeight</value>
        [DataMember(Name="strategic_weight", EmitDefaultValue=false)]
        public double? StrategicWeight { get; set; }

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
            sb.Append("class AccountAllocationMapping {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  AllocationId: ").Append(AllocationId).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  CurrentWeight: ").Append(CurrentWeight).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  GoalId: ").Append(GoalId).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  StrategicWeight: ").Append(StrategicWeight).Append("\n");
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
            return this.Equals(input as AccountAllocationMapping);
        }

        /// <summary>
        /// Returns true if AccountAllocationMapping instances are equal
        /// </summary>
        /// <param name="input">Instance of AccountAllocationMapping to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AccountAllocationMapping input)
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
                    this.AllocationId == input.AllocationId ||
                    (this.AllocationId != null &&
                    this.AllocationId.Equals(input.AllocationId))
                ) && 
                (
                    this.CreateDate == input.CreateDate ||
                    (this.CreateDate != null &&
                    this.CreateDate.Equals(input.CreateDate))
                ) && 
                (
                    this.CurrentWeight == input.CurrentWeight ||
                    (this.CurrentWeight != null &&
                    this.CurrentWeight.Equals(input.CurrentWeight))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
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
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
                ) && 
                (
                    this.StrategicWeight == input.StrategicWeight ||
                    (this.StrategicWeight != null &&
                    this.StrategicWeight.Equals(input.StrategicWeight))
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
                if (this.AllocationId != null)
                    hashCode = hashCode * 59 + this.AllocationId.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.CurrentWeight != null)
                    hashCode = hashCode * 59 + this.CurrentWeight.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.GoalId != null)
                    hashCode = hashCode * 59 + this.GoalId.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.StrategicWeight != null)
                    hashCode = hashCode * 59 + this.StrategicWeight.GetHashCode();
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
