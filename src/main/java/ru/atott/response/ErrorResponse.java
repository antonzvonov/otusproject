package ru.atott.response;

import java.util.Objects;

public class ErrorResponse {

    private int code;

    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Error{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorResponse error = (ErrorResponse) o;
        return code == error.code && Objects.equals(message, error.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message);
    }
}
