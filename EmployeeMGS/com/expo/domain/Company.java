/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expo.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Company {
    @Id
    private String registrionNo;
    private String name;
    private String address;
    @OneToMany(mappedBy ="company",fetch = FetchType.EAGER)
     private List<ExpoStand>expo;

    public String getRegistrionNo() {
        return registrionNo;
    }

    public void setRegistrionNo(String registrionNo) {
        this.registrionNo = registrionNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ExpoStand> getExpo() {
        return expo;
    }

    public void setExpo(List<ExpoStand> expo) {
        this.expo = expo;
    }
    
    
}
