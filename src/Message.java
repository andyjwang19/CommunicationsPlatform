public class Message {
    private String name;
    private String message;
    private String timeStamp;
    public Message(String n, String m, String tS){
        name = n;
        message = m;
        timeStamp = tS;
    }
    public String getMessageText(){
        return name +": " + message;
    }

    public String getTimeStamp(){
        return timeStamp;
    }
}
