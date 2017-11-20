package com.yelisoft.mfc.mrs;

import org.yaml.snakeyaml.Yaml;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Config config = new Config("configStub.yml");
        config.setNamesComplianceFile("nameComplianceFileStub");
        Map<String, String > pageNamesCompliance = new HashMap<>();
        pageNamesCompliance.put("sPage1", "dPage1");
        pageNamesCompliance.put("sPage2", "dPage2");
        pageNamesCompliance.put("sPage3", "dPage3");
        pageNamesCompliance.put("sPage4", "dPage4");
        pageNamesCompliance.put("sPage5", "dPage5");
        pageNamesCompliance.put("sPage6", "dPage6");
        DestinationPlan dp1 = new DestinationPlan("authorityLevelInstance1",
                "destinationFileName1",
                pageNamesCompliance);
        Map<String,DestinationPlan> destinasionsMap = new HashMap<>();
        destinasionsMap.put("authorityLevelInstance1", dp1);

        config.setAutorityToDestinationPlan(destinasionsMap);

        Yaml yaml = new Yaml();
        StringWriter sw = new StringWriter();
        yaml.dump(config, sw);

        System.out.println(sw.toString());

    }
}
