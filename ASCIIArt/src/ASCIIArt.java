/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main (String [] args) {
		snowMan();
	}
	public static void snowMan() {
		myHat();
		ballThree();
		ballTwo();
		ballOne();
		System.out.print("This is a spaced-out snowman ^_^");
		
	}
	public static void ballOne() {
		System.out.println("     ____________  ");
		System.out.println("    /            \\");
		System.out.println("   /              \\");
		System.out.println("  /                \\ ");
		System.out.println(" |                  | ");
		System.out.println(" |        {O}       | ");
		System.out.println(" |                  |");
		System.out.println("  \\                /");
		System.out.println("   \\              /");
		System.out.println("    \\            /");
		System.out.println("     ^^^^^^^^^^^^");
	}
	public static void ballTwo() {
		System.out.println("\t________   ");
		System.out.println("       /        \\");
		System.out.println("      /          \\");
		System.out.println("     |            |");
		System.out.println("     |    {O}     |");
		System.out.println("      \\          /");
		System.out.println("       \\        /");
		System.out.println("        ^^^^^^^^");
	}
	public static void ballThree() {
		System.out.println("         ______    ");
		System.out.println("        /      \\");
		System.out.println("       |  0  0  |");
		System.out.println("        \\ ---- /");
		System.out.println("         ^^^^^^");
	}
	public static void myHat() {
		System.out.println("          ____");
		System.out.println("         |    |");
		System.out.println("         |    |");
		System.out.println("         |    |");
		System.out.println("        ^^^^^^^^");
	}
}