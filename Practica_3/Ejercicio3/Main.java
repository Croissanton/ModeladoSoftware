public class Main {
    public static void main(String[] args) {
        // Create a new tray with a capacity of 3.
        Bandeja bandeja = new Bandeja(3);

        // Create some pieces to put in the tray.
        Pieza pieza1 = new Pieza();
        Pieza pieza2 = new Pieza();
        Pieza pieza3 = new Pieza();
        Pieza pieza4 = new Pieza(); // We will try to add this to a full tray.

        // Add pieces to the tray.
        bandeja.put(pieza1);
        System.out.println("Added piece 1: Tray should now be in Normal state.");
        bandeja.put(pieza2);
        System.out.println("Added piece 2: Tray should still be in Normal state.");

        // Attempt to add a third piece (should transition to FullState)
        try {
            bandeja.put(pieza3);
            System.out.println("Added piece 3: Tray should now be in Full state.");
        } catch (IllegalStateException ise) {
            System.err.println(ise.getMessage());
        }

        // Attempt to add a fourth piece (should fail)
        try {
            bandeja.put(pieza4); // This should throw an exception since the tray is full.
        } catch (IllegalStateException ise) {
            System.err.println("Failed to add piece 4: " + ise.getMessage());
        }

        // Remove a piece (should transition back to NormalState)
        Pieza removedPiece = bandeja.get();
        System.out.println("Removed a piece: Tray should now be in Normal state again.");

        // Attempt to remove all pieces (should eventually become EmptyState)
        bandeja.get();
        System.out.println("Removed a piece: Should still be in Normal state.");
        bandeja.get();
        System.out.println("Removed a piece: Tray should now be in Empty state.");

        // Attempt to remove a piece from an empty tray (should fail)
        try {
            bandeja.get(); // This should throw an exception since the tray is empty.
        } catch (IllegalStateException ise) {
            System.err.println("Failed to remove piece: " + ise.getMessage());
        }
    }
}