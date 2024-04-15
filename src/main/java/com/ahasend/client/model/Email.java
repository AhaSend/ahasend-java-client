/*
 * AhaSend Email API
 * This is the API documentation for sending emails via [AhaSend.com](https://ahasend.com). To use this API you need to get your API Key from your account under the API Keys page.
 *
 * OpenAPI spec version: 1.0.1
 * Contact: support@ahasend.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ahasend.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.ahasend.client.model.Contact;
import com.ahasend.client.model.Content;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Email
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-15T10:12:27.933925439Z[GMT]")

public class Email {
  @JsonProperty("from")
  private Contact from = null;

  @JsonProperty("recipients")
  private List<Contact> recipients = new ArrayList<Contact>();

  @JsonProperty("content")
  private Content content = null;

  public Email from(Contact from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @Schema(required = true, description = "")
  public Contact getFrom() {
    return from;
  }

  public void setFrom(Contact from) {
    this.from = from;
  }

  public Email recipients(List<Contact> recipients) {
    this.recipients = recipients;
    return this;
  }

  public Email addRecipientsItem(Contact recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Specifies the list of recipients to which message will be sent.
   * @return recipients
  **/
  @Schema(required = true, description = "Specifies the list of recipients to which message will be sent.")
  public List<Contact> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Contact> recipients) {
    this.recipients = recipients;
  }

  public Email content(Content content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(required = true, description = "")
  public Content getContent() {
    return content;
  }

  public void setContent(Content content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Email email = (Email) o;
    return Objects.equals(this.from, email.from) &&
        Objects.equals(this.recipients, email.recipients) &&
        Objects.equals(this.content, email.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, recipients, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
