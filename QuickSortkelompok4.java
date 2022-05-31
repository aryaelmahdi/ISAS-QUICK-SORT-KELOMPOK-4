import java.util.Scanner;

public class QuickSortkelompok4 {
    public static int arrayPartition(int[] score, int start, int end) 
        {
            int pivot = score[end];
            int i = (start - 1);
            for (int ele = start; ele < end; ele++) 
            {
                if (score[ele] < pivot)
                {
                    i++;
                int swap = score[i];
                score[i] = score[ele];
                score[ele] = swap;
                }
            }
    // Swapping the elements
            int swap = score[i + 1];
            score[i + 1] = score[end];
            score[end] = swap;
            return i + 1;
        }
        public static void quickSortAlgo(int[] arrayTobeSorted, int start, int end) 
            {
                if (start < end) 
                {
                int pivot = arrayPartition(arrayTobeSorted, start, end);
                quickSortAlgo(arrayTobeSorted, start, pivot - 1);
                quickSortAlgo(arrayTobeSorted, pivot + 1, end);
                }
            }
        public static void main(String[] args)
        {
            int score[] = new int[5];
            try (Scanner allArray = new Scanner(System.in)) {
                //int[] score = { 50,70,40,60,100 };
                   {
                    System.out.println("Welcome To My Program");
                    System.out.println("============================");
                    System.out.println("Masukkan Score Yang Kamu Inginkan");
                    for(int u=0;u<5;u++)
                    {
                        System.out.print("score [" +u+"] = ");
                        score[u] = allArray.nextInt();
                    }
                    System.out.println("============================");
                }
            }
           System.out.println("The Student's Grade That Have Been Inputted: ");
            for(int z = 0;z<score.length;z++)
          {
              for(z=0;z<score.length;z++)
              {
                  System.out.print(score[z]+ " ");
              }
              System.out.println(" ");
              System.out.println("-----------------");
            quickSortAlgo(score, 0, score.length - 1);
          }
            System.out.println("After Sorting From The Lowest To The Highest:");
            for (int ar : score) 
            {	
                System.out.print(ar+" ");
            }
            System.out.println(" ");
            System.out.println("-----------------");
        }
    }

