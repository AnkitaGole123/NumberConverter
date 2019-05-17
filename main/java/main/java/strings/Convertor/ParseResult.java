package main.java.strings.Convertor;

public class ParseResult {

    public int fromBase;
    public String number;
    public int toBase;

    public ParseResult(String[] args) {
        if(args.length == 1) {
            this.fromBase = 10;
            number = args[0];
        }
        else {
            this.fromBase = Integer.parseInt(args[1]);
            this.number = args[2];
        }
    }
}
