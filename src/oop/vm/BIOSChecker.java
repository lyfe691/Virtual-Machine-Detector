package oop.vm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BIOSChecker {

    public static boolean isVM() {
        try {
            String command = "wmic bios get manufacturer";
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("VMware") || line.contains("VirtualBox") || line.contains("QEMU")) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
