package oop.vm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RegistryChecker {

    public static boolean isVM() {
        try {
            String command = "reg query HKLM\\HARDWARE\\DESCRIPTION\\System";
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("VMware") || line.contains("VirtualBox") || line.contains("Xen")) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
