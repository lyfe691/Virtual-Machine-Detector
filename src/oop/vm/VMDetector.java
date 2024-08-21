package oop.vm;
public class VMDetector {

    public static void main(String[] args) {
        System.out.println("Starting VM Detection...");

        boolean isVM = BIOSChecker.isVM() || MacAddressChecker.isVM() || CPUChecker.isVM() || RegistryChecker.isVM();

        if (isVM) {
            System.out.println("VM environment detected.");
        } else {
            System.out.println("No VM environment detected.");
        }
    }
}
