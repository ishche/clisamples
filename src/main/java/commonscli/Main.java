package commonscli;

import org.apache.commons.cli.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        CommandLineParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("/t", false, "display current time");
        CommandLine cmd = parser.parse( options, args);
        System.out.println(cmd);
    }
}
