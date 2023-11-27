package ucu.edu;

public abstract class AbstractDecorator {
    private SmartDocument document;
    public abstract String getGcsPath();
    public abstract String parse();
}
