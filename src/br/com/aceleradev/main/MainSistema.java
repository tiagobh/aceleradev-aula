package br.com.aceleradev.main;

import br.com.aceleradev.dataloader.DataLoader;
import br.com.aceleradev.domain.Aluno;
import br.com.aceleradev.domain.Disciplina;
import br.com.aceleradev.domain.Professor;
import br.com.aceleradev.domain.Usuario;
import br.com.aceleradev.repositories.DisciplinaRepository;
import br.com.aceleradev.repositories.UsuarioRepository;

import java.time.LocalDate;

import static br.com.aceleradev.dataloader.DataLoader.*;

public class MainSistema {

    public static void main(String[] args) {

        UsuarioRepository userRepo = getUsuarioRepository();
        DisciplinaRepository disciplinaRepo = getDisciplinaRepository();

        Aluno aluno = new Aluno(
                "Gustavo ",
                "gustavo123",
                "123.456.789-23",
                LocalDate.of(1985, 3, 14)
                );

        Aluno aluno2 = new Aluno(
                "Gustavo 2",
                "gustavo13",
                "123.456.789-23",
                LocalDate.of(1993, 4,1)
                );

        Aluno aluno3 = new Aluno(
                "Gustavo 3",
                "gustavo13",
                "123.456.789-23",
                LocalDate.of(1987, 4,1)
        );

        Professor professor = new Professor(
                "Jose",
                "jose123",
                "123.456.789-23",
                LocalDate.of(1960,1,1)); 

        userRepo.insere(aluno);
        userRepo.insere(aluno2);
        userRepo.insere(aluno3);
        userRepo.insere(professor);

        System.out.println("Professores:");
        userRepo.mostraProfessores();

        System.out.println("Alunos:");
        userRepo.mostraAlunos();
        System.out.println("Média de idade dos alunos: " + userRepo.getMediaIdadeAlunos());


//        Disciplina disciplina = new Disciplina("Matematica", professor);
//        disciplina.matricular(aluno);

//        System.out.println(disciplina);
//        disciplina.mostraAlunos();


    }

}
