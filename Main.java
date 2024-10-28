import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Pobranie aktualnej daty i godziny
        LocalDateTime teraz = LocalDateTime.now();

        // Sformatowanie daty i godziny
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String sformatowanaData = teraz.format(format);

        // Wyświetlenie aktualnej daty i godziny
        System.out.println("Aktualna data i godzina: " + sformatowanaData);
    }
}