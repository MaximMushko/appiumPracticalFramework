package appiumFramework.capabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CapabilitiesFactory {

    public static MobileDriver<MobileElement> getCapability(String platform) throws MalformedURLException {
        if(platform.equals(MobilePlatform.ANDROID)){
           return getAndroidCapability();
        } else if (platform.equals(MobilePlatform.IOS)){
            return getIOSCapability();
        }
        return null;
    }

    private static AndroidDriver<MobileElement> getAndroidCapability () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5 API 26");

        AndroidDriver<MobileElement> androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

        return androidDriver;
    }

    private static IOSDriver<MobileElement> getIOSCapability () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5 API 26");

        IOSDriver<MobileElement> iosDriver = new IOSDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);

        return iosDriver;
    }
}
