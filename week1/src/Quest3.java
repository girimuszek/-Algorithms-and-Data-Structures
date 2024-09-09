

public class Quest3 {

    public static String Quest3(String m){

        for (int i = 0; i < m.length(); i++){

            char c = m.charAt(i);

            if (c == ' ') {
                continue;

            }
            for (int j = i + 1; j < m.length(); j++){

                if (c == m.charAt(j)) {

                    System.out.println("Numbers are not distinct!");
                    return m;
                }

            }

        }
        System.out.println("Numbers are distinct!");
        return m;
    }
}
