package epcc.acm.oop;


import epcc.acm.project.oop.Nasdaq;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class ReadFile {

    private ArrayList<Nasdaq> readFile() throws Exception {
        ArrayList<Nasdaq> data = new ArrayList<>();
        String file = new File("").getAbsolutePath().concat("/datasets/Nasdaq.txt");
        Scanner scanner = new Scanner(new File(file));
        while(scanner.hasNext()){
            String [] nasdaq = scanner.nextLine().split(",");
            data.add(new Nasdaq().fastload(nasdaq));
        }
        scanner.close();
        return data;
    }

    public ArrayList<Nasdaq> getNasdaq() throws Exception {
        return readFile();
    }
}
