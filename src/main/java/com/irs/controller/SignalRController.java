package com.irs.controller;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irs.model.ChatMessage;
import com.irs.model.SignalRConnectionInfo;
import com.irs.model.SignalRMessage;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import kong.unirest.Unirest;

/**
 * SignalRController
 */
@RestController
@RequestMapping("/apiInteractiveRetailStore/v1")
@CrossOrigin(origins = { "*" })
public class SignalRController {
	private static final Logger LOG = LoggerFactory.getLogger(SignalRController.class);
    private String signalRServiceKey = "7CBr5mnYzhKv/PWLjBL575bCgWf1+ykrTZRuUCKS//A=";
    private String signalRServiceBaseEndpoint = "https://signalr-is.service.signalr.net";
    private String hubName = "chat";

 
    @PostMapping("/signalr/negotiate")
    public SignalRConnectionInfo negotiate() {
    	LOG.info("SignalRController : negotiate - Start");
        String hubUrl = signalRServiceBaseEndpoint + "/client/?hub=" + hubName;
        String userId = "12345"; // optional
        String accessKey = generateJwt(hubUrl, userId);
        return new SignalRConnectionInfo(hubUrl, accessKey);
    }

    @PostMapping("/api/messages")
    public void sendMessage(@RequestBody ChatMessage message) {
    	LOG.info("SignalRController : sendMessage - Start");
        String hubUrl = signalRServiceBaseEndpoint + "/api/v1/hubs/" + hubName;
        String accessKey = generateJwt(hubUrl, null);

        Unirest.post(hubUrl)
            .header("Content-Type", "application/json")
            .header("Authorization", "Bearer " + accessKey)
            .body(new SignalRMessage("newMessage", new Object[] { message }))
            .asEmpty();
    }

    private String generateJwt(String audience, String userId) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
    	LOG.info("SignalRController : generateJwt - Start");
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        long expMillis = nowMillis + (30 * 30 * 1000);
        Date exp = new Date(expMillis);

        byte[] apiKeySecretBytes = signalRServiceKey.getBytes(StandardCharsets.UTF_8);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        JwtBuilder builder = Jwts.builder()
            .setAudience(audience)
            .setIssuedAt(now)
            .setExpiration(exp)
            .signWith(signingKey);

        if (userId != null) {
            builder.claim("nameid", userId);
        }
        
        return builder.compact();
    }
}