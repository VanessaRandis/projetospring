package com.escola.uniforme.filter;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.escola.uniforme.user.IUserRepository;

import at.favre.lib.crypto.bcrypt.BCrypt;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class FilterPecasAuth extends OncePerRequestFilter {

    @Autowired
    private IUserRepository userRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
                filterChain.doFilter(request, response);

                /*var servletPath = request.getServletPath();
                if (servletPath.equals("/pecas/")) {

                 //pegar a autentação
                var authorization = request.getHeader("Authorization");
                System.out.println("Authorization");
                System.out.println(authorization);

                var usuario_password = authorization.substring("Basic".length()).trim();
                System.out.println(usuario_password);

                byte [] authDecode = Base64.getDecoder().decode(usuario_password);

                System.out.println(authDecode);

                var authString = new String (authDecode);

                System.out.println(authString);

                String [] credentials = authString.split(":");
                String username = credentials[0];
                String password = credentials[1];

                System.out.println("username: "+ username);
                System.out.println("password: " + password);


                var user = this.userRepository.findByUsername(username);
                if (user == null) {
                        response.sendError(401);

                }else {

                    var passwordVerify = BCrypt.verifyer().verify(password.toCharArray(), user.getPassword());
                    if (passwordVerify.verified){
                        filterChain.doFilter(request, response);
                    }else {
                        response.sendError(401);
                    }
                    
                }

                //validar a exsitencia do usuario
                //valida senha
                //segue os passos do projeto
             

                 }else {
                    filterChain.doFilter(request, response);
                 }*/
             

    }
    
}
