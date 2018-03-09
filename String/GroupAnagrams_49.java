package String;

import java.util.*;

/**
 * Created by Druning on 2017/9/5.
 */
public class GroupAnagrams {
    public static List<List<String>> solutionByMap(String[] s){
        List<List<String>> result = new ArrayList<List<String>>();
        Map<String, ArrayList<String>> mp = new HashMap<>();
        for(String str : s){
            char[] strChar = str.toCharArray();
            Arrays.sort(strChar);
            String strSorted = String.valueOf(strChar);
            if(mp.containsKey(strSorted)){
                ArrayList<String> aList = mp.get(strSorted);
                aList.add(str);
                mp.put(strSorted, aList);
            }else{
                ArrayList<String> aList = new ArrayList<>();
                aList.add(str);
                mp.put(strSorted, aList);
            }
        }
        Set<String> keySet = mp.keySet();
        for(String key: keySet){
            ArrayList<String> aList = mp.get(key);
            Collections.sort(aList);
            result.add(aList);
        }
        return result;
    }
//    public static
    public static void main(String[] args){
        String[] s1 = new String[]{"dafs", "fadsf", "fads"};
        List<List<String>> result = solutionByMap(s1);
        System.out.println(result);
    }
}
