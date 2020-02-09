package MesinVending;

/**
 * SoldOutExcepiton Vending Machine melempar pengecualian ini jika pengguna
 * meminta produk yang terjual habis.
 */
public class SoldOutException extends RuntimeException {
    private String message;

    public SoldOutException(String string) {
        this.message = string;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
