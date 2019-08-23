package br.digitalhouse.desafiescola;

import java.util.Date;

public class Matricula {
    private Aluno matriculaAluno;
    private Curso matriculaCurso;
    private Date dataDaMatricula;

    public Matricula(Aluno matriculaAluno, Curso matriculaCurso, Date dataDaMatricula) {
        this.matriculaAluno = matriculaAluno;
        this.matriculaCurso = matriculaCurso;
        this.dataDaMatricula = dataDaMatricula;
    }

    public Aluno getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(Aluno matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public Curso getMatriculaCurso() {
        return matriculaCurso;
    }

    public void setMatriculaCurso(Curso matriculaCurso) {
        this.matriculaCurso = matriculaCurso;
    }

    public Date getDataDaMatricula() {
        return dataDaMatricula;
    }

    public void setDataDaMatricula(Date dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }
}
