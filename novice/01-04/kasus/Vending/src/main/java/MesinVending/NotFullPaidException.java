package MesinVending;

/**
 * NotFullPaidException Pengecualian yang dilemparkan oleh Mesin Penjual ketika
 * pengguna mencoba untuk mengumpulkan item, tanpa membayar jumlah penuh.
 */

public class NotFullPaidException extends RuntimeException {
    private String message;
    private long remaining;

    public NotFullPaidException(String message, long remaining) {
        this.message = message;
        this.remaining = remaining;
    }

    public long getRemaining() {
        return remaining;
    }

    @Override
    public String getMessage() {
        return message + remaining;
    }
}
