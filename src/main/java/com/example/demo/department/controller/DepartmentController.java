package com.example.demo.department.controller;

import org.springframework.http.ResponseEntity;

public interface DepartmentController {
    ResponseEntity getChildDeps();
    ResponseEntity getEmployees();
    ResponseEntity createNewDep();
    ResponseEntity reSubord();
    ResponseEntity closeDep();
    ResponseEntity depChange();
}
