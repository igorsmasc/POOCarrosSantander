public class Main {

    // 1 -
    // "O sistema deve ser composto por duas entidades principais: Carro e Moto.
    // Ambas as entidades compartilham atributos como modelo e ano,
    // e possuem métodos específicos de aceleração e frenagem,
    // refletindo as características individuais de cada veículo.
    // No entanto, ambas as entidades implementam o método buzinar de forma idêntica,
    // uma vez que essa funcionalidade é comum a ambos os tipos de veículos."

    // Contrato dos métodos:
    // void acelerar(int velocidade);
    // int frear(int velocidade);
    // void buzinar();

    // 2 -
    // É necessário incorporar um novo veículo ao nosso sistema:
    // o caminhão. Este veículo deve atender aos mesmos requisitos
    // básicos estabelecidos para carros e motos, como modelo, ano,
    // além de compartilhar os métodos padrão de aceleração, frenagem e buzina.
    // No entanto, é essencial destacar que o caminhão deve apresentar
    // duas funcionalidades exclusivas: um sistema de controle de carga e um de rota inteligente,
    // que será fundamental para gerenciar e monitorar a carga transportada
    // por este tipo específico de veículo.

    // contratos
    // String controleDeCarga(double peso, int distancia)
    // Rota calcularRota(String[] pontosDeEntrega)

    // 3 -
    // Diante do êxito alcançado pelos nossos caminhões,
    // planejamos introduzir uma nova categoria de transporte:
    // a mini van. Esta nova adição ao nosso sistema deve herdar as
    // características fundamentais de um veículo, como modelo e ano,
    // além de incorporar o método de controle de carga e rota inteligente, semelhante ao
    // implementado para os caminhões. Dessa forma, a mini van oferecerá
    // uma funcionalidade adicional e atenderá aos requisitos padrão estabelecidos
    // para os veículos existentes em nosso sistema.

    // 4 -
    // A fim de atender às exigências ambientais,
    // estamos introduzindo uma versão elétrica para os nossos carros e caminhões.
    // Esta nova variante incluirá as funções adicionais de modo Eco,
    // visando otimizar a eficiência energética, e carregar,
    // permitindo o carregamento do veículo.
    // Essas funcionalidades refletem nosso compromisso com a sustentabilidade e
    // oferecem opções mais ecológicas para atender às demandas ambientais em
    // constante evolução.

    // contratos:
    // void ativarModoEco();
    // void carregar(int voltagem);

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ModuloEletrico moduloEletrico = new ModuloEletricoCaminhao();
        CaminhaoEletrico caminhaoEletrico =
                new CaminhaoEletrico("abc", 2022, moduloEletrico);

        caminhaoEletrico.carregar(220);
    }

}
