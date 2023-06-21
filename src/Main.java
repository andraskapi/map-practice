import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> ovodaiJelek = new HashMap<>();
        ovodaiJelek.put("Zámbó Jimmy", "korona");
        ovodaiJelek.put("Kapitány András","Vitorláshajó");
        ovodaiJelek.put("Kiss Pista","Kulcs");
        ovodaiJelek.put("LL J","Dollár");
        ovodaiJelek.put("LL G","Dollár");
        ovodaiJelek.put("LL G","Aranylánc");
        System.out.println(ovodaiJelek);
        ovodaiJelek.remove("LL J");



        System.out.println(ovodaiJelek);
        System.out.println(ovodaiJelek.size());
        System.out.println(ovodaiJelek.get("Kapitány András"));

        System.out.println(ovodaiJelek.keySet());
        System.out.println(ovodaiJelek.values());
        System.out.println(ovodaiJelek.entrySet());
        System.out.println(ovodaiJelek.get("Kapi"));
        System.out.println(ovodaiJelek.replace("Kapitány András","Labda"));
        System.out.println(ovodaiJelek);


    }

}
