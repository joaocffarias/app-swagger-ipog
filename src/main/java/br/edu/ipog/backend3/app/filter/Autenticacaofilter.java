package br.edu.ipog.backend3.app.filter;

import jakarta.servlet.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class Autenticacaofilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        log.info("AutenticacaoFilter::doFilter executado.");

        filterChain.doFilter(request,response);
    }
}
