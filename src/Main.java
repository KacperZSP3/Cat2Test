import java.time.LocalDate;

class Cat{

    private String name;
    private LocalDate birthday;
    private double weight;
    private String master;

    public Cat(String name, LocalDate birthday, double weight, String master) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String introduceMyMaster() {
        return "My master's name is: " + master.toUpperCase();
    }

}

class Date{


}

public class Main {
    public static void main(String[] args) {
        Cat pulpecik = new Cat("Pulpecik", LocalDate.of(2021, 10, 10), 3.6, "Casper");
        System.out.println("Cat's name: " + pulpecik.getName().toUpperCase() + " " + "Date of birth: " + pulpecik.getBirthday() + " " + "Cat's weigh: " + pulpecik.getWeight() + " " + "Master's name: " + pulpecik.getMaster() );
        System.out.println(pulpecik.introduceMyMaster());

        System.out.println();
        System.out.println();

        System.out.println("-----------------------------------------------------------");
        System.out.println("Current date");
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
        System.out.println();

        System.out.println("-----------------------------------------------------------");
        System.out.println("Specific date");

        LocalDate specificDate = LocalDate.of(2024, 9, 29);
        System.out.println("Specific date: " + specificDate);
        System.out.println();

        System.out.println("-----------------------------------------------------------");
        System.out.println("A date by parsing a string");

        LocalDate parsedDate = LocalDate.parse("2024-09-29");
        System.out.println("Parsed date: " + parsedDate);
        System.out.println();

        System.out.println("-----------------------------------------------------------");
        System.out.println("Extract specific parts of the date");

        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();  // returns the month as an integer
        int day = date.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println();

        System.out.println("-----------------------------------------------------------");
        System.out.println("Manipulate the date by adding or subtracting days, months, or years");

        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusDays(7);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate lastYear = today.minusYears(1);

        System.out.println("Next week: " + nextWeek);
        System.out.println("Next month: " + nextMonth);
        System.out.println("Last year: " + lastYear);
        System.out.println();

        System.out.println("-----------------------------------------------------------");
        System.out.println("Compare two LocalDate instances");

        LocalDate date1 = LocalDate.of(2023, 9, 29);
        LocalDate date2 = LocalDate.of(2024, 9, 29);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else {
            System.out.println("Both dates are the same");
        }
        System.out.println();

        System.out.println("-----------------------------------------------------------");
        System.out.println("Checking day of the week or leap year");

        LocalDate dateNew = LocalDate.of(2024, 9, 29);

        System.out.println("Day of the week: " + dateNew.getDayOfWeek());
        System.out.println("Is leap year: " + dateNew.isLeapYear());

    }
}