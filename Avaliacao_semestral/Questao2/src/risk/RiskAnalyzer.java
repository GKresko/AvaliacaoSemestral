package Questao2.src.risk;

public class RiskAnalyzer {
    private RiskModel model;

    public RiskAnalyzer(RiskModel model) {
        this.model = model;
    }

    public void setModel(RiskModel model) {
        this.model = model;
    }

    public double analyze(ClientProfile p) {
        return model.calculateRisk(p);
    }

    public String getModelName() {
        return model.getName();
    }
}
