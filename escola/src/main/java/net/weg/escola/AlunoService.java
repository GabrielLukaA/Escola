package net.weg.escola;

import net.weg.escola.model.Aluno;
import net.weg.escola.repository.AlunoRepository;

public class AlunoService {

    AlunoRepository alunoRepository;

    public void salvar(Aluno aluno){
        alunoRepository.save(aluno);
    }

    public void deletar(Long id){
        alunoRepository.deleteById(id);
    }

    public void buscar(){
        alunoRepository.findAll();
    }

    public void buscar(Long id){
        alunoRepository.findById(id);
    }
}
