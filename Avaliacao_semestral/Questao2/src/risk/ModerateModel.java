package Questao2.src.risk;

public class ModerateModel implements RiskModel {
    @Override
    public double calculateRisk(ClientProfile p) {
        double score = 0;

        score += p.riskToleranceQuestionnaireScore * 0.4;
        double investRatio = p.investmentAmount / Math.max(1, p.monthlyIncome);
        score += Math.min(100, investRatio * 8) * 0.3;
        score += Math.max(0, (55 - p.age)) * 0.3;
        return Math.max(0, Math.min(100, score));
    }

    @Override
    public String getName() {
        return "Moderate";
    }
}
