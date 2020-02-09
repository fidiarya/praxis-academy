package MesinVending;

/**
 * NotSufficientChangeException Mesin Penjual Otomatis melempar pengecualian ini
 * untuk menunjukkan bahwa ia tidak memiliki perubahan yang cukup untuk
 * menyelesaikan permintaan ini.
 */
public class NotSufficientChangeException extends RuntimeException {
    private String message;

    public NotSufficientChangeException(String string) {
        this.message = string;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
