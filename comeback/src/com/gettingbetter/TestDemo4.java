package com.gettingbetter;


public class TestDemo4 {


		static void method1() {
			System.out.println("method1 called !!");
			TestDemo4 t4 = new TestDemo4();
			t4.method2();
		}


		void method2() {
			System.out.println("method2 called !!");
			method4();

		}

		static void method3() {
			System.out.println("method3 called !!");

		}

		void method4() {
			System.out.println("method4 called !!");
			method5();

		}

		static void method5() {
			System.out.println("method5 called !!");

			TestDemo4 t = new TestDemo4();
			t.method6();

		}

		void method6() {
			System.out.println("method6 called !!");
		}


		public static void main(String[] args) {
			System.out.println("main method started !!");
			method1();
			
			System.out.println("main method ended !!");
		}

	}

