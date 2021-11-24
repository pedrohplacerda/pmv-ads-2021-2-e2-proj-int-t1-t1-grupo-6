package puc.minas.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;
import puc.minas.demo.model.EstoqueModel;
import puc.minas.demo.repository.EstoqueRepository;


@RestController
@RequestMapping("/estoque")
@EntityScan(basePackages = "puc.minas.demo.model")
public class EstoqueController {

    @Autowired
    private EstoqueRepository repository;

//    @PatchMapping(path = "/atualizar")
//    public com.sample.EstoqueModel atualizarEstoque(@RequestHeader Double idProduto, @RequestHeader Double qntd) {
//        if(repository.existsById(idProduto)) {
//            return repository.;
//        }
//    }

    @PostMapping(path = "/inserir")
    public EstoqueModel inserirProdutoNoEstoque(@RequestBody EstoqueModel estoque) {
        return repository.save(estoque);
    }

    @DeleteMapping(path = "/deletar")
    public void deletarDoEstoque(@RequestHeader Double idProduto) {
        if(repository.existsById(idProduto)) {
            repository.deleteById(idProduto);
        }
    }



}
