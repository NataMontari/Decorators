package ucu.edu;

public class MeasureDecorator extends AbstractDecorator{
    private SmartDocument document;

    public MeasureDecorator(SmartDocument document){
        this.document = document;
    }

    public String getGcsPath(){
        return document.getGcsPath();
    }
    public String parse(){
        return document.parse();
    }
}
