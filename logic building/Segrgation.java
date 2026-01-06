public class Segrgation {
    public static void main(String[] args) {
        char ch='a';
        if(ch>='A'&&ch<='Z'){
            System.out.println("upercase ");
        }else if (ch>='a'&&ch<='z') {
           System.out.println("lowercase "); 
        }else if(ch>='0'&&ch<='9'){
            System.out.println("digit ");
        }else{
            System.out.println("special digit");
        }
    }
    
}
