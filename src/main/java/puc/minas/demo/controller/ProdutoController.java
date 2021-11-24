package puc.minas.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import puc.minas.demo.model.ProdutoModel;
import puc.minas.demo.repository.ProdutoRepository;


@RestController
@RequestMapping("/produto")
@EntityScan(basePackages = "puc.minas.demo.model")
public class ProdutoController {

    @Autowired
    private ProdutoRepository respository;

    @PostMapping(path = "/cadastrar")
    public ProdutoModel cadastrarProduto(@RequestBody ProdutoModel produto) {
        return respository.save(produto);
    }

    @GetMapping(path = "/consultar-estoque")
    public ResponseEntity consultarEstoqueProduto(@RequestHeader Double idProduto) {
        return respository.findById(idProduto).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = "/excluir")
    public void excluirProduto(@RequestHeader Double idProduto) {
        respository.deleteById(idProduto);
    }

}

