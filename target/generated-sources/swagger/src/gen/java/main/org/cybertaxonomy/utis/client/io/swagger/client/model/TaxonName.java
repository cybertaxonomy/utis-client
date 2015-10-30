package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.AtomisedName;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-30T18:08:48.841+01:00")
public class TaxonName   {
  
  private String nomenclaturalReference = null;
  private AtomisedName atomisedName = null;
  private String authorship = null;
  private String rank = null;
  private String fullName = null;
  private String canonicalName = null;

  
  /**
   * A reference for the publication in which the scientificName was originally established under the rules of the associated nomenclaturalCode.
   **/
  @ApiModelProperty(value = "A reference for the publication in which the scientificName was originally established under the rules of the associated nomenclaturalCode.")
  @JsonProperty("nomenclaturalReference")
  public String getNomenclaturalReference() {
    return nomenclaturalReference;
  }
  public void setNomenclaturalReference(String nomenclaturalReference) {
    this.nomenclaturalReference = nomenclaturalReference;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("atomisedName")
  public AtomisedName getAtomisedName() {
    return atomisedName;
  }
  public void setAtomisedName(AtomisedName atomisedName) {
    this.atomisedName = atomisedName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("authorship")
  public String getAuthorship() {
    return authorship;
  }
  public void setAuthorship(String authorship) {
    this.authorship = authorship;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("rank")
  public String getRank() {
    return rank;
  }
  public void setRank(String rank) {
    this.rank = rank;
  }

  
  /**
   * The full scientific name, with authorship, publication date information and potentially further taxonomic information.
   **/
  @ApiModelProperty(value = "The full scientific name, with authorship, publication date information and potentially further taxonomic information.")
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  
  /**
   * Canonical name string consisting of only nomenclatural information, i.e. no authorship or taxonomic hierarchy information with the exception of the necessary placements within Genus or Species.
   **/
  @ApiModelProperty(value = "Canonical name string consisting of only nomenclatural information, i.e. no authorship or taxonomic hierarchy information with the exception of the necessary placements within Genus or Species.")
  @JsonProperty("canonicalName")
  public String getCanonicalName() {
    return canonicalName;
  }
  public void setCanonicalName(String canonicalName) {
    this.canonicalName = canonicalName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxonName {\n");
    
    sb.append("    nomenclaturalReference: ").append(StringUtil.toIndentedString(nomenclaturalReference)).append("\n");
    sb.append("    atomisedName: ").append(StringUtil.toIndentedString(atomisedName)).append("\n");
    sb.append("    authorship: ").append(StringUtil.toIndentedString(authorship)).append("\n");
    sb.append("    rank: ").append(StringUtil.toIndentedString(rank)).append("\n");
    sb.append("    fullName: ").append(StringUtil.toIndentedString(fullName)).append("\n");
    sb.append("    canonicalName: ").append(StringUtil.toIndentedString(canonicalName)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
