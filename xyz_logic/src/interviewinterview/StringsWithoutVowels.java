package interviewinterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsWithoutVowels {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("akjs", "sjhs", "rrrr"," i");
        
        
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        // Find and print strings without vowels
        List<String> stringsWithoutVowels = names.stream()
                .filter(s -> s.chars().noneMatch(c -> vowels.contains((char) c)))
                .collect(Collectors.toList());

        System.out.println("Strings without vowels: " + stringsWithoutVowels);
    }
}
