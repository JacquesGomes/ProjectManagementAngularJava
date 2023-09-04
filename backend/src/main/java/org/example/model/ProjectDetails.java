package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
public class ProjectDetails {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String equipeResponsavel;
    private String tipoProjeto;
    private double orcamento;
    private List<String> recursos;
    private List<String> marcos;
    private List<String> tarefas;
    private List<String> riscos;
    private List<String> requisitos;
    private List<String> metodosComunicacao;
    private List<String> documentacao;

    public ProjectDetails() {
    }

    public ProjectDetails(String equipeResponsavel, String tipoProjeto, double orcamento, List<String> recursos, List<String> marcos, List<String> tarefas, List<String> riscos, List<String> requisitos, List<String> metodosComunicacao, List<String> documentacao) {
        this.equipeResponsavel = equipeResponsavel;
        this.tipoProjeto = tipoProjeto;
        this.orcamento = orcamento;
        this.recursos = recursos;
        this.marcos = marcos;
        this.tarefas = tarefas;
        this.riscos = riscos;
        this.requisitos = requisitos;
        this.metodosComunicacao = metodosComunicacao;
        this.documentacao = documentacao;
    }

    public String getEquipeResponsavel() {
        return equipeResponsavel;
    }

    public void setEquipeResponsavel(String equipeResponsavel) {
        this.equipeResponsavel = equipeResponsavel;
    }

    public String getTipoProjeto() {
        return tipoProjeto;
    }

    public void setTipoProjeto(String tipoProjeto) {
        this.tipoProjeto = tipoProjeto;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public List<String> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<String> recursos) {
        this.recursos = recursos;
    }

    public List<String> getMarcos() {
        return marcos;
    }

    public void setMarcos(List<String> marcos) {
        this.marcos = marcos;
    }

    public List<String> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<String> tarefas) {
        this.tarefas = tarefas;
    }

    public List<String> getRiscos() {
        return riscos;
    }

    public void setRiscos(List<String> riscos) {
        this.riscos = riscos;
    }

    public List<String> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<String> requisitos) {
        this.requisitos = requisitos;
    }

    public List<String> getMetodosComunicacao() {
        return metodosComunicacao;
    }

    public void setMetodosComunicacao(List<String> metodosComunicacao) {
        this.metodosComunicacao = metodosComunicacao;
    }

    public List<String> getDocumentacao() {
        return documentacao;
    }

    public void setDocumentacao(List<String> documentacao) {
        this.documentacao = documentacao;
    }
}
