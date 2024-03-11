import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int casaB = 0;
        int casaP = 0;
        a *= a;

        if (a % 2 == 0) {
            casaB = a / 2;
            casaP = a / 2;
        } else {

            casaB = (a/2) +1;
            casaP = (a/ 2) ;
        }

        System.out.println(casaB + " casas brancas e " + casaP + " casas pretas");
    }
}
