public class Driver {
    public static void main(String[] args) {

        SkipList mySkipList = new SkipList();


        System.out.println("Inserting values into the SkipList:");
        mySkipList.put("1", 40);
        mySkipList.put("2", 30);
        mySkipList.put("3", 7);
        mySkipList.put("4", 8);


        System.out.println("\nPrinting the SkipList horizontally:");
        mySkipList.printHorizontal();

        System.out.println("\nPrinting the SkipList vertically:");
        mySkipList.printVertical();

        String targetKey = "3";

        System.out.println("\nSearching for target key: " + targetKey);

        Integer targetValue = mySkipList.get(targetKey);
        if (targetValue != null) {
            System.out.println("Found target key: " + targetKey + ", Value: " + targetValue);
        } else {
            System.out.println("Key not found in SkipList.");
        }
    }
}
