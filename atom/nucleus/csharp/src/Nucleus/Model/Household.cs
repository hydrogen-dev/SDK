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
    /// Household
    /// </summary>
    [DataContract]
    public partial class Household :  IEquatable<Household>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Household" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Household() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Household" /> class.
        /// </summary>
        /// <param name="category">category.</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="householdIncome">householdIncome.</param>
        /// <param name="id">id.</param>
        /// <param name="isActive">is_active.</param>
        /// <param name="members">members.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="name">name (required).</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="subcategory">subcategory.</param>
        /// <param name="updateDate">updateDate.</param>
        public Household(string category = default(string), DateTime? createDate = default(DateTime?), double? householdIncome = default(double?), Guid? id = default(Guid?), bool? isActive = default(bool?), List<Member> members = default(List<Member>), Dictionary<string, string> metadata = default(Dictionary<string, string>), string name = default(string), string secondaryId = default(string), string subcategory = default(string), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new InvalidDataException("name is a required property for Household and cannot be null");
            }
            else
            {
                this.Name = name;
            }
            this.Category = category;
            this.CreateDate = createDate;
            this.HouseholdIncome = householdIncome;
            this.Id = id;
            this.IsActive = isActive;
            this.Members = members;
            this.Metadata = metadata;
            this.SecondaryId = secondaryId;
            this.Subcategory = subcategory;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// category
        /// </summary>
        /// <value>category</value>
        [DataMember(Name="category", EmitDefaultValue=false)]
        public string Category { get; set; }

        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// householdIncome
        /// </summary>
        /// <value>householdIncome</value>
        [DataMember(Name="household_income", EmitDefaultValue=false)]
        public double? HouseholdIncome { get; set; }

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
        /// Gets or Sets Members
        /// </summary>
        [DataMember(Name="members", EmitDefaultValue=false)]
        public List<Member> Members { get; set; }

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
        /// subcategory
        /// </summary>
        /// <value>subcategory</value>
        [DataMember(Name="subcategory", EmitDefaultValue=false)]
        public string Subcategory { get; set; }

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
            sb.Append("class Household {\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  HouseholdIncome: ").Append(HouseholdIncome).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsActive: ").Append(IsActive).Append("\n");
            sb.Append("  Members: ").Append(Members).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  Subcategory: ").Append(Subcategory).Append("\n");
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
            return this.Equals(input as Household);
        }

        /// <summary>
        /// Returns true if Household instances are equal
        /// </summary>
        /// <param name="input">Instance of Household to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Household input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
                ) && 
                (
                    this.CreateDate == input.CreateDate ||
                    (this.CreateDate != null &&
                    this.CreateDate.Equals(input.CreateDate))
                ) && 
                (
                    this.HouseholdIncome == input.HouseholdIncome ||
                    (this.HouseholdIncome != null &&
                    this.HouseholdIncome.Equals(input.HouseholdIncome))
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
                    this.Members == input.Members ||
                    this.Members != null &&
                    this.Members.SequenceEqual(input.Members)
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
                    this.Subcategory == input.Subcategory ||
                    (this.Subcategory != null &&
                    this.Subcategory.Equals(input.Subcategory))
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
                if (this.Category != null)
                    hashCode = hashCode * 59 + this.Category.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.HouseholdIncome != null)
                    hashCode = hashCode * 59 + this.HouseholdIncome.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.IsActive != null)
                    hashCode = hashCode * 59 + this.IsActive.GetHashCode();
                if (this.Members != null)
                    hashCode = hashCode * 59 + this.Members.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.Subcategory != null)
                    hashCode = hashCode * 59 + this.Subcategory.GetHashCode();
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
