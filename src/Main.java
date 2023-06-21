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

        Map<String,Integer> heightMap = new HashMap<>();
        heightMap.put("Sziproka", 131);
        heightMap.put("Csuporka", 134);
        heightMap.put("Puszedli", 123);
        heightMap.put("X-Professzor", 185);
        heightMap.put("Mohó Jojó", 152);
        System.out.println(heightMap.values());
        System.out.println(legmagassag(heightMap));
        System.out.println(legmagasabbNeve(heightMap));
        System.out.println(legalacsonyabb(heightMap));
        System.out.println(legalacsonyabbneve(heightMap));
        kiALegkisebb(heightMap);
        heightMap.replace("Sziproka",heightMap.get("Sziproka") + 1 );
        System.out.println(heightMap.get("Sziproka"));

        Map<String,Integer> grades = new HashMap<>();




    }
    public static int legmagassag(Map<String,Integer> heightMap){
        int maxHeight = Integer.MIN_VALUE;
        for(int height : heightMap.values()){
            if(maxHeight < height){
                maxHeight = height;
            }

        }return maxHeight;
    }

    public static String legmagasabbNeve(Map<String,Integer> heightMap){
        int maxHeight = Integer.MIN_VALUE;
        String name = "";

        for(int height : heightMap.values()){
            if (height > maxHeight){
                maxHeight = height;

            }
        }
        for (var entry : heightMap.entrySet()) {
            if (maxHeight == entry.getValue()){
                name = entry.getKey();
            }
        }


        return name;
    }

    public static int legalacsonyabb(Map<String,Integer> heightMap){
        int min = Integer.MAX_VALUE;

        for(int height : heightMap.values()){
            if(height < min){
                min = height;

            }

        }return min;
    }
    public static String legalacsonyabbneve(Map<String,Integer> heightMap){

        String name = "";
        int min = Integer.MAX_VALUE;

        for(int height : heightMap.values()){
            if(height < min){
                min = height;

            }

        }

        for (var height : heightMap.entrySet()){
            if(min == height.getValue()){
                name = height.getKey();

            }
        }return name;
    }
    public static void kiALegkisebb(Map<String,Integer> heightMap){
        String name = "";
        Integer min = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : heightMap.entrySet()) {
            if(entry.getValue() < min ){
                min = entry.getValue();
                name = entry.getKey();

            }

        }
        System.out.println("A legkisebb : " + name + " és " + min + " cm ");

    }

}
