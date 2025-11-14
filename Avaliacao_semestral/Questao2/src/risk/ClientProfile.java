package Questao2.src.risk;

public class ClientProfile {
    public final int age;
    public final double monthlyIncome;
    public final double investmentAmount;
    public final int riskToleranceQuestionnaireScore; // 0-100

    public ClientProfile(int age, double monthlyIncome, double investmentAmount, int questionnaireScore) {
        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.investmentAmount = investmentAmount;
        this.riskToleranceQuestionnaireScore = questionnaireScore;
    }

    @Override
    public String toString() {
        return String.format("age=%d, income=%.2f, invest=%.2f, qScore=%d", age, monthlyIncome, investmentAmount, riskToleranceQuestionnaireScore);
    }
}
