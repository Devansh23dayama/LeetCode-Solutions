class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int x = map.get(arr[i]) + 1;
                map.put(arr[i], x);
            }
        }
        int[] mapfreq = new int[map.size()];

        int index = 0;

        for (int freq : map.values()) {
            mapfreq[index++] = freq;

        }
        Arrays.sort(mapfreq);
int removed=0;
int count=0;
int halfsize= arr.length/2;
for(int i=mapfreq.length-1;i>=0;i--){
    removed+=mapfreq[i];
    count++;
    if(removed>=halfsize){
        break;
    }
}
return count;
    }
}