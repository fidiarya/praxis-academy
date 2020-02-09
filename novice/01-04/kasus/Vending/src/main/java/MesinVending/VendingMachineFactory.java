package MesinVending;

/**
 * VandingMachineFactory Kelas Pabrik untuk membuat berbagai jenis Mesin
 * PenjualOtomatis
 */

public class VendingMachineFactory {
    public static VendingMachine createVendingMachine() {
        return new VendingMachineImpl();
    }
}
