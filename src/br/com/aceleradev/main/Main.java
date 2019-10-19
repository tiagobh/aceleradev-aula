package br.com.aceleradev.main;

import br.com.aceleradev.domain.Aluno;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

//        try {
//            aluno = new Aluno(
//                    "Gustavo",
//                    "gus",
//                    "123.456.789-12");
//        } catch (Exception e ) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally");
//        }


        Aluno aluno = new Aluno(
                "Gustavo",
                "guse",
                "123.456.789-12",
                LocalDate.of(1985, 3, 14)
        );

       System.out.println(aluno);
        System.out.println("Idade; " + aluno.getIdade());

    }

}
