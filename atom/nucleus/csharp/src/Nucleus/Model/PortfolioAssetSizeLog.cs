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
    /// PortfolioAssetSizeLog Object
    /// </summary>
    [DataContract]
    public partial class PortfolioAssetSizeLog :  IEquatable<PortfolioAssetSizeLog>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PortfolioAssetSizeLog" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PortfolioAssetSizeLog() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PortfolioAssetSizeLog" /> class.
        /// </summary>
        /// <param name="accountId">accountId (required).</param>
        /// <param name="assetSize">asset_size (required).</param>
        /// <param name="assetSizeAvailable">asset_size_available.</param>
        /// <param name="assetSizePending">asset_size_pending.</param>
        /// <param name="cashFlow">cash_flow (required).</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="currencyCode">currency_code.</param>
        /// <param name="date">date (required).</param>
        /// <param name="id">id.</param>
        /// <param name="modelId">modelId (required).</param>
        /// <param name="portfolioId">portfolioId (required).</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="updateDate">updateDate.</param>
        public PortfolioAssetSizeLog(Guid? accountId = default(Guid?), double? assetSize = default(double?), double? assetSizeAvailable = default(double?), double? assetSizePending = default(double?), double? cashFlow = default(double?), DateTime? createDate = default(DateTime?), string currencyCode = default(string), DateTime? date = default(DateTime?), Guid? id = default(Guid?), Guid? modelId = default(Guid?), Guid? portfolioId = default(Guid?), string secondaryId = default(string), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "accountId" is required (not null)
            if (accountId == null)
            {
                throw new InvalidDataException("accountId is a required property for PortfolioAssetSizeLog and cannot be null");
            }
            else
            {
                this.AccountId = accountId;
            }
            // to ensure "assetSize" is required (not null)
            if (assetSize == null)
            {
                throw new InvalidDataException("assetSize is a required property for PortfolioAssetSizeLog and cannot be null");
            }
            else
            {
                this.AssetSize = assetSize;
            }
            // to ensure "cashFlow" is required (not null)
            if (cashFlow == null)
            {
                throw new InvalidDataException("cashFlow is a required property for PortfolioAssetSizeLog and cannot be null");
            }
            else
            {
                this.CashFlow = cashFlow;
            }
            // to ensure "date" is required (not null)
            if (date == null)
            {
                throw new InvalidDataException("date is a required property for PortfolioAssetSizeLog and cannot be null");
            }
            else
            {
                this.Date = date;
            }
            // to ensure "modelId" is required (not null)
            if (modelId == null)
            {
                throw new InvalidDataException("modelId is a required property for PortfolioAssetSizeLog and cannot be null");
            }
            else
            {
                this.ModelId = modelId;
            }
            // to ensure "portfolioId" is required (not null)
            if (portfolioId == null)
            {
                throw new InvalidDataException("portfolioId is a required property for PortfolioAssetSizeLog and cannot be null");
            }
            else
            {
                this.PortfolioId = portfolioId;
            }
            this.AssetSizeAvailable = assetSizeAvailable;
            this.AssetSizePending = assetSizePending;
            this.CreateDate = createDate;
            this.CurrencyCode = currencyCode;
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
        /// asset_size
        /// </summary>
        /// <value>asset_size</value>
        [DataMember(Name="asset_size", EmitDefaultValue=false)]
        public double? AssetSize { get; set; }

        /// <summary>
        /// asset_size_available
        /// </summary>
        /// <value>asset_size_available</value>
        [DataMember(Name="asset_size_available", EmitDefaultValue=false)]
        public double? AssetSizeAvailable { get; set; }

        /// <summary>
        /// asset_size_pending
        /// </summary>
        /// <value>asset_size_pending</value>
        [DataMember(Name="asset_size_pending", EmitDefaultValue=false)]
        public double? AssetSizePending { get; set; }

        /// <summary>
        /// cash_flow
        /// </summary>
        /// <value>cash_flow</value>
        [DataMember(Name="cash_flow", EmitDefaultValue=false)]
        public double? CashFlow { get; set; }

        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// currency_code
        /// </summary>
        /// <value>currency_code</value>
        [DataMember(Name="currency_code", EmitDefaultValue=false)]
        public string CurrencyCode { get; set; }

        /// <summary>
        /// date
        /// </summary>
        /// <value>date</value>
        [DataMember(Name="date", EmitDefaultValue=false)]
        public DateTime? Date { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public Guid? Id { get; set; }

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
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

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
            sb.Append("class PortfolioAssetSizeLog {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  AssetSize: ").Append(AssetSize).Append("\n");
            sb.Append("  AssetSizeAvailable: ").Append(AssetSizeAvailable).Append("\n");
            sb.Append("  AssetSizePending: ").Append(AssetSizePending).Append("\n");
            sb.Append("  CashFlow: ").Append(CashFlow).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  CurrencyCode: ").Append(CurrencyCode).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ModelId: ").Append(ModelId).Append("\n");
            sb.Append("  PortfolioId: ").Append(PortfolioId).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
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
            return this.Equals(input as PortfolioAssetSizeLog);
        }

        /// <summary>
        /// Returns true if PortfolioAssetSizeLog instances are equal
        /// </summary>
        /// <param name="input">Instance of PortfolioAssetSizeLog to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PortfolioAssetSizeLog input)
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
                    this.AssetSize == input.AssetSize ||
                    (this.AssetSize != null &&
                    this.AssetSize.Equals(input.AssetSize))
                ) && 
                (
                    this.AssetSizeAvailable == input.AssetSizeAvailable ||
                    (this.AssetSizeAvailable != null &&
                    this.AssetSizeAvailable.Equals(input.AssetSizeAvailable))
                ) && 
                (
                    this.AssetSizePending == input.AssetSizePending ||
                    (this.AssetSizePending != null &&
                    this.AssetSizePending.Equals(input.AssetSizePending))
                ) && 
                (
                    this.CashFlow == input.CashFlow ||
                    (this.CashFlow != null &&
                    this.CashFlow.Equals(input.CashFlow))
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
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
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
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
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
                if (this.AssetSize != null)
                    hashCode = hashCode * 59 + this.AssetSize.GetHashCode();
                if (this.AssetSizeAvailable != null)
                    hashCode = hashCode * 59 + this.AssetSizeAvailable.GetHashCode();
                if (this.AssetSizePending != null)
                    hashCode = hashCode * 59 + this.AssetSizePending.GetHashCode();
                if (this.CashFlow != null)
                    hashCode = hashCode * 59 + this.CashFlow.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.CurrencyCode != null)
                    hashCode = hashCode * 59 + this.CurrencyCode.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.ModelId != null)
                    hashCode = hashCode * 59 + this.ModelId.GetHashCode();
                if (this.PortfolioId != null)
                    hashCode = hashCode * 59 + this.PortfolioId.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
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
