package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-30T18:08:48.841+01:00")
public class Classification   {
  
  private String family = null;
  private String order = null;
  private String kingdom = null;
  private String phylum = null;
  private String genus = null;
  private String _class = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("family")
  public String getFamily() {
    return family;
  }
  public void setFamily(String family) {
    this.family = family;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("order")
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("kingdom")
  public String getKingdom() {
    return kingdom;
  }
  public void setKingdom(String kingdom) {
    this.kingdom = kingdom;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("phylum")
  public String getPhylum() {
    return phylum;
  }
  public void setPhylum(String phylum) {
    this.phylum = phylum;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("genus")
  public String getGenus() {
    return genus;
  }
  public void setGenus(String genus) {
    this.genus = genus;
  }

  
  /**
   * The full scientific name of the class in which the taxon is classified.
   **/
  @ApiModelProperty(value = "The full scientific name of the class in which the taxon is classified.")
  @JsonProperty("class")
  public String getClass() {
    return _class;
  }
  public void setClass(String _class) {
    this._class = _class;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Classification {\n");
    
    sb.append("    family: ").append(StringUtil.toIndentedString(family)).append("\n");
    sb.append("    order: ").append(StringUtil.toIndentedString(order)).append("\n");
    sb.append("    kingdom: ").append(StringUtil.toIndentedString(kingdom)).append("\n");
    sb.append("    phylum: ").append(StringUtil.toIndentedString(phylum)).append("\n");
    sb.append("    genus: ").append(StringUtil.toIndentedString(genus)).append("\n");
    sb.append("    _class: ").append(StringUtil.toIndentedString(_class)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
