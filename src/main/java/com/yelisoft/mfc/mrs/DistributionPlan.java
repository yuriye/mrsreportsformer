package com.yelisoft.mfc.mrs;

import java.util.Map;

public class DistributionPlan {
    private String name;
    private String authorityLevel;
    private Map<String, String> namesComplianceMap;
    private Map<String, String> columnsComplianceMap;
    private Integer sourceFirstRow;
    private Integer destinationFirstRow;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorityLevel() {
        return authorityLevel;
    }

    public void setAuthorityLevel(String authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    public Map<String, String> getNamesComplianceMap() {
        return namesComplianceMap;
    }

    public void setNamesComplianceMap(Map<String, String> namesComplianceMap) {
        this.namesComplianceMap = namesComplianceMap;
    }

    public Map<String, String> getColumnsComplianceMap() {
        return columnsComplianceMap;
    }

    public void setColumnsComplianceMap(Map<String, String> columnsComplianceMap) {
        this.columnsComplianceMap = columnsComplianceMap;
    }

    public DistributionPlan(String name, String authorityLevel, Map<String, String> nameComplianceMap, Map<String, String> columnsComplianceMap) {

        this.name = name;
        this.authorityLevel = authorityLevel;
        this.namesComplianceMap = nameComplianceMap;
        this.columnsComplianceMap = columnsComplianceMap;
    }

    //    public void fillnameComplianceMapFromXSLSFile(File inFile) {
//
//    }
}
