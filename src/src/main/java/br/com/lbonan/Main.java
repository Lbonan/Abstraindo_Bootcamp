package br.com.lbonan;

import br.com.lbonan.dominio.Curso;
import br.com.lbonan.dominio.Mentoria;

import java.awt.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Curso Java focado em estrutura de dados");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentadoria Java focado em estrutura de dados");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);

    }
}
