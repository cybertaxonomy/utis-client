package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-30T18:08:48.841+01:00")
public class Source   {
  
  private String datasetName = null;
  private String title = null;
  private String identifier = null;
  private String url = null;
  private String name = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("datasetName")
  public String getDatasetName() {
    return datasetName;
  }
  public void setDatasetName(String datasetName) {
    this.datasetName = datasetName;
  }

  
  /**
   * The full not atomized source string.
   **/
  @ApiModelProperty(value = "The full not atomized source string.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    
    sb.append("    datasetName: ").append(StringUtil.toIndentedString(datasetName)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("    identifier: ").append(StringUtil.toIndentedString(identifier)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
