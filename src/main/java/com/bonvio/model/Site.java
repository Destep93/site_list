package com.bonvio.model;
 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table (name = "site")
@JsonIgnoreProperties({"people"})
public class Site {
    
    public Site (){  
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private String secret;
    private String dbname;
    private String server;
    private boolean checked;
    
    @Column(nullable = false, insertable = false, updatable = false)
    private long people_id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "people_id", referencedColumnName="people_id" )
    private People people;

    public long getPeople_id() {
        return people_id;
    }

    public void setPeople_id(long people_id) {
        this.people_id = people_id;
    }
    
    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
 
    @Override
    public String toString() {
        return "Site{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", secret='" + secret + '\'' +
                ", dbname='" + dbname + '\'' +
                ", server='" + server + '\'' +
                ", checked=" + checked +
                '}';
    }


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
