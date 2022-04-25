package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {

        Gato gato = new Gato();
        Livro livro1 = new Livro(nome: "O problema dos copos", numPaginas 300);
        System.out.println(gato);

//        int a = 5;
//        int b = 3;
//        System.out.println("Hello world " + (a + b));
    }

}
    class Livro{
        private String nome;
        private Integer numPaginas;

        @java.lang.Override
        public java.lang.String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }

        public Livro(String nome, Integer numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }
    }




