package Questao1.src.reports;

public class DailyReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new DailyReport();
    }
}
