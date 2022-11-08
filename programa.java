package CP3;

import java.util.Scanner;
import java.util.ArrayList;

public class programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        int opcao = 0;
        do {
            System.out.println("Sistema de cadastro de pessoas da faculdade");
            System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.println("3 - Coordenador");
            System.out.println("4 - Exibir pessoas cadastradas");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
            case 1:
                Aluno novoAluno = new Aluno();
                System.out.println("Digite o nome do aluno: ");
                novoAluno.setNome(input.nextLine());
                System.out.println("Digite o ra do aluno: ");
                novoAluno.setRa(input.nextLine());
                System.out.println("Digite o curso do aluno: ");
                novoAluno.setCurso(input.nextLine());
                pessoas.add(novoAluno);
                break;
            case 2:
                Professor novoProfessor = new Professor();
                System.out.println("Digite o nome do professor: ");
                novoProfessor.setNome(input.nextLine());
                System.out.println("Digite o ra do professor: ");
                novoProfessor.setRa(input.nextLine());
                System.out.println("Digite a disciplina do professor: ");
                novoProfessor.setDisciplina(input.nextLine());
                pessoas.add(novoProfessor);
                break;
            case 3:
                Coordenador novoCoordenador = new Coordenador();
                System.out.println("Digite o nome do coordenador: ");
                novoCoordenador.setNome(input.nextLine());
                System.out.println("Digite o ra do coordenador: ");
                novoCoordenador.setRa(input.nextLine());
                System.out.println("Digite o curso do coordenador: ");
                novoCoordenador.setCurso(input.nextLine());
                pessoas.add(novoCoordenador);
                break;
            case 4:
                for (Pessoa pessoa : pessoas) {
                    System.out.println(pessoa);
                }
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
            }
        } while (
            opcao != 0
        );

    }

}




