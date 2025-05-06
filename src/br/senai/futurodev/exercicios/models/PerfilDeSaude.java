package br.senai.futurodev.exercicios.models;

import java.time.LocalDate;
import java.time.Period;

public class PerfilDeSaude {
    public String nome;
    public String sobrenome;
    public String sexo;
    public LocalDate dataNascimento;
    public double altura;
    public double peso;

    public PerfilDeSaude(String nome, String sobrenome, String sexo, LocalDate dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public int frequenciaCardiacaMax(){
        return 220 - calcularIdade();
    }
    public String frequenciaCardiacaAlvo(){
        int frequenciaMaxima = frequenciaCardiacaMax();
        int limiteInferior = (int) (frequenciaMaxima * 0.50);
        int limiteSuperior = (int) (frequenciaMaxima * 0.85);

        return limiteInferior + limiteSuperior + "bpm";
    }

    public double calcularIMC (){
        return peso / (altura * altura);
    }
}
