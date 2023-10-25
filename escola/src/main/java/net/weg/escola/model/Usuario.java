package net.weg.escola.model;
import jakarta.persistence.*;
import net.weg.escola.model.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@IdClass(UsuarioIdClass.class)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cpf;
    private String nome;
    private String email;
    private String telefone;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;
}
