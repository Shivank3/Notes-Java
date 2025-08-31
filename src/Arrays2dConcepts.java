public class Arrays2dConcepts {
    public static void main(String[] args){

        // 2D array -> an array where each element is an array
        //             useful for storing a matrix of data
        char[][] telephone = {{'1','2','3'},
                            {'4','5','6'},
                            {'7','8','9'},
                            {'*','0','#'}};
        for(char[] row: telephone){
            for(char number: row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}

/*
String[] fruits = {"orange","apple","kiwi"};
        String[] vegetables = {"onion", "potato","tomato"};
        String[] oils = {"mustard","refined", "ghee"};

        String[][] Groceries = {fruits, vegetables, oils};

        Groceries[0][1] = "eggs";

        for(String[] items: Groceries){
            for(String item: items){
                System.out.print(item + " ");
            }
            System.out.println();
        }
 */
