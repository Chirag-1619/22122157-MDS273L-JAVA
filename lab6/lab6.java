import java.util.*;
import java.io.File;
import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) throws Exception
    {
        try{
        File file = new File("text.txt");
        Scanner sc = new Scanner(file);
        int count = 0;

        while (sc.hasNextLine())
         System.out.println(sc.next());


        System.out.println("Number of vowels in given text file is " +count);

}

    

private static int countVowels(String file){
    int count = 0;
for (int i=0 ; i<file.length(); i++){
    char ch = file.charAt(i);
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        count ++;
    }
}
return count;
}
