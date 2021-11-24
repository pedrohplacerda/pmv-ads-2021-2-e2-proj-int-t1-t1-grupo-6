package puc.minas.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import puc.minas.demo.model.UsuarioModel;
import puc.minas.demo.repository.UsuarioRepository;

import java.util.Objects;

@RestController
@RequestMapping("/usuario")
@EntityScan(basePackages = "cup.gestor.gestordevendas.model")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "/consultar")
    public ResponseEntity consultarUsuario(@RequestHeader Double idUsuario) {
        if (Objects.nonNull(idUsuario)) {
            return repository.findById(idUsuario).map(record -> ResponseEntity.ok().body(record))
                    .orElse(ResponseEntity.notFound().build());
        }
        return null;
    }

    @PostMapping(path = "/cadastrar")
    public UsuarioModel cadastrarUsuario(@RequestBody UsuarioModel usuario) {
        if (Objects.nonNull(usuario)) {
            return repository.save(usuario);
        }
        return null;
    }

    @DeleteMapping(path = "/deletar")
    public void deletarUsuario(@RequestHeader Double idUsuario) {
        repository.deleteById(idUsuario);
    }

}
