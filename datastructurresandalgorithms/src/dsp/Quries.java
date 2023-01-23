package dsp;

public class Quries {

}
/**
You are given an array A of size N
We define F(x) as the number of triples i,j,k such that it means the following conditions 
	1. i<j<k
	2. (Ai OR Aj OR Ak) and x= (Ai OR Aj OR Ak)
You have q quries where each query i contains one integer Queryi. The answer to the ith query is ansi=F(Queryi)MOD 10^9+7.
Find the value of ans1 XOR ans2 XOR ans3... XOR ansq where ansq where ansi denotes the answer to the ith query.

Input format:
The first line contains an intger, N, denoting the number of elements in A.
Each line i of the N subsequent lines (where 0<=i<N) contains an integer describing A[i].
The next line contains an intger, q, denoting the number of elements in Query.
Each line i of the q subsequent lines (where 0<=i<q) contains an integer describing A[i].

constraints:
1<=N<=10^5
1<=A[i]<=10^6
1<=q<=10^5
1<=Query[i]<=10^6

sample input:
3 1 3 6 2 6 7 6
sample output:
1
explanation:
N=3 A =[1,3,6] Q=2 Query =[6,7] 
there is one triplet 1,3 and 6 and OR is 7. So the answer to the firstquery is 0 since 7 AND 6!=7 and the answer to the second query is 1 since 7&7=7.
So the answer is 0 XOR 1=1



sample input:
4 1 2 4 8 2 14 15
sample output:
5
explanation:
N=4 A=[1,2,4,8] Q=2 Query=[14,15] 
There are 4 triplets Their ORs are {7,11,13,14} the answer to the first query is 1 since 14 &14=14 and the other 3 triplets dont't satisfy the given condition.
The answer to the second query is 4 since all triplets will satisfy the condition. so the answer is 1 XOR 4 =5.



sample input:
4 6 2 7 4 3 6 7 14
sample output:
4
explanation:
N=4 A=[6,2,7,4] Q=3 Query=[6,7,14]
There are 4 triplets their ORs are {7,6,7,7} The answers of the queries are 1,4,1.
So the answer is 1 XOR 4 XOR 1=4.
*/