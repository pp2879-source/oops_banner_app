import java.util.HashMap;
import java.util.Map;

public class OOPSBANNERApp8 {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner("OOPS", patternMap);
    }

    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        });

        map.put('P', new String[]{
                "******** ",
                "**     **",
                "**     **",
                "******** ",
                "**       ",
                "**       ",
                "**       "
        });

        map.put('S', new String[]{
                " ********",
                "**       ",
                "**       ",
                " ********",
                "       **",
                "       **",
                " ********"
        });

        return map;
    }

    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patternMap.get(ch);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line.toString());
        }
    }
}