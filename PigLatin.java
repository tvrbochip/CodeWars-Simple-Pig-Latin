import java.util.Arrays;

public class PigLatin {
  public static String pigIt(String str) {
    String[] words = str.split(" ");
    for (int i = 0; i < words.length; i++) {
      if (words[i].equals("!") | words[i].equals("?")) {
        break;
      }
      words[i] = words[i] + words[i].charAt(0) + "ay";
      words[i] = words[i].substring(1);
    }
    String reslt = Arrays.toString(words).replace(",", "").replace("]", "").replace("[", "").trim();
    return reslt;
  }
}
//OR
public class PigLatin {
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
