package Access_modifier;

public class XayDungLopTrongJava {
    private String name = "john";
    private String classes = "C02";

    public XayDungLopTrongJava() {
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        XayDungLopTrongJava x = new XayDungLopTrongJava();
        x.setClasses("Tandeptrai");
        x.setName("Tan");
        System.out.println("Name : "+x.getName()+" Class :"+x.getClasses());
    }
}
