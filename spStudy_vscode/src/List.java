
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class List {
    static ArrayList<String[]> list = new ArrayList<String[]>();

    public static void ReadFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./testFile/List_Sample.txt"));

        String str;
        while ((str = reader.readLine()) != null) {
            list.add(str.split("\t"));
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(0).length; j++) {

                System.out.println(list.get(i)[j]);
            }

            reader.close();
        }
        String[] arr = list.toArray(new String[list.size()]);

        // (배열, override 함수);
        Arrays.sort(arr, new Comparator<String[]>() { // new Comparator 함수 Override
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[0].toString().contentEquals(o2[0].toString()))
                    return o1[1].toString().compareTo(o2[1].toString());
                else
                    return o1[0].toString().compareTo(o2[0].toString());
            }
        });

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.equals("print")) {
            ReadFile();
        }

    }
}
