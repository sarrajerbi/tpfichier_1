package tp_fichiers51;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {
	
	    public static void main(String[] args) throws IOException {
	        System.out.println("Répertoire courant : " + System.getProperty("user.dir"));
	        File rep = new File(".");
	        System.out.println("Chemin relatif : " + rep.getPath());
	        System.out.println("Chemin absolu : " + rep.getAbsolutePath());

	        File[] roots = File.listRoots();
	        for (File root : roots) {
	            System.out.println("Racine : " + root);
	        }

	        File[] files = rep.listFiles();
	        if (files != null) {
	            for (File element : files) {
	                if (element.isDirectory()) {
	                    System.out.print(element.getName() + "\t<REP>\n");
	                }
	            }

	            for (File element : files) {
	                if (element.isFile()) {
	                    System.out.printf("%-20s", element.getName());
	                    System.out.printf("%tc\t", new Date(element.lastModified()));
	                    System.out.printf("%10d octets\n", element.length());
	                }
	            }
	        }
	    }
	}