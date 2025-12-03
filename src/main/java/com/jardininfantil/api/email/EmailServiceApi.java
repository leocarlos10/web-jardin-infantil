package com.jardininfantil.api.email;

import org.springframework.stereotype.Service;

@Service
public class EmailServiceApi {

    private final EmailProvider provider;

    public EmailServiceApi(EmailProvider provider) {
        this.provider = provider;
    }

    public void send(String to, String subject, String body) throws Exception {
        provider.sendEmail(to, subject, body);
    }
}
