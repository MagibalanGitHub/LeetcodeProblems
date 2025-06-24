class Solution {
    public int largestInteger(int num) {
        List<Integer> digits = new ArrayList<>();
        int temp = num;

    
        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }
      
        Collections.reverse(digits);

      
        PriorityQueue<Integer> evenPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> oddPQ = new PriorityQueue<>(Collections.reverseOrder());

        for (int digit : digits) {
            if (digit % 2 == 0) evenPQ.add(digit);
            else oddPQ.add(digit);
        }

        int result = 0;
        for (int digit : digits) {
            result *= 10;
            if (digit % 2 == 0) {
                result += evenPQ.poll(); 
            } else {
                result += oddPQ.poll(); 
            }
        }

        return result;
    }
}