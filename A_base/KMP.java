package A_base;

/**
 * Created by Druning on 2017/9/25.
 */
public class KMP {
//求解pattern的Next数组
    private static int[] getNext(String pattern){
        int[] next = new int[pattern.length()];

        int i;

        next[0] = i = -1;

        for(int j  = i ; j < pattern.length(); j++){
            // 已经存在最大匹位置时,向前寻找最大匹配的 index 就是 i 然后看i+1是否和j相同
            while(i >=0 && pattern.charAt(i+1) != pattern.charAt(j)){
                i = next[i];
            }

            //i= -1和i>=0统一
            if(pattern.charAt(i+1) == pattern.charAt(j)){  //出现了匹配,则在目前最大出现匹位置基础上+1
                i++;
            }
        }
    }
    public static void searchSque(String origin,String pattern){
        int next[] = getNext1(pattern);

        //为了下面更好的表示，用匹配串的下一个字符和目标位置进行对比
        int i = -1;
        for(int j = 0;j<origin.length();j++){
            //如果发生了不匹配的时,回溯到i位置并从i+1位置开始比对
            while(i>=0 && origin.charAt(j) != pattern.charAt(i+1)){
                i=next[i];
            }

            if(origin.charAt(j)== pattern.charAt(i+1)){
                i++;
            }

            if(i == pattern.length()-1){ //完成了一次匹配
                System.out.println("字符串开始匹配位置："+(j-i));

                //当出现了一次匹之后,在此判断是否在本串最大匹配子串之后是能接着匹配
                //T = "absabsab"
                //P = "absab";
                //出现了两次匹配
                i = next[i];
            }


        }
    }


}
