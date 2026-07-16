class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = grid.length;
        int maxNo = n*n;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(map.containsKey(grid[i][j])){
                    map.put(grid[i][j] , map.get(grid[i][j]) + 1);
                }
                else{
                    map.put(grid[i][j] , 1);
                }
            }
        }

        int rept = -1;
        int miss = -1;

        for(int k=1; k<=maxNo; k++){
            if(!map.containsKey(k)){
                miss = k;
            }
            else if(map.get(k) >= 2){
                rept = k;
            }
        }

        return new int[] {rept, miss};
    }
}