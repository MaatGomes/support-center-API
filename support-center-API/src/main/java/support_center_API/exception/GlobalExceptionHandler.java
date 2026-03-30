package support_center_API.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import support_center_API.dto.ApiErrorResponse;
import tools.jackson.databind.exc.InvalidFormatException;

import java.util.Arrays;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ApiErrorResponse> handleRequestError(HttpMessageNotReadableException ex, HttpServletRequest request) {
        String message = "Valor inválido na requisição";

        Throwable cause = ex.getCause();

        if (cause instanceof InvalidFormatException e) {

            String fieldName = e.getPath().isEmpty()
                    ? "campo desconhecido"
                    : e.getPath().get(0).getPropertyName();

            Object invalidValue = e.getValue();

            if (e.getTargetType().isEnum()) {
                message = String.format(
                        "Valor '%s' inválido para o campo '%s'. Os valores aceitos são '%s'",
                        invalidValue,
                        fieldName,
                        Arrays.stream(e.getTargetType().getEnumConstants())
                                .map(Object::toString)
                                .collect(Collectors.joining(", "))
                );
            }
        }
        return ResponseEntity.badRequest()
                .body(new ApiErrorResponse(message, request.getRequestURI()));
    }
}
