

public class convert_firstletter_of_each_word_to_uppercase {
    public static void stringtoUppercase(String str){
        StringBuilder sb = new StringBuilder(" ");
        sb.append(Character.toUpperCase(str.charAt(0)))  ;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="hi, i am prince";
        stringtoUppercase(str);
    }
}
