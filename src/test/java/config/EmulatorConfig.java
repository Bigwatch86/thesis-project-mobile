package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/emulator.properties")
public interface EmulatorConfig extends Config {
    String platformName();
    String deviceName();
    String platformVersion();
    String locale();
    String language();
    String appPackage();
    String appActivity();
}
