package Questao2.src.risk;


public class ConservativeModel implements RiskModel {
    @Override
    public double calculateRisk(ClientProfile p) {
        double score = 0;

        score += p.riskToleranceQuestionnaireScore * 0.2;
        score += Math.max(0, (65 - p.age)) * 0.5;
        double investRatio = p.investmentAmount / Math.max(1, p.monthlyIncome);
        score += Math.max(0, (10 - investRatio*2)) * 3 * 0.1;
        return Math.max(0, Math.min(100, score));
    }

    @Override
    public String getName() {
        return "Conservative";
    }
}
