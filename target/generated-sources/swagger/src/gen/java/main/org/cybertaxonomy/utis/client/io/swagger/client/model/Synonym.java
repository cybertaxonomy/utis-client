package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.TaxonName;
import io.swagger.client.model.Source;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-30T18:08:48.841+01:00")
public class Synonym   {
  
  private List<Source> sources = new ArrayList<Source>();
  private TaxonName taxonName = null;
  private String taxonomicStatus = null;
  private String accordingTo = null;
  private String url = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sources")
  public List<Source> getSources() {
    return sources;
  }
  public void setSources(List<Source> sources) {
    this.sources = sources;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("taxonName")
  public TaxonName getTaxonName() {
    return taxonName;
  }
  public void setTaxonName(TaxonName taxonName) {
    this.taxonName = taxonName;
  }

  
  /**
   * The taxonomic status string like 'invalid', 'misapplied', 'homotypic synonym', 'accepted', 'synonym'. Corresponds to http://rs.tdwg.org/dwc/terms/taxonomicStatus
   **/
  @ApiModelProperty(value = "The taxonomic status string like 'invalid', 'misapplied', 'homotypic synonym', 'accepted', 'synonym'. Corresponds to http://rs.tdwg.org/dwc/terms/taxonomicStatus")
  @JsonProperty("taxonomicStatus")
  public String getTaxonomicStatus() {
    return taxonomicStatus;
  }
  public void setTaxonomicStatus(String taxonomicStatus) {
    this.taxonomicStatus = taxonomicStatus;
  }

  
  /**
   * The reference to the source in which the specific taxon concept circumscription is defined or implied - traditionally signified by the Latin 'sensu' or 'sec.' (from secundum, meaning 'according to').
   **/
  @ApiModelProperty(value = "The reference to the source in which the specific taxon concept circumscription is defined or implied - traditionally signified by the Latin 'sensu' or 'sec.' (from secundum, meaning 'according to').")
  @JsonProperty("accordingTo")
  public String getAccordingTo() {
    return accordingTo;
  }
  public void setAccordingTo(String accordingTo) {
    this.accordingTo = accordingTo;
  }

  
  /**
   * The URL pointing to the original record of the checklist provider.
   **/
  @ApiModelProperty(value = "The URL pointing to the original record of the checklist provider.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Synonym {\n");
    
    sb.append("    sources: ").append(StringUtil.toIndentedString(sources)).append("\n");
    sb.append("    taxonName: ").append(StringUtil.toIndentedString(taxonName)).append("\n");
    sb.append("    taxonomicStatus: ").append(StringUtil.toIndentedString(taxonomicStatus)).append("\n");
    sb.append("    accordingTo: ").append(StringUtil.toIndentedString(accordingTo)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
