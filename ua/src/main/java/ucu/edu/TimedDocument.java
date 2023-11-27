package ucu.edu;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class TimedDocument implements Document{
    public String gcsPath;

    public String parse(){
        return "String";
    }
}
