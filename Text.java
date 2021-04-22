import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//class Person {
//    String name = "no name";
//    public Person(String nm) {
//        name = nm;
//    }
//}
//class Employee extends Person {
//    String empID = "0000";
//    public Employee(String id) {
//        empID = id;
//    }
//}
//class Rectangle {
//    double len;
//    double wide;
//
//    public double S() {
//        return len * wide;
//    }
//}
class Student {
    public int num;
    public String name;
    public String sex;
    public String major;

    public Student(int num, String name, String sex, String major) {
        this.num = num;
        this.name = name;
        this.sex = sex;
        this.major = major;
    }
}
public class Text {


    //二叉树的最小深度
//    public int minDepth(TreeNode root) {
//        if(root == null) return 0;
//        if(root.left == null && root.right != null) {
//            return minDepth(root.right)  + 1;
//        }
//        if(root.right == null && root.left != null) {
//            return minDepth(root.left) + 1;
//        }
//        return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
//    }

//    public int add(int a,int b) {
//        try {
//            return a + b;
//        } catch(Exception e) {
//            System.out.println("catch语句块");
//        } finally {
//            System.out.println("finally语句块");
//        }
//        return 0;
//    }
    //整数转罗马数字
//    public String intToRoman(int num) {
//        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
//        String[] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//        int index = 0;
//        StringBuilder sb = new StringBuilder();
//        while(index < 13) {
//            while(num >= nums[index]) {
//                sb.append(str[index]);
//                num -= nums[index];
//            }
//            index++;
//        }
//        return sb.toString();
//    }
    //验证回文串
//    public boolean isPalindrome(String s) {
//        int n = s.length();
//        if(n == 0) return true;
//        s = s.toLowerCase();
//        StringBuilder sb  = new StringBuilder();
//        for(int i = 0; i < n; i++) {
//            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
//                sb.append(s.charAt(i));
//            }
//        }
//        char[] ch = sb.toString().toCharArray();
//        int l = 0,r = ch.length - 1;
//        while(l <= r) {
//            if(ch[l] != ch[r]) {
//                return false;
//            }
//            l++;
//            r--;
//        }
//        return true;
//    }

    //删数
//    public static int getSub(int[] arr) {
//        List<Integer> list = new ArrayList<>();
//        for(int x : arr) {
//            list.add(x);
//        }
//        int index = 0;
//        while(list.size() > 1) {
//            int n = list.size();
//            index = (index + 2) % n;
//            list.remove(index);
//        }
//        return list.get(0);
//    }
//    public static void fun(StringBuffer x,StringBuffer y) {
//        x.append(y);y = x;
//    }
    public static void main(String[] args) {
//        Rectangle r = new Rectangle();
//        r.len = 10;
//        r.wide = 20;
//        System.out.println(r.S());
//        int a=15,b=10;
//        float c=(float)a/b;
//        System.out.println(c);
//        string[,] strArray=new string[3,4];
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int f1 = 0;
//        int f2 = 1;
//        int f3 = 0;
//        while(f3 < n) {
//            f3 = f1 + f2;
//            f1 = f2;
//            f2 = f3;
//        }
//        int min = Math.min(Math.abs(f1 - n),Math.abs(f2 - n));
//        System.out.println(min);
//        StringBuffer a = new StringBuffer("A");
//        StringBuffer b = new StringBuffer("B");
//        fun(a,b);
//        System.out.println(a + " " + b);

//        byte b1 = 1,b2 = 2,b3,b6;
//        final byte b4 = 4,b5 = 6;
//        b6 = b4 + b5;
//        b3 = (byte) (b1 + b2);
//        Text t = new Text();
//        System.out.println(t.add(9,43));
//        String s = "skamclkasm";
//        s.toUpperCase();
//        System.out.println(s);
//
//
//        int a = 123;
//        String str = Integer.toString(a);
//        System.out.println(str);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long sum = 1;
//        for (int i = 1; i <= n; i++) {
//            sum *= i;
//        }
//        int count = 0;
//        while(sum != 0) {
//            if(sum % 10 == 0) {
//                count++;
//            } else {
//                break;
//            }
//            sum /= 10;
//        }
//        System.out.println(count);
    }
}
