public class Cinema {

    private boolean[][] seats;

    public Cinema(int rows, int seatsPerRow) {
        seats = new boolean[rows][seatsPerRow];
    }

    public boolean reserve(int row, int seat) {
        if (row < 1 || row > seats.length || seat < 1 || seat > seats[0].length) {
            System.out.println("Fejl: Ugyldig række eller sæde.");
            return false;
        }
        if (!seats[row - 1][seat - 1]) {
            seats[row - 1][seat - 1] = true;
            return true;
        } else {
            System.out.println("Fejl: Sædet er allerede reserveret.");
            return false;
        }
    }

    public boolean cancelReservation(int row, int seat) {
        if (row < 1 || row > seats.length || seat < 1 || seat > seats[0].length) {
            System.out.println("Fejl: Ugyldig række eller sæde.");
            return false;
        }
        if (seats[row - 1][seat - 1]) {
            seats[row - 1][seat - 1] = false;
            return true;
        } else {
            System.out.println("Fejl: Sædet er ikke reserveret.");
            return false;
        }
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seats.length; i++) {
            sb.append("Række " + (i + 1) + ": ");
            for (int j = 0; j < seats[i].length; j++) {
                sb.append(seats[i][j] ? "[X]" : "[ ]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}



