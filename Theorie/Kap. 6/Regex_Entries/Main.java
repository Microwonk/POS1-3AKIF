import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // kompilieren der Regex
    private static Pattern emailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE); // case insensitive, weil mails ausschließlich klein geschrieben werden und somit es egal ist
    private static Pattern phonePattern = Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");

    public static void main(String[] args) {
        regexForMailAndPhone();
    }

    private static void regexForMailAndPhone() {
        // erwartet: 
        String[] emails = { "name@domain.com", "name@sub.domain.com", "name@sub.domain.travel" };

        // erwartet: +41 664 1234567 und +43 650 5401909 funktionieren -> nur Telefonnummern mit einer Vorwahl (+ oder nicht), ohne Klammern und mit optionalen Leerzeichen werden als match angesehen
        String[] phoneNumbers = { "+41 664 1234567", "0664/1234567", "+43 650 5401909", "12345678" };
 
        // schauen, ob die Mails valide oder nicht valide sind
        for (String email : emails) {
            Matcher emailMatcher = emailPattern.matcher(email);
            System.out.println();
            if (emailMatcher.matches()) {
                System.out.println(email + " ist eine valide Mail.");
            } 
            else {
                System.out.println(email + " ist keine valide Mail.");
            }
        }

        // schauen, ob die Nummern valide oder nicht valide sind
        for (String phoneNumber : phoneNumbers) {
            Matcher phoneMatcher = phonePattern.matcher(phoneNumber);
            System.out.println();
            if (phoneMatcher.matches()) {
                System.out.println(phoneNumber + " ist eine valide Nummer.");
            } 
            else {
                System.out.println(phoneNumber + " ist keine valide Nummer.");
            }
        }
    }
}
