package ru.atott.response;

public class HealthResponse {

    private String status;

    public HealthResponse() {
    }

    public HealthResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static final HealthResponse OK = new HealthResponse("OK");
}
