public class OOPSBANNERApp7 {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap buildO() {
        return new CharacterPatternMap('O', new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        });
    }

    public static CharacterPatternMap buildP() {
        return new CharacterPatternMap('P', new String[]{
                "******** ",
                "**     **",
                "**     **",
                "******** ",
                "**       ",
                "**       ",
                "**       "
        });
    }

    public static CharacterPatternMap buildS() {
        return new CharacterPatternMap('S', new String[]{
                " ********",
                "**       ",
                "**       ",
                " ********",
                "       **",
                "       **",
                " ********"
        });
    }

    public static void main(String[] args) {

        CharacterPatternMap[] characters = {
                buildO(),
                buildO(),
                buildP(),
                buildS()
        };

        for (int i = 0; i < 7; i++) {

            StringBuilder row = new StringBuilder();

            for (CharacterPatternMap c : characters) {
                row.append(c.getPattern()[i]).append("   ");
            }

            System.out.println(row.toString());
        }
    }
}