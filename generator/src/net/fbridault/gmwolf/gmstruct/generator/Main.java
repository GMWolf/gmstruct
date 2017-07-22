package net.fbridault.gmwolf.gmstruct.generator;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by felix on 21/07/2017.
 */
public class Main {
    public static void main(String[] args) {

        if (args.length < 2) {
            throw new IllegalArgumentException("Requires input and output path");
        }

        Path out = new File(args[1]).toPath();

        List<Script> scripts = Generator.generateScripts(args[0]);

        for(Script script : scripts) {
            try {
                script.write(out);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
