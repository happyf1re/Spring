package homework2;

public enum SicknessType {
    Cold(1, "Cold"),
    Stomachache(2, "Stomachache");


    private final int id;
    private final String name;

    SicknessType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

}
