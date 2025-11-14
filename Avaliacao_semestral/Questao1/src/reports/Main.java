package Questao1.src.reports;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando geração de relatórios (demo)...\n");

        ReportCreator dailyCreator = new DailyReportCreator();
        dailyCreator.buildReport();

        System.out.println("-----------------------------");

        ReportCreator weeklyCreator = new WeeklyReportCreator();
        weeklyCreator.buildReport();

        System.out.println("\nPara adicionar um novo relatório (ex: EmergencyReport):");
        System.out.println("  1) criar classe EmergencyReport implements Report"); 
        System.out.println("  2) criar EmergencyReportCreator extends ReportCreator"); 
        System.out.println("  3) usar no lugar desejado sem alterar o núcleo do sistema.");
    }
}
