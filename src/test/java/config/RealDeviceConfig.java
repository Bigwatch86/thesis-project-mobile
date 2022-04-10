package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/realDevice.properties")
public interface RealDeviceConfig extends Config {
    String platformName();
    String DeviceName();
    String PlatformVersion();
    String Locale();
    String Language();
    String appPackage();
    String AppActivity();
}
