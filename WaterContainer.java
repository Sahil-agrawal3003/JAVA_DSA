import java.util.ArrayList;

public class WaterContainer {

    // Function to store maximum water
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        // Loop to check every pair of lines
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j)); // smaller line height
                int width = j - i; // distance between lines
                int currWater = ht * width; // water area

                maxWater = Math.max(maxWater, currWater); // keep max value
            }
        }
        return maxWater; // ✅ you missed return statement
    }

    public static void main(String args[]) {
        // ✅ Create an ArrayList first
        ArrayList<Integer> height = new ArrayList<>();

        // Add elements
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // Call function and print result
        System.out.println(storeWater(height));
    }
}
