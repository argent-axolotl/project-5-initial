package com.example.sorting;

import java.util.Arrays;
import java.util.List;

public class SortingUtility
{


    public static <T extends Comparable<T>> void gnomeSort(T[] a)
    {

        // TODO implement Gnome Sort here

        int pos = 0;

        while(pos < a.length)
        {
            if(pos == 0 || a[pos].compareTo(a[pos-1]) >= 0)
            {
                pos++;
            }
            else
            {
                T temp = a[pos];
                a[pos] = a[pos - 1];
                a[pos - 1] = temp;
                pos--;
            }
        }
    }


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] A)
    {

        // TODO implement Cocktail Shaker Sort here

        boolean swapped = true;

        do
        {
            swapped = false;

            for(int i = 0; i < A.length - 1; i++)
            {
                if(A[i].compareTo(A[i + 1]) > 0)
                {
                    T temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    swapped = true;
                }
            }

            if(!swapped)
            {
                break;
            }

            swapped = false;

            for(int i = A.length - 2; i >= 0; i--)
            {
                if(A[i].compareTo(A[i + 1]) > 0)
                {
                    T temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    swapped = true;
                }
            }
        } while(swapped);
    }


    public static <T extends Comparable<T>> void shellSort(T[] data)
    {

        // TODO implement Shell Sort here

        List<Integer> gaps = Arrays.asList(701, 301, 132, 57, 23, 10, 4, 1);
        int n = data.length;

        for(int gap : gaps)
        {
            for(int i = gap; i < n; i++)
            {
                T temp = data[i];
                int j = i;

                while(j >= gap && data[j - gap].compareTo(temp) > 0)
                {
                    data[j] = data[j - gap];
                    j -= gap;
                }

                data[j] = temp;
            }
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2)
    {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





