package com.itrovers.service;

import com.wings4.security.model.*;
import com.wings4.security.service.SecurityService;
import com.wings4.security.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface BootStrap {
    public void createDefaultAdmin();
}
