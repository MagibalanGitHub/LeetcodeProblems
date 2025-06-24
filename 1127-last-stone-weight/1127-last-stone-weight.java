class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            int sum=a-b;
            if(sum!=0){
                pq.add(sum);
            }
        }
        if(pq.size()==0){
            return 0;
        }
        return pq.poll();
    }
}