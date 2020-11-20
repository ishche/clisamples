package picocli;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "/paragraph", mixinStandardHelpOptions = true, description = "Enable paragraph breakpoints")
public class MySubCommand implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Hello, World!");
        return 0;
    }
}
