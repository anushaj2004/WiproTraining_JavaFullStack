package Milestone2B;

import java.util.*;
class Main {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int N = sc.nextInt();
			int d = b - a;
			int e = c - b;
			int term = 0;
			int count = 3;
			int prev = c;
			while (count < N) {
			    prev += d;
			    count++;
			    if (count == N) {
			        term = prev;
			        break;
			    }
			    prev += e;
			    count++;
			    if (count == N) {
			        term = prev;
			        break;
			    }
			}
			if (N == 1) term = a;
			else if (N == 2) term = b;
			else if (N == 3) term = c;
			System.out.println(term);
		}
    }
}