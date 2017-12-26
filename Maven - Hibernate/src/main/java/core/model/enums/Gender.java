package core.model.enums;

public enum Gender {
    Male(1),
    Female(2),
    Unknown(3);
    private int value;
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value= value;
    }

    Gender(int value){
        this.value=value;
    }

}
