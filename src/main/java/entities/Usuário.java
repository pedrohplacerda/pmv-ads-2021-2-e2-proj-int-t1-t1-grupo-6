package entities;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Usuário {

    private String usuario;
    private String senha;
    private String permissao;
    private String nomeEmpregado;
    private Integer telefoneContato;
    private Integer idUsuario;

}
