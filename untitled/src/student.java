public class student {
    private String name = "Hoang";
    private String lop = "C06";
    public static int numberical;
    public student(){
        this.numberical++;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public void show(){
        System.out.println("Name: " +this.name +", lop: "+this.lop );
    }
}
