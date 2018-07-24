package com.example.demo.position;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "positions")
public class Position {

    @Id
    @Column
    private Long id;

    @Column(name = "position_id")
    private String positionName;

    public Position() {
    }

    public Long getId() {
        return id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}