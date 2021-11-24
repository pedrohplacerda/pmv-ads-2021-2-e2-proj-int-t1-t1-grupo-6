package entities;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public abstract class EmpresaBase {

    private String nome;
    private Integer cnpj;
    private Integer idEmpresa;

}