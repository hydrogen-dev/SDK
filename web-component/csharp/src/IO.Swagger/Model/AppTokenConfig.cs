/* 
 * Hydrogen Admin API
 *
 * The Hydrogen Admin API
 *
 * OpenAPI spec version: 1.0.0
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
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{

    /// <summary>
    /// AppTokenConfig
    /// </summary>
    [DataContract]
    public partial class AppTokenConfig : IEquatable<AppTokenConfig>, IValidatableObject
    {
        ///<Summary>
        /// clientId
        ///</Summary>
        [DataMember(Name="client_id", EmitDefaultValue=false)]
        public string clientId { get; set; }

        ///<Summary>
        /// clientSecret
        ///</Summary>
        [DataMember(Name="client_secret", EmitDefaultValue=false)]
        public string clientSecret { get; set; }

        ///<Summary>
        /// username
        ///</Summary>
        [DataMember(Name="username", EmitDefaultValue=false)]
        public string username { get; set; }

        ///<Summary>
        /// password
        ///</Summary>
        [DataMember(Name="password", EmitDefaultValue=false)]
        public string password { get; set; }

        ///<Summary>
        /// publicKey
        ///</Summary>
        [DataMember(Name="public_key", EmitDefaultValue=false)]
        public string publicKey { get; set; }

        ///<Summary>
        /// userAccessToken
        ///</Summary>
        [DataMember(Name="user_access_token", EmitDefaultValue=false)]
        public string userAccessToken { get; set; }

        ///<Summary>
        /// basePath
        ///</Summary>
        [DataMember(Name="base_path", EmitDefaultValue=false)]
        public string basePath { get; set; }

        ///<Summary>
        /// isCredsPassed
        ///</Summary>
        [DataMember(Name="is_creds_passed", EmitDefaultValue=false)]
        public bool isCredsPassed { get; set; }

        ///<Summary>
        /// isEmbed
        ///</Summary>
        [DataMember(Name="is_embed", EmitDefaultValue=false)]
        public bool isEmbed { get; set; }

        ///<Summary>
        /// appNames
        ///</Summary>
        [DataMember(Name="app_names", EmitDefaultValue=false)]
        public List<AppConfig> appNames { get; set; }

        ///<Summary>
        /// attributes
        ///</Summary>
        [DataMember(Name="attributes", EmitDefaultValue=false)]
        public List<TagAttributes> attributes { get; set; }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="AppTokenConfig" /> class.
        /// </summary>
        /// <param name="clientId">clientId.</param>
        /// <param name="clientSecret">clientSecret.</param>
        /// <param name="username">username.</param>
        /// <param name="password">password.</param>
        /// <param name="publicKey">publicKey.</param>
        /// <param name="userAccessToken">userAccessToken.</param>
        /// <param name="basePath">basePath.</param>
        /// <param name="isCredsPassed">isCredsPassed.</param>
        /// <param name="isEmbed">isEmbed.</param>
        /// <param name="appNames">appNames.</param>
        /// <param name="attributes">attributes.</param>
        public AppTokenConfig(string clientId = default(string), string clientSecret = default(string)
        , string username = default(string), string password = default(string), string publicKey = default(string)
        , string userAccessToken = default(string), string basePath = default(string), bool? isCredsPassed = default(bool?)
        , bool? isEmbed = default(bool?), List<AppConfig> appNames = default(List<AppConfig>)
        , List<TagAttributes> attributes = default(List<TagAttributes>))
        {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
            this.username = username;
            this.password = password;
            this.publicKey = publicKey;
            this.userAccessToken = userAccessToken;
            this.basePath = basePath;
            this.isCredsPassed = isCredsPassed?? false;
            this.isEmbed = isEmbed?? false;
            this.appNames = appNames;
            this.attributes = attributes;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AppTokenConfig {\n");
            sb.Append("  clientId: ").Append(clientId).Append("\n");
            sb.Append("  clientSecret: ").Append(clientSecret).Append("\n");
            sb.Append("  username: ").Append(username).Append("\n");
            sb.Append("  password: ").Append(password).Append("\n");
            sb.Append("  publicKey: ").Append(publicKey).Append("\n");
            sb.Append("  userAccessToken: ").Append(userAccessToken).Append("\n");
            sb.Append("  basePath: ").Append(basePath).Append("\n");
            sb.Append("  isCredsPassed: ").Append(isCredsPassed).Append("\n");
            sb.Append("  isEmbed: ").Append(isEmbed).Append("\n");
            sb.Append("  appNames: ").Append(appNames).Append("\n");
            sb.Append("  attributes: ").Append(attributes).Append("\n");
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
            return this.Equals(input as AppTokenConfig);
        }

        /// <summary>
        /// Returns true if AppToken instances are equal
        /// </summary>
        /// <param name="input">Instance of AppToken to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AppTokenConfig input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.clientId == input.clientId ||
                    (this.clientId != null &&
                    this.clientId.Equals(input.clientId))
                ) && 
                (
                    this.clientSecret == input.clientSecret ||
                    (this.clientSecret != null &&
                    this.clientSecret.Equals(input.clientSecret))
                ) && 
                (
                    this.username == input.username ||
                    (this.username != null &&
                    this.username.Equals(input.username))
                ) && 
                (
                    this.password == input.password ||
                    (this.password != null &&
                    this.password.Equals(input.password))
                ) && 
                (
                    this.publicKey == input.publicKey ||
                    (this.publicKey != null &&
                    this.publicKey.Equals(input.publicKey))
                ) && 
                (
                    this.userAccessToken == input.userAccessToken ||
                    (this.userAccessToken != null &&
                    this.userAccessToken.Equals(input.userAccessToken))
                ) && 
                (
                    this.basePath == input.basePath ||
                    (this.basePath != null &&
                    this.basePath.Equals(input.basePath))
                ) && 
                (
                    this.isCredsPassed == input.isCredsPassed ||
                    (this.isCredsPassed != null &&
                    this.isCredsPassed.Equals(input.isCredsPassed))
                )&& 
                (
                    this.isEmbed == input.isEmbed ||
                    (this.isEmbed != null &&
                    this.isEmbed.Equals(input.isEmbed))
                )&& 
                (
                    this.appNames == input.appNames ||
                    (this.appNames != null &&
                    this.appNames.Equals(input.appNames))
                )&& 
                (
                    this.attributes == input.attributes ||
                    (this.attributes != null &&
                    this.attributes.Equals(input.attributes))
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
                if (this.clientId != null)
                    hashCode = hashCode * 59 + this.clientId.GetHashCode();
                if (this.clientSecret != null)
                    hashCode = hashCode * 59 + this.clientSecret.GetHashCode();
                if (this.username != null)
                    hashCode = hashCode * 59 + this.username.GetHashCode();
                if (this.password != null)
                    hashCode = hashCode * 59 + this.password.GetHashCode();
                if (this.publicKey != null)
                    hashCode = hashCode * 59 + this.publicKey.GetHashCode();
                if (this.userAccessToken != null)
                    hashCode = hashCode * 59 + this.userAccessToken.GetHashCode();
                if (this.basePath != null)
                    hashCode = hashCode * 59 + this.basePath.GetHashCode();
                if (this.isCredsPassed != null)
                    hashCode = hashCode * 59 + this.isCredsPassed.GetHashCode();
                if (this.isEmbed != null)
                    hashCode = hashCode * 59 + this.isEmbed.GetHashCode();
                if (this.appNames != null)
                    hashCode = hashCode * 59 + this.appNames.GetHashCode();
                if (this.attributes != null)
                    hashCode = hashCode * 59 + this.attributes.GetHashCode();
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