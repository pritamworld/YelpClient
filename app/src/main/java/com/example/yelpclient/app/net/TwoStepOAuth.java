package com.example.yelpclient.app.net;

import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;

public class TwoStepOAuth extends DefaultApi10a {
    @Override
    public String getRequestTokenEndpoint() {
        return null;
    }

    @Override
    public String getAccessTokenEndpoint() {
        return null;
    }

    @Override
    public String getAuthorizationUrl(Token requestToken) {
        return null;
    }
}