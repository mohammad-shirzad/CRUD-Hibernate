package core.model.enums;

public enum Grade {
    Doctoral(1),
    Mater_Of_Science(2),
    Bachelor_Of_Science(3),
    Associate_Degree(4),
    Diploma(5),
    Not_Educated(6);
    private int value;
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value= value;
    }

    Grade(int value){
        this.value=value;
    }
}
