**Boundary Travsersal of Binary Tree**


You are given a binary tree having 'n' nodes.



The boundary nodes of a binary tree include the nodes from the left and right boundaries and the leaf nodes, each node considered once.



Figure out the boundary nodes of this binary tree in an Anti-Clockwise direction starting from the root node.


Example :

Input: Consider the binary tree A as shown in the figure:

Output: [10, 5, 3, 7, 18, 25, 20]

Explanation: As shown in the figure

The nodes on the left boundary are [10, 5, 3]

The nodes on the right boundary are [10, 20, 25]

The leaf nodes are [3, 7, 18, 25].

Please note that nodes 3 and 25 appear in two places but are considered once.
 
Sample Input 1:

10 5 20 3 8 18 25 -1 -1 7 -1 -1 -1 -1 -1 -1 -1

Sample Output 1:

10 5 3 7 18 25 20

Explanation of Sample Input 1:

The nodes on the left boundary are [10, 5, 3]

The nodes on the right boundary are [10, 20, 25]

The leaf nodes are [3, 7, 18, 25].

Please note that nodes 3 and 25 appear in two places but are considered once.


Sample Input 2:

100 50 150 25 75 140 200 -1 30 70 80 -1 -1 -1 -1 -1 35 -1 -1 -1 -1 -1 -1

Sample Output 2:

100 50 25 30 35 70 80 140 200 150
