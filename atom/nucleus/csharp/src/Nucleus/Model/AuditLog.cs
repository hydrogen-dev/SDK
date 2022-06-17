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
    /// AuditLog Object
    /// </summary>
    [DataContract]
    public partial class AuditLog :  IEquatable<AuditLog>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AuditLog" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AuditLog() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AuditLog" /> class.
        /// </summary>
        /// <param name="accountIds">accountIds.</param>
        /// <param name="aggregationAccountIds">aggregationAccountIds.</param>
        /// <param name="allocationIds">allocationIds.</param>
        /// <param name="clientIds">clientIds.</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="goalIds">goalIds.</param>
        /// <param name="id">id.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="modelIds">modelIds.</param>
        /// <param name="portfolioIds">portfolioIds.</param>
        /// <param name="request">request.</param>
        /// <param name="requestUrl">requestUrl (required).</param>
        /// <param name="response">response (required).</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="securityIds">securityIds.</param>
        /// <param name="updateDate">updateDate.</param>
        public AuditLog(List<Guid?> accountIds = default(List<Guid?>), List<Guid?> aggregationAccountIds = default(List<Guid?>), List<Guid?> allocationIds = default(List<Guid?>), List<Guid?> clientIds = default(List<Guid?>), DateTime? createDate = default(DateTime?), List<Guid?> goalIds = default(List<Guid?>), Guid? id = default(Guid?), Dictionary<string, string> metadata = default(Dictionary<string, string>), List<Guid?> modelIds = default(List<Guid?>), List<Guid?> portfolioIds = default(List<Guid?>), string request = default(string), string requestUrl = default(string), string response = default(string), string secondaryId = default(string), List<Guid?> securityIds = default(List<Guid?>), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "requestUrl" is required (not null)
            if (requestUrl == null)
            {
                throw new InvalidDataException("requestUrl is a required property for AuditLog and cannot be null");
            }
            else
            {
                this.RequestUrl = requestUrl;
            }
            // to ensure "response" is required (not null)
            if (response == null)
            {
                throw new InvalidDataException("response is a required property for AuditLog and cannot be null");
            }
            else
            {
                this.Response = response;
            }
            this.AccountIds = accountIds;
            this.AggregationAccountIds = aggregationAccountIds;
            this.AllocationIds = allocationIds;
            this.ClientIds = clientIds;
            this.CreateDate = createDate;
            this.GoalIds = goalIds;
            this.Id = id;
            this.Metadata = metadata;
            this.ModelIds = modelIds;
            this.PortfolioIds = portfolioIds;
            this.Request = request;
            this.SecondaryId = secondaryId;
            this.SecurityIds = securityIds;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// accountIds
        /// </summary>
        /// <value>accountIds</value>
        [DataMember(Name="account_ids", EmitDefaultValue=false)]
        public List<Guid?> AccountIds { get; set; }

        /// <summary>
        /// aggregationAccountIds
        /// </summary>
        /// <value>aggregationAccountIds</value>
        [DataMember(Name="aggregation_account_ids", EmitDefaultValue=false)]
        public List<Guid?> AggregationAccountIds { get; set; }

        /// <summary>
        /// allocationIds
        /// </summary>
        /// <value>allocationIds</value>
        [DataMember(Name="allocation_ids", EmitDefaultValue=false)]
        public List<Guid?> AllocationIds { get; set; }

        /// <summary>
        /// clientIds
        /// </summary>
        /// <value>clientIds</value>
        [DataMember(Name="client_ids", EmitDefaultValue=false)]
        public List<Guid?> ClientIds { get; set; }

        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// goalIds
        /// </summary>
        /// <value>goalIds</value>
        [DataMember(Name="goal_ids", EmitDefaultValue=false)]
        public List<Guid?> GoalIds { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public Guid? Id { get; set; }

        /// <summary>
        /// metadata
        /// </summary>
        /// <value>metadata</value>
        [DataMember(Name="metadata", EmitDefaultValue=false)]
        public Dictionary<string, string> Metadata { get; set; }

        /// <summary>
        /// modelIds
        /// </summary>
        /// <value>modelIds</value>
        [DataMember(Name="model_ids", EmitDefaultValue=false)]
        public List<Guid?> ModelIds { get; set; }

        /// <summary>
        /// portfolioIds
        /// </summary>
        /// <value>portfolioIds</value>
        [DataMember(Name="portfolio_ids", EmitDefaultValue=false)]
        public List<Guid?> PortfolioIds { get; set; }

        /// <summary>
        /// Gets or Sets Request
        /// </summary>
        [DataMember(Name="request", EmitDefaultValue=false)]
        public string Request { get; set; }

        /// <summary>
        /// requestUrl
        /// </summary>
        /// <value>requestUrl</value>
        [DataMember(Name="request_url", EmitDefaultValue=false)]
        public string RequestUrl { get; set; }

        /// <summary>
        /// response
        /// </summary>
        /// <value>response</value>
        [DataMember(Name="response", EmitDefaultValue=false)]
        public string Response { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

        /// <summary>
        /// securityIds
        /// </summary>
        /// <value>securityIds</value>
        [DataMember(Name="security_ids", EmitDefaultValue=false)]
        public List<Guid?> SecurityIds { get; set; }

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
            sb.Append("class AuditLog {\n");
            sb.Append("  AccountIds: ").Append(AccountIds).Append("\n");
            sb.Append("  AggregationAccountIds: ").Append(AggregationAccountIds).Append("\n");
            sb.Append("  AllocationIds: ").Append(AllocationIds).Append("\n");
            sb.Append("  ClientIds: ").Append(ClientIds).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  GoalIds: ").Append(GoalIds).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  ModelIds: ").Append(ModelIds).Append("\n");
            sb.Append("  PortfolioIds: ").Append(PortfolioIds).Append("\n");
            sb.Append("  Request: ").Append(Request).Append("\n");
            sb.Append("  RequestUrl: ").Append(RequestUrl).Append("\n");
            sb.Append("  Response: ").Append(Response).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  SecurityIds: ").Append(SecurityIds).Append("\n");
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
            return this.Equals(input as AuditLog);
        }

        /// <summary>
        /// Returns true if AuditLog instances are equal
        /// </summary>
        /// <param name="input">Instance of AuditLog to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AuditLog input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AccountIds == input.AccountIds ||
                    this.AccountIds != null &&
                    this.AccountIds.SequenceEqual(input.AccountIds)
                ) && 
                (
                    this.AggregationAccountIds == input.AggregationAccountIds ||
                    this.AggregationAccountIds != null &&
                    this.AggregationAccountIds.SequenceEqual(input.AggregationAccountIds)
                ) && 
                (
                    this.AllocationIds == input.AllocationIds ||
                    this.AllocationIds != null &&
                    this.AllocationIds.SequenceEqual(input.AllocationIds)
                ) && 
                (
                    this.ClientIds == input.ClientIds ||
                    this.ClientIds != null &&
                    this.ClientIds.SequenceEqual(input.ClientIds)
                ) && 
                (
                    this.CreateDate == input.CreateDate ||
                    (this.CreateDate != null &&
                    this.CreateDate.Equals(input.CreateDate))
                ) && 
                (
                    this.GoalIds == input.GoalIds ||
                    this.GoalIds != null &&
                    this.GoalIds.SequenceEqual(input.GoalIds)
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
                    this.ModelIds == input.ModelIds ||
                    this.ModelIds != null &&
                    this.ModelIds.SequenceEqual(input.ModelIds)
                ) && 
                (
                    this.PortfolioIds == input.PortfolioIds ||
                    this.PortfolioIds != null &&
                    this.PortfolioIds.SequenceEqual(input.PortfolioIds)
                ) && 
                (
                    this.Request == input.Request ||
                    (this.Request != null &&
                    this.Request.Equals(input.Request))
                ) && 
                (
                    this.RequestUrl == input.RequestUrl ||
                    (this.RequestUrl != null &&
                    this.RequestUrl.Equals(input.RequestUrl))
                ) && 
                (
                    this.Response == input.Response ||
                    (this.Response != null &&
                    this.Response.Equals(input.Response))
                ) && 
                (
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
                ) && 
                (
                    this.SecurityIds == input.SecurityIds ||
                    this.SecurityIds != null &&
                    this.SecurityIds.SequenceEqual(input.SecurityIds)
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
                if (this.AccountIds != null)
                    hashCode = hashCode * 59 + this.AccountIds.GetHashCode();
                if (this.AggregationAccountIds != null)
                    hashCode = hashCode * 59 + this.AggregationAccountIds.GetHashCode();
                if (this.AllocationIds != null)
                    hashCode = hashCode * 59 + this.AllocationIds.GetHashCode();
                if (this.ClientIds != null)
                    hashCode = hashCode * 59 + this.ClientIds.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.GoalIds != null)
                    hashCode = hashCode * 59 + this.GoalIds.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.ModelIds != null)
                    hashCode = hashCode * 59 + this.ModelIds.GetHashCode();
                if (this.PortfolioIds != null)
                    hashCode = hashCode * 59 + this.PortfolioIds.GetHashCode();
                if (this.Request != null)
                    hashCode = hashCode * 59 + this.Request.GetHashCode();
                if (this.RequestUrl != null)
                    hashCode = hashCode * 59 + this.RequestUrl.GetHashCode();
                if (this.Response != null)
                    hashCode = hashCode * 59 + this.Response.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.SecurityIds != null)
                    hashCode = hashCode * 59 + this.SecurityIds.GetHashCode();
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
