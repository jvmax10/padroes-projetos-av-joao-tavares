public class Main {
    public static void main(String[] args) {
        Apolice apoliceAuto = FabricaApolice.criarApolice("prêmio mensal igual a 8% do valor do veículo, dividido por 12. Documentos
        exigidos: CNH e CRLV");

        Apolice apoliceResidencial = FabricaApolice.criarApolice("prêmio mensal igual a 1,5% do valor do imóvel, dividido por 12.
        Documentos exigidos: escritura ou contrato de locação");

        Apolice apoliceVida = FabricaApolice.criarApolice(" prêmio mensal igual a 3% do capital segurado, dividido por 12. Documentos
        exigidos: documento de identidade e CPF");
       

        apoliceAuto.emitirValor();
        apoliceResidencial.emitirValor();
        apoliceVida.emitirValor();
    }
}

interface Apolice {
    void emitirValor();
}

class Auto implements Apolice {
    public void emitirValor() {
        System.out.println("prêmio mensal igual a 8% do valor do veículo, dividido por 12. Documentos
        exigidos: CNH e CRLV");
    }
}

class Vida implements Apolice {
    public void emitirValor() {
        System.out.println("prêmio mensal igual a 3% do capital segurado, dividido por 12. Documentos
        exigidos: documento de identidade e CPF");
    }
}

class Residencial implements Apolice {
    public void emitirValor() {
        System.out.println("prêmio mensal igual a 1,5% do valor do imóvel, dividido por 12.
        Documentos exigidos: escritura ou contrato de locação");
    }
}
class FabricaApolice {
    public static Apolice criarAnimal(String tipo) {
        switch (tipo.toLowerCase()) {
            case "Auto":
                return new Auto();
            case "Vida":
                return new Vida();
            case "Residencial":
                return new Residencial();
            default:
                throw new IllegalArgumentException("apolice inválido.");
        }
    }
}
