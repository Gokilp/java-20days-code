////progarm using foreach  loop in arrays
public class program11 {

        public static void main(String args[])
        {
// declaration and instantiation of an array
            String[] city = new String[4];
//initializing elements
            city[0] = "Delhi";
            city[1] = "Jaipur";
            city[2] = "Gujarat";
            city[3] = "Mumbai";
//traversing over array using for-each loop
            for (String str : city)
            {
                System.out.println(str);
            }
        }
    }

