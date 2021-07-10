
package com.expo.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ExpoStand {
    @Id
    private String standNo;
    private int standLenght;
    private int standwith;
    private Date rentDate;
    private int standArea;
    @ManyToOne
    private Company company;
    @ManyToOne 
    
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    
    public String getStandNo() {
        return standNo;
    }

    public void setStandNo(String standNo) {
        this.standNo = standNo;
    }

    public int getStandLenght() {
        return standLenght;
    }

    public void setStandLenght(int standLenght) {
        this.standLenght = standLenght;
    }

    public int getStandwith() {
        return standwith;
    }

    public void setStandwith(int standwith) {
        this.standwith = standwith;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public int getStandArea() {
        return standArea;
    }

    public void setStandArea(int standArea) {
        this.standArea = standArea;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

   
    
    
}
