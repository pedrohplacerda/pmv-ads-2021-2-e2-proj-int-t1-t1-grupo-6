package entities;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.OffsetDateTime;

@Data
@Builder
@RequiredArgsConstructor
public class Financeiro {

    private Double entrada;
    private Double saida;
    private OffsetDateTime mesReferente;
    private Double resultado;

}

