package puc.minas.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_produto")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoModel {

    @Id
    @Column(name = "id_produto")
    private Double idProduto;
    @Column(name = "nome_produto")
    private String nomeProduto;
    @Column(name = "preco_produto")
    private Double precoProduto;
    @Column(name = "categoria")
    private String categoria;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }


    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public Double getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Double idProduto) {
        this.idProduto = idProduto;
    }

}
