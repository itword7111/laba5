import java.util.*;

public class Main {
    public static Map<String, List<String>> ReverseMap (Map<String, List<String>> s){
        //Set<Tuple<>> a;
        Map<String, List<String>> ans = new HashMap<String, List<String>>();
        for (String ss:s.keySet()
        ) {
            for (String ss2:s.get(ss)
            ) {
                //if проверка на null map"ans" get(ss2)
                if(ans.get(ss2)==null) {
                    List<String> aa = new ArrayList<String>();
                    aa.add(ss);
                    ans.put(ss2, aa);
                }
                else if(!(ans.get(ss2).contains(ss))){
                    ans.get(ss2).add(ss);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Map<String, List<String>> s = new HashMap<String, List<String>>();
        s.put("", Arrays.asList("AA", "BB", "CC"));
        s.put("1", Arrays.asList("AA", "BB"));
        s.put("2", Arrays.asList("AA", "DD"));
        s.put("3", Arrays.asList("FF"));
        System.out.println("Входной Map");
        System.out.println(s);
        System.out.println("Перевернутый Map");
        System.out.println(ReverseMap(s));
    }

}
