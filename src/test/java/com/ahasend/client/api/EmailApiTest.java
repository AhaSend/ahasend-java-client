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

package com.ahasend.client.api;

import com.ahasend.client.model.AccessDeniedResponse;
import com.ahasend.client.model.BadRequestResponse;
import com.ahasend.client.model.Email;
import com.ahasend.client.model.SuccessfulResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for EmailApi
 */
@Ignore
public class EmailApiTest {

    private final EmailApi api = new EmailApi();

    /**
     * Send emails
     *
     * You can send emails to up to 100 recipients using this API at the same time.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sendEmailTest() throws Exception {
        Email body = null;
        String contentType = null;
        SuccessfulResponse response = api.sendEmail(body, contentType);

        // TODO: test validations
    }
}
