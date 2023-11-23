package az.company.springsecurity6jwt.services.auth;


import az.company.springsecurity6jwt.models.auth.AuthenticationResponse;
import az.company.springsecurity6jwt.models.auth.LoginRequest;
import az.company.springsecurity6jwt.models.auth.RegisterRequest;

public interface AuthenticationService {


    AuthenticationResponse register(RegisterRequest registerRequest);

    AuthenticationResponse login(LoginRequest loginRequest);
}
