package core.model.enums;

public enum EducationStatus {
    Studying(1),
    Graduated(2);
    private int value;
    public int getValue() {
        return value;
    }

    public void setvaluealue(int value) {
        this.value= value;
    }

    EducationStatus(int value){
        this.value=value;
    }
}
