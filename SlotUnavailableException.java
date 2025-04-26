/**
 * Exception thrown when a parking slot is unavailable.
 */
class SlotUnavailableException extends Exception {

    // Default error message
    private static final String DEFAULT_MESSAGE = "No available slots for the requested vehicle type.";

    /**
     * Constructor with custom message.
     *
     * @param message Custom error message.
     */
    public SlotUnavailableException(String message) {
        super(message);
    }

    /**
     * Constructor with default message.
     */
    public SlotUnavailableException() {
        super(DEFAULT_MESSAGE);
    }
}
