package problem4;

public class SortWords {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + " Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        
        String[] words = text.split("[\\s,;?.`]+"); 
        bubbleSort(words); 
        
        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    // Bubble sort method
    public static void bubbleSort(String[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i].compareToIgnoreCase(array[i + 1]) > 0) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            n--; 
        } while (swapped);
    }
}

