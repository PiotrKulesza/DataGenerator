package Generator;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Arguments {
	
	@Option(name = "-p", usage = "path to data file", required = true)
    private String pathToDataFile = null;

    public static Arguments fromMain(String[] args) throws CmdLineException {
        return read(args);
    }

    private static Arguments read(String[] args) throws CmdLineException {
        Arguments arguments = new Arguments();
        CmdLineParser parser = new CmdLineParser(arguments);
        try {
            parser.parseArgument(args);
            return arguments;
        } catch (CmdLineException e){
            parser.printUsage(System.err);
            throw e;
        }
    }
	
}
