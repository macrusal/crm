package br.com.restless.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

  @Id
  private long idCliente;
  private String primeiroNome;
  private String ultimoNome;
  private String email;
  private String sexo;
  private String cidade;
  private String codigoPais;
  private String empresa;
  private long idProfissao;
  private String etnia;
  private java.sql.Date nascimento;


  public long getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(long idCliente) {
    this.idCliente = idCliente;
  }


  public String getPrimeiroNome() {
    return primeiroNome;
  }

  public void setPrimeiroNome(String primeiroNome) {
    this.primeiroNome = primeiroNome;
  }


  public String getUltimoNome() {
    return ultimoNome;
  }

  public void setUltimoNome(String ultimoNome) {
    this.ultimoNome = ultimoNome;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }


  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }


  public String getCodigoPais() {
    return codigoPais;
  }

  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }


  public String getEmpresa() {
    return empresa;
  }

  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }


  public long getIdProfissao() {
    return idProfissao;
  }

  public void setIdProfissao(long idProfissao) {
    this.idProfissao = idProfissao;
  }


  public String getEtnia() {
    return etnia;
  }

  public void setEtnia(String etnia) {
    this.etnia = etnia;
  }


  public java.sql.Date getNascimento() {
    return nascimento;
  }

  public void setNascimento(java.sql.Date nascimento) {
    this.nascimento = nascimento;
  }

}
