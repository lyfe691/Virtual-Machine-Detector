package oop.vm;

import java.net.NetworkInterface;
import java.util.Enumeration;

public class MacAddressChecker {

    public static boolean isVM() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                byte[] mac = networkInterface.getHardwareAddress();
                if (mac != null) {
                    String macAddress = String.format("%02X:%02X:%02X:%02X:%02X:%02X",
                            mac[0], mac[1], mac[2], mac[3], mac[4], mac[5]);

                    if (macAddress.startsWith("00:05:69") || macAddress.startsWith("00:1C:14") ||
                            macAddress.startsWith("00:0C:29") || macAddress.startsWith("00:50:56")) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
	