///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS info.picocli:picocli:4.6.3


import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import java.util.List;

import java.util.concurrent.Callable;

@Command(name = "helloclilonger", mixinStandardHelpOptions = true, version = "helloclilonger 0.2",
        description = "helloclilonger made with jbang")
class helloclilonger implements Callable<Integer> {

    @Parameters(index = "0", description = "The greeting to print", defaultValue = "World!", arity = "1..N")
    private List<String> greeting;

    public static void main(String... args) {
        int exitCode = new CommandLine(new helloclilonger()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception { // your business logic goes here...
        System.out.println("Hello " + String.join(" ", greeting));
        return 0;
    }
}
