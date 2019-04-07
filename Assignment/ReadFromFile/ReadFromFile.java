package ReadFromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        BufferedReader datal = null;
        try {
            datal = new BufferedReader(new FileReader("input.html"));
            String s;
            String[] words = null;
            int count = 1;
            while((s = datal.readLine()) != null) {
                words = s.split(" ");
                for(int i=0; i<words.length; i++) {
                    if(words[i].equals("")) continue;
                    for(int j=i+1; j<words.length; j++) {
                        if(words[i].equals(words[j])) {
                            words[j] = "";
                            count++;
                        }
                    }
                    System.out.println("'" + words[i] + "'" + " is " + count + " times.");
                    words[i] = "";
                    count = 1;
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                datal.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
