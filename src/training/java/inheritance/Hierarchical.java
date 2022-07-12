/*
 * package training.java.inheritance;
 * 
 * class One { public void m1() {
 * System.out.println("Parent class:from One:m1 method "); }
 * 
 * }
 * 
 * class Two extends One { public void m2() {
 * System.out.println("Intermediate class:from Two:m2 metod"); } }
 * 
 * class Three extends One { public void m3() {
 * System.out.println("Child class:from Two:m3 metod"); } }
 * 
 * class Four extends One{ public void m4() {
 * System.out.println("Child class:from Two:m4 metod"); } }
 * 
 * public class Hierarchical {
 * 
 * public static void main(String[] args) {
 * 
 * Four four=new Four(); four.m1(); four.m2(); four.m3(); four.m4();
 * 
 * 
 * Three three = new Three(); three.m1(); three.m2(); three.m3(); three.m4();
 * 
 * Two two = new Two(); two.m1(); two.m2(); two.m3(); two.m4()
 * 
 * One one = new One(); one.m1(); one.m2(); one.m3(); one.m4();
 * 
 * One one = new Three(); one.m1(); // one.m2() ; //one.m3();
 * 
 * One one1 = new Two(); one1.m1(); one1.m2(); one.m3();
 * 
 * }
 * 
 * }
 */