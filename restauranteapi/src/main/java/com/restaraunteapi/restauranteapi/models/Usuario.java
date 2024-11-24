package com.restaraunteapi.restauranteapi.models;

import com.restaraunteapi.restauranteapi.models.enuns.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import java.util.Set;

import java.util.UUID;

@Entity(name = "Usuarios")
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    @NotBlank
    @Size(max = 200)
    private final String nome;

    @NotBlank
    private final String email;

    @NotBlank
    @Size(min = 8)
    private final String senha;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    public Usuario(String nome, String email, String senha, Set<Role> roles){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.roles = roles;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Set<Role> getRoles(){
        return roles;
    }
}
