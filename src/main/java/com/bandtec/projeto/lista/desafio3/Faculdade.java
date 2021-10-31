package com.bandtec.projeto.lista.desafio3;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;
    private Integer qtdAlunosMatriculaCancelada;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.qtdAlunosMatriculaCancelada = 0;
    }

    /*
        Deve verificar se existe um aluno com o nome informado, caso não exista,
        retorne false;
     */
    public Boolean existsAlunoPorNome(String nome) {
        if (Objects.isNull(nome)) {
            return false;
        } else {
            for(Aluno aluno : this.alunos) {
                if (aluno.getNome().equalsIgnoreCase(nome)) {
                    return true;
                }
            }
            return false;
        }
    }

    /*
        Deve matricular um aluno na faculdade (inserir na lista), se a lista já
        possuir um aluno com o nome informado, não deve matricular;
     */
    public void matricularAluno(Aluno aluno) {
        if (Objects.nonNull(aluno) && !existsAlunoPorNome(aluno.getNome())) {
            this.alunos.add(aluno);
        }
    }

    /*
        Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
        um aluno com o RA informado, não faça nada.
     */
    public void cancelarMatricula(String ra) {
        if (Objects.nonNull(ra)) {
            for (int i = 0; i < this.alunos.size(); i++) {
                Aluno aluno = this.alunos.get(i);
                if (aluno.getRa().equals(ra)) {
                    this.alunos.remove(i);
                    this.qtdAlunosMatriculaCancelada++;
                }
            }
        }
    }

    /*
        Deve retornar a quantidade de alunos contidos na lista (matriculados);
     */
    public Integer getQuantidadeAlunos() {
        return this.alunos.size();
    }

    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
     */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
        if (Objects.isNull(semestre)){
            return 0;
        }

        Integer quantidadeAlunosPorSemestre = 0;

        for(Aluno aluno : this.alunos) {
            if (aluno.getSemestre().equals(semestre)) {
                quantidadeAlunosPorSemestre++;
            }
        }
        return quantidadeAlunosPorSemestre;
    }

    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
     */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        return this.qtdAlunosMatriculaCancelada;
    }

    public String getNome() {
        return nome;
    }
}
