
public class Test02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		1問目a　1〜10までの数字のうち偶数のみを昇順で表示させる
        for (int i = 2; i <= 10; i += 2) {
        	System.out.println(i);
        }
        
        
//      1問目b　1〜10までの数字のうち偶数のみを降順で表示させる
        for (int i = 10; i >= 2; i -= 2) {
        	System.out.println(i);
        }
        
 
//      1問目c 1〜10までの数字のうち奇数のみを昇順で表示させる
        for (int i = 1; i <= 10; i += 2) {
        	System.out.println(i);
        }
        
//      1問目d 1〜10までの数字のうち奇数のみを降順で表示させる
        for (int i = 9; i >= 1; i -= 2) {
        	System.out.println(i);
        }
        
//      2問目a　1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる
       int count = 0;
       int sum = 0;
       
       for (int i = 2; i <= 10; i += 2) {
    	   count ++;
    	   sum += i;
       }
       
       System.out.println("偶数の個数は" + count);
       System.out.println("偶数の合計は" + sum);
        
//      2問目b　1〜10までに奇数が何個あるか、また奇数の合計は幾つになるか表示させる
        int count2 = 0;
        int sum2 = 0;
        
        for (int i = 1; i <= 10; i += 2) {
        	count2 ++;
        	sum2 += i;
        }
        
        System.out.println("奇数の個数は" + count2);
        System.out.println("奇数の合計は" + sum2);
        
//      3問目a　1〜10までの整数をカンマ区切りで横並びで表示させる（10にはカンマをつけない）
        for (int i = 1; i <= 10; i ++) {
        	if (i < 10) {
        		System.out.print(i + ", ");
        	} else {
        		System.out.print(i);
        	}
        }
        
//      3問目b　1〜10までの偶数をカンマ区切りで横並びで表示させる（最後はカンマをつけない）
       for (int i = 2; i <= 10; i += 2) {
    	   if (i < 10) {
    		   System.out.print(i + ", ");
    	   } else {
    		   System.out.print(i);
    	   }
       }
        
//      3問目c　1〜10までの奇数をカンマ区切りで横並びで表示させる（最後はカンマをつけない）
        for (int i = 1; i <= 10; i += 2) {
        	if (i < 9) {
        		System.out.print(i + ", ");
        	} else {
        		System.out.print(i);
        	}
        }

//      4問目　要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
//            [0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
       int[] array = new int[20];
       
       for(int i = 0; i < 20; i ++) {
    	   array[i] = i * 5;
       }
       
       System.out.print("\n奇数:");
       
       for (int i = 0; i <= 10; i ++) {
    	   if (array[i] % 2 != 0) {
    		   System.out.print(array[i]);
    		   if (i < 9) {
    			   System.out.print(", ");
    		   }
    	   }
       }
       
       System.out.print("\n偶数:");
       
       for (int i = 11; i <= 19; i ++) {
    	   if (array[i] % 2 == 0) {
    		   System.out.print(array[i]);
    		   if (i < 18) {
    			   System.out.print(", ");
    		   }
    	   }
       }
	}
}
