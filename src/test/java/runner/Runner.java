package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Scenario çalıştırıcı notasyonu.Cucumber ile junit entegrasonunu sağlar
@CucumberOptions(

        plugin = {"pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:TestOutput/failed_scenario.txt"},

        //rerun ile berlittigimiz dosyada fail olan senaryolar tutulur.


        features = "src/test/resources/features",

        glue = {"stepDefinitions", "hooks"},


        tags = "@a",

        dryRun = false
)

public class Runner {


}
