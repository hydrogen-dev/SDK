using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class AppToken {
    /// <summary>
    /// Gets or Sets AppName
    /// </summary>
    [DataMember(Name="app_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "app_name")]
    public string AppName { get; set; }

    /// <summary>
    /// Gets or Sets _AppToken
    /// </summary>
    [DataMember(Name="app_token", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "app_token")]
    public string _AppToken { get; set; }

    /// <summary>
    /// Gets or Sets CreateDate
    /// </summary>
    [DataMember(Name="create_date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "create_date")]
    public DateTime? CreateDate { get; set; }

    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public Guid? Id { get; set; }

    /// <summary>
    /// Gets or Sets IsValid
    /// </summary>
    [DataMember(Name="is_valid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_valid")]
    public bool? IsValid { get; set; }

    /// <summary>
    /// Gets or Sets TenantName
    /// </summary>
    [DataMember(Name="tenant_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tenant_name")]
    public string TenantName { get; set; }

    /// <summary>
    /// Gets or Sets UpdateDate
    /// </summary>
    [DataMember(Name="update_date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "update_date")]
    public DateTime? UpdateDate { get; set; }

    /// <summary>
    /// Gets or Sets Username
    /// </summary>
    [DataMember(Name="username", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "username")]
    public string Username { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AppToken {\n");
      sb.Append("  AppName: ").Append(AppName).Append("\n");
      sb.Append("  _AppToken: ").Append(_AppToken).Append("\n");
      sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  IsValid: ").Append(IsValid).Append("\n");
      sb.Append("  TenantName: ").Append(TenantName).Append("\n");
      sb.Append("  UpdateDate: ").Append(UpdateDate).Append("\n");
      sb.Append("  Username: ").Append(Username).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
