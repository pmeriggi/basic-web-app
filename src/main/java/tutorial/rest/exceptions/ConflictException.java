package tutorial.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class ConflictException extends RuntimeException {

	private static final long serialVersionUID = 4374618114743007037L;

	public ConflictException() {
	}

	public ConflictException(Throwable cause) {
		super(cause);
	}
}