package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.ServiceProviderInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-30T18:08:48.841+01:00")
public class ServiceProviderInfo   {
  
  private List<String> searchModes = new ArrayList<String>();
  private List<ServiceProviderInfo> subChecklists = new ArrayList<ServiceProviderInfo>();
  private String label = null;
  private String documentationUrl = null;
  private String copyrightUrl = null;
  private String version = null;
  private String id = null;

  
  /**
   * Set of the different SearchModes supported by the service provider and client implementation.Possible search modes are: scientificNameExact, scientificNameLike, vernacularName
   **/
  @ApiModelProperty(value = "Set of the different SearchModes supported by the service provider and client implementation.Possible search modes are: scientificNameExact, scientificNameLike, vernacularName")
  @JsonProperty("searchModes")
  public List<String> getSearchModes() {
    return searchModes;
  }
  public void setSearchModes(List<String> searchModes) {
    this.searchModes = searchModes;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("subChecklists")
  public List<ServiceProviderInfo> getSubChecklists() {
    return subChecklists;
  }
  public void setSubChecklists(List<ServiceProviderInfo> subChecklists) {
    this.subChecklists = subChecklists;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("documentationUrl")
  public String getDocumentationUrl() {
    return documentationUrl;
  }
  public void setDocumentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("copyrightUrl")
  public String getCopyrightUrl() {
    return copyrightUrl;
  }
  public void setCopyrightUrl(String copyrightUrl) {
    this.copyrightUrl = copyrightUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProviderInfo {\n");
    
    sb.append("    searchModes: ").append(StringUtil.toIndentedString(searchModes)).append("\n");
    sb.append("    subChecklists: ").append(StringUtil.toIndentedString(subChecklists)).append("\n");
    sb.append("    label: ").append(StringUtil.toIndentedString(label)).append("\n");
    sb.append("    documentationUrl: ").append(StringUtil.toIndentedString(documentationUrl)).append("\n");
    sb.append("    copyrightUrl: ").append(StringUtil.toIndentedString(copyrightUrl)).append("\n");
    sb.append("    version: ").append(StringUtil.toIndentedString(version)).append("\n");
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
