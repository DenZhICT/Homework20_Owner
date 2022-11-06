package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${environment}.properties",
        "classpath:local.properties"
})
public interface WebDriverConfig extends Config {

    @Key("browserName")
    String getBrowserName();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("baseUrl")
    String getBaseUrl();

    @Key("browserPosition")
    String getBrowserPosition();

    @Key("browserSize")
    String getBrowserSize();

    @Key("remoteUrl")
    String getRemoteUrl();
}