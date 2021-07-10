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
public class Country {
    @Id
   private String code;
   private String name;
   @OneToMany(mappedBy = "country",fetch =FetchType.EAGER)
    private List<ExpoStand>count;

    public List<ExpoStand> getCount() {
        return count;
    }

    public void setCount(List<ExpoStand> count) {
        this.count = count;
    }
   
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
}
