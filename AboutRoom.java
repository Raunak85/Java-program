package com.Raunak;
import java.util.Scanner;
class Room{
    Scanner sc=new Scanner(System.in);
    int room_no;
    String room_type;
    int room_area;
    int Ac_machine;
    void setData()
    {
        System.out.println("Enter Room Number ");
        room_no=sc.nextInt();
        System.out.println("Enter room type");
        room_type=sc.next();
        System.out.println("Enter Room Area in square feet");
        room_area=sc.nextInt();
        System.out.println("Please enter how many Ac machine in Room");
        Ac_machine=sc.nextInt();
    }
    void display()
    {
        System.out.println("------------Room information-------------");
        System.out.println("Room Number = "+room_no);
        System.out.println("Room type = "+room_type);
        System.out.println("Room Area in square feet= "+room_area);
        System.out.println("Ac Machine = "+Ac_machine);

    }
}
public class AboutRoom {
    public static void main(String[] args) {
        Room rm=new Room();
        rm.setData();
        rm.display();
    }
}

