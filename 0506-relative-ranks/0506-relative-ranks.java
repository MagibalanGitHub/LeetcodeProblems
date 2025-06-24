class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<Integer>list=new ArrayList<>();
        for(int i:score){
            list.add(i);
        }
        Collections.sort(list,Collections.reverseOrder());
        Map<Integer,String>map=new HashMap<>();
        String arr[]=new String[score.length];
        for(int i=0; i<list.size();i++){
            if(i==0){
                map.put(list.get(0),"Gold Medal");
            }
            else if(i==1){
                map.put(list.get(1),"Silver Medal");
            }
            else if(i==2){
                map.put(list.get(2),"Bronze Medal");
            }
            else{
               map.put(list.get(i),(i+1)+"");
            }
        }
        for(int i=0;i<score.length;i++){
            arr[i]=map.get(score[i]);
        }
        return arr;
    }
}