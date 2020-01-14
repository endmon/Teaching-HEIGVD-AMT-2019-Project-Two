package ch.heigvd.user.api.interceptor;

import ch.heigvd.user.api.util.JWTHelper;
import ch.heigvd.user.api.util.Utils;
import ch.heigvd.user.repositories.UserRepository;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TokenInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    UserRepository userRepository;

    @Autowired
    JWTHelper jwtHelper;

    @Autowired
    Utils utils;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Claims claims = jwtHelper.decodeJWT(request.getHeader("Authorization"));

        if(claims == null) {
            return false;
        } else {
            request.setAttribute("claims", claims);
            return true;
        }
    }
}
