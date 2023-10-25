package net.weg.escola.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.weg.escola.model.*;
import net.weg.escola.model.*;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Escola {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToOne

    private Endereco endereco;
    private String email;
    @OneToMany(mappedBy = "escola")
    private List<Professor> listaDeProfessores;
    @OneToMany
    private List<Curso> listaDeCursos;
    @OneToOne(mappedBy = "escola")
    private Diretor diretor;

}
