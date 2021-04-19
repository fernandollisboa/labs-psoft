package lab6;


import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private static RequisitosVacinacao requisitosVacinacao = new RequisitosVacinacao();
    private static PessoaService pessoaService = new PessoaService();


    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(menu());
            opcao = sc.nextInt();

            if (opcao == 1) {
                menuCadastro();

            } else if (opcao == 2) {
                menuAvancarVacinacao();

            } else if (opcao == 3) {
                menuAlteracao();

            } else if (opcao == 4) {
                menuVerificaVacinacao();

            } else if (opcao == 5) {
                System.out.println(requisitosVacinacao.toString());

            } else if (opcao == 6) {
                menuRequisitos();

            } else {
                System.out.println("Opção Inválida!");
            }

        } while (opcao != 0);
    }


    private static void menuAvancarVacinacao(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o CPF da Pessoa cadastrada: ");
            String cpf = sc.nextLine();
            pessoaService.avancaEstadoDeVacinacao(cpf);
            System.out.println(pessoaService.getMessageVacinacao(cpf));
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private static void menuVerificaVacinacao(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o CPF da Pessoa cadastrada:");
            String cpf = sc.nextLine();
            System.out.println(pessoaService.getMessageVacinacao(cpf));
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private static String menu() {
        return "\nSISTEMA DE VACINAÇÃO COVID-19\n" + "(1) Cadastrar Nova Pessoa\n" +
                "(2) Avançar Estado de Vacinação\n" +
                "(3) Alterar Pessoa Cadastrada\n" +
                "(4) Verificar Situação de Vacinação\n" +
                "(5) Verificar Requisitos de Vacinação\n" +
                "(6) Atualizar Requisitos de Vacinação\n" +
                "(0) Sair\n";
    }

    private static void menuCadastro() {
        try {
            System.out.println("\nMENU CADASTRO");
            Scanner sc = new Scanner(System.in);
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("CPF: ");
            String cpf = sc.nextLine();
            System.out.println("Endereço: ");
            String endereco = sc.nextLine();
            System.out.println("Número do cartão do SUS: ");
            String numSus = sc.nextLine();
            System.out.println("e-mail: ");
            String email = sc.nextLine();
            System.out.println("Telefone: ");
            String telefone = sc.nextLine();
            System.out.println("Profissão: ");
            String profissao = sc.nextLine();
            System.out.println("Comorbidades (digitar separadas por vígula e espaços): ");
            String comorbidadesStr = sc.nextLine();
            System.out.println("Data de Nascimento (AAAA-MM-DD): ");
            String dataNascStr = sc.nextLine();
            LocalDate dataNasc = LocalDate.parse(dataNascStr);
            pessoaService.criaPessoa(nome, cpf, endereco, numSus, email, telefone, profissao, comorbidadesStr, dataNasc);
            System.out.println("Pessoa cadastrada com sucesso!");
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }

    private static void menuAlteracao() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("Insira o CPF da Pessoa a ser modificada: ");
        String cpf = sc.nextLine();

        System.out.println(
                "\n ALTERAÇÃO DE PESSOA CADASTRADA\n"+
                        "(1) Alterar nome;\n" +
                        "(2) Alterar endereço;\n" +
                        "(3) Alterar e-mail;\n" +
                        "(4) Alterar telefone;\n" +
                        "(5) Alterar profissão;\n" +
                        "(6) Adicionar comorbidade;\n" +
                        "(7) Remover comorbidade\n"
        );

        opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.print("Novo nome: ");
            String nome = sc.nextLine();
            pessoaService.setNome(nome, cpf);

        } else if (opcao == 2) {
            System.out.print("Novo endereço: ");
            String endereco = sc.nextLine();
            pessoaService.setEndereco(endereco, cpf);

        } else if (opcao == 3){
            System.out.print("Novo e-mail: ");
            String email = sc.nextLine();
            pessoaService.setEmail(email,cpf);

        } else if (opcao==4) {
            System.out.print("Novo telefone: ");
            String telefone = sc.nextLine();
            pessoaService.setTelefone(telefone,cpf);

        } else if (opcao ==5) {
            System.out.print("Nova Profissão: ");
            String profissao = sc.nextLine();
            pessoaService.setProfissao(profissao,cpf);

        } else if (opcao==6) {
            System.out.print("Nova Comorbidade: ");
            String comorbidade = sc.nextLine();
            pessoaService.adicionaComorbidade(comorbidade,cpf);

        } else if (opcao == 7) {
            System.out.print("Remove comorbidade: ");
            String comorbidadeRemove = sc.nextLine();
            pessoaService.removeComorbidade(comorbidadeRemove,cpf);

        } else System.out.println("Opção inválida! ");
    }


    private static void menuRequisitos() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println(
                "\n ALTERAÇÃO DE REQUISITOS MÍNIMOS DE VACINAÇÃO\n"+
                "(1) Alterar Idade Mínima;\n" +
                "(2) Adicionar Comorbidade;\n" +
                "(3) Adicionar Profissão;\n"

        );
        opcao = sc.nextInt();

        if(opcao == 1){
            System.out.println("Qual a nova idade mínima?");
            int idade = sc.nextInt();
            requisitosVacinacao.setIdadeMinima(idade);
        } else if (opcao == 2){
            System.out.println("Qual a nova comorbidade? ");
            String comorb = sc.nextLine();
            requisitosVacinacao.addComorbidade(comorb);
        } else if (opcao == 3){
            System.out.println("Qual a nova profissão? ");
            String profissao = sc.nextLine();
            requisitosVacinacao.addProfissao(profissao);
        } else{
            System.out.println("Opção inválida!");
        }

    }



}