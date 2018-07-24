package com.example.demo.department.controller.impl;

import com.example.demo.department.controller.DepartmentController;
import com.example.demo.department.model.Department;
import com.example.demo.department.service.DepartmentService;
import com.example.demo.employee.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class DepartmentControllerImpl implements DepartmentController {
    private DepartmentService departmentService;

    public DepartmentControllerImpl(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public ResponseEntity getChildDeps() {
        return null;
    }

    @Override
    public ResponseEntity getEmployees() {
        return null;
    }

    @Override
    public ResponseEntity createNewDep() {
        return null;
    }

    @Override
    public ResponseEntity reSubord() {
        return null;
    }

    @Override
    public ResponseEntity closeDep() {
        return null;
    }

    @Override
    public ResponseEntity depChange() {
        return null;
    }
}
