package com.example.springboot.learning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Depertment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long depertmentId;
    private String depertmentName;
    private String depertmentAddress;
    private String depertmentCode;

    public Long getDepertmentId() {
        return depertmentId;
    }

    public void setDepertmentId(Long depertmentId) {
        this.depertmentId = depertmentId;
    }

    public String getDepertmentName() {
        return depertmentName;
    }

    public void setDepertmentName(String depertmentName) {
        this.depertmentName = depertmentName;
    }

    public String getDepertmentAddress() {
        return depertmentAddress;
    }

    public void setDepertmentAddress(String depertmentAddress) {
        this.depertmentAddress = depertmentAddress;
    }

    public String getDepertmentCode() {
        return depertmentCode;
    }

    public void setDepertmentCode(String depertmentCode) {
        this.depertmentCode = depertmentCode;
    }

    public Depertment(Long depertmentId, String depertmentName, String depertmentAddress, String depertmentCode) {
        this.depertmentId = depertmentId;
        this.depertmentName = depertmentName;
        this.depertmentAddress = depertmentAddress;
        this.depertmentCode = depertmentCode;
    }

    public Depertment() {
    }

    @Override
    public String toString() {
        return "Depertment{" +
                "depertmentId=" + depertmentId +
                ", depertmentName='" + depertmentName + '\'' +
                ", depertmentAddress='" + depertmentAddress + '\'' +
                ", depertmentCode='" + depertmentCode + '\'' +
                '}';
    }
}
