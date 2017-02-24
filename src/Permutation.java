import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kinshuk.bairagi on 24/02/17.
 */
public class Permutation {

    public static void main(String[] args) {
        System.out.println(" :: Permutations :: ");
        String str = "ABC";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n - 1).forEach(System.out::println);
    }

    private List<String> permute(String str, int l, int r) {
        ArrayList<String> permutations = new ArrayList<>();
        if (l != r) {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                 permutations.addAll(permute(str, l + 1, r));
                str = swap(str, i, l);
            }
        } else
            permutations.add(str);
        return  permutations;
    }

    private String swap(String str, int a, int b) {
        char[] chars = str.toCharArray();
        char t = chars[a];
        chars[a] = chars[b];
        chars[b] = t;
        return new String(chars);
    }
}
