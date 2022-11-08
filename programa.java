package CP3;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.println("3 - Coordenador");
            System.out.println("0 - Sair");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    Aluno aluno = new Aluno();
                    System.out.println("Digite o nome do aluno:");
                    aluno.setNome(scan.next());
                    System.out.println("Digite o RA do aluno:");
                    aluno.setRa(scan.next());
                    System.out.println("Digite o curso do aluno:");
                    aluno.setCurso(scan.next());
                    System.out.println("Nome: " + aluno.getNome() + "\nRA: " + aluno.getRa() + "\nCurso: " + aluno.getCurso());
                    break;
                case 2:
                    Professor professor = new Professor();
                    System.out.println("Digite o nome do professor:");
                    professor.setNome(scan.next());
                    System.out.println("Digite o RA do professor:");
                    professor.setRa(scan.next());
                    System.out.println("Digite a disciplina do professor:");
                    professor.setDisciplina(scan.next());
                    System.out.println("Nome: " + professor.getNome() + "\nRA: " + professor.getRa() + "\nDisciplina: " + professor.getDisciplina());
                    break;
                case 3:
                    Coordenador coordenador = new Coordenador();
                    System.out.println("Digite o nome do coordenador:");
                    coordenador.setNome(scan.next());
                    System.out.println("Digite o RA do coordenador:");
                    coordenador.setRa(scan.next());
                    System.out.println("Digite o curso do coordenador:");
                    coordenador.setCurso(scan.next());
                    System.out.println("Nome: " + coordenador.getNome() + "\nRA: " + coordenador.getRa() + "\nCurso: " + coordenador.getCurso());
                    break;
                default:
                    break;
            }
        } while (opcao != 0);
        scan.close();
    }
}





