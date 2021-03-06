package com.stats.appraiser.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.stats.appraiser.entity.CourtLevel;
import org.springframework.lang.NonNull;


@Entity
public class CaseFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate registeredDate;
    private CourtLevel courtLevel;
    private String fileNumber;
    public CaseFile(long id, LocalDate registeredDate, CourtLevel courtLevel, String fileNumber) {
        this.id = id;
        this.registeredDate = registeredDate;
        this.courtLevel = courtLevel;
        this.fileNumber = fileNumber;
    }
    public CaseFile() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public CourtLevel getCourtLevel() {
        return courtLevel;
    }

    public void setCourtLevel(CourtLevel courtLevel) {
        this.courtLevel = courtLevel;
    }

    public String getFileNumber() {
        return fileNumber;
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
        CaseFile other = (CaseFile) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        
        return courtLevel + "." + fileNumber +  "/"  + registeredDate.getYear();
    }

}
