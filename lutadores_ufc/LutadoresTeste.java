package lutadores_ufc;

public class LutadoresTeste {

    public static void main(String[] args) {

        Lutadores lutador1 = new Lutadores();
        lutador1.setNome("José ");
        lutador1.setNacionalidade("Brasil");
        lutador1.setIdade(35);
        lutador1.setPeso(73.8);
        lutador1.setVitorias(23);
        lutador1.setEmpates(3);
        lutador1.setDerrotas(2);
        lutador1.apresentar();
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        lutador1.status();

        Lutadores lutador2 = new Lutadores();
        lutador2.setNome("Jack ");
        lutador2.setNacionalidade("EUA");
        lutador2.setIdade(28);
        lutador2.setPeso(75.8);
        lutador2.setVitorias(16);
        lutador2.setEmpates(2);
        lutador2.setDerrotas(4);
        lutador2.apresentar();
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        lutador2.status();

        System.out.println();
        lutador2.ganharLuta();
        lutador2.status();
        System.out.println();
        lutador1.perderLuta();
        lutador1.status();

    }
}
