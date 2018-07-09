package chapter1.two;

import java.util.Arrays;
import java.util.Comparator;

import edu.princeton.cs.algs4.Date;

public class Transaction implements Comparable<Transaction>{
	private final String who;
	private final Date when;
	private final double amount;
	
	public Transaction(String who, Date when, double amount) {
		this.who = who;
		this.when = when;
		this.amount = amount;
	}
	
	public Transaction(String transaction) {
		String[] a = transaction.split("\\s+");
		who = a[0];
		when = new Date(a[1]);
		amount = Double.parseDouble(a[2]);
	}
	
	public String who() {return who;}
	public Date when() {return when;}
	public double amount() {return amount;}
	
	public String toString() {
		return String.format("%-10s %10s %8.2f", who, when, amount);
	}
	
	public int compareTo(Transaction o) {
		return this.amount > o.amount ? 1 
				: this.amount == o.amount ? 0 : -1;		
	}
	
	public boolean equals(Object o) {
		if (o instanceof Transaction) {
			Transaction oTemp = (Transaction) o;
			return this.amount == oTemp.amount && this.when == oTemp.when
									&& this.who == oTemp.who;
		}
		return false;
	}
	
	public int hashCode() {
		int hash = 17;
		hash = 31*hash + who.hashCode();
		hash = 31*hash + when.hashCode();
		hash = 31*hash + ((Double) amount).hashCode();
		return hash;
	}
	
	public static class WhoOrder implements Comparator<Transaction>{
		public int compare(Transaction v, Transaction w) {
			return v.who.compareTo(w.who);
		}
	}
	
	static Comparator<Transaction> WhenOrder = (o1, o2) -> o1.when.compareTo(o2.when);
	static Comparator<Transaction> HowMuchOrder = (o1, o2) -> o1.amount > o2.amount ? 1 : -1;
	
	public static void main(String[] args) {
		Transaction[] a = new Transaction[4];
		a[0] = new Transaction("Turing   6/17/1990  644.08");
        a[1] = new Transaction("Tarjan   3/26/2002 4121.85");
        a[2] = new Transaction("Knuth    6/14/1999  288.34");
        a[3] = new Transaction("Dijkstra 8/22/2007 2678.40");
        
        System.out.println("unsorted:");
        System.out.println(Arrays.toString(a));
        
        System.out.println("sort by amount:");
        Arrays.sort(a, HowMuchOrder);
        System.out.println(Arrays.toString(a));
	}
	
}
