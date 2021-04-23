import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Good> good = new ArrayList<>();
        ArrayList<Good> shoppingCart = new ArrayList<>();
        Laptop laptop1 = new Laptop("Lenovo", 250000, 10, 5, "corei5", 4, true);
        Laptop laptop2 = new Laptop("ASUS", 400000, 10, 6, "corei7", 8, true);
        Laptop laptop3 = new Laptop("Macbook", 600000, 15, 5, "corei7", 8, true);
        Tablet tablet1 = new Tablet("Samsung", 100000,20, 15, "qualcom600", 4, "1280*800");
        Tablet tablet2 = new Tablet("IPad", 200000,30, 15, "qualcom700", 4, "1024*600");
        Tablet tablet3 = new Tablet("Samsung", 150000,15, 5, "qualcom700", 4, "1280*800");
        Smartphone phone1 = new Smartphone("IPhoneX", 450000, 50, 45, "qualcom700", 4, "g2");
        Smartphone phone2 = new Smartphone("SamsungS6", 300000, 40, 16, "qualcom700", 4, "g3");
        Smartphone phone3 = new Smartphone("Redmi", 150000, 60, 30, "qualcom600", 4, "g1");
        T_shirt t_shirt1 = new T_shirt("QR", 15000, 50, 15, "xl", "black", false, true, "cotton");
        T_shirt t_shirt2 = new T_shirt("Base", 20000, 30, 10, "m", "pink", false, false, "cotton");
        T_shirt t_shirt3 = new T_shirt("Pony", 12000, 40, 15, "s", "white", true, true, "cotton");
        Sneakers sneakers1 = new Sneakers("Nike", 50000, 20, 3, "40", "white", false, true,"summer");
        Sneakers sneakers2 = new Sneakers("Adidas", 45000, 10, 3, "45", "pink", true, false,"winter");
        Sneakers sneakers3 = new Sneakers("Nike", 30000, 10, 6, "35", "white", false, false,"summer");
        good.add(laptop1);
        good.add(laptop2);
        good.add(laptop3);
        good.add(tablet1);
        good.add(tablet2);
        good.add(tablet3);
        good.add(phone1);
        good.add(phone2);
        good.add(phone3);
        good.add(t_shirt1);
        good.add(t_shirt2);
        good.add(t_shirt3);
        good.add(sneakers1);
        good.add(sneakers2);
        good.add(sneakers3);
        int x =-1;
        while(x!=0){
            System.out.println();
            System.out.println("PRESS [1] TO ENTER AS A CLIENT");
            System.out.println("PRESS [2] TO ENTER AS A ADMINISTRATOR");
            System.out.println("PRESS [0] TO EXIT");
            x=sc.nextInt();
            switch (x){
                case 1:
                    int y=-1;
                    while(y!=0){
                        System.out.println();
                        System.out.println("PRESS [1] TO VIEW ALL PRODUCTS");
                        System.out.println("PRESS [2] TO SEARCH");
                        System.out.println("PRESS [3] TO FILTER");
                        System.out.println("PRESS [4] TO BUY");
                        System.out.println("PRESS [0] TO RETURN");
                        y=sc.nextInt();
                        switch (y){
                            case 1:
                                for (int i=0;i<good.size();i++){
                                    good.get(i).showDetails();
                                }
                                System.out.println();
                                break;
                            case 2:
                                System.out.println("What do you want to find? Please, enter the model");
                                String s = sc.next();
                                for (int i=0;i<good.size();i++){
                                    if(good.get(i).getModel().equals(s))good.get(i).showDetails();
                                }
                                break;
                            case 3:
                                System.out.println("What do you want to find?");
                                System.out.println("- 1 - devices");
                                System.out.println("- 2 - clothes");
                                int n = sc.nextInt();
                                switch (n){
                                    case 1:
                                        System.out.println("By what criteria do you want to filter?");
                                        System.out.println("1)Laptop");
                                        System.out.println("2)Tablet");
                                        System.out.println("3)Smartphone");
                                        int device = sc.nextInt();
                                        if(device==1){
                                            for(int i=0;i<good.size();i++){
                                                if(good.get(i) instanceof Laptop)good.get(i).showDetails();
                                            }
                                        }
                                        else if(device==2){
                                            for(int i=0;i<good.size();i++){
                                                if(good.get(i) instanceof Tablet)good.get(i).showDetails();
                                            }
                                        }
                                        else if(device==3){
                                            for(int i=0;i<good.size();i++){
                                                if(good.get(i) instanceof Smartphone)good.get(i).showDetails();
                                            }
                                        }
                                        System.out.println();
                                        break;
                                    case 2:
                                        System.out.println("Is it for man or woman?");
                                        System.out.println("-1-man");
                                        System.out.println("-2-woman");
                                        System.out.println("");
                                        int clothes = sc.nextInt();
                                        if(clothes==1){
                                            System.out.println("Is it for kid?");
                                            System.out.println("-1-yes");
                                            System.out.println("-2-no");
                                            int l=sc.nextInt();
                                            if(l==1){
                                                System.out.println("What kind of clothes do you want to find?");
                                                System.out.println("1)T-shirt");
                                                System.out.println("2)Sneakers");
                                                int m = sc.nextInt();
                                                if(m==1){
                                                    for(int i=0;i<good.size();i++){
                                                        if(good.get(i) instanceof T_shirt && ((T_shirt) good.get(i)).isKid()==true && ((T_shirt) good.get(i)).isMan()==true)good.get(i).showDetails();
                                                    }
                                                }
                                                else{
                                                    for(int i=0;i<good.size();i++){
                                                        if(good.get(i) instanceof Sneakers && ((Sneakers) good.get(i)).isKid()==true && ((Sneakers) good.get(i)).isMan()==true)good.get(i).showDetails();
                                                    }
                                                }
                                            }
                                            else{
                                                System.out.println("What kind of clothes do you want to find?");
                                                System.out.println("1)T-shirt");
                                                System.out.println("2)Sneakers");
                                                int m = sc.nextInt();
                                                if(m==1){
                                                    for(int i=0;i<good.size();i++){
                                                        if(good.get(i) instanceof T_shirt && ((T_shirt) good.get(i)).isKid()==false && ((T_shirt) good.get(i)).isMan()==true)good.get(i).showDetails();
                                                    }
                                                }
                                                else{
                                                    for(int i=0;i<good.size();i++){
                                                        if(good.get(i) instanceof Sneakers && ((Sneakers) good.get(i)).isKid()==false && ((Sneakers) good.get(i)).isMan()==true)good.get(i).showDetails();
                                                    }
                                                }
                                            }
                                        }
                                        else if(clothes==2){
                                            System.out.println("Is it for kid?");
                                            System.out.println("-1-yes");
                                            System.out.println("-2-no");
                                            int l=sc.nextInt();
                                            if(l==1){
                                                System.out.println("What kind of clothes do you want to find?");
                                                System.out.println("1)T-shirt");
                                                System.out.println("2)Sneakers");
                                                int m = sc.nextInt();
                                                if(m==1){
                                                    for(int i=0;i<good.size();i++){
                                                        if(good.get(i) instanceof T_shirt && ((T_shirt) good.get(i)).isKid()==true && ((T_shirt) good.get(i)).isMan()==false)good.get(i).showDetails();
                                                    }
                                                }
                                                else{
                                                    for(int i=0;i<good.size();i++){
                                                        if(good.get(i) instanceof Sneakers && ((Sneakers) good.get(i)).isKid()==true && ((Sneakers) good.get(i)).isMan()==false)good.get(i).showDetails();
                                                    }
                                                }
                                            }
                                            else{
                                                System.out.println("What kind of clothes do you want to find?");
                                                System.out.println("1)T-shirt");
                                                System.out.println("2)Sneakers");
                                                int m = sc.nextInt();
                                                if(m==1){
                                                    for(int i=0;i<good.size();i++){
                                                        if(good.get(i) instanceof T_shirt && ((T_shirt) good.get(i)).isKid()==false && ((T_shirt) good.get(i)).isMan()==false)good.get(i).showDetails();
                                                    }
                                                }
                                                else{
                                                    for(int i=0;i<good.size();i++){
                                                        if(good.get(i) instanceof Sneakers && ((Sneakers) good.get(i)).isKid()==false && ((Sneakers) good.get(i)).isMan()==false)good.get(i).showDetails();
                                                    }
                                                }
                                            }
                                        }
                                        System.out.println();
                                        break;
                                }
                                break;
                            case 4:
                                for (int i=0;i<good.size();i++){
                                    System.out.print((i+1)+" ");
                                    good.get(i).showDetails();
                                }
                                System.out.println();
                                int a = -1;
                                while (a!=0){
                                    System.out.println("PRESS [1] TO ADD TO THE SHOPPING CART");
                                    System.out.println("PRESS [0] TO BUY");
                                    a = sc.nextInt();
                                    if(a==1){
                                        System.out.print("Pleass, enter the index of the product: ");
                                        int index = sc.nextInt();
                                        shoppingCart.add(good.get(index-1));
                                    }
                                }
                                System.out.println();
                                System.out.println("--------------------------------");
                                int total = 0;
                                for(int i=0;i<shoppingCart.size();i++){
                                    System.out.print((i+1)+")"+" ");
                                    shoppingCart.get(i).showDetails();
                                    total+=shoppingCart.get(i).getPrice();
                                }
                                System.out.println("---------------------------------");
                                System.out.println("Total: "+total+"KZT");
                                System.out.println();
                                break;
                        }
                    }
                    break;
                case 2:
                    int z = -1;
                    while(z!=0){
                        System.out.println();
                        System.out.println("PRESS [1] TO VIEW ALL PRODUCTS");
                        System.out.println("PRESS [2] TO ADD NEW PRODUCT");
                        System.out.println("PRESS [3] TO DELETE PRODUCT");
                        System.out.println("PRESS [4] TO SHOW INCOME REPORT");
                        System.out.println("PRESS [0] TO RETURN");
                        z = sc.nextInt();
                        switch (z){
                            case 1:
                                for (int i=0;i<good.size();i++){
                                    good.get(i).showDetails();
                                }
                                System.out.println();
                                break;
                            case 2:
                                int c = -1;
                                while (c!=0){
                                    System.out.println("What do you want to add?");
                                    System.out.println("-1-Devices");
                                    System.out.println("-2-Clothes");
                                    System.out.println("PRESS[0] TO STOP ADDING");
                                    c = sc.nextInt();
                                    switch (c){
                                        case 1:
                                            System.out.println("What kind of devices?");
                                            System.out.println("-1-Laptop");
                                            System.out.println("-2-Tablet");
                                            System.out.println("-3-Smartphone");
                                            int b = sc.nextInt();
                                            String model ="";
                                            int price;
                                            int count;
                                            int sold;
                                            String cpu="";
                                            int ram;
                                            String resolution="";
                                            boolean ssd;
                                            String generation="";
                                            if(b==1){
                                                System.out.print("Enter the model:");
                                                model= sc.next();
                                                System.out.print("Enter the price:");
                                                price=sc.nextInt();
                                                System.out.print("Enter the count:");
                                                count=sc.nextInt();
                                                System.out.print("Enter the sold:");
                                                sold=sc.nextInt();
                                                System.out.print("Enter the CPU:");
                                                cpu=sc.next();
                                                System.out.print("Enter the RAM:");
                                                ram=sc.nextInt();
                                                System.out.print("Enter the SSD:");
                                                ssd=sc.nextBoolean();
                                                Laptop newLaptop = new Laptop(model, price, count, sold, cpu, ram, ssd);
                                                good.add(newLaptop);
                                                System.out.println("You successfully add new laptop!");
                                                System.out.println();
                                            }
                                            if(b==2){
                                                System.out.print("Enter the model:");
                                                model= sc.next();
                                                System.out.print("Enter the price:");
                                                price=sc.nextInt();
                                                System.out.print("Enter the count:");
                                                count=sc.nextInt();
                                                System.out.print("Enter the sold:");
                                                sold=sc.nextInt();
                                                System.out.print("Enter the CPU:");
                                                cpu=sc.next();
                                                System.out.print("Enter the RAM:");
                                                ram=sc.nextInt();
                                                System.out.print("Enter the resolution:");
                                                resolution= sc.next();
                                                Tablet newTablet = new Tablet(model, price, count, sold, cpu, ram, resolution);
                                                good.add(newTablet);
                                                System.out.println("You successfully add new tablet!");
                                                System.out.println();
                                            }
                                            if(b==3){
                                                System.out.print("Enter the model:");
                                                model= sc.next();
                                                System.out.print("Enter the price:");
                                                price=sc.nextInt();
                                                System.out.print("Enter the count:");
                                                count=sc.nextInt();
                                                System.out.print("Enter the sold:");
                                                sold=sc.nextInt();
                                                System.out.print("Enter the CPU:");
                                                cpu=sc.next();
                                                System.out.print("Enter the RAM:");
                                                ram=sc.nextInt();
                                                System.out.print("Enter the generation:");
                                                generation= sc.next();
                                                Smartphone newPhone = new Smartphone(model, price, count, sold, cpu, ram, generation);
                                                good.add(newPhone);
                                                System.out.println("You successfully add new smartphone!");
                                                System.out.println();
                                            }
                                            break;
                                        case 2:
                                            System.out.println("What kind of clothes?");
                                            System.out.println("-1-T-shirt");
                                            System.out.println("-2-Sneakers");
                                            int d = sc.nextInt();
                                            String size="";
                                            String color="";
                                            boolean isKid;
                                            boolean isMan;
                                            String material="";
                                            String season="";
                                            if(d==1){
                                                System.out.print("Enter the model:");
                                                model= sc.next();
                                                System.out.print("Enter the price:");
                                                price=sc.nextInt();
                                                System.out.print("Enter the count:");
                                                count=sc.nextInt();
                                                System.out.print("Enter the sold:");
                                                sold=sc.nextInt();
                                                System.out.print("Enter the size:");
                                                size=sc.next();
                                                System.out.print("Enter the color:");
                                                color=sc.next();
                                                System.out.print("Is it for kids? ");
                                                isKid=sc.nextBoolean();
                                                System.out.print("Is it for men? ");
                                                isMan=sc.nextBoolean();
                                                System.out.print("Enter the material:");
                                                material=sc.next();
                                                T_shirt t_shirt = new T_shirt(model, price, count, sold, size, color, isKid, isMan, material);
                                                good.add(t_shirt);
                                                System.out.println("You successfully add new t-shirt!");
                                                System.out.println();
                                            }
                                            if(d==2){
                                                System.out.print("Enter the model:");
                                                model= sc.next();
                                                System.out.print("Enter the price:");
                                                price=sc.nextInt();
                                                System.out.print("Enter the count:");
                                                count=sc.nextInt();
                                                System.out.print("Enter the sold:");
                                                sold=sc.nextInt();
                                                System.out.print("Enter the size:");
                                                size=sc.next();
                                                System.out.print("Enter the color:");
                                                color=sc.next();
                                                System.out.print("Is it for kids? ");
                                                isKid=sc.nextBoolean();
                                                System.out.print("Is it for men? ");
                                                isMan=sc.nextBoolean();
                                                System.out.print("Enter the season:");
                                                season=sc.next();
                                                Sneakers sneakers = new Sneakers(model, price, count, sold, size, color, isKid, isMan, season);
                                                good.add(sneakers);
                                                System.out.println("You successfully add new sneakers!");
                                                System.out.println();
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                for (int i=0;i<good.size();i++){
                                    System.out.print((i+1)+" ");
                                    good.get(i).showDetails();
                                }
                                System.out.println();
                                System.out.print("Please, enter the index of product you want to delete");
                                int delete = sc.nextInt();
                                good.remove(delete-1);
                                System.out.println("You successfully delete the product!");
                                break;
                            case 4:
                                int income=0;
                                for (int i=0;i<good.size();i++){
                                    income+=good.get(i).getPrice()*good.get(i).getSold();
                                }
                                System.out.println("INCOME = "+income+"KZT");
                                System.out.println();
                                break;
                        }
                    }
                    break;
            }
        }
    }
}
