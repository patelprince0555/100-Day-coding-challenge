

public class string_compression {
    public static  String stringCompress(String str){
        String newstr ="";
        for(int i=0;i<str.length();i++){
            int count=1;
            while (i<str.length()-1&& str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if(count>1){
                newstr+=String.valueOf(count);
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println(stringCompress(str));
        
    }
}


// public class string_compression {
//     public static void compress(String str){
//         StringBuilder sb =new StringBuilder("");
//         // String newstr ="";
//         for(int i=0;i<str.length();i++){
//             Integer count =1;
//             while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             sb.append(str.charAt(i));
//             if(count>1){
//              sb.append(count.toString());
//             }

//         }
      
       
//         System.out.println(sb);
        
//     }
//     public static void main(String[] args) {

        
//         String str ="aaabbcccddd";
//       compress(str);
        
//     }
// }