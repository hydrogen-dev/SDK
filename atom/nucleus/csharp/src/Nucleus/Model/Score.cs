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
    /// Score Object
    /// </summary>
    [DataContract]
    public partial class Score :  IEquatable<Score>, IValidatableObject
    {
        /// <summary>
        /// scoreType
        /// </summary>
        /// <value>scoreType</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ScoreTypeEnum
        {
            
            /// <summary>
            /// Enum Goalachievementscore for value: goal_achievement_score
            /// </summary>
            [EnumMember(Value = "goal_achievement_score")]
            Goalachievementscore = 1,
            
            /// <summary>
            /// Enum Portfoliooptimizationscore for value: portfolio_optimization_score
            /// </summary>
            [EnumMember(Value = "portfolio_optimization_score")]
            Portfoliooptimizationscore = 2,
            
            /// <summary>
            /// Enum Creditscore for value: credit_score
            /// </summary>
            [EnumMember(Value = "credit_score")]
            Creditscore = 3,
            
            /// <summary>
            /// Enum Dimensionalriskscore for value: dimensional_risk_score
            /// </summary>
            [EnumMember(Value = "dimensional_risk_score")]
            Dimensionalriskscore = 4,
            
            /// <summary>
            /// Enum Diversificationscore for value: diversification_score
            /// </summary>
            [EnumMember(Value = "diversification_score")]
            Diversificationscore = 5,
            
            /// <summary>
            /// Enum Riskscore for value: risk_score
            /// </summary>
            [EnumMember(Value = "risk_score")]
            Riskscore = 6,
            
            /// <summary>
            /// Enum Riskprofile for value: risk_profile
            /// </summary>
            [EnumMember(Value = "risk_profile")]
            Riskprofile = 7
        }

        /// <summary>
        /// scoreType
        /// </summary>
        /// <value>scoreType</value>
        [DataMember(Name="score_type", EmitDefaultValue=false)]
        public ScoreTypeEnum ScoreType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Score" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Score() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Score" /> class.
        /// </summary>
        /// <param name="accountId">accountId.</param>
        /// <param name="allocationId">allocationId.</param>
        /// <param name="benchmarkId">benchmarkId.</param>
        /// <param name="clientId">clientId.</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="goalId">goalId.</param>
        /// <param name="id">id.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="modelId">modelId.</param>
        /// <param name="portfolioId">portfolioId.</param>
        /// <param name="scoreTimeStamp">scoreTimeStamp.</param>
        /// <param name="scoreType">scoreType (required).</param>
        /// <param name="scoreValue">scoreValue (required).</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="securityId">securityId.</param>
        /// <param name="updateDate">updateDate.</param>
        public Score(Guid? accountId = default(Guid?), Guid? allocationId = default(Guid?), Guid? benchmarkId = default(Guid?), Guid? clientId = default(Guid?), DateTime? createDate = default(DateTime?), Guid? goalId = default(Guid?), Guid? id = default(Guid?), Dictionary<string, string> metadata = default(Dictionary<string, string>), Guid? modelId = default(Guid?), Guid? portfolioId = default(Guid?), DateTime? scoreTimeStamp = default(DateTime?), ScoreTypeEnum scoreType = default(ScoreTypeEnum), string scoreValue = default(string), string secondaryId = default(string), Guid? securityId = default(Guid?), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "scoreType" is required (not null)
            if (scoreType == null)
            {
                throw new InvalidDataException("scoreType is a required property for Score and cannot be null");
            }
            else
            {
                this.ScoreType = scoreType;
            }
            // to ensure "scoreValue" is required (not null)
            if (scoreValue == null)
            {
                throw new InvalidDataException("scoreValue is a required property for Score and cannot be null");
            }
            else
            {
                this.ScoreValue = scoreValue;
            }
            this.AccountId = accountId;
            this.AllocationId = allocationId;
            this.BenchmarkId = benchmarkId;
            this.ClientId = clientId;
            this.CreateDate = createDate;
            this.GoalId = goalId;
            this.Id = id;
            this.Metadata = metadata;
            this.ModelId = modelId;
            this.PortfolioId = portfolioId;
            this.ScoreTimeStamp = scoreTimeStamp;
            this.SecondaryId = secondaryId;
            this.SecurityId = securityId;
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
        /// benchmarkId
        /// </summary>
        /// <value>benchmarkId</value>
        [DataMember(Name="benchmark_id", EmitDefaultValue=false)]
        public Guid? BenchmarkId { get; set; }

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
        /// portfolioId
        /// </summary>
        /// <value>portfolioId</value>
        [DataMember(Name="portfolio_id", EmitDefaultValue=false)]
        public Guid? PortfolioId { get; set; }

        /// <summary>
        /// Gets or Sets ScoreTimeStamp
        /// </summary>
        [DataMember(Name="score_time_stamp", EmitDefaultValue=false)]
        public DateTime? ScoreTimeStamp { get; set; }


        /// <summary>
        /// scoreValue
        /// </summary>
        /// <value>scoreValue</value>
        [DataMember(Name="score_value", EmitDefaultValue=false)]
        public string ScoreValue { get; set; }

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
            sb.Append("class Score {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  AllocationId: ").Append(AllocationId).Append("\n");
            sb.Append("  BenchmarkId: ").Append(BenchmarkId).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  GoalId: ").Append(GoalId).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  ModelId: ").Append(ModelId).Append("\n");
            sb.Append("  PortfolioId: ").Append(PortfolioId).Append("\n");
            sb.Append("  ScoreTimeStamp: ").Append(ScoreTimeStamp).Append("\n");
            sb.Append("  ScoreType: ").Append(ScoreType).Append("\n");
            sb.Append("  ScoreValue: ").Append(ScoreValue).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  SecurityId: ").Append(SecurityId).Append("\n");
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
            return this.Equals(input as Score);
        }

        /// <summary>
        /// Returns true if Score instances are equal
        /// </summary>
        /// <param name="input">Instance of Score to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Score input)
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
                    this.BenchmarkId == input.BenchmarkId ||
                    (this.BenchmarkId != null &&
                    this.BenchmarkId.Equals(input.BenchmarkId))
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
                    this.PortfolioId == input.PortfolioId ||
                    (this.PortfolioId != null &&
                    this.PortfolioId.Equals(input.PortfolioId))
                ) && 
                (
                    this.ScoreTimeStamp == input.ScoreTimeStamp ||
                    (this.ScoreTimeStamp != null &&
                    this.ScoreTimeStamp.Equals(input.ScoreTimeStamp))
                ) && 
                (
                    this.ScoreType == input.ScoreType ||
                    (this.ScoreType != null &&
                    this.ScoreType.Equals(input.ScoreType))
                ) && 
                (
                    this.ScoreValue == input.ScoreValue ||
                    (this.ScoreValue != null &&
                    this.ScoreValue.Equals(input.ScoreValue))
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
                if (this.BenchmarkId != null)
                    hashCode = hashCode * 59 + this.BenchmarkId.GetHashCode();
                if (this.ClientId != null)
                    hashCode = hashCode * 59 + this.ClientId.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.GoalId != null)
                    hashCode = hashCode * 59 + this.GoalId.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.ModelId != null)
                    hashCode = hashCode * 59 + this.ModelId.GetHashCode();
                if (this.PortfolioId != null)
                    hashCode = hashCode * 59 + this.PortfolioId.GetHashCode();
                if (this.ScoreTimeStamp != null)
                    hashCode = hashCode * 59 + this.ScoreTimeStamp.GetHashCode();
                if (this.ScoreType != null)
                    hashCode = hashCode * 59 + this.ScoreType.GetHashCode();
                if (this.ScoreValue != null)
                    hashCode = hashCode * 59 + this.ScoreValue.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.SecurityId != null)
                    hashCode = hashCode * 59 + this.SecurityId.GetHashCode();
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
