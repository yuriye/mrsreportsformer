package com.yelisoft.mfc.mrs;

import org.yaml.snakeyaml.Yaml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Yaml yaml = new Yaml();
        Config config = null;

        if (args.length > 0) {
            System.out.println("Arg[0]==" + args[0]);
            if ("1".equals(args[0])) {
                config = new Config();
                config.setNamesComplianceFile("nameComplianceFileStub");
                Map<String, String> pageNamesCompliance = new HashMap<>();
                pageNamesCompliance.put("sPage1", "dPage1");
                pageNamesCompliance.put("sPage2", "dPage2");
                pageNamesCompliance.put("sPage3", "dPage3");
                pageNamesCompliance.put("sPage4", "dPage4");
                pageNamesCompliance.put("sPage5", "dPage5");
                pageNamesCompliance.put("sPage6", "dPage6");
                DestinationPlan dp1 = new DestinationPlan("authorityLevelInstance1",
                        "destinationFileName1",
                        pageNamesCompliance);
                Map<String, DestinationPlan> destinasionsMap = new HashMap<>();
                destinasionsMap.put("authorityLevelInstance1", dp1);

                config.setAuthorityToDestinationPlan(destinasionsMap);
            }
            else {
//                for (Object obj: yaml.loadAll(new FileReader("C:/config.yml"))
//                     ) {
//                    StringWriter sw = new StringWriter();
//                    yaml.dump((Config) obj , sw);
//                    System.out.println(sw.toString());
//                    System.out.println(obj);
//                }
////                System.out.println(yaml.loadAll(new FileReader("C:/config.yml")));
                config = yaml.load(new FileReader("C:/config.yml"));
            }
        }
        else {
//            System.out.println(yaml.loadAll(new FileReader("C:/config.yml")));
            config = yaml.load(new FileReader("C:/config.yml"));
        }
        StringWriter sw = new StringWriter();
        yaml.dump(config, sw);
        System.out.println(sw.toString());

    }
}
