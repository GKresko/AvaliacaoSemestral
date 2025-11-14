package Questao1.src.reports;

public class WeeklyReport implements Report {

    @Override
    public void prepareData() {
        // regras específicas do relatório semanal
        System.out.println("WeeklyReport: consolidando dados da semana e calculando métricas comparativas.");
    }

    @Override
    public void generate() {
        System.out.println("WeeklyReport: gerando saída em Excel (simulada).");
    }
}
