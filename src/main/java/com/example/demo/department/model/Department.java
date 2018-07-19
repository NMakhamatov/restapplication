package com.example.demo.department.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @Version
    private Integer version = 0;

    @NotNull
    @Size(min = 3, max = 255)
    @Basic(optional = false)
    @Column(name = "full_name")
    private String fullname;

    @ManyToOne(
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "parent_id")
    private Department department;

    public Department() {
    }

    public Long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
