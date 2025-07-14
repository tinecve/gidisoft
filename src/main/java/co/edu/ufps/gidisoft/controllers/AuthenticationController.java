package co.edu.ufps.gidisoft.controllers;

import co.edu.ufps.gidisoft.controllers.dto.AuthCreateUserRequest;
import co.edu.ufps.gidisoft.controllers.dto.AuthLoginRequest;
import co.edu.ufps.gidisoft.controllers.dto.AuthResponse;
import co.edu.ufps.gidisoft.services.impl.UserDetailServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private UserDetailServiceImpl userDetailService;

    @PostMapping("/log-in")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthLoginRequest loginRequest){
        return new ResponseEntity<>(this.userDetailService.loginUser(loginRequest), HttpStatus.OK);
    }

    @PostMapping("/sign-up")
    public ResponseEntity<AuthResponse> register(@RequestBody @Valid AuthCreateUserRequest authCreateUserRequest){
        return new ResponseEntity<>(this.userDetailService.createUser(authCreateUserRequest), HttpStatus.CREATED);
    }

}
