public class LearnString {
    public static void main(String[] args) {
        String str = "Hello Master, ";
        String str1 = "Hatim";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.substring(2, 5));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.equals(str1));
        System.out.println(str + str1);
        System.out.println(str.replace('e','o'));
        System.out.println(str.replaceFirst("Hello", "Good Morning"));
        System.out.println(str.replaceAll(str, str1));
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

        String s1 = "Hello";
        String s2 = "Hello";

        String newString1 = new String("Hello");
        String newString2 = new String("Hello");

        System.out.println((s1 == s2));
        System.out.println((newString1 == newString2));

        System.out.println(s1.equals(s2));
        System.out.println(newString1.equals(newString2));

        newString1 = newString1.intern();
        System.out.println(newString1 == s1);

        System.out.println(newString1 == s2);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf);
        
    }
}
