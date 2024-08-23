package com.project.cms.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "artigo")
@Data
public class Artigo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idArtigo;
    private String titulo;
    private String conteudo;
}
