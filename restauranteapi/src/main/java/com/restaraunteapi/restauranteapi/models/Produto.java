package com.restaraunteapi.restauranteapi.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "Produtos")
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank
    @Size(max = 200)
    private final String nome;

    @NotBlank
    @Size(max = 150)
    private final String descricao;

    @NotBlank
    @DecimalMin(value = "0.0", inclusive = false)
    private final BigDecimal preco;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Produto(String nome, String descricao, BigDecimal preco, Categoria categoria){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome(){
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
