public class Main {
    public static void main(String[] args) {
        launchGame();
    }

    public static void launchGame() {
        setCharactersAvailable();
        showGUI();
    }

    public static void setCharactersAvailable() {
    }

    public static void showGUI() {
        System.out.println(
                "█▄─█▀▀▀█─▄█▄─▄▄─█▄─▄███─▄▄▄─█─▄▄─█▄─▀█▀─▄█▄─▄▄─█\n██─█─█─█─███─▄█▀██─██▀█─███▀█─██─██─█▄█─███─▄█▀█\n▀▀▄▄▄▀▄▄▄▀▀▄▄▄▄▄▀▄▄▄▄▄▀▄▄▄▄▄▀▄▄▄▄▀▄▄▄▀▄▄▄▀▄▄▄▄▄▀");
    }
}