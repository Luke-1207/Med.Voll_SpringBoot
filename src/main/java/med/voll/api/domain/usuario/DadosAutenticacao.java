package med.voll.api.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosAutenticacao(
        @NotBlank(message = "Login é obrigatório")
        @Email(message = "Formato do email é inválido")
        String login,
        @NotBlank(message = "Senha é obrigatória")
        String senha) {

}
