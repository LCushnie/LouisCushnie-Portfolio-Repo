public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        String[] banner = {
            "==============================",
            "   Welcome to Louis' Repo!    ",
            "=============================="
        };

        for (String line : banner) {
            System.out.println(line);
            Thread.sleep(500); // half a second delay
        }

        // Add a dramatic pause
        Thread.sleep(1000);

        // Print hello message
        System.out.println("\nHello, world! 🚀");
    }
}
