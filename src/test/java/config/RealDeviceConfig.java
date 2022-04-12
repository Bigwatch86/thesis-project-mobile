package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/realDevice.properties")
public interface RealDeviceConfig extends Config {
    String platformName();
    String deviceName();
    String platformVersion();
    String locale();
    String language();
    String appPackage();
    String appActivity();
}
