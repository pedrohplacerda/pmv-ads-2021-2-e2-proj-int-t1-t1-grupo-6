package entities;

import constants.AppConstants;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Estoque {

    private String nomeProduto;
    private Double precoProduto;
    private String categoria;
    private Integer idProduto;
    private Integer qntd;
    private Boolean emEstoque;

    private String produtoEmEstoque() {
        if(emEstoque = true) {
            return AppConstants.Produto.PRODUTO_EM_ESTOQUE;
        } else {
            return AppConstants.Produto.PRODUTO_FORA_DE_ESTOQUE;
        }
    }

    private Integer estoqueTotal(String idProduto) {
        return this.qntd;
    }
}
