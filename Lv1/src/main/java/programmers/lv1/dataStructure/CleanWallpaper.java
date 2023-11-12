// 바탕화면 정리
// https://school.programmers.co.kr/learn/courses/30/lessons/161990
package programmers.lv1.dataStructure;

public class CleanWallpaper {
    public int[] cleanWallpaper(String[] wallpaper) {
        int minY = wallpaper[0].length();
        int maxY = 0;
        int minX = wallpaper.length;
        int maxX = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (minY > j) {
                        minY = j;
                    }
                    if (minX > i) {
                        minX = i;
                    }
                    if (maxY < j) {
                        maxY = j;
                    }
                    if (maxX < i) {
                        maxX = i;
                    }
                }
            }
        }

        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }
}
