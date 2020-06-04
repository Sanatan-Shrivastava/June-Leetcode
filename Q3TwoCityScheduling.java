Lets find the benefit between the costs[i][0] and costs[i][1], and
lets sort the array of benfits and reverse it, the more the profit, the better for N/2 elements, and the next N/2 will be better off with city B.


Complexity: 
1: The sorting would take O(Nlog(N)): Heap can lead to extra space, hence sorting is considered better.
# we can use max heap, where:
                                                   Node
                                                  /    \
                                                 /      \
                                                /        \
                                             Index     Profit
                                                    
                                                    OR
Greedy Approach:
"The idea of greedy algorithm is to pick the locally optimal move at each step, that will lead to the globally optimal solution."
 
 The standard solution has O(Nlog(N)) time complexity and consists of two parts:

Figure out how to sort the input data O(Nlog(N)) time. That could be done directly by a sorting or indirectly by a heap usage. 
Typically sort is better than the heap usage because of gain in space.

Parse the sorted input to have a solution O(N) time.

###Code:

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        
        Arrays.sort(costs, new Comparator<int[]>() {
      
    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[0] - o1[1] - (o2[0] - o2[1]);
      }
    });

    int sum = 0;
    int n = costs.length / 2;
    for (int i = 0; i < n; ++i) {
        sum = sum + (costs[i][0] + costs[i + n][1]);
    }
    return sum;
        
        
    }
}
