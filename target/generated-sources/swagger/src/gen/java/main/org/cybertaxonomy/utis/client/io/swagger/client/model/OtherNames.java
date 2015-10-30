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
public class OtherNames   {
  
  private List<Source> sources = new ArrayList<Source>();
  private TaxonName taxonName = null;
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
   * The URL pointing to the original name record of the checklist provider.
   **/
  @ApiModelProperty(value = "The URL pointing to the original name record of the checklist provider.")
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
    sb.append("class OtherNames {\n");
    
    sb.append("    sources: ").append(StringUtil.toIndentedString(sources)).append("\n");
    sb.append("    taxonName: ").append(StringUtil.toIndentedString(taxonName)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
