package com.madhavareddy;

public class MovingMan {
    public static void main(String[] args) throws InterruptedException {
        int width = 200; // width of the console

        while (true) {
            for (int i = 0; i < width; i++) {
                clearConsole();
                printMan(i);
                Thread.sleep(150); // control speed (ms)
            }
        }
    }

    // Function to print the man with spaces before
    public static void printMan(int position) {
        String space = " ".repeat(position);
        /*System.out.println(space + " o");     // head
        System.out.println(space + "/|\\");   // arms and body
        System.out.println(space + "/ \\");   // legs*/

        System.out.println(space + " o>");     // head
        System.out.println(space + "/|\\");   // arms and body
        System.out.println(space + "/ \\");   // legs
    }

    // Clears the console screen
    public static void clearConsole() {
        /*try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // If clearing fails, just print a bunch of new lines
            System.out.println("\n".repeat(20));
        }*/
    }
}

