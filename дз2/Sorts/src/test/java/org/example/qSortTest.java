package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class qSortTest {

    @Test
    public void qSortTest1() { //Случайный Массив
        int[] a = new int[]{4, 6, 1, 2, 6, 0, 432};
        int[] res = new int[]{0, 1, 2, 4, 6, 6, 432};
        qSort qSort = new qSort();
        Assert.assertArrayEquals(res, qSort.qSort(a));
    }
    @Test
    public void qSortTest2() {//Отсортированный  Массив
        int[] a = new int[]{0, 1, 2, 4, 6, 6, 432};
        int[] res = new int[]{0, 1, 2, 4, 6, 6, 432};
        qSort qSort = new qSort();
        Assert.assertArrayEquals(res, qSort.qSort(a));
    }
    @Test
    public void qSortTest3() {//Обратыный Массив
        int[] a = new int[]{432, 6, 6, 4, 2, 1, 0};
        int[] res = new int[]{0, 1, 2, 4, 6, 6, 432};
        qSort qSort = new qSort();
        Assert.assertArrayEquals(res, qSort.qSort(a));
    }
//    @Test
//    public void qSortTest4() {//Тест который не пройдёт
//        int[] a = new int[]{4, 6, 1, 2, 6, 0, 432};
//        int[] res = new int[]{0, 1, 4, 2, 6, 6, 432};
//        qSort qSort = new qSort();
//        Assert.assertArrayEquals(res, qSort.qSort(a));
//    }
}