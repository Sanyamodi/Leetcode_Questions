import java.util.*;
public class _08_49_GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to hold sorted string as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert to char array, sort it, and convert back to string
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);

            // Add the original string to the corresponding group
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }

        // Return all the grouped anagram lists
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        _08_49_GroupAnagram sol = new _08_49_GroupAnagram();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = sol.groupAnagrams(input);
        System.out.println(result);
    }


}
