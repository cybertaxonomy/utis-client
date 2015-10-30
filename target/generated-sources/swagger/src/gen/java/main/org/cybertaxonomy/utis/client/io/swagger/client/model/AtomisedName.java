package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-30T18:08:48.841+01:00")
public class AtomisedName   {
  
  private String genusOrUninomial = null;
  private String infragenericEpithet = null;
  private String specificEpithet = null;
  private String infraspecificEpithet = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("genusOrUninomial")
  public String getGenusOrUninomial() {
    return genusOrUninomial;
  }
  public void setGenusOrUninomial(String genusOrUninomial) {
    this.genusOrUninomial = genusOrUninomial;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("infragenericEpithet")
  public String getInfragenericEpithet() {
    return infragenericEpithet;
  }
  public void setInfragenericEpithet(String infragenericEpithet) {
    this.infragenericEpithet = infragenericEpithet;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("specificEpithet")
  public String getSpecificEpithet() {
    return specificEpithet;
  }
  public void setSpecificEpithet(String specificEpithet) {
    this.specificEpithet = specificEpithet;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("infraspecificEpithet")
  public String getInfraspecificEpithet() {
    return infraspecificEpithet;
  }
  public void setInfraspecificEpithet(String infraspecificEpithet) {
    this.infraspecificEpithet = infraspecificEpithet;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtomisedName {\n");
    
    sb.append("    genusOrUninomial: ").append(StringUtil.toIndentedString(genusOrUninomial)).append("\n");
    sb.append("    infragenericEpithet: ").append(StringUtil.toIndentedString(infragenericEpithet)).append("\n");
    sb.append("    specificEpithet: ").append(StringUtil.toIndentedString(specificEpithet)).append("\n");
    sb.append("    infraspecificEpithet: ").append(StringUtil.toIndentedString(infraspecificEpithet)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
