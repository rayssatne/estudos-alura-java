package questao2;

public class Pessoa {

        private String nome;
        private int idade;
        private String altura;

        Pessoa(String nome, int idade, String altura){
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
        }
        public String getNome() {
            return nome;
        }

        public String getAltura() {
            return altura;
        }

        public int getIdade(){
            return idade;
        }

}

