package com.institucion.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthRequest {
    @NotBlank(message = "El nombre de Usuario es obligatorio")
    @Size(max = 50, message = "El nombre de usuario no debe exceder los 50 caracteres")
    private String UserName;

    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min = 9, message = "La contraseña debe tener al menos 9 caracteres")
    private String passkey;

}
