package puc.minas.demo.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_estoque")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstoqueModel {

  @Id
  private Double idProduto;
  @Column(name = "qntd")
  private Double qntd;
  @Column(name = "em_estoque")
  private Boolean emEstoque;


  public Double getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(double idProduto) {
    this.idProduto = idProduto;
  }


  public Double getQntd() {
    return qntd;
  }

  public void setQntd(double qntd) {
    this.qntd = qntd;
  }


  public Boolean getEmEstoque() {
    return emEstoque;
  }

  public void setEmEstoque(Boolean emEstoque) {
    this.emEstoque = emEstoque;
  }

}
