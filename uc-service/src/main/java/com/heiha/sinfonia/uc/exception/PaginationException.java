package com.heiha.sinfonia.uc.exception;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/9 14:27<br>
 * <b>Author:</b> heiha<br>
 */
public class PaginationException extends IllegalArgumentException {
    public PaginationException() {
        super();
    }

    public PaginationException(String s) {
        super(s);
    }

    public PaginationException(String message, Throwable cause) {
        super(message, cause);
    }

    public PaginationException(Throwable cause) {
        super(cause);
    }
}
