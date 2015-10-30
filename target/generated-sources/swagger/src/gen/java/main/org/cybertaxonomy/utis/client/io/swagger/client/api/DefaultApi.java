package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.ServiceProviderInfo;
import io.swagger.client.model.TnrMsg;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-30T18:08:48.841+01:00")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * capabilities
   * capabilities
   * @return List<ServiceProviderInfo>
   */
  public List<ServiceProviderInfo> capabilities () throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/capabilities".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "application/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<ServiceProviderInfo>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * search
   * search
   * @param query The scientific name to search for. For example: \&quot;Bellis perennis\&quot;, \&quot;Prionus\&quot; or \&quot;Bolinus brandaris\&quot;. This is an exact search so wildcard characters are not supported.
   * @param providers A list of provider id strings concatenated by comma characters. The default : \&quot;pesi,bgbm-cdm-server[col]\&quot; will be used if this parameter is not set. A list of all available provider ids can be obtained from the &#39;/capabilities&#39; service end point. Providers can be nested, that is a parent provider can have sub providers. If the id of the parent provider is supplied all subproviders will be queried. The query can also be restriced to one or more subproviders by using the following syntax: parent-id[sub-id-1,sub-id2,...]
   * @param searchMode Specifies the searchMode. Possible search modes are: scientificNameExact, scientificNameLike (begins with), vernacularNameExact, vernacularNameLike (contains), findByIdentifier. If the a provider does not support the chosen searchMode it will be skipped and the status message in the tnrClientStatus will be set to &#39;unsupported search mode&#39; in this case.
   * @param addSynonymy Indicates whether the synonymy of the accepted taxon should be included into the response. Turning this option on may cause an increased response time.
   * @param timeout The maximum of milliseconds to wait for responses from any of the providers. If the timeout is exceeded the service will jut return the resonses that have been received so far. The default timeout is 0 ms (wait for ever)
   * @return TnrMsg
   */
  public TnrMsg search (String query, String providers, String searchMode, Boolean addSynonymy, Long timeout) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'query' is set
     if (query == null) {
        throw new ApiException(400, "Missing the required parameter 'query' when calling search");
     }
     
    // create path and map variables
    String path = "/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "query", query));
    
    queryParams.addAll(apiClient.parameterToPairs("", "providers", providers));
    
    queryParams.addAll(apiClient.parameterToPairs("", "searchMode", searchMode));
    
    queryParams.addAll(apiClient.parameterToPairs("", "addSynonymy", addSynonymy));
    
    queryParams.addAll(apiClient.parameterToPairs("", "timeout", timeout));
    

    

    

    final String[] accepts = {
      "application/json", "application/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<TnrMsg>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
