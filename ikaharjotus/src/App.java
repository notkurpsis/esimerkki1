public class App {
    public static void main(String[] args) throws Exception {
        int age = 65;
        if (age >=0 && age < 18)
        { System.out.println("Olet alaikäinen" ); }
        else if ( age == 18)
        { System.out.println("Saat ajaa autoa."); }
        else if (age >= 65)
        { System.out.println("Olet eläkeläinen."); }
        else
        {
            System.out.println("Olet aikuinen");
        }

    }
}
