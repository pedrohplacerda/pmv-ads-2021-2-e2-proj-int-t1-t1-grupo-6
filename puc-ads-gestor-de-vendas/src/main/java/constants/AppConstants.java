package constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AppConstants {

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Produto {
        public static final String PRODUTO_EM_ESTOQUE = "Produto em estoque";
        public static final String PRODUTO_FORA_DE_ESTOQUE = "Produto fora de estoque";
    }

}
