package support_center_API.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ApiErrorResponse {

    private LocalDateTime timestamp;
    private String message;
    private String path;

    public ApiErrorResponse(String message, String path) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
        this.path = path;
    }


}