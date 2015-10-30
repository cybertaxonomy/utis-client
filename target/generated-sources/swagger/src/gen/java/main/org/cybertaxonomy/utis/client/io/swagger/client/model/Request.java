package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-30T18:08:48.841+01:00")
public class Request   {
  
  private String searchMode = null;
  private Boolean addSynonymy = null;
  private String queryString = null;

  
  /**
   * Specified the search mode to be usedPossible search modes are: scientificNameExact, scientificNameLike (begins with), vernacularNameExact, vernacularNameLike (contains).
   **/
  @ApiModelProperty(value = "Specified the search mode to be usedPossible search modes are: scientificNameExact, scientificNameLike (begins with), vernacularNameExact, vernacularNameLike (contains).")
  @JsonProperty("searchMode")
  public String getSearchMode() {
    return searchMode;
  }
  public void setSearchMode(String searchMode) {
    this.searchMode = searchMode;
  }

  
  /**
   * Indicates whether the synonymy of the accepted taxon should be included into the response. Turning this option on may lead to an increased response time.
   **/
  @ApiModelProperty(value = "Indicates whether the synonymy of the accepted taxon should be included into the response. Turning this option on may lead to an increased response time.")
  @JsonProperty("addSynonymy")
  public Boolean getAddSynonymy() {
    return addSynonymy;
  }
  public void setAddSynonymy(Boolean addSynonymy) {
    this.addSynonymy = addSynonymy;
  }

  
  /**
   * The query string to match a scientific name, vernacular name or identifier depending on the searchMode
   **/
  @ApiModelProperty(value = "The query string to match a scientific name, vernacular name or identifier depending on the searchMode")
  @JsonProperty("queryString")
  public String getQueryString() {
    return queryString;
  }
  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Request {\n");
    
    sb.append("    searchMode: ").append(StringUtil.toIndentedString(searchMode)).append("\n");
    sb.append("    addSynonymy: ").append(StringUtil.toIndentedString(addSynonymy)).append("\n");
    sb.append("    queryString: ").append(StringUtil.toIndentedString(queryString)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
