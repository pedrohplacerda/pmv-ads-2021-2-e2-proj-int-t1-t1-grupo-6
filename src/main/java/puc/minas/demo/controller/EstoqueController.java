package puc.minas.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import puc.minas.demo.model.EstoqueModel;
import puc.minas.demo.repository.EstoqueRepository;


@RestController
@RequestMapping("/estoque")
@EntityScan(basePackages = "puc.minas.demo.model")
public class EstoqueController {

    @Autowired
    private EstoqueRepository repository;

    @PatchMapping(path = "/atualizar")
    public ResponseEntity atualizarEstoque(@RequestHeader Double idProduto, @RequestBody EstoqueModel estoqueModel) {
        if(repository.existsById(idProduto)) {
            String msg = "Produto atualizado com sucesso no estoque.";
            repository.save(estoqueModel);
            return ResponseEntity.ok().body(msg);
        }
        return null;
    }

    @PostMapping(path = "/inserir")
    public EstoqueModel inserirProdutoNoEstoque(@RequestBody EstoqueModel estoque) {
        return repository.save(estoque);
    }

    @DeleteMapping(path = "/deletar")
    public void deletarProdutoNoEstoque(@RequestHeader Double idProduto) {
        if(repository.existsById(idProduto)) {
            repository.deleteById(idProduto);
        }
    }



}
