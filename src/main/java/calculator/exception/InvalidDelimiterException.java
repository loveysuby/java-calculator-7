package calculator.exception;

public class InvalidDelimiterException extends IllegalArgumentException {
	public InvalidDelimiterException() {
		super(SystemError.INVALID_DELIMITER.getMessage());
	}
}
