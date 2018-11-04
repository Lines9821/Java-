abstract class AllEmployee {
    private String name;
    private String ID;

    public abstract void work();

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

abstract class Develop extends AllEmployee {

}

abstract class Maintainer extends AllEmployee {

}

class JavaEE extends Develop {
    @Override
    public void work() {
        System.out.println(super.getName() + "   " + super.getID() + "  " + "JavaEE工程师  在开发淘宝");
    }
}

class Android extends Develop {
    @Override
    public void work() {
        System.out.println(super.getName() + "   " + super.getID() + "  " + "Android工程师  在研发淘宝手机客户端软件");
    }
}

class NetWork extends Maintainer {
    @Override
    public void work() {
        System.out.println(super.getName() + "   " + super.getID() + "  " + "网络工程师  在检查网络是否畅通");
    }
}

class HardTest extends Maintainer {
    @Override
    public void work() {
        System.out.println(super.getName() + "   " + super.getID() + "  " + "硬件工程师  在修复打印机");
    }
}

public class Employee {
    public static void main(String[] args) {
        JavaEE ee = new JavaEE();
        Android an = new Android();
        NetWork net = new NetWork();
        HardTest hard = new HardTest();

        ee.setName("张三");
        ee.setID("研发部001号");

        an.setName("李四");
        an.setID("研发部002号");

        net.setName("王五");
        net.setID("维护部007号");

        hard.setName("赵六");
        hard.setID("维护部008号");

/*
        System.out.println(ee.getName()+"  "+ee.getID());
        System.out.println(an.getName()+"  "+an.getID());
        System.out.println(net.getName()+"  "+net.getID());
        System.out.println(hard.getName()+"  "+hard.getID());
*/


        ee.work();
        an.work();
        net.work();
        hard.work();
    }
}