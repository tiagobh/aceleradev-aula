package br.com.aceleradev.repositories;

import br.com.aceleradev.domain.Disciplina;

import java.util.HashSet;
import java.util.Set;

public class DisciplinaRepository {
    Set<Disciplina> db = new HashSet<>();

    public void inserir(Disciplina disciplina){
        db.add(disciplina);
    }

    public void mostrarDisciplinas(){
        db.forEach(System.out::println);
    }
}
