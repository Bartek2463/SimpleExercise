package exercise;

public enum Wekend {

    MONDAY("poniedziałek",false),
    TUESDAY("Wtorek",false),
    WHEDNES_DAY("Sroda",false),
    THURSDAY("Czwartek",false),
    FRIDAY("Piątek",false),
    STURDAY("Sobota",true),
    SUNDAY("Niedziela",false);

    private String polishnumer;
    private boolean holiday;

    Wekend(String polishnumer, boolean holiday) {
        this.polishnumer = polishnumer;
        this.holiday = holiday;
    }

}
