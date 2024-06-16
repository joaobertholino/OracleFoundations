
public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;

        int index = custName.indexOf(" ");
        spaceIdx = index;
        firstName = custName.substring(0, spaceIdx);
        
        System.out.println(firstName);
    }

}
