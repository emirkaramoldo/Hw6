package kg.geeks.hw6.templates;
public enum WeaponType {
    PHYSICAL("Physical"),
    MAGICAL("Magical"),
    PSYCHO("PSYCHO");
    private String code;

    WeaponType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
