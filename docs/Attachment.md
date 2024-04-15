# Attachment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **String** | The attachment data. If the base64 field is true, this data must be encoded using base64. Otherwise, it will be interpreted as UTF-8. | 
**base64** | **Boolean** | If set to true, data needs to be encoded using base64. Otherwise data will be interpreted as UTF-8. |  [optional]
**contentType** | **String** |  | 
**contentId** | **String** | If specified, this attachment will be added as an inline attachment and a multipart/related MIME container will be generated in the message to hold it and the textual content. |  [optional]
**fileName** | **String** |  | 
