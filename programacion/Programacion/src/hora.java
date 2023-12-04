import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class hora {
    public static void main(String[] args) {
        String dateTime = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm:ss a")
                .format(LocalDateTime.now());
        System.out.println(dateTime);
    }
}