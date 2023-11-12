// 바탕화면 정리
// https://school.programmers.co.kr/learn/courses/30/lessons/161990
package programmers.lv1.dataStructure;

import org.junit.Assert;
import org.junit.Test;

public class CleanWallpaperTest {

    @Test
    public void cleanWallpaper() {
        CleanWallpaper cleanWallpaper = new CleanWallpaper();
        Assert.assertArrayEquals(new int[]{0, 1, 3, 4}, cleanWallpaper.cleanWallpaper(new String[]{".#...", "..#..", "...#."}));
    }
    @Test
    public void cleanWallpaper1() {
        CleanWallpaper cleanWallpaper = new CleanWallpaper();
        Assert.assertArrayEquals(new int[]{1, 3, 5, 8}, cleanWallpaper.cleanWallpaper(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."}));
    }
    @Test
    public void cleanWallpaper2() {
        CleanWallpaper cleanWallpaper = new CleanWallpaper();
        Assert.assertArrayEquals(new int[]{0, 0, 7, 9}, cleanWallpaper.cleanWallpaper(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."}));
    }
    @Test
    public void cleanWallpaper3() {
        CleanWallpaper cleanWallpaper = new CleanWallpaper();
        Assert.assertArrayEquals(new int[]{1, 0, 2, 1}, cleanWallpaper.cleanWallpaper(new String[]{"..", "#."}));
    }
}