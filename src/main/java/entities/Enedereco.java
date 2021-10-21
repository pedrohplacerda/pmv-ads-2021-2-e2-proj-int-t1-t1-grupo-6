package entities;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Enedereco {

    private String rua;
    private String cidade;
    private String estado;
    private String cep;

}
