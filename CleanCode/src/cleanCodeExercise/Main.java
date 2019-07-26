package cleanCodeExercise;

//Skip to content
//Why GitHub?
//Enterprise
//Explore
//Marketplace
//Pricing
//Search
//
//Sign in
//Sign up
// Code  Issues 0  Pull requests 0  Projects 0  Security  Insights
//Join GitHub today
//GitHub is home to over 36 million developers working together to host and review code, manage projects, and build software together.
//
//Java/Races/src/main/java/Races/Main.java
//@Jurgis1997 Jurgis1997 Update Main.java
//5082aaa on May 14
//132 lines (119 sloc)  6.08 KB

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.lang.Math;



public class Main {
    private static final String Path = "C:/Users/ABC/Documents/Athlete_Results.csv";
    static SortedMap < String, Integer > taskai = new TreeMap < > (Collections.reverseOrder());
    static SortedMap < Integer, String > galutinis = new TreeMap < > ();
    static Map < String, Integer > galutinislaikas = new HashMap < String, Integer > ();
    static List < String > vardai = new ArrayList < String > ();
    static int makspoints = 0;
    public static void main(String[] args) throws IOException {
        try (

                Reader reader = Files.newBufferedReader(Paths.get(Path)); Reader reader1 = Files.newBufferedReader(Paths.get(Path)); CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT); CSVParser csvParser1 = new CSVParser(reader1, CSVFormat.DEFAULT);
        ) {
            int games = 0;
            for (CSVRecord csvRecord: csvParser1) {

                games++;
            }
            for (CSVRecord csvRecord: csvParser) {
                int Totalscore = 0;
                String name = csvRecord.get(0);
                String Victories = csvRecord.get(1);
                String SwimTime = csvRecord.get(2);
                String Knocking = csvRecord.get(3);
                String Refusal = csvRecord.get(4);
                String Disobedience = csvRecord.get(5);
                String score = csvRecord.get(6);
                String Time = csvRecord.get(7);
                String[] parts = SwimTime.split(":|\\.");
                int min = Integer.valueOf(parts[0]) * 600;
                int sec = Integer.valueOf(parts[1]) * 10;
                int milisec = Integer.valueOf(parts[2]);
                int time = min + sec + milisec;
                String[] parts1 = Time.split(":|\\.");
                int min1 = Integer.valueOf(parts1[0]) * 600;
                int sec1 = Integer.valueOf(parts1[1]) * 10;
                int milisec1 = Integer.valueOf(parts1[2]);
                int time1 = min1 + sec1 + milisec1;
                int laikas = 1500;
                vardai.add(csvRecord.get(0));
                if (Integer.valueOf(score) >= 172) {
                    Totalscore = 1000 + (Integer.valueOf(score) - 172) * 12;
                }
                if (Integer.valueOf(score) < 172) {
                    Totalscore = 1000 - (Integer.valueOf(score) - 172) * 12;
                }
                if (Integer.valueOf(Victories) >= Math.ceil(Integer.valueOf(games) * 0.7)) {
                    Totalscore = (int)(Totalscore + 1000 + (Integer.valueOf(Victories) - Math.ceil(Integer.valueOf(games) * 0.7)) * 40);
                }
                if (Integer.valueOf(Victories) < Math.ceil(Integer.valueOf(games) * 0.7)) {
                    Totalscore = (int)(Totalscore + 1000 - (Math.ceil(Integer.valueOf(games) * 0.7) - Integer.valueOf(Victories)) * 40);
                }
                if (Integer.valueOf(time) <= laikas) {
                    Totalscore = (int)(Totalscore + 1000 + (laikas - Integer.valueOf(time)) * 4 / 3);
                }
                if (Integer.valueOf(time) > laikas) {
                    Totalscore = (int)(Totalscore + 1000 - (Integer.valueOf(time) - laikas) * 4 / 3);
                }

                Totalscore = Totalscore + 1200 - Integer.valueOf(Knocking) * 28 - Integer.valueOf(Refusal) * 40 - Integer.valueOf(Disobedience) * 60;
                taskai.put(name, Totalscore);
                galutinislaikas.put(name, time1);
                if (Totalscore > makspoints) makspoints = Totalscore;



                System.out.println("Competitor No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("Name : " + name);
                System.out.println("Victories : " + Victories);
                System.out.println("SwimTime : " + SwimTime);
                System.out.println("Knocking : " + Knocking);
                System.out.println("Refusal : " + Refusal);
                System.out.println("Disobedience : " + Disobedience);
                System.out.println("score : " + score);
                System.out.println("Time : " + Time);
                System.out.println("Total score : " + Totalscore);
                System.out.println("---------------\n\n");
            }
        }
        int ilgis = vardai.size() - 1;
        int i = 0;
        while (i != ilgis) {
            int wow = galutinislaikas.get(vardai.get(i));
            int wow1 = taskai.get(vardai.get(i));
            if (wow1 < makspoints) {
                int minusas = makspoints - wow1; //pagal surinktus taskus prideda laiko
                int dabartinislaikas = wow + minusas;
                galutinislaikas.put(vardai.get(i), dabartinislaikas);
            }
            i++;

        }
        int b = 0;
        while (b != ilgis) {
            String vardas = vardai.get(b);
            int laikas = galutinislaikas.get(vardai.get(b)); // sudaro laiko ir vardo lentele
            galutinis.put(laikas, vardas);
            b++;

        }
        int vieta = 1;
        while (galutinis.size() != 0) {
            int minutes = Math.round(Integer.valueOf(galutinis.firstKey() / 600));
            int sekundes = Math.round((Integer.valueOf(galutinis.firstKey()) - (minutes * 600)) / 10);
            int milisekundes = Integer.valueOf(galutinis.firstKey() - minutes * 600 - sekundes * 10);
            String laikas = minutes + ":" + sekundes + "." + milisekundes;
            System.out.println("Vieta: " + vieta + " Vardas:  " + galutinis.remove(galutinis.firstKey()) + " Laikas: " + laikas);
            vieta++;

        }
    }
}
//© 2019 GitHub, Inc.
//Terms
//Privacy
//Security
//Status
//Help
//Contact GitHub
//Pricing
//API
//Training
//Blog
//About



