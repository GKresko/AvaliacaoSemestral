package Questao1.src.reports;

public abstract class ReportCreator {

    // Factory method
    public abstract Report createReport();

    // Template method that defines the building flow
    public final void buildReport() {
        Report report = createReport();
        report.prepareData();
        report.generate();
    }
}
