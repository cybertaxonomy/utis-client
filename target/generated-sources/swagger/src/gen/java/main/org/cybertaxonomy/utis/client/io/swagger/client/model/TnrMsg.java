package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Query;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-30T18:08:48.841+01:00")
public class TnrMsg   {
  
  private List<Query> query = new ArrayList<Query>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("query")
  public List<Query> getQuery() {
    return query;
  }
  public void setQuery(List<Query> query) {
    this.query = query;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TnrMsg {\n");
    
    sb.append("    query: ").append(StringUtil.toIndentedString(query)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
