package net.fbridault.gmwolf.gmstruct.generator;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by felix on 01/07/2017.
 */
public class GMSFileFilter extends javax.swing.filechooser.FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) return true;
        return pathname.getName().toLowerCase().endsWith(".gms");
    }

    @Override
    public String getDescription() {
        return "*.gms - GMStruct definition file";
    }
}
