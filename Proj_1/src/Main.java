import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1

        //System.out.println("“Your time is limited,\n    so don’t waste it\n       living someone else’s life”\n              Steve Jobs");

        //task2

        /*Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
        System.out.printf("first number: %d \n",num1);
        System.out.printf("second number: %d \n",num2);
        double res=num2/100f*num1;
        System.out.printf("result: %.2f %% \n",res);
        in.close();*/

        //task3

        /*Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
        System.out.print("Input third number: ");
        int num3 = in.nextInt();
        String res=new String(Integer.toString(num1)+Integer.toString(num2)+Integer.toString(num3));
        System.out.printf("result: %s \n",res);
        in.close();*/

        //task4

        /*Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num1 = in.nextInt();
        String str=Integer.toString(num1);
        boolean flag=true;
        while(flag) {
            if (str.length() < 6) {
                System.out.print("error\n");
                System.out.print("Input number: ");
                num1 = in.nextInt();
                str=Integer.toString(num1);
                flag=true;
            }
            else
                flag=false;
        }
        String newStr=Character.toString(str.charAt(5))+str.charAt(4)+str.charAt(2)+str.charAt(3)+str.charAt(1)+str.charAt(0);
        System.out.printf("result: %s \n",newStr);*/

        //task5

        /*Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num1 = in.nextInt();
        if(num1==1||num1==2||num1==12)
        {
            System.out.printf("result: %s \n","Winter");
        }
        else if(num1>=3&&num1<=5)
        {
            System.out.printf("result: %s \n","Spring");
        }
        else if(num1>=6&&num1<=8)
        {
            System.out.printf("result: %s \n","Summer");
        }
        else if(num1>=9&&num1<=11)
        {
            System.out.printf("result: %s \n","Autumn");
        }
        else
        {
            System.out.printf("result: %s \n","error");
        }*/

        //task6

        /*Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num1 = in.nextInt();

        System.out.printf("miles: %s \n",Double.toString(num1*0.000621));
        System.out.printf("inches: %s \n",Double.toString(num1/0.0254));
        System.out.printf("yards: %s \n",Double.toString(num1*0.9144));*/

        //task7

        /*Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2=in.nextInt();
        int temp=0;
        if(num1>num2)
        {
            temp=num1;
            num1=num2;
            num2=temp;
        }
        for(int i=num1;i<=num2;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }*/

        //task8

        /*Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2=in.nextInt();
        for(int i=num1;i<=num2;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.printf("%s * %s = %s ",i,j,i*j);
            }
            System.out.println();
        }*/

        //task9

        /*int[] arr=new int[100];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= rnd(-20,20);
            System.out.println(arr[i]);
        }
        var min = Arrays.stream(arr).min();
        System.out.printf("min: %d \n",min.isPresent() ? min.getAsInt() : "empty array");
        var max = Arrays.stream(arr).max();
        System.out.printf("max: %d \n",max.isPresent() ? max.getAsInt() : "empty array");
        int countNeg=0;
        int countPos=0;
        int countZeroes=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                countPos++;
            }
            if(arr[i]<0)
            {
                countNeg++;
            }
            if(arr[i]==0)
            {
                countZeroes++;
            }
        }
        System.out.printf("negatives: %d \n",countNeg);
        System.out.printf("positives: %d \n",countPos);
        System.out.printf("zeroes: %d \n",countZeroes);*/

        //task10

       /* int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= rnd(-20,20);
            System.out.println(arr[i]);
        }
        int countNeg=0;
        int countPos=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                countPos++;
            }
            if(arr[i]<0)
            {
                countNeg++;
            }
        }
        int countOdd=0;
        int countEven=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }
        int[] arrOdd=new int[countOdd];
        int[] arrEven=new int[countEven];
        int[] arrPos=new int[countPos];
        int[] arrNeg=new int[countNeg];
        int indEven=0;
        int indOdd=0;
        int indPos=0;
        int indNeg=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0) {
                arrEven[indEven] = arr[i];
                indEven++;
            }
            else {
                arrOdd[indOdd] = arr[i];
                indOdd++;
            }

            if(arr[i]>=0) {
                arrPos[indPos] = arr[i];
                indPos++;
            }
            else {
                arrNeg[indNeg] = arr[i];
                indNeg++;
            }
        }
        System.out.println("even");
        for(int i=0;i<arrEven.length;i++)
        {
            System.out.println(arrEven[i]);
        }
        System.out.println("odd");
        for(int i=0;i<arrOdd.length;i++)
        {
            System.out.println(arrOdd[i]);
        }
        System.out.println("pos");
        for(int i=0;i<arrPos.length;i++)
        {
            System.out.println(arrPos[i]);
        }
        System.out.println("neg");
        for(int i=0;i<arrNeg.length;i++)
        {
            System.out.println(arrNeg[i]);
        }*/

        //task11

        /*Scanner in = new Scanner(System.in);
        System.out.print("Input length: ");
        int len = in.nextInt();
        System.out.print("Input direction: ");
        String direction = in.next();
        System.out.print("Input symbol: ");
        String symbol = in.next();
        if(direction.equals("h")) {
            for (int i = 0; i < len; i++) {
                System.out.print(symbol);
            }
        }
        else if(direction.equals("v"))
        {
            for (int i = 0; i < len; i++) {
                System.out.println(symbol);
            }

        }*/

        //task12

        /*Scanner in = new Scanner(System.in);
        System.out.print("Input mode: ");
        String mode = in.next();
        Integer[] arr=new Integer[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= rnd(-20,20);
            System.out.println(arr[i]);
        }
        if(mode.equals("asc"))
        {
            Arrays.sort(arr);
        }
        else if(mode.equals("desc"))
        {
            Collections.sort(Arrays.asList(arr),Collections.reverseOrder());
        }
        System.out.println("sorted");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/
    }
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}