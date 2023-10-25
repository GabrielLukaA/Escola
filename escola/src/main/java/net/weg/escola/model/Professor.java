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
public class Professor extends Usuario {

   @ManyToOne
   private Escola escola;
   @ManyToMany
   private List<Disciplina> listaDeDisciplinas;
}
