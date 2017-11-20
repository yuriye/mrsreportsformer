package com.yelisoft.mfc.mrs;

import java.util.Map;

public class Config {
    private String namesComplianceFile;
    private Map<String, DestinationPlan> authorityToDestinationPlan;


    public String getNamesComplianceFile() {
        return namesComplianceFile;
    }

    public void setNamesComplianceFile(String namesComplianceFile) {
        this.namesComplianceFile = namesComplianceFile;
    }

    public Map<String, DestinationPlan> getAuthorityToDestinationPlan() {
        return authorityToDestinationPlan;
    }

    public void setAuthorityToDestinationPlan(Map<String, DestinationPlan> authorityToDestinationPlan) {
        this.authorityToDestinationPlan = authorityToDestinationPlan;
    }
}
