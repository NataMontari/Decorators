package ucu.edu;

public class CacheDecorator extends AbstractDecorator{
    private SmartDocument document;

    public CacheDecorator(SmartDocument document){
        this.document = document;
    }

    public String getGcsPath(){
        return document.getGcsPath();
    }
    public String parse(){
        return document.parse();
    }
}