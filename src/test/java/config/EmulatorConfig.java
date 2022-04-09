package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/emulator.properties")
public interface EmulatorConfig extends Config {
    String platformName();
    String DeviceName();
    String PlatformVersion();
    String Locale();
    String Language();
    String appPackage();
    String AppActivity();
}
