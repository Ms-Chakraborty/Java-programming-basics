package patterntwo.patterntwo.recursion;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n, char source, char aux, char dest) {
        // Base case: only one disk
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + dest);
            return;
        }

        // Step 1: Move n-1 disks from source → aux
        towerOfHanoi(n - 1, source, dest, aux);

        // Step 2: Move nth disk from source → dest
        System.out.println("Move disk " + n + " from " + source + " to " + dest);

        // Step 3: Move n-1 disks from aux → dest
        towerOfHanoi(n - 1, aux, source, dest);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
