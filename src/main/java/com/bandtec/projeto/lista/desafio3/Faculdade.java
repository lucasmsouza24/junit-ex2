package com.bandtec.projeto.lista.desafio3;

import java.util.List;
import java.util.ArrayList;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList();
    }

    /*
        Deve verificar se existe um aluno com o nome informado, caso não exista,
        retorne false;
     */
    public Boolean existsAlunoPorNome(String nome) {
        return null;
    }

    /*
        Deve matricular um aluno na faculdade (inserir na lista), se a lista já
        possuir um aluno com o nome informado, não deve matricular;
     */
    public void matricularAluno(Aluno aluno) {

    }

    /*
        Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
        um aluno com o RA informado, não faça nada.
     */
    public void cancelarMatricula(String ra) {

    }

    /*
        Deve retornar a quantidade de alunos contidos na lista (matriculados);
     */
    public Integer getQuantidadeAlunos() {
        return null;
    }

    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
     */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
        return null;
    }

    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
     */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        return null;
    }

    public String getNome() {
        return nome;
    }
}
