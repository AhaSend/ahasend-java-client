package com.ahasend.client.api;

import com.ahasend.client.ApiException;
import com.ahasend.client.ApiClient;
import com.ahasend.client.Configuration;
import com.ahasend.client.Pair;

import javax.ws.rs.core.GenericType;

import com.ahasend.client.model.AccessDeniedResponse;
import com.ahasend.client.model.BadRequestResponse;
import com.ahasend.client.model.Email;
import com.ahasend.client.model.SuccessfulResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-15T06:03:59.323628806Z[GMT]")
public class EmailApi {
  private ApiClient apiClient;

  public EmailApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EmailApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Send emails
   * You can send emails to up to 100 recipients using this API at the same time.
   * @param body Email object. (required)
   * @param contentType Only application/json is supported (optional)
   * @return SuccessfulResponse
   * @throws ApiException if fails to make API call
   */
  public SuccessfulResponse sendEmail(Email body, String contentType) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling sendEmail");
    }
    // create path and map variables
    String localVarPath = "/email/send";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (contentType != null)
      localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<SuccessfulResponse> localVarReturnType = new GenericType<SuccessfulResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
