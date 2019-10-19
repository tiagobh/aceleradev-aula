package br.com.aceleradev.repositories;

import br.com.aceleradev.domain.Aluno;
import br.com.aceleradev.domain.Professor;
import br.com.aceleradev.domain.Usuario;

import java.util.HashSet;
import java.util.Set;

public class UsuarioRepository {

    private Set<Usuario> db = new HashSet<>();

    public void insere(Usuario usuario) {
        db.add(usuario);
    }

    public void mostraProfessores() {
        db.forEach(usuario -> {
            if(usuario instanceof Professor){
                System.out.println(usuario);
//                Professor professor = (Professor) usuario;
            }

        });
    }

    public void mostraAlunos() {
        db.forEach(usuario -> {
            if(usuario instanceof Aluno){
                System.out.println(usuario);
            }
        });
    }

    public double getMediaIdadeAlunos(){
        return db.stream()
                .filter(u -> u instanceof Aluno)
                .mapToDouble(Usuario::getIdade)
                .average()
                .orElse(0.0);
    }

}
