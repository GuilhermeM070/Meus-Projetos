package línguadoprograma;

import java.util.Locale;

public class LínguaDoPrograma {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("Seu sistema está em:");
        System.out.println( loc.getDisplayLanguage());
    }
}
