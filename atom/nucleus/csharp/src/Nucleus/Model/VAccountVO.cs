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
    /// VAccountVO
    /// </summary>
    [DataContract]
    public partial class VAccountVO :  IEquatable<VAccountVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VAccountVO" /> class.
        /// </summary>
        /// <param name="accountId">accountId.</param>
        /// <param name="accountName">accountName.</param>
        /// <param name="accountTypeId">accountTypeId.</param>
        /// <param name="accountTypeName">accountTypeName.</param>
        /// <param name="goalAssetSizeByAccount">goalAssetSizeByAccount.</param>
        /// <param name="goalAssetSizeByAccountDate">goalAssetSizeByAccountDate.</param>
        public VAccountVO(Guid? accountId = default(Guid?), string accountName = default(string), Guid? accountTypeId = default(Guid?), string accountTypeName = default(string), double? goalAssetSizeByAccount = default(double?), DateTime? goalAssetSizeByAccountDate = default(DateTime?))
        {
            this.AccountId = accountId;
            this.AccountName = accountName;
            this.AccountTypeId = accountTypeId;
            this.AccountTypeName = accountTypeName;
            this.GoalAssetSizeByAccount = goalAssetSizeByAccount;
            this.GoalAssetSizeByAccountDate = goalAssetSizeByAccountDate;
        }
        
        /// <summary>
        /// Gets or Sets AccountId
        /// </summary>
        [DataMember(Name="account_id", EmitDefaultValue=false)]
        public Guid? AccountId { get; set; }

        /// <summary>
        /// Gets or Sets AccountName
        /// </summary>
        [DataMember(Name="account_name", EmitDefaultValue=false)]
        public string AccountName { get; set; }

        /// <summary>
        /// Gets or Sets AccountTypeId
        /// </summary>
        [DataMember(Name="account_type_id", EmitDefaultValue=false)]
        public Guid? AccountTypeId { get; set; }

        /// <summary>
        /// Gets or Sets AccountTypeName
        /// </summary>
        [DataMember(Name="account_type_name", EmitDefaultValue=false)]
        public string AccountTypeName { get; set; }

        /// <summary>
        /// Gets or Sets GoalAssetSizeByAccount
        /// </summary>
        [DataMember(Name="goal_asset_size_by_account", EmitDefaultValue=false)]
        public double? GoalAssetSizeByAccount { get; set; }

        /// <summary>
        /// Gets or Sets GoalAssetSizeByAccountDate
        /// </summary>
        [DataMember(Name="goal_asset_size_by_account_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? GoalAssetSizeByAccountDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VAccountVO {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  AccountName: ").Append(AccountName).Append("\n");
            sb.Append("  AccountTypeId: ").Append(AccountTypeId).Append("\n");
            sb.Append("  AccountTypeName: ").Append(AccountTypeName).Append("\n");
            sb.Append("  GoalAssetSizeByAccount: ").Append(GoalAssetSizeByAccount).Append("\n");
            sb.Append("  GoalAssetSizeByAccountDate: ").Append(GoalAssetSizeByAccountDate).Append("\n");
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
            return this.Equals(input as VAccountVO);
        }

        /// <summary>
        /// Returns true if VAccountVO instances are equal
        /// </summary>
        /// <param name="input">Instance of VAccountVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VAccountVO input)
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
                    this.AccountName == input.AccountName ||
                    (this.AccountName != null &&
                    this.AccountName.Equals(input.AccountName))
                ) && 
                (
                    this.AccountTypeId == input.AccountTypeId ||
                    (this.AccountTypeId != null &&
                    this.AccountTypeId.Equals(input.AccountTypeId))
                ) && 
                (
                    this.AccountTypeName == input.AccountTypeName ||
                    (this.AccountTypeName != null &&
                    this.AccountTypeName.Equals(input.AccountTypeName))
                ) && 
                (
                    this.GoalAssetSizeByAccount == input.GoalAssetSizeByAccount ||
                    (this.GoalAssetSizeByAccount != null &&
                    this.GoalAssetSizeByAccount.Equals(input.GoalAssetSizeByAccount))
                ) && 
                (
                    this.GoalAssetSizeByAccountDate == input.GoalAssetSizeByAccountDate ||
                    (this.GoalAssetSizeByAccountDate != null &&
                    this.GoalAssetSizeByAccountDate.Equals(input.GoalAssetSizeByAccountDate))
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
                if (this.AccountName != null)
                    hashCode = hashCode * 59 + this.AccountName.GetHashCode();
                if (this.AccountTypeId != null)
                    hashCode = hashCode * 59 + this.AccountTypeId.GetHashCode();
                if (this.AccountTypeName != null)
                    hashCode = hashCode * 59 + this.AccountTypeName.GetHashCode();
                if (this.GoalAssetSizeByAccount != null)
                    hashCode = hashCode * 59 + this.GoalAssetSizeByAccount.GetHashCode();
                if (this.GoalAssetSizeByAccountDate != null)
                    hashCode = hashCode * 59 + this.GoalAssetSizeByAccountDate.GetHashCode();
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
