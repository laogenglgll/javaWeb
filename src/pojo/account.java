package pojo;

// 对应jdbc_sy4 的查询集合。
public class account {
    //对应数据库的列
    private String name;
    private int serial_number;
    private  int id;

    // 设置private变量
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "account{" +
                "name='" + name + '\'' +
                ", serial_number=" + serial_number +
                ", id=" + id +
                '}';
    }
}
