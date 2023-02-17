/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tida.mathutuil.main;

import com.tida.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testFactorialGivenRightArgumentReturnsWell();
        testFactorialGivenWrongArgumentReturnsWell();
        
        
        
    }

    // kiểm thử các tình huống n đưa vào kiểu cà chớn!!!
    public static void testFactorialGivenWrongArgumentReturnsWell(){
    // test #6: test getF() with n = -1
    // expected value: an Illegal Argument Exception is Thrown
    // nếu đưa n = -1 thì hàm sẽ đập vào mặt user một hàm ngoại lệ
    
        System.out.println("test-1 | expected: an Illegal Argument Exception is Thrown!!!"
                + "| actual: ???");
    MathUtility.getFactorial(-1);
    
    }
    
    
    // dân dev phải có trách nhiệm với những hàm/method mình viết ra
    // tức là đảm bảo rằng hàm chạy đúng như thiết kế
    // hàm getFactorial() đc thiết kế rằng:
    // nếu đưa n < 0 hoặc n > 20 thì chửi, ném ra ngoại lệ
    // nếu n = 0  ... 20 thì phải tính cho đúng n 
    // dân dev sẽ kiểm thử hàm đúng như các tình huống - case
    // hàm sẽ đc dùng trong tương lai 
    // hàm sẽ đc dùng theo 2 cách dựa trên thiết kế 
    // đưa data tử tế n từ 0 ... 20
    // đưa data cà chớn n < 0 hoặc n > 20
    public static void testFactorialGivenRightArgumentReturnsWell() {
        // case #1: test getF() with n = 0 
        // Excepted value: 2
        // kiểm thử xem có đúng 0! = 1 hay không? - 1 tình huống xài hàm 1 test case
        int n = 0;        
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        // gọi hàm tính giai thừa, xem kết quả trả về
        
        System.out.println("test " + n + "! |expected: " + expectedValue + "| actual: " + actualValue);

        // case #2: test getF() with n = 1
        // Expected value = 1 
        // test xem 1! có đúng là 1 không???
        n = 1;
        expectedValue = 1;        
        actualValue = MathUtility.getFactorial(n);
        System.out.println("test " + n + "! |expected: " + expectedValue + "| actual: " + actualValue);

        // case #3: test getF() with n = 2
        System.out.println("test 2! | expected: 2" + "| actual: " + MathUtility.getFactorial(2));
        
        // case #4: test getF() with n = 3
        System.out.println("test 3! | expected: 6" + "| actual: " + MathUtility.getFactorial(3));
        
        // case #5: test getF() with n = 5
        System.out.println("test 5! | expected: 120" + "| actual: " + MathUtility.getFactorial(5));
        
    }
}
