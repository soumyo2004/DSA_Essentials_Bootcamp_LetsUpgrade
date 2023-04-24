class UniqueElement {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};

        int unique = 0;
        int index = -1;

        for (int i = 0; i < arr.length; i += 2) {
            if (i == arr.length - 1 || arr[i] != arr[i+1]) {
                unique = arr[i];
                index = i;
                break;
            }
        }

        System.out.println("Unique element: " + unique);
        System.out.println("Index: " + index);
    }

}
