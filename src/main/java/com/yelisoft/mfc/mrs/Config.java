package com.yelisoft.mfc.mrs;

import java.util.Map;

public class Config {
    private String configFileName;
    private String namesComplianceFile;
    private Map<String, DestinationPlan> autorityToDestinationPlan;

    public Config(String configFileName) {
        this.configFileName = configFileName;
    }

    public String getConfigFileName() {
        return configFileName;
    }

    public void setConfigFileName(String configFileName) {
        this.configFileName = configFileName;
    }

    public String getNamesComplianceFile() {
        return namesComplianceFile;
    }

    public void setNamesComplianceFile(String namesComplianceFile) {
        this.namesComplianceFile = namesComplianceFile;
    }

    public Map<String, DestinationPlan> getAutorityToDestinationPlan() {
        return autorityToDestinationPlan;
    }

    public void setAutorityToDestinationPlan(Map<String, DestinationPlan> autorityToDestinationPlan) {
        this.autorityToDestinationPlan = autorityToDestinationPlan;
    }
}
