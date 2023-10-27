// 공원 산책
// https://school.programmers.co.kr/learn/courses/30/lessons/172928
package programmers.lv1.dataStructure;

import java.util.StringTokenizer;

public class ParkWalk {
    /** Find last position.
     * Park is 2D array of parkMap. S is start, O is accessible, X is not accessible.
     * 3<= park.lenght, park[i].length <= 50
     * Routes are ways you move.
     * 1 <= routes.length <= 50
     * If x is in the way or out of park map. Ignore that route.
     **/
    public int[] parkWalk(String[] park, String[] routes){
        // Preprocess to make 2d array.
        String[][] park2D = new String[park.length][park[0].length()];
        for(int i = 0; i < park2D.length; i++){
            for(int j = 0; j < park2D[i].length; j++){
                park2D[i][j] = String.valueOf(park[i].charAt(j));
            }
        }

        for(String route : routes){
            StringTokenizer words = new StringTokenizer(route);
            String direction = words.nextToken();
            int distance = Integer.parseInt(words.nextToken());
            switch (direction){
                case "E": east(park2D, distance);break;
                case "W": west(park2D, distance);break;
                case "N": north(park2D, distance);break;
                case "S": south(park2D, distance);break;
            }
        }

        return findS(park2D);
    }
    public void east(String[][] map, int n){
        int[] pos = findS(map);
        int x = pos[0];
        int y = pos[1];

        //If not out of range. Command executed.
        try{
            for(int i = 0; i <= n; i++){
                if(map[x][y+i].equals("X")){
                    return;
                }
            }
            map[x][y+n] = "S";
            map[x][y] = "O";
        } // Out of range it ignored.
        catch (Exception ignored){

        }
    }
    public void south(String[][] map, int n){
        int[] pos = findS(map);
        int x = pos[0];
        int y = pos[1];

        try{
            for(int i = 0; i <= n; i++){
                if(map[x+i][y].equals("X")){
                    return;
                }
            }
            map[x+n][y] = "S";
            map[x][y] = "O";
        }
        catch (Exception ignored){

        }
    }
    public void north(String[][] map, int n){
        int[] pos = findS(map);
        int x = pos[0];
        int y = pos[1];

        try{
            for(int i = 0; i <= n; i++){
                if(map[x-i][y].equals("X")){
                    return;
                }
            }
            map[x-n][y] = "S";
            map[x][y] = "O";
        }
        catch (Exception ignored){

        }
    }
    public void west(String[][] map, int n){
        int[] pos = findS(map);
        int x = pos[0];
        int y = pos[1];

        try{
            for(int i = 0; i <= n; i++){
                if(map[x][y-i].equals("X")){
                    return;
                }
            }
            map[x][y-n] = "S";
            map[x][y] = "O";
        }
        catch (Exception ignored){

        }
    }
    public int[] findS(String[][] map){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if(map[i][j].equals("S")){
                    return new int[]{i, j};
                }
            }
        }
        // If "S" is not in map.
        return new int[] {-1, -1};
    }
}
