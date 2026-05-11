package com.techouts.cart_service.config;

import feign.RequestInterceptor;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Configuration
public class FeignConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {

        return requestTemplate -> {

            ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

            if (requestAttributes != null) {

                HttpServletRequest request = requestAttributes.getRequest();

                String userId = request.getHeader("X-User-Id");
                String userRole = request.getHeader("x-User-Role");

                if (userId != null) {
                    requestTemplate.header("X-User-Id", userId);
                }

                if (userRole != null) {
                    requestTemplate.header("X-User-Role", userRole);
                }

            }

        };
    }

}
