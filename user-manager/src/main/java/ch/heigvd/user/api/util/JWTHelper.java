package ch.heigvd.user.api.util;


import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

import ch.heigvd.user.api.model.JWTToken;
import io.jsonwebtoken.*;


/**
 * https://developer.okta.com/blog/2018/10/31/jwts-with-java
 */
public class JWTHelper {

    private static final String SECRET_KEY = "Le gâteau est un mensonge";

    public static JWTToken createJWT(String email, long ttlMillis, boolean admin) {

        //The JWT signature algorithm we will be using to sign the token
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        //We will sign our JWT with our ApiKey secret
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET_KEY);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        //Let's set the JWT Claims
        JwtBuilder builder = Jwts.builder()
                .setIssuedAt(now)
                .setSubject(email)
                .setIssuer("login-server")
                .claim("admin", admin)
                .signWith(signatureAlgorithm, signingKey);

        //if it has been specified, let's add the expiration
        if (ttlMillis > 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }


        //Builds the JWT and serializes it to a compact, URL-safe string
        JWTToken jwtToken = new JWTToken();
        jwtToken.setJwttoken(builder.compact());

        return jwtToken;
    }

    public static Claims decodeJWT(String jwt) {
        //This line will throw an exception if it is not a signed JWS (as expected)
        Claims claims = Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(SECRET_KEY))
                .parseClaimsJws(jwt).getBody();
        return claims;
    }
}
