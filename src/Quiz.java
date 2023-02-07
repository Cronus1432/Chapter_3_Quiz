import java.util.Scanner;

public class Quiz {
    private static Question[] questions = new Question[] {
            new Question("What does the V in VLAN stand for?", "Virtual", "Volatile", "Verbose", 1),
            new Question("What is exchanged in the process called handshaking in computer science?", "Hands", "Predetermined signals", "Predetermined bits of data", 2),
            new Question("What does check sum generate?", "Digits sum", "Numbers sum", "Letters sum", 1),
            new Question("What is the internet made of?", "LANs", "WANs", "Both WANs & LANs & others", 3),
            new Question("What is an example of a pan?", "USB", "Cast Iron skillets", "UNIX", 2),
            new Question("What does the P in VPN stand for?", "Private", "Public", "Protected", 1),
            new Question("What does ISDN stand for?", "Integrated services data network", "International storage device network", "Integrated services digital network", 3),
            new Question("Which of the 3 is more sophisticated?", "Switch", "Hub", "Router", 3),
            new Question("What is faster in transmitting data?", "Hub", "Switch", "Same speed", 2),
            new Question("Continue the sentence : VANs are implemented to achieve ...", "scalability", "kidnapping children", "freedom", 1),
            new Question("What size area does a PAN cover?", "It doesn't cover any area", "very small", "very big", 2),
            new Question("Is the internet and the World Wide Web exactly the same thing?", "Yes", "Maybe", "No", 3),
            new Question("What is an intranet?", "Network of networks", "Company employee private network", "Google", 2),
            new Question("What is it called when peripheral devices communicate with each other?", "PAN", "LAN", "WLAN", 1),
            new Question("What is P2P?", "Peer-2-Peer", "Game Boy", "Peer-to-Peer", 3),
            new Question("What does data integrity measure?", "It actually detects errors", "Data integrity", "Data accuracy", 3),
            new Question("What do TCP/IP connect?", "Hosts", "Data protocols", "Data bits", 1),
            new Question("What covers a larger area?", "LAN", "MAN", "WAN", 3),
            new Question("What does MAN stand for?", "Metropolitician area network", "Metropolitan area network", "Mega area network", 2),
            new Question("What can you use to describe SAN out of the following?", "Secure", "Both", "High-speed", 2)
};

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("This is a quiz. For every question you answer right you get 1 point and for every question you answer wrong you lose 1 point.");
        System.out.println("You start with 0 points. If you end with negative points you have complied to give up your left arm for free.\n");

        for (Question question : questions) {
        System.out.println(question.getQuestion());
        System.out.println("1. " + question.getOption1());
        System.out.println("2. " + question.getOption2());
        System.out.println("3. " + question.getOption3());
        System.out.print("\nYour answer: ");

        int answer = scanner.nextInt();
        if (answer == question.getCorrectOption()) {
        System.out.println("\nCorrect!");
        score++;
        } else {
        System.out.println("\nIncorrect.");
        score--;
        }
        System.out.println();
        }

        System.out.println("\nYour final score is: " + score + " / " + questions.length);
        }
        }
