package Lab4PRC;

public class DeletionInArray {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        int delete_element = 30;
        int index_delete = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == delete_element){
                index_delete = i;
                break;
            }
        }
    }
}
