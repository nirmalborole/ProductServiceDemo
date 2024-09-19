package com.example.apidemo.component;

import com.example.apidemo.dtos.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AuthUtils {
    private RestTemplate restTemplate;
    @Autowired
    public AuthUtils(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public boolean validateToken(String tokenValue) {
        String body="{\"token\":\""+tokenValue+"\"}";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String>httpEntity=new HttpEntity<>(body,headers);
        try {
            Token token = this.restTemplate.postForObject("http://localhost:8080/user/validateToken", httpEntity, Token.class);
            return token != null;
        }catch (Exception e){
            return false;
        }
    }
}
