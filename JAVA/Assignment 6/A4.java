
// INCOMPLETE 
import java.util.*;
import java.io.*;

class item {
    String name, id;
    int qty;
    double price, total;

    item(String i, String n, String q, String p) {
        name = n;
        id = i;
        qty = Integer.parseInt(q);
        price = Double.parseDouble(p);
        total = qty * price;
    }

    public String toString() {
        String s = name + " " + id + " " + qty + " " + price + " " + total;
        return s;
    }

    public static void search(item[] arr, int n) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (int i = 0; i < n; i++) {
            if (arr[i].name.equals(s)) {
                System.out.println(arr[i].toString());
                return;
            }
        }
        System.out.println("No Records Found");
    }
}

public class A4 {
    public static void main(String[] args) throws IOException {
        String s, space = " ";
        int c, i;
        FileWriter fw = new FileWriter("item.dat");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of records : ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter Records\n <id> <name> <price> <Quantity> : ");
        for (i = 0; i < n; i++) {
            s = br.readLine();
            fw.write(s);
        }
        fw.flush();
        item[] it = new item[20];
        FileReader fr = new FileReader("item.dat");
        BufferedReader b = new BufferedReader(fr);

        for (i = 0; i < n; i++) {
            s = b.readLine();
            StringTokenizer st = new StringTokenizer(s, space);
            String si = new String(st.nextToken());
            String sn = new String(st.nextToken());
            String sq = new String(st.nextToken());
            String sp = new String(st.nextToken());
            it[i] = new item(si, sn, sq, sp);
        }
        do {
            System.out.println(
                    "Menu : \n 1: Add an item. \n 2: Search for an item. \n 3: Delete an item. \n 4: Modify details of an item. \n 5: Display all items.\n 6: Exit.");
            c = Integer.parseInt(br.readLine());
            switch (c) {
                case 1:
                    n = n + 1;
                    fw.flush();
                    System.out.println("Enter Records\n <id> <name> <price> <Quantity> : ");
                    s = br.readLine();
                    fw.write(s);
                    fw.flush();
                    s = b.readLine();
                    StringTokenizer st = new StringTokenizer(s, space);
                    String si = new String(st.nextToken());
                    String sn = new String(st.nextToken());
                    String sq = new String(st.nextToken());
                    String sp = new String(st.nextToken());
                    it[n] = new item(si, sn, sq, sp);
                    fw.flush();
                    break;
                case 2:
                    System.out.println("Enter the name of the item to be searched : ");
                    item.search(it, n);
                    break;
                case 3:
                    System.out.println("Enter the name of item to be deleted : ");
                    break;
                case 4:

                    System.out.println("Enter the name of the item to be modified");
                    break;
                case 5:
                    for (i = 0; i < n; i++)
                        System.out.println(it[i].toString());
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (c != 6);
    }
}