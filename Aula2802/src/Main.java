interface IPartida {
    void ligar();
    void desligar();
}

abstract class Veiculo implements IPartida {
    protected String modelo;
    protected String cor;
    protected int ano;

    public Veiculo(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}

class Carro extends Veiculo {
    private int portas;

    public Carro(String modelo, String cor, int ano, int portas) {
        super(modelo, cor, ano);
        this.portas = portas;
    }

    @Override
    public void ligar() {
        System.out.println("O carro " + modelo + " está ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("O carro " + modelo + " está desligado!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + portas);
    }
}

class Moto extends Veiculo {
    private boolean temPartidaEletrica;

    public Moto(String modelo, String cor, int ano, boolean temPartidaEletrica) {
        super(modelo, cor, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void ligar() {
        System.out.println("A moto " + modelo + " está ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("A moto " + modelo + " está desligada!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Partida Elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota Corolla", "Preto", 2022, 4);
        Moto moto = new Moto("Honda Titan 150", "Vermelha", 2021, true);

        System.out.println("Informações do Carro:");
        carro.exibirInfo();
        carro.ligar();
        carro.desligar();

        System.out.println("\nInformações da Moto:");
        moto.exibirInfo();
        moto.ligar();
        moto.desligar();
    }
}