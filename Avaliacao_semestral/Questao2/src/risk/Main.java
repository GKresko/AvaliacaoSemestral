package Questao2.src.risk;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demo de cálculo de perfil de risco (Strategy)");

        ClientProfile client = new ClientProfile(30, 5000, 20000, 70);
        System.out.println("Perfil do cliente: " + client);

        RiskAnalyzer analyzer = new RiskAnalyzer(new ModerateModel());
        double score = analyzer.analyze(client);
        System.out.printf("Modelo: %s -> score: %.2f\n", analyzer.getModelName(), score);

        analyzer.setModel(new AggressiveModel());
        score = analyzer.analyze(client);
        System.out.printf("Modelo: %s -> score: %.2f\n", analyzer.getModelName(), score);

        analyzer.setModel(new ConservativeModel());
        score = analyzer.analyze(client);
        System.out.printf("Modelo: %s -> score: %.2f\n", analyzer.getModelName(), score);

        System.out.println("\nPara adicionar novo modelo: criar classe que implemente RiskModel e usar setModel() quando quiser.");
    }
}
