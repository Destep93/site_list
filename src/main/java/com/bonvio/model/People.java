/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonvio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name = "people")
@JsonIgnoreProperties(ignoreUnknown = true)
public class People {

    public People() {
    }

    public People(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long people_id;
    private String name;
    private String address;
    private int age;
    
    @JsonIgnore//?
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "people")
    private List<Site> site;

    public List<Site> getSite() {
        return site;
    }

    public void setSite(List<Site> site) {
        this.site = site;
    }
    
    @Override
    public String toString() {
        return "People{" +
                "id=" + people_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age +  
                '}';
    }

    public long getPeople_id() {
        return people_id;
    }

    public void setPeople_id(long people_id) {
        this.people_id = people_id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
