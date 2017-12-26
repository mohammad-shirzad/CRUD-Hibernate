package core.model.enums;

public enum JobStatus {
    Working(1),
    Retired(2),
    Unemployed(3),
    Unknown(4);
    private int value;
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value= value;
    }

    JobStatus(int value){
        this.value=value;
    }
}
