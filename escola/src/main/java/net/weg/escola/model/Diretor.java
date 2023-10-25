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
public class Diretor extends Usuario{
    @OneToOne
    private Escola escola;

}
