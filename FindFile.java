package com.part01;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 找出你电脑上所有的图片文件，放入List<File>
 *
 * @author Administrator
 */
public class FindFile {
    static List<File> list = new ArrayList<File>();

    public static void foundPic(File f) {
        File[] file = f.listFiles();
        if (file != null) {
            for (File allf : file)
                if (allf.isDirectory()) {
                    foundPic(allf);
                } else {
                    if (allf.getName().toLowerCase().endsWith(".jpg") || allf.getName().toLowerCase().endsWith(".png"))
                        list.add(allf);

                }
        }
    }

    public static void main(String[] args) {
        File[] roots = File.listRoots();
        for (File f : roots) {
            foundPic(f);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}