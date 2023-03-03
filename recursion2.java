public class recursion2{
    public static int first = 0;
    public static int last = 0;
    public static void findOccurrence(String str,int idx,char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurrence(str, idx+1, element);
    }
    public static void main(String args[]){
        String str = "htguhjkunhikh";
        findOccurrence(str, 0, 'h');
    }
}
