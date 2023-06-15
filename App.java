public class App {
    public static void main(String[] args) throws Exception {
        // Iphone 12, tela de 6.1", 256gb
        // Galaxy 20 Note Ultra, tela de 6.2", 256gb
        // Xiome Mi 11 Pro, tela de 6.81", 128gb
        // <tipoVariavel> nomeVariavel = valor;

        //  Declarando um objeto do tipo celular = Instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "Iphone12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.SistemaOperacional = "ios";

        Celular celularB = new Celular();
        celularB.nome = " Galaxy 20 Note Ultra";
        celularB.tamanhoTela = 6.2f;
        celularB.espacoArmazenamento = 256;
        celularB.SistemaOperacional = "android";

        Celular celularC = new Celular();
        celularC.nome = "Xiome Mi 11 Pro";
        celularC.tamanhoTela = 6.81f;
        celularC.espacoArmazenamento = 128;
        celularC.SistemaOperacional = "android";


        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.SistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.SistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.SistemaOperacional);
        
        
        

    }
    
}
