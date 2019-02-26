package ua.lviv.iot;

public class Message {
    public String textOfMessage;
    public String author;
    private double amountOfText;
    private double messageWeight;
    protected double timeOfSending;
    protected boolean factOfDelivery;
    private static double dateOfSending;

    public Message() {
    }

    public Message(String textOfMessage, String author, double amountOfText, double messageWeight) {
        this();
        this.textOfMessage = textOfMessage;
        this.author = author;
        this.amountOfText = amountOfText;
        this.messageWeight = messageWeight;
    }

    public Message(String textOfMessage, String author, double amountOfText, double messageWeight, double timeOfSending, boolean factOfDelivery) {
        this(textOfMessage, author, amountOfText, messageWeight);
        this.timeOfSending = timeOfSending;
        this.factOfDelivery = factOfDelivery;
    }

    public String toString() {
        return "Message{" +
                "textOfMessage='" + textOfMessage + '\'' +
                ", author='" + author + '\'' +
                ", amountOfText=" + amountOfText +
                ", messageWeight=" + messageWeight +
                ", timeOfSending=" + timeOfSending +
                ", factOfDelivery=" + factOfDelivery +
                '}';
    }

    public void resetValues(String textOfMessage, String author, double amountOfText, double messageWeight, double timeOfSending, boolean factOfDelivery) {
        this.textOfMessage = textOfMessage;
        this.author = author;
        this.amountOfText = amountOfText;
        this.messageWeight = messageWeight;
        this.timeOfSending = timeOfSending;
        this.factOfDelivery = factOfDelivery;
    }

    public static double printStaticDateOfSending(){
        return dateOfSending;
    }

    public double printDateOfSending(){
        return dateOfSending;
    }

    public String getTextOfMessage() {
        return textOfMessage;
    }

    public void setTextOfMessage(String textOfMessage) {
        this.textOfMessage = textOfMessage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getAmountOfText() {
        return amountOfText;
    }

    public void setAmountOfText(double amountOfText) {
        this.amountOfText = amountOfText;
    }

    public double getMessageWeight() {
        return messageWeight;
    }

    public void setMessageWeight(double messageWeight) {
        this.messageWeight = messageWeight;
    }

    public double getTimeOfSending() {
        return timeOfSending;
    }

    public void setTimeOfSending(double timeOfSending) {
        this.timeOfSending = timeOfSending;
    }

    public boolean isFactOfDelivery() {
        return factOfDelivery;
    }

    public void setFactOfDelivery(boolean factOfDelivery) {
        this.factOfDelivery = factOfDelivery;
    }

    public static double getDateOfSending() {
        return dateOfSending;
    }

    public static void setDateOfSending(double dateOfSending) {
        Message.dateOfSending = dateOfSending;
    }
}
