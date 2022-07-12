/*
 * package training.java.inheritance;
 * 
 * class One {
 * 
 * One() { System.out.println("default constructor from One"); }
 * 
 * public void m1() { System.out.println("Parent class:from One:m1 method"); }
 * 
 * }
 * 
 * class Two extends One { Two() {
 * System.out.println("default constructor from Two"); }
 * 
 * public void m2() {
 * System.out.println("Intermediate class:from Two:m2 metod"); } }
 * 
 * class Three extends Two {
 * 
 * Three() { System.out.println("default constructor from Three"); }
 * 
 * public void m1() { System.out.println("Parent class:from One:m1 method"); }
 * 
 * public void m3() { System.out.println("Child class:from Three:m3 metod"); }
 * 
 * }
 * 
 * public class MultiLevelDemo {
 * 
 * public static void main(String[] args) {
 * 
 * Three three = new Three(); three.m1(); three.m2(); three.m3();
 * 
 * Two two = new Two(); two.m1(); two.m2(); two.m3();
 * 
 * One one = new One(); one.m1(); one.m2(); one.m3();
 * 
 * Two two = new Three(); two.m1(); two.m2(); two.m3();
 * 
 * One one = new Three(); one.m1(); one.m2(); one.m3();
 * 
 * }
 * 
 * }
 */