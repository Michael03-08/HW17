import java.time.LocalDate;
import java.time.Period;

public class Wine {
   private String name;
   private String tradeMark;
   private String country;
   private LocalDate date;
   private String description;

    public Wine() {
    }

    public Wine(String name, String tradeMark, String country, LocalDate date, String description) {
        this.name = name;
        this.tradeMark = tradeMark;
        this.country = country;
        this.date = date;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void bottlingDate(LocalDate now){
        int years =  Period.between(date,now).getYears();
        int months =  Period.between(date,now).getMonths();
        int days =  Period.between(date,now).getDays();
        System.out.println("Выдержка: " + years + " лет " + months + " месяцев " + days + " дней" );
    }
}

