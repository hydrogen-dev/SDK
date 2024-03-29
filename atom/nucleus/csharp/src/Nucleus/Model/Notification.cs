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
    /// Notification Object
    /// </summary>
    [DataContract]
    public partial class Notification :  IEquatable<Notification>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Notification" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Notification() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Notification" /> class.
        /// </summary>
        /// <param name="applicationId">application_id.</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="description">description.</param>
        /// <param name="featureId">feature_id.</param>
        /// <param name="frequencyUnit">frequency_unit.</param>
        /// <param name="id">id.</param>
        /// <param name="isActive">is_active.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="name">name (required).</param>
        /// <param name="notificationType">notificationType (required).</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="thresholdType">threshold_type.</param>
        /// <param name="updateDate">updateDate.</param>
        public Notification(Guid? applicationId = default(Guid?), DateTime? createDate = default(DateTime?), string description = default(string), Guid? featureId = default(Guid?), List<string> frequencyUnit = default(List<string>), Guid? id = default(Guid?), bool? isActive = default(bool?), Dictionary<string, string> metadata = default(Dictionary<string, string>), string name = default(string), string notificationType = default(string), string secondaryId = default(string), string thresholdType = default(string), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new InvalidDataException("name is a required property for Notification and cannot be null");
            }
            else
            {
                this.Name = name;
            }
            // to ensure "notificationType" is required (not null)
            if (notificationType == null)
            {
                throw new InvalidDataException("notificationType is a required property for Notification and cannot be null");
            }
            else
            {
                this.NotificationType = notificationType;
            }
            this.ApplicationId = applicationId;
            this.CreateDate = createDate;
            this.Description = description;
            this.FeatureId = featureId;
            this.FrequencyUnit = frequencyUnit;
            this.Id = id;
            this.IsActive = isActive;
            this.Metadata = metadata;
            this.SecondaryId = secondaryId;
            this.ThresholdType = thresholdType;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// application_id
        /// </summary>
        /// <value>application_id</value>
        [DataMember(Name="application_id", EmitDefaultValue=false)]
        public Guid? ApplicationId { get; set; }

        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// description
        /// </summary>
        /// <value>description</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// feature_id
        /// </summary>
        /// <value>feature_id</value>
        [DataMember(Name="feature_id", EmitDefaultValue=false)]
        public Guid? FeatureId { get; set; }

        /// <summary>
        /// frequency_unit
        /// </summary>
        /// <value>frequency_unit</value>
        [DataMember(Name="frequency_unit", EmitDefaultValue=false)]
        public List<string> FrequencyUnit { get; set; }

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
        /// metadata
        /// </summary>
        /// <value>metadata</value>
        [DataMember(Name="metadata", EmitDefaultValue=false)]
        public Dictionary<string, string> Metadata { get; set; }

        /// <summary>
        /// name
        /// </summary>
        /// <value>name</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// notificationType
        /// </summary>
        /// <value>notificationType</value>
        [DataMember(Name="notification_type", EmitDefaultValue=false)]
        public string NotificationType { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

        /// <summary>
        /// threshold_type
        /// </summary>
        /// <value>threshold_type</value>
        [DataMember(Name="threshold_type", EmitDefaultValue=false)]
        public string ThresholdType { get; set; }

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
            sb.Append("class Notification {\n");
            sb.Append("  ApplicationId: ").Append(ApplicationId).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  FeatureId: ").Append(FeatureId).Append("\n");
            sb.Append("  FrequencyUnit: ").Append(FrequencyUnit).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsActive: ").Append(IsActive).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  NotificationType: ").Append(NotificationType).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  ThresholdType: ").Append(ThresholdType).Append("\n");
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
            return this.Equals(input as Notification);
        }

        /// <summary>
        /// Returns true if Notification instances are equal
        /// </summary>
        /// <param name="input">Instance of Notification to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Notification input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ApplicationId == input.ApplicationId ||
                    (this.ApplicationId != null &&
                    this.ApplicationId.Equals(input.ApplicationId))
                ) && 
                (
                    this.CreateDate == input.CreateDate ||
                    (this.CreateDate != null &&
                    this.CreateDate.Equals(input.CreateDate))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.FeatureId == input.FeatureId ||
                    (this.FeatureId != null &&
                    this.FeatureId.Equals(input.FeatureId))
                ) && 
                (
                    this.FrequencyUnit == input.FrequencyUnit ||
                    this.FrequencyUnit != null &&
                    this.FrequencyUnit.SequenceEqual(input.FrequencyUnit)
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
                    this.NotificationType == input.NotificationType ||
                    (this.NotificationType != null &&
                    this.NotificationType.Equals(input.NotificationType))
                ) && 
                (
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
                ) && 
                (
                    this.ThresholdType == input.ThresholdType ||
                    (this.ThresholdType != null &&
                    this.ThresholdType.Equals(input.ThresholdType))
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
                if (this.ApplicationId != null)
                    hashCode = hashCode * 59 + this.ApplicationId.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.FeatureId != null)
                    hashCode = hashCode * 59 + this.FeatureId.GetHashCode();
                if (this.FrequencyUnit != null)
                    hashCode = hashCode * 59 + this.FrequencyUnit.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.IsActive != null)
                    hashCode = hashCode * 59 + this.IsActive.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.NotificationType != null)
                    hashCode = hashCode * 59 + this.NotificationType.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.ThresholdType != null)
                    hashCode = hashCode * 59 + this.ThresholdType.GetHashCode();
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
