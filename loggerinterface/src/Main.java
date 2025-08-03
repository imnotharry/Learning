public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger("log.txt");

        consoleLogger.log("This is a message to the console.");
        fileLogger.log("This is a message to the file.");

        System.out.println("Loggers executed.");
    }
}

