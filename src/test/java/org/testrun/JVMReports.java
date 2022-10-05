package org.testrun;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
public static void generateReport(String json) {
	File f=new File("C:\\Users\\Elangovan\\eclipse-workspace\\BDDCucumber\\src\\test\\resources\\report\\jvmReport");
   Configuration con = new Configuration(f,"Facebook");
   con.addClassifications("Enviroinment","QA");
   con.addClassifications("Build","10");
   
   List<String> l = new LinkedList<String>();
   l.add(json);
    ReportBuilder r = new ReportBuilder(l,con);
    r.generateReports();


}
}
