package com.stats.appraiser.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
public class JudicialOfficer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @NonNull
    private String firstName;
    @Nullable
    private String middleName;
    @NonNull
    private String lasName;

    public JudicialOfficer() {
    }

    public JudicialOfficer(long id, String firstName, String middleName, String lasName) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lasName = lasName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        JudicialOfficer other = (JudicialOfficer) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return firstName + ". " + middleName + " " + lasName;
    }

    
    
    

    

}
