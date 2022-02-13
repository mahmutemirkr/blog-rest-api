package com.emirk.myblog.service;

import com.emirk.myblog.model.User;

public interface IAuthenticationService {

	User signInAndReturnJWT(User signInRequest);
}
