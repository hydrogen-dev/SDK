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
    /// ClientViewGoalData
    /// </summary>
    [DataContract]
    public partial class ClientViewGoalData :  IEquatable<ClientViewGoalData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientViewGoalData" /> class.
        /// </summary>
        /// <param name="accounts">accounts.</param>
        /// <param name="accumulationHorizon">accumulationHorizon.</param>
        /// <param name="decumulationHorizon">decumulationHorizon.</param>
        /// <param name="goalAmount">goalAmount.</param>
        /// <param name="goalAssetSizeByGoal">goalAssetSizeByGoal.</param>
        /// <param name="goalAssetSizeByGoalDate">goalAssetSizeByGoalDate.</param>
        /// <param name="goalCategory">goalCategory.</param>
        /// <param name="goalCreateDate">goalCreateDate.</param>
        /// <param name="goalId">goalId.</param>
        /// <param name="goalName">goalName.</param>
        /// <param name="goalType">goalType.</param>
        /// <param name="goalUpdateDate">goalUpdateDate.</param>
        /// <param name="isDecumulation">isDecumulation.</param>
        /// <param name="portfolios">portfolios.</param>
        public ClientViewGoalData(List<VAccountVO> accounts = default(List<VAccountVO>), double? accumulationHorizon = default(double?), double? decumulationHorizon = default(double?), double? goalAmount = default(double?), double? goalAssetSizeByGoal = default(double?), DateTime? goalAssetSizeByGoalDate = default(DateTime?), string goalCategory = default(string), DateTime? goalCreateDate = default(DateTime?), Guid? goalId = default(Guid?), string goalName = default(string), string goalType = default(string), DateTime? goalUpdateDate = default(DateTime?), bool? isDecumulation = default(bool?), List<VPortfolioVO> portfolios = default(List<VPortfolioVO>))
        {
            this.Accounts = accounts;
            this.AccumulationHorizon = accumulationHorizon;
            this.DecumulationHorizon = decumulationHorizon;
            this.GoalAmount = goalAmount;
            this.GoalAssetSizeByGoal = goalAssetSizeByGoal;
            this.GoalAssetSizeByGoalDate = goalAssetSizeByGoalDate;
            this.GoalCategory = goalCategory;
            this.GoalCreateDate = goalCreateDate;
            this.GoalId = goalId;
            this.GoalName = goalName;
            this.GoalType = goalType;
            this.GoalUpdateDate = goalUpdateDate;
            this.IsDecumulation = isDecumulation;
            this.Portfolios = portfolios;
        }
        
        /// <summary>
        /// Gets or Sets Accounts
        /// </summary>
        [DataMember(Name="accounts", EmitDefaultValue=false)]
        public List<VAccountVO> Accounts { get; set; }

        /// <summary>
        /// Gets or Sets AccumulationHorizon
        /// </summary>
        [DataMember(Name="accumulation_horizon", EmitDefaultValue=false)]
        public double? AccumulationHorizon { get; set; }

        /// <summary>
        /// Gets or Sets DecumulationHorizon
        /// </summary>
        [DataMember(Name="decumulation_horizon", EmitDefaultValue=false)]
        public double? DecumulationHorizon { get; set; }

        /// <summary>
        /// Gets or Sets GoalAmount
        /// </summary>
        [DataMember(Name="goal_amount", EmitDefaultValue=false)]
        public double? GoalAmount { get; set; }

        /// <summary>
        /// Gets or Sets GoalAssetSizeByGoal
        /// </summary>
        [DataMember(Name="goal_asset_size_by_goal", EmitDefaultValue=false)]
        public double? GoalAssetSizeByGoal { get; set; }

        /// <summary>
        /// Gets or Sets GoalAssetSizeByGoalDate
        /// </summary>
        [DataMember(Name="goal_asset_size_by_goal_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? GoalAssetSizeByGoalDate { get; set; }

        /// <summary>
        /// Gets or Sets GoalCategory
        /// </summary>
        [DataMember(Name="goal_category", EmitDefaultValue=false)]
        public string GoalCategory { get; set; }

        /// <summary>
        /// Gets or Sets GoalCreateDate
        /// </summary>
        [DataMember(Name="goal_create_date", EmitDefaultValue=false)]
        public DateTime? GoalCreateDate { get; set; }

        /// <summary>
        /// Gets or Sets GoalId
        /// </summary>
        [DataMember(Name="goal_id", EmitDefaultValue=false)]
        public Guid? GoalId { get; set; }

        /// <summary>
        /// Gets or Sets GoalName
        /// </summary>
        [DataMember(Name="goal_name", EmitDefaultValue=false)]
        public string GoalName { get; set; }

        /// <summary>
        /// Gets or Sets GoalType
        /// </summary>
        [DataMember(Name="goal_type", EmitDefaultValue=false)]
        public string GoalType { get; set; }

        /// <summary>
        /// Gets or Sets GoalUpdateDate
        /// </summary>
        [DataMember(Name="goal_update_date", EmitDefaultValue=false)]
        public DateTime? GoalUpdateDate { get; set; }

        /// <summary>
        /// Gets or Sets IsDecumulation
        /// </summary>
        [DataMember(Name="is_decumulation", EmitDefaultValue=false)]
        public bool? IsDecumulation { get; set; }

        /// <summary>
        /// Gets or Sets Portfolios
        /// </summary>
        [DataMember(Name="portfolios", EmitDefaultValue=false)]
        public List<VPortfolioVO> Portfolios { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ClientViewGoalData {\n");
            sb.Append("  Accounts: ").Append(Accounts).Append("\n");
            sb.Append("  AccumulationHorizon: ").Append(AccumulationHorizon).Append("\n");
            sb.Append("  DecumulationHorizon: ").Append(DecumulationHorizon).Append("\n");
            sb.Append("  GoalAmount: ").Append(GoalAmount).Append("\n");
            sb.Append("  GoalAssetSizeByGoal: ").Append(GoalAssetSizeByGoal).Append("\n");
            sb.Append("  GoalAssetSizeByGoalDate: ").Append(GoalAssetSizeByGoalDate).Append("\n");
            sb.Append("  GoalCategory: ").Append(GoalCategory).Append("\n");
            sb.Append("  GoalCreateDate: ").Append(GoalCreateDate).Append("\n");
            sb.Append("  GoalId: ").Append(GoalId).Append("\n");
            sb.Append("  GoalName: ").Append(GoalName).Append("\n");
            sb.Append("  GoalType: ").Append(GoalType).Append("\n");
            sb.Append("  GoalUpdateDate: ").Append(GoalUpdateDate).Append("\n");
            sb.Append("  IsDecumulation: ").Append(IsDecumulation).Append("\n");
            sb.Append("  Portfolios: ").Append(Portfolios).Append("\n");
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
            return this.Equals(input as ClientViewGoalData);
        }

        /// <summary>
        /// Returns true if ClientViewGoalData instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientViewGoalData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientViewGoalData input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Accounts == input.Accounts ||
                    this.Accounts != null &&
                    this.Accounts.SequenceEqual(input.Accounts)
                ) && 
                (
                    this.AccumulationHorizon == input.AccumulationHorizon ||
                    (this.AccumulationHorizon != null &&
                    this.AccumulationHorizon.Equals(input.AccumulationHorizon))
                ) && 
                (
                    this.DecumulationHorizon == input.DecumulationHorizon ||
                    (this.DecumulationHorizon != null &&
                    this.DecumulationHorizon.Equals(input.DecumulationHorizon))
                ) && 
                (
                    this.GoalAmount == input.GoalAmount ||
                    (this.GoalAmount != null &&
                    this.GoalAmount.Equals(input.GoalAmount))
                ) && 
                (
                    this.GoalAssetSizeByGoal == input.GoalAssetSizeByGoal ||
                    (this.GoalAssetSizeByGoal != null &&
                    this.GoalAssetSizeByGoal.Equals(input.GoalAssetSizeByGoal))
                ) && 
                (
                    this.GoalAssetSizeByGoalDate == input.GoalAssetSizeByGoalDate ||
                    (this.GoalAssetSizeByGoalDate != null &&
                    this.GoalAssetSizeByGoalDate.Equals(input.GoalAssetSizeByGoalDate))
                ) && 
                (
                    this.GoalCategory == input.GoalCategory ||
                    (this.GoalCategory != null &&
                    this.GoalCategory.Equals(input.GoalCategory))
                ) && 
                (
                    this.GoalCreateDate == input.GoalCreateDate ||
                    (this.GoalCreateDate != null &&
                    this.GoalCreateDate.Equals(input.GoalCreateDate))
                ) && 
                (
                    this.GoalId == input.GoalId ||
                    (this.GoalId != null &&
                    this.GoalId.Equals(input.GoalId))
                ) && 
                (
                    this.GoalName == input.GoalName ||
                    (this.GoalName != null &&
                    this.GoalName.Equals(input.GoalName))
                ) && 
                (
                    this.GoalType == input.GoalType ||
                    (this.GoalType != null &&
                    this.GoalType.Equals(input.GoalType))
                ) && 
                (
                    this.GoalUpdateDate == input.GoalUpdateDate ||
                    (this.GoalUpdateDate != null &&
                    this.GoalUpdateDate.Equals(input.GoalUpdateDate))
                ) && 
                (
                    this.IsDecumulation == input.IsDecumulation ||
                    (this.IsDecumulation != null &&
                    this.IsDecumulation.Equals(input.IsDecumulation))
                ) && 
                (
                    this.Portfolios == input.Portfolios ||
                    this.Portfolios != null &&
                    this.Portfolios.SequenceEqual(input.Portfolios)
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
                if (this.Accounts != null)
                    hashCode = hashCode * 59 + this.Accounts.GetHashCode();
                if (this.AccumulationHorizon != null)
                    hashCode = hashCode * 59 + this.AccumulationHorizon.GetHashCode();
                if (this.DecumulationHorizon != null)
                    hashCode = hashCode * 59 + this.DecumulationHorizon.GetHashCode();
                if (this.GoalAmount != null)
                    hashCode = hashCode * 59 + this.GoalAmount.GetHashCode();
                if (this.GoalAssetSizeByGoal != null)
                    hashCode = hashCode * 59 + this.GoalAssetSizeByGoal.GetHashCode();
                if (this.GoalAssetSizeByGoalDate != null)
                    hashCode = hashCode * 59 + this.GoalAssetSizeByGoalDate.GetHashCode();
                if (this.GoalCategory != null)
                    hashCode = hashCode * 59 + this.GoalCategory.GetHashCode();
                if (this.GoalCreateDate != null)
                    hashCode = hashCode * 59 + this.GoalCreateDate.GetHashCode();
                if (this.GoalId != null)
                    hashCode = hashCode * 59 + this.GoalId.GetHashCode();
                if (this.GoalName != null)
                    hashCode = hashCode * 59 + this.GoalName.GetHashCode();
                if (this.GoalType != null)
                    hashCode = hashCode * 59 + this.GoalType.GetHashCode();
                if (this.GoalUpdateDate != null)
                    hashCode = hashCode * 59 + this.GoalUpdateDate.GetHashCode();
                if (this.IsDecumulation != null)
                    hashCode = hashCode * 59 + this.IsDecumulation.GetHashCode();
                if (this.Portfolios != null)
                    hashCode = hashCode * 59 + this.Portfolios.GetHashCode();
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