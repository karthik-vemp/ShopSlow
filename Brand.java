public class Brand {
    // instance variables
    private String name;
    private int price;
    private String atr1;
    private String atr2;
    private String atr3;
    private String people;
    private int num;

    // constructor
    public Brand(String name, int price, String atr1, String atr2, String atr3, String people) {
        this.name = name;
        this.price = price;
        this.atr1 = atr1;
        this.atr2 = atr2;
        this.atr3 = atr3;
        this.people = people;
        num = 0;
    }
    public Brand() {
        name = "";
        price = 0;
    }
    
    // other methods
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    public boolean genderMatch(String gender) {
            if(people.contains(gender)) {
                return true;
            }
            return false;
    }
    public int atrMatch(String a1, String a2, String a3, String a4, String a5) {
        int numCommon = 0;
        if(atr1.equals(a1)) {
            numCommon++;
        } else if(atr1.equals(a2)) {
            numCommon++;
        } else if(atr1.equals(a3)) {
            numCommon++;
        } else if(atr1.equals(a4)) {
            numCommon++;
        } else if(atr1.equals(a5)) {
            numCommon++;
        }

        if(atr2.equals(a1)) {
            numCommon++;
        } else if(atr2.equals(a2)) {
            numCommon++;
        } else if(atr2.equals(a3)) {
            numCommon++;
        } else if(atr2.equals(a4)) {
            numCommon++;
        } else if(atr2.equals(a5)) {
            numCommon++;
        }

        if(atr3.equals(a1)) {
            numCommon++;
        } else if(atr3.equals(a2)) {
            numCommon++;
        } else if(atr3.equals(a3)) {
            numCommon++;
        } else if(atr3.equals(a4)) {
            numCommon++;
        } else if(atr3.equals(a5)) {
            numCommon++;
        }
        return numCommon;
    }
}
