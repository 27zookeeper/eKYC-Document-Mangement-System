package com.ekyc.management.service.impl;

import javax.jws.WebService;

import com.ekyc.management.RegistrationService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class RegistrationServiceImpl implements RegistrationService {

    public String firstName;

    public String lastName;

    public String emailId;

    public String password;

    private RegistrationServiceImpl(String firstName, String lastName, String emailId, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.password = password;
    }

    public String creatUser(final String firstName, final String lastName, final String emailId, final String password) {
        return firstName;
    }
}
