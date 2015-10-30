package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Synonym;
import io.swagger.client.model.Taxon;
import java.util.*;
import io.swagger.client.model.OtherNames;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-30T18:08:48.841+01:00")
public class Response   {
  
  private Taxon taxon = null;
  private List<OtherNames> otherNames = new ArrayList<OtherNames>();
  private List<String> vernacularNames = new ArrayList<String>();
  private String checklistId = null;
  private String checklistUrl = null;
  private String checklistVersion = null;
  private String checklistCitation = null;
  private String matchingNameString = null;

public enum MatchingNameTypeEnum {
  TAXON("TAXON"),
  SYNONYM("SYNONYM"),
  VERNACULAR_NAME("VERNACULAR_NAME"),
  OTHER_NAME("OTHER_NAME");

  private String value;

  MatchingNameTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private MatchingNameTypeEnum matchingNameType = null;
  private List<Synonym> synonyms = new ArrayList<Synonym>();
  private String checklist = null;

  
  /**
   * The accepted taxon
   **/
  @ApiModelProperty(value = "The accepted taxon")
  @JsonProperty("taxon")
  public Taxon getTaxon() {
    return taxon;
  }
  public void setTaxon(Taxon taxon) {
    this.taxon = taxon;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("otherNames")
  public List<OtherNames> getOtherNames() {
    return otherNames;
  }
  public void setOtherNames(List<OtherNames> otherNames) {
    this.otherNames = otherNames;
  }

  
  /**
   * A common or vernacular name.
   **/
  @ApiModelProperty(value = "A common or vernacular name.")
  @JsonProperty("vernacularNames")
  public List<String> getVernacularNames() {
    return vernacularNames;
  }
  public void setVernacularNames(List<String> vernacularNames) {
    this.vernacularNames = vernacularNames;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("checklistId")
  public String getChecklistId() {
    return checklistId;
  }
  public void setChecklistId(String checklistId) {
    this.checklistId = checklistId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("checklistUrl")
  public String getChecklistUrl() {
    return checklistUrl;
  }
  public void setChecklistUrl(String checklistUrl) {
    this.checklistUrl = checklistUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("checklistVersion")
  public String getChecklistVersion() {
    return checklistVersion;
  }
  public void setChecklistVersion(String checklistVersion) {
    this.checklistVersion = checklistVersion;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("checklistCitation")
  public String getChecklistCitation() {
    return checklistCitation;
  }
  public void setChecklistCitation(String checklistCitation) {
    this.checklistCitation = checklistCitation;
  }

  
  /**
   * Refers to the name string of the accepted taxon, synonym or otherName which was matching the query string
   **/
  @ApiModelProperty(value = "Refers to the name string of the accepted taxon, synonym or otherName which was matching the query string")
  @JsonProperty("matchingNameString")
  public String getMatchingNameString() {
    return matchingNameString;
  }
  public void setMatchingNameString(String matchingNameString) {
    this.matchingNameString = matchingNameString;
  }

  
  /**
   * Reports which of the names was matching the query string:  'taxon', 'synonym', 'vernacularName', or 'otherName'
   **/
  @ApiModelProperty(value = "Reports which of the names was matching the query string:  'taxon', 'synonym', 'vernacularName', or 'otherName'")
  @JsonProperty("matchingNameType")
  public MatchingNameTypeEnum getMatchingNameType() {
    return matchingNameType;
  }
  public void setMatchingNameType(MatchingNameTypeEnum matchingNameType) {
    this.matchingNameType = matchingNameType;
  }

  
  /**
   * The list synonyms related to the accepted taxon
   **/
  @ApiModelProperty(value = "The list synonyms related to the accepted taxon")
  @JsonProperty("synonyms")
  public List<Synonym> getSynonyms() {
    return synonyms;
  }
  public void setSynonyms(List<Synonym> synonyms) {
    this.synonyms = synonyms;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("checklist")
  public String getChecklist() {
    return checklist;
  }
  public void setChecklist(String checklist) {
    this.checklist = checklist;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    taxon: ").append(StringUtil.toIndentedString(taxon)).append("\n");
    sb.append("    otherNames: ").append(StringUtil.toIndentedString(otherNames)).append("\n");
    sb.append("    vernacularNames: ").append(StringUtil.toIndentedString(vernacularNames)).append("\n");
    sb.append("    checklistId: ").append(StringUtil.toIndentedString(checklistId)).append("\n");
    sb.append("    checklistUrl: ").append(StringUtil.toIndentedString(checklistUrl)).append("\n");
    sb.append("    checklistVersion: ").append(StringUtil.toIndentedString(checklistVersion)).append("\n");
    sb.append("    checklistCitation: ").append(StringUtil.toIndentedString(checklistCitation)).append("\n");
    sb.append("    matchingNameString: ").append(StringUtil.toIndentedString(matchingNameString)).append("\n");
    sb.append("    matchingNameType: ").append(StringUtil.toIndentedString(matchingNameType)).append("\n");
    sb.append("    synonyms: ").append(StringUtil.toIndentedString(synonyms)).append("\n");
    sb.append("    checklist: ").append(StringUtil.toIndentedString(checklist)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
