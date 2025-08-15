package com.pojos.responsePOJO.restfulBooker;
import com.google.gson.annotations.Expose;

public class TokenResponse {

    @Expose
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
