package Enums;

public enum ErrorMessage {
    ERROR_NOT_KNOWN ("Plantan är okänd på hotellet, försök igen."),
    ERROR_NULL_INPUT ("Inputvärdet är NULL, försök igen.");

    public final String message;

    ErrorMessage(String message) {
        this.message = message;
    }
}
