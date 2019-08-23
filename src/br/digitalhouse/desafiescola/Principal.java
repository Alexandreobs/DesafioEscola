package br.digitalhouse.desafiescola;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        Aluno alexandre = new Aluno("Alexandre","Silva",25);
        Aluno robson = new Aluno ("Robson","Carvalho",24);
        Aluno will = new Aluno("Will", "Pereira", 44);


        ProfessorTitular jessica = new ProfessorTitular("Jessica", "Correia","Mobile",2,445);
        ProfessorAdjunto joao = new ProfessorAdjunto("joão", "Camargo",41,3,446);


        Curso android = new Curso("Android",12,jessica,joao,2);
        Date matriculaAlexandre = new Date (10/01/2019);
        Date matriculaRobson = new Date(05/01/2019);
        Date matriculaWill = new Date(23/01/2019);

        Matricula matricula1 = new Matricula(alexandre,android,matriculaAlexandre);
        Matricula mat2 = new Matricula(robson,android,matriculaRobson);
        Matricula mat3 = new Matricula(will,android,matriculaWill);


        android.adicionarUmAluno(alexandre);
        android.adicionarUmAluno(robson);
        android.adicionarUmAluno(will);




    }
}
