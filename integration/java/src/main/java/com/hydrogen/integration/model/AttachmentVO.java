/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AttachmentVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-18T13:00:49.675Z")
public class AttachmentVO {
  @SerializedName("file_content")
  private String fileContent = null;

  @SerializedName("file_name")
  private String fileName = null;

  @SerializedName("file_type")
  private String fileType = null;

  public AttachmentVO fileContent(String fileContent) {
    this.fileContent = fileContent;
    return this;
  }

   /**
   * Get fileContent
   * @return fileContent
  **/
  @ApiModelProperty(value = "")
  public String getFileContent() {
    return fileContent;
  }

  public void setFileContent(String fileContent) {
    this.fileContent = fileContent;
  }

  public AttachmentVO fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public AttachmentVO fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @ApiModelProperty(value = "")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentVO attachmentVO = (AttachmentVO) o;
    return Objects.equals(this.fileContent, attachmentVO.fileContent) &&
        Objects.equals(this.fileName, attachmentVO.fileName) &&
        Objects.equals(this.fileType, attachmentVO.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileContent, fileName, fileType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentVO {\n");
    
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

