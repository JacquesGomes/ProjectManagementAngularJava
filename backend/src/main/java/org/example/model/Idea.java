package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table (name ="IDEAS_TB")
public class Idea {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private String relevancia;

    private String detalhes;

    private String meta;

    private String plano;

    private String possiveisColaboradores;

    private String possiveisPatrocinadores;

    private String projetosPassadosSemelhantes;

    private List<String> linksInspiracao;

    private List<String> linksConstrucao;

    private List<String> linksGerais;

}
