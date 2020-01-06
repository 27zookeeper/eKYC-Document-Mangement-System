package com.ekyc.management;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface RegistrationService {

    @WebMethod
    String creatUser(final String firstName, final String lastName, final String emailId, final String password);
}
