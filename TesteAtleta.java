/*
*nome: maria eduarda del passo leite
*data: 29/08/2023
*/

public class TesteAtleta{
    public static void main(String args[]) {
        System.out.println("\n\n");

        Maratonista mineiro = new Maratonista();
        mineiro.setNomeDaPessoa ("Jose dos Santos");
        mineiro.correr();

        System.out.println ("\n\n");

        Estradista corisco = new Estradista();
        corisco.setNomeDaPessoa ("Manoela Assis");
        corisco.pedalar();

        System.out.println ("\n\n");
    }
}