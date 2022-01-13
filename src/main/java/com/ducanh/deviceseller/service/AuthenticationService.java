package com.ducanh.deviceseller.service;

import com.ducanh.deviceseller.model.User;

public interface AuthenticationService {
    User SignInAndReturnJWT(User signInRequest);
}
