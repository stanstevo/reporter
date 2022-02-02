package com.stats.appraiser.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
public class ActiveCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private LocalDate eventDate;

    private CaseFile caseFile;
    
    @NonNull
    private CaseType caseType;

    @NonNull
    private String caseEvent;

    @NonNull
    private String caseOutcome;

// optional fields
    @Nullable
    private String appealDeatails;

    @Nullable
    private JudicialOfficer judicialOfficer;

    @Nullable
    private String adjournReason;

    private ActiveCase(Builder builder) {
        this.eventDate = builder.eventDate;
        this.caseFile = builder.caseFile;
        this.caseType = builder.caseType;
        this.caseEvent = builder.caseEvent;
        this.caseOutcome = builder.caseOutcome;
        this.appealDeatails = builder.appealDeatails;
        this.judicialOfficer=builder.judicialOfficer;
        this.adjournReason = builder.adjournReason;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }


    public CaseFile getCaseFile() {
        return caseFile;
    }


    public CaseType getCaseType() {
        return caseType;
    }


    public String getCaseEvent() {
        return caseEvent;
    }


    public String getCaseOutcome() {
        return caseOutcome;
    }


    public String getAppealDeatails() {
        return appealDeatails;
    }


    public JudicialOfficer getJudicialOfficer() {
        return judicialOfficer;
    }

    public String getAdjournReason() {
        return adjournReason;
    }

    private static class Builder {
        
        private final LocalDate eventDate;
    
        private final CaseFile caseFile;
        
        private final CaseType caseType;
        
        private final String caseEvent;
    
        private final String caseOutcome;

        private  String appealDeatails;
        
        private JudicialOfficer judicialOfficer;
    
        private String adjournReason;


        public Builder(LocalDate eventDate, CaseFile caseFile, CaseType caseType, String caseEvent, String caseOutcome,
                String appealDeatails, JudicialOfficer judicialOfficer, String adjournReason) {
            this.eventDate = eventDate;
            this.caseFile = caseFile;
            this.caseType = caseType;
            this.caseEvent = caseEvent;
            this.caseOutcome = caseOutcome;
            this.appealDeatails = appealDeatails;
            this.judicialOfficer = judicialOfficer;
            this.adjournReason = adjournReason;
        }


        public Builder getAppealDeatails(String details) {

            this.appealDeatails = details;
            return this;
        }


        public Builder getJudicialOfficer(JudicialOfficer officer) {
            this.judicialOfficer = officer;
            return this;
        }


        public Builder getAdjournReason(String reason) {
            this.adjournReason = reason;
            return this;
        }
        public ActiveCase build() {
            return new ActiveCase(this);
        }        

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
        ActiveCase other = (ActiveCase) obj;
        if (id != other.id)
            return false;
        return true;
    }
    

    
}
