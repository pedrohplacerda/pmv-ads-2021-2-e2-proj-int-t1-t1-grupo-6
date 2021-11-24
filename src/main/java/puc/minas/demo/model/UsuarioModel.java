package puc.minas.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioModel {

    @Id
    @Column(name = "id_usuario")
    private Double idUsuario;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "senha")
    private String senha;
    @Column(name = "permissao")
    private String permissao;
    @Column(name = "nome_empregado")
    private String nomeEmpregado;


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }


    public double getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(double idUsuario) {
        this.idUsuario = idUsuario;
    }


    public String getNomeEmpregado() {
        return nomeEmpregado;
    }

    public void setNomeEmpregado(String nomeEmpregado) {
        this.nomeEmpregado = nomeEmpregado;
    }

}
