package com.app.employeeservice.controller;

import com.app.employeeservice.model.WelcomeObject;
import com.app.employeeservice.service.Company;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
    @GetMapping("/say/welcome")
    public ResponseEntity<?> sayWelcome(){
        WelcomeObject wb=new WelcomeObject();
        wb.setDescription("hey welcome to session");
        wb.setEmployeeName("Jaya");
        wb.setTitle("Welcome");
        return new ResponseEntity<>(wb, HttpStatus.OK);

    }
}
