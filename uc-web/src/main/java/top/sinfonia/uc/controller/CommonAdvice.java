package top.sinfonia.uc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.function.Supplier;

import static com.google.common.collect.ImmutableMap.of;
import static org.springframework.http.HttpStatus.*;
import static org.springframework.http.ResponseEntity.status;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/9 13:07<br>
 * <b>Author:</b> heiha<br>
 */
@RestControllerAdvice
public class CommonAdvice {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonAdvice.class);
    private static final String CODE = "code";
    private static final String MESSAGE = "message";
    private static final String ERROR = "error";

    @ExceptionHandler
    public ResponseEntity<?> handleException(final Throwable throwable) {
        if (throwable instanceof NullPointerException)
            return response(BAD_REQUEST, BAD_REQUEST::getReasonPhrase);
        LOGGER.error(ERROR, throwable);
        return response(INTERNAL_SERVER_ERROR, INTERNAL_SERVER_ERROR::getReasonPhrase);
    }

    private ResponseEntity<Map<?, ?>> response(final HttpStatus httpStatus, final Supplier<?> messageSupplier) {
        return status(httpStatus).body(of(
                CODE, httpStatus.value(),
                MESSAGE, messageSupplier.get()
        ));
    }
}
