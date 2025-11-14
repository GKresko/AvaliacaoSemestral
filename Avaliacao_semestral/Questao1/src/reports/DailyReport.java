package Questao1.src.reports;

public class DailyReport implements Report {

    @Override
    public void prepareData() {
        // regras específicas do relatório diário
        System.out.println("DailyReport: coletando dados do dia e priorizando operações recentes.");
    }

    @Override
    public void generate() {
        System.out.println("DailyReport: gerando saída em PDF (simulada).");
    }
}
