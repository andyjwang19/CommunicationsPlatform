
public class People {
    //student, instructor, ta
    private String name;
    private String type;

    private boolean helpFlag;
    private boolean completeFlag;
    //private time?? timeOfLastMessage
    public People(String name, String type){
        this.name = name;
        this.type = type;

        helpFlag = false;
        completeFlag = false;
        //timeOfLastMessage.
    }



    public String getName() { return name; }

    public String getType() { return type; }

    public boolean isCompleteFlag() { return completeFlag; }

    public boolean isHelpFlag() { return helpFlag; }

    public void setName(String name) { this.name = name; }

    public void setType(String type) { this.type = type; }

    public void setCompleteFlag(boolean completeFlag) { this.completeFlag = completeFlag; }

    public void setHelpFlag(boolean helpFlag) { this.helpFlag = helpFlag; }

}
