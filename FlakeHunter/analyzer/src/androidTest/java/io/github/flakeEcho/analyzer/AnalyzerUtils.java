package io.github.flakeEcho.analyzer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyzerUtils {

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static void output(Result result, String path) {
        try {
            File logFile = new File(path + "/event_data.txt");
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(logFile));
            try {
                bw.write("event race pair number(average):" + result.getEventRaceNum());
                bw.newLine();
                bw.write("total event number(average):" + result.getEventNum());
                bw.newLine();
                bw.write("average time" + result.getTime());
                bw.newLine();
            } catch (IOException e) {
            }
            bw.close();
        } catch (IOException e) {
        }
    }

}
