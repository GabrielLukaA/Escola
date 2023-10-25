package net.weg.escola.model;
import jakarta.persistence.*;
import net.weg.escola.model.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String nome;
 @ManyToMany(mappedBy = "listaDeDisciplinas")
 private List<Professor> listaDeProfessores;
}
