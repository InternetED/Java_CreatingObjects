/**
 * @date: 2020/3/28 : 下午 07:35
 * @author: Ed
 * @email: salahayo3192@gmail.com
 **/
public class Main {
    public static void main(String[] args) {
        // 首次加載時，會經歷類加載
        Child child = new Child();
        System.out.println("----------\n");
        // 只走構造函數的部分
        Child child2 = new Child();

    }
}


class Father {
    static String fatherString = getFatherString();// 1 執行 getFatherString()

    static {
        System.out.println("Father static initial method execution");// 2
    }

    public Father() {
        System.out.println("Father constructor method execution");// 5
    }


    private static String getFatherString() {
        System.out.println("Assignment fatherString(static variable)");
        return "Father";
    }
}

class Child extends Father {
    static String childString = getChildString();// 3 執行 getChildString()

    static {
        System.out.println("Child static initial method execution");// 4
    }

    private String name = getName();// 6 執行 getName()

    public Child() {
        System.out.println("Child constructor method execution");// 7
    }

    private static String getChildString() {
        System.out.println("Assignment childString(static variable)");
        return "Child";
    }

    private String getName(){
        System.out.println("Assignment name(member variable)");
        return "Baby";
    }

}