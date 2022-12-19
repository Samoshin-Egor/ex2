package ex1;
import java.lang.*;
public class TestAuthor {
    public static void main(String [] args){
        Author a1 = new Author ( "Misha", "Misha@12", 'm') ;
        Author a2 = new Author ("Olivia", "Olivka@12", 'f');
      //Author a3 = new Author ("Kolyan", "Kolik@12", 'n');
        System.out.println(a1);
        System.out.println(a2);
      //System.out.println(a3);
    }
}
