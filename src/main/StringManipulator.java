package main;

public class StringManipulator {
    // input: ExAmPLE => output: ELPmAxE
    public String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        return sb.toString();
    }

    // input: example => output: false
    // input: ELpmpLE => output: true
    public boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
            if (left > right) {
                break;
            }
        }

        return true;
    }

    // input: ExAmPLE, part: Ex => output: true
    // input: ExAmPLE, part: ex => output: false
    public boolean isContained(String input, String part) {
        // Your code here
        return input.contains(part);
    }

    // input: ExAm1PLE2 => output: ExAmPLE
    public String numberRemoved(String input) {
        // Your code here
        input = input.replaceAll("\\d", "");
        return input;
    }

    // input: ExAmPLE => output: EXAMPLE
    public String upperString(String input) {
        // Your code here
        return input.toUpperCase();
    }

    // input: ExAmPLE => output: example
    public String lowerString(String input) {
        // Your code here
        return input.toLowerCase();
    }

    // input: example string => output: Example String
    public String capitalString(String input) {
        // Your code here
        StringBuilder sb = new StringBuilder();
        String[] words = input.split("\\s");
        for (String s : words) {
            sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1).toLowerCase()+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    // input: Example => output: 3 ue oai
    public int countVowels(String input) {
        // Your code here
        int count = 0;
        for(int i=0;i<input.length();i++){
            char a = input.toLowerCase().charAt(i);
            if(a == 'u'||a=='e'||a=='o'||a=='a'||a=='i'){
                count++;
            }
        }
        return count;
    }

    // input: Hello, how are you? => output: 4
    public int countWords(String sentence) {
        // Your code here
        String[] words = sentence.split("\\s");
        return words.length;
    }

    // Input: input = "Java programming", substring = "programming" => Output: 5
    // Input: input = "Java programming", substring = "Programming" => Output: -1
    public int findSubstringIndex(String input, String substring) {
        int result = input.indexOf(substring);
        return result;
    }

    // Input: "Hello World How Are You" => Output: "You Are How World Hello"
    public String reverseWords(String sentence) {
        // Your code here
        String[] words = sentence.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>-1;i--){
            sb.append(words[i]+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
