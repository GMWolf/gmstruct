package net.fbridault.gmwolf.gmstruct.gui;

import net.fbridault.gmwolf.gmstruct.generator.*;
import net.fbridault.gmwolf.gmstruct.generator.ir.Script;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.prefs.Preferences;

/**
 * Created by felix on 01/07/2017.
 */
public class Main {


    public static void main(String[] args) {
        if (args.length >= 1 && args[0].equals("-cli")) {
            if (args.length != 3) {
                throw new RuntimeException("Must provide source and dest");
            }
            net.fbridault.gmwolf.gmstruct.generator.Main.main(new String[]{args[1], args[2]});
        } else {
            new Main().run();
        }
    }

    public void run() {
        Preferences prefs = Preferences.userRoot().node(this.getClass().getName());

        File inFile = new File(prefs.get("LastOpen", ""));
        File outDir = new File(prefs.get("lastSave", ""));

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception ex) {
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new GMSFileFilter());
        fileChooser.setSelectedFile(inFile);
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            inFile = selectedFile;
            prefs.put("LastOpen", inFile.getAbsolutePath());
        } else {
            return;
        }

        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setSelectedFile(outDir);
        returnValue = fileChooser.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            outDir = fileChooser.getSelectedFile();
            prefs.put("lastSave", outDir.getAbsolutePath());
        } else {
            return;
        }

        try {
            List<Script> scripts = Generator.generateScripts(inFile.getCanonicalPath());

            for(Script script : scripts) {
                    script.write(outDir.toPath());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
