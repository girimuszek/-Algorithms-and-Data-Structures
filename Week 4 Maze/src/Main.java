import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
public class Main {

    static int currIndex;
    static int rightIndex;
    static int bottomIndex;
    static int currElement;
    static int rightElement;
    static int bottomElement;

    public static void main(String[] args) {


        location(6, 6);

        }


    public static int location(int Row, int Col){

        int totalSize = Row * Col;

        List<Integer> aiMaze = new ArrayList<>(Arrays.asList(27, 4, 29, 35, 6, 33,
                                                            12, 22, 3, 15, 17, 0,
                                                            8, 9, 10, 16, 1, 34,
                                                            11, 18, 21, 20, 7, 14,
                                                            19, 23, 31, 26, 24, 25,
                                                             13, 28, 5, 30, 32, 2));


        //IF YOU WANT A RANDOM MAZE, COMMENT OUT THE UPPER CODE, AND UNCOMMENT OUT THE CODE BELOW
        //List<Integer> aiMaze = new ArrayList<>();
        //Creates all values from 0 to totalSize and adds to the list
        //for(int i = 1; i <= totalSize; i++){
        //    aiMaze.add(i);
        //}

        //Collections.shuffle(aiMaze);

        List<Integer> finalPath = new ArrayList<>();

        currElement = aiMaze.get(0);
        currIndex = 0;
        finalPath.add(currElement);







        // List of the rightmost side index values
        List<Integer> multiplesOfRow = new ArrayList<>();

        // Puts rightmost index into a list
        for (int i = Row - 1  ; i <= totalSize; i+=Row) {
            multiplesOfRow.add(i);
        }

        // While the current position in the maze isn't at the end, keep continuing.
        while (currIndex != aiMaze.size() - 1) {

            rightIndex = currIndex + 1;
            bottomIndex = currIndex + Row;

            rightElement = aiMaze.get(rightIndex);
            bottomElement = aiMaze.get(bottomIndex);

            boolean rightOutOfBounds = oobRight(currIndex, multiplesOfRow);
            boolean bottOutOfBounds = oobBottom(currIndex, totalSize, Row);

            if (!rightOutOfBounds && !bottOutOfBounds ) {

                if (rightElement < bottomElement) {
                    currIndex++;
                    currElement = aiMaze.get(currIndex);
                    finalPath.add(currElement);
                } else{
                    currIndex = bottomIndex;
                    currElement = aiMaze.get(currIndex);
                    finalPath.add(currElement);
                }



            } else if (rightOutOfBounds && !bottOutOfBounds) {
                currIndex = bottomIndex;
                currElement = aiMaze.get(currIndex);
                finalPath.add(currElement);

            } else if (!rightOutOfBounds && bottOutOfBounds) {
                currIndex = rightIndex;
                currElement = aiMaze.get(currIndex);
                finalPath.add(currElement);

            } else if (rightOutOfBounds && bottOutOfBounds) {
                break;


            }

        }
        System.out.println(finalPath);
        return 0;

    }
    //if currIndex is == any of the values in multiplesofRow, return true (OOB)
    public static boolean oobRight(int rightVal, List<Integer> multRow){

        if (multRow.contains(rightVal)){
            return true;
        }
        return false;
    }

    // if currIndex +6 is greater than totalSize, return true (OOB)
    public static boolean oobBottom(int currPosition, int totalSize, int rowSize){

        if ((currPosition + rowSize) > totalSize){
            return true;

        }
        return false;
    }


    }







