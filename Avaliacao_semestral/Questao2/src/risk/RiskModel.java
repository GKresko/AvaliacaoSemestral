package Questao2.src.risk;

public interface RiskModel {

    double calculateRisk(ClientProfile profile);

    String getName();
}
