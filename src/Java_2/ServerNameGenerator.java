package Java_2;

/**
 * Created by canidmars on 5/18/17.
 */
public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"brown", "friendly", "gross", "marbled", "sparkly", "translucent", "red", "morose", "thin", "tapered"};
        String[] nouns = {"bear", "cactus", "fire-hose", "rug", "record", "car", "table", "skyscraper", "dog", "computer"};

        System.out.println(generateName(adjectives, nouns));
    }

    public static String generateName(String[] adjectives, String[] nouns){
        String randomAdjective = adjectives[(int) (Math.random() * adjectives.length)];
        String randomNoun = nouns[(int) (Math.random() * nouns.length)];
        return randomNoun + "-" + randomAdjective;
    }

}
