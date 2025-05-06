package br.senai.futurodev.exercicios.main;

import br.senai.futurodev.exercicios.models.PerfilDeSaude;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite seu sexo:");
        String sexo = entrada.nextLine();

        System.out.println("Digite sua data de nascimento:");
        String dataNascimentoInput = entrada.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoInput);

        System.out.println("Digite sua altura:");
        double altura = entrada.nextDouble();

        System.out.println("Digite seu peso:");
        double peso = entrada.nextDouble();

        PerfilDeSaude perfil = new PerfilDeSaude(nome, sobrenome, sexo, dataNascimento, altura, peso);

        System.out.println("Informações baseadas em seus dados:");
        System.out.println("Nome: " + perfil.getNome());
        System.out.println("Sobrenome: " + perfil.getSobrenome());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Data de nascimento: " + perfil.getDataNascimento());
        System.out.println("Idade: " + perfil.calcularIdade() + " anos.");
        System.out.println("Peso: " + perfil.calcularIMC() + "kg.");
        System.out.println("Frequência cardíaca máxima: " + perfil.frequenciaCardiacaMax());
        System.out.println("Frequência cardíaca alvo: " + perfil.frequenciaCardiacaAlvo());
    }
}
