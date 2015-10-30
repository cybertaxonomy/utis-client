package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-30T18:08:48.841+01:00")
public class ClientStatus   {
  
  private String statusMessage = null;
  private String checklistId = null;
  private Double duration = null;

  
  /**
   * Status of the request, possible values are 'ok', 'timeout', 'interrupted', 'unsupported search mode'.
   **/
  @ApiModelProperty(value = "Status of the request, possible values are 'ok', 'timeout', 'interrupted', 'unsupported search mode'.")
  @JsonProperty("statusMessage")
  public String getStatusMessage() {
    return statusMessage;
  }
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
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
   * Duration of the request processing in the specific checklist client in milliseconds.
   **/
  @ApiModelProperty(value = "Duration of the request processing in the specific checklist client in milliseconds.")
  @JsonProperty("duration")
  public Double getDuration() {
    return duration;
  }
  public void setDuration(Double duration) {
    this.duration = duration;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientStatus {\n");
    
    sb.append("    statusMessage: ").append(StringUtil.toIndentedString(statusMessage)).append("\n");
    sb.append("    checklistId: ").append(StringUtil.toIndentedString(checklistId)).append("\n");
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
