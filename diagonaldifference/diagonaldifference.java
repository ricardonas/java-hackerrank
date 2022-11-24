public static int diagonalDifference(List<List<Integer>> arr) {
        int sumLeftToRightDiagonal = 0;
        int sumRightToLeftDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {

            final List<Integer> integers = arr.get(i);

            sumLeftToRightDiagonal += integers.get(i);

            sumRightToLeftDiagonal += integers.get((integers.toArray().length - 1) - i);
        }

        return (sumRightToLeftDiagonal - sumLeftToRightDiagonal);
    }