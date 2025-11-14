package Questao1.src.reports;

public class WeeklyReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new WeeklyReport();
    }
}
