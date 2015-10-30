package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.ClientStatus;
import io.swagger.client.model.Response;
import io.swagger.client.model.Request;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-30T18:08:48.841+01:00")
public class Query   {
  
  private List<ClientStatus> clientStatus = new ArrayList<ClientStatus>();
  private Request request = null;
  private List<Response> response = new ArrayList<Response>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("clientStatus")
  public List<ClientStatus> getClientStatus() {
    return clientStatus;
  }
  public void setClientStatus(List<ClientStatus> clientStatus) {
    this.clientStatus = clientStatus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("request")
  public Request getRequest() {
    return request;
  }
  public void setRequest(Request request) {
    this.request = request;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("response")
  public List<Response> getResponse() {
    return response;
  }
  public void setResponse(List<Response> response) {
    this.response = response;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    
    sb.append("    clientStatus: ").append(StringUtil.toIndentedString(clientStatus)).append("\n");
    sb.append("    request: ").append(StringUtil.toIndentedString(request)).append("\n");
    sb.append("    response: ").append(StringUtil.toIndentedString(response)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
