public class BubbleSort {

    public Character[] sort(Character[] input) {

        int swapped = 0;

        for (int i = 0; i + 1 < input.length; i++) {
            Character current = input[i];
            Character next = input[i + 1];


            if (current > next) {
                input[i] = next;
                input[i + 1] = current;
                swapped += 1;
            }
        }

        if (swapped == 0) {
            return input;
        } else {
            sort(input);
        }

        return input;
    }
}