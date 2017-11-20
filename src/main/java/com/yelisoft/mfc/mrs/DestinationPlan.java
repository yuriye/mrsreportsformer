package com.yelisoft.mfc.mrs;

import java.util.Map;

public class DestinationPlan {

    private String authorityLevel;
    private String destinationFileName;
    private Map<String, String > pageNamesCompliance;

    public DestinationPlan() {}

    public DestinationPlan(String authorityLevel, String destinationFileName, Map<String, String> pageNamesCompliance) {
        this.authorityLevel = authorityLevel;
        this.destinationFileName = destinationFileName;
        this.pageNamesCompliance = pageNamesCompliance;
    }

    public String getAuthorityLevel() {
        return authorityLevel;
    }

    public void setAuthorityLevel(String authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    public String getDestinationFileName() {
        return destinationFileName;
    }

    public void setDestinationFileName(String destinationFileName) {
        this.destinationFileName = destinationFileName;
    }

    public Map<String, String> getPageNamesCompliance() {
        return pageNamesCompliance;
    }

    public void setPageNamesCompliance(Map<String, String> pageNamesCompliance) {
        this.pageNamesCompliance = pageNamesCompliance;
    }
}
