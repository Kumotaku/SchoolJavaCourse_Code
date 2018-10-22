/**
 * 定义一个通信录类Address,它包含姓名、电话以及E-mail地址，方法有显示所有成员变量。
 * 并定义起始类，由构造方法创建3个对象，显示通信录信息。
 */
package Exercise_4_Address;

public class Main_Address {
    public static void main(String[] args){
        Address NewAddress1 = new Address("Kumotaku","177xxxx3949","taku.ookami@Oxxxx.com");
        Address NewAddress2 = new Address("Mobei","123xxxx0000","moxxxx@Oxxxx.com");
        Address NewAddress3 = new Address("XTStarry","176xxxx3806","XTStarry@Oxxxx.com");

        NewAddress1.PrintInfo();
        NewAddress2.PrintInfo();
        NewAddress3.PrintInfo();
    }
}

class Address{
    private String m_Name;
    private String m_PhoneNumber;
    private String m_Email;

    public Address(String Name, String PhoneNumber, String Email){
        m_Name = Name;
        m_PhoneNumber = PhoneNumber;
        m_Email = Email;
    }

    public void PrintInfo(){
        System.out.println("Name:\t" + m_Name);
        System.out.println("Phone:\t" + m_PhoneNumber);
        System.out.println("Email:\t" + m_Email + "\n");
    }
}