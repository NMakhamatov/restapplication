package com.example.demo.certificates;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "certificates")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "certif_name")
    private  String name;

    @Column(name = "issue_date")

    @Temporal(TemporalType.DATE)
    private Date issueDate;

    @Column(name = "company_name")
    private String companyName;

    @Column
    private Long code;

    @Column
    private Blob scan;

    public Certificate(){

    }

    public Long getId() {
        return id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Blob getScan() {
        return scan;
    }

    public void setScan(Blob scan) {
        this.scan = scan;
    }
}
