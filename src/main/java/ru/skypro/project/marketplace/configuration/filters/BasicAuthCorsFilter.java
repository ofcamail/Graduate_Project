package ru.skypro.project.marketplace.configuration.filters;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
public class BasicAuthCorsFilter extends OncePerRequestFilter {

    private static final String ACCESS_CONTROL_ALLOW_CREDENTIALS_HEADER = "Access-Control-Allow-Credentials";
    private static final String TRUE = "true";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        response.addHeader(ACCESS_CONTROL_ALLOW_CREDENTIALS_HEADER, TRUE);
        filterChain.doFilter(request, response);
    }
}
