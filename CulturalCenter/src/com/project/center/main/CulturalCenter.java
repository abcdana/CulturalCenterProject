package com.project.center.main;

import java.util.Scanner;

public class CulturalCenter {
	public static void main(String[] args) {
		
		// 유저, 직원, 관리자
		
		while(true)	{
			int Num;
			
			// 메인화면 1. 로그인 2.회원가입	3.종료
			showMain();
			
			// 사용자가 입력한 숫자를 받아온다
			Num = selectNum(); 
			
			if(Num == 1) { // 로그인
				System.out.println("로그인 선택");
				// 로그인처리 메서드
				// public void isLogin()? 로그인처리
				// public void createAccount(){} 로그인 성공하면 
				// 로그인 완료후 프로그램 진행
				break;
				
			} else if(Num == 2) { // 회원가입
				System.out.println("회원가입 선택");
				// 회원가입처리 메서드
				// 회원 가입 완료후 다시 메인화면으로
				
			} else if(Num == 3) { // 종료
				// 프로그램 종료
				System.out.println("프로그램을 종료합니다");
				System.exit(0); 
			} else {
				// 다른 숫자 입력시
				pause();
			}
			
		}
		
		
		System.out.println("프로그램 진행 . . . .");
		while (true) {
			
		}
			
		
	} //main
	
	// 번호를 입력받는 메서드
	private static int selectNum() {
		
		// 사용자에게 번호를 입력받는다
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("번호를 선택하세요 : ");
		return Integer.parseInt(scan.nextLine());
		
	}
	
	// 일시정지
	private static void pause() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("잘못된 숫자입니다. 엔터키를 누르면 이전화면으로 돌아갑니다.");
		scan.nextLine();
		for(int i=0 ; i<10 ; i++) {
			System.out.println();
		}
		
	}
	
	// 프로그램 로고를 출력하는 메서드
	public static void showlogo() {
		
		System.out.println(" _____         _  _                        _   _____               _               \r\n"
				+ "/  __ \\       | || |                      | | /  __ \\             | |              \r\n"
				+ "| /  \\/ _   _ | || |_  _   _  _ __   __ _ | | | /  \\/  ___  _ __  | |_   ___  _ __ \r\n"
				+ "| |    | | | || || __|| | | || '__| / _` || | | |     / _ \\| '_ \\ | __| / _ \\| '__|\r\n"
				+ "| \\__/\\| |_| || || |_ | |_| || |   | (_| || | | \\__/\\|  __/| | | || |_ |  __/| |   \r\n"
				+ " \\____/ \\__,_||_| \\__| \\__,_||_|    \\__,_||_|  \\____/ \\___||_| |_| \\__| \\___||_|   ");
		
	
	}
	
	// 프로그램의 메인 화면을 출력하는 메서드
	public static void showMain() {
		showlogo();
		System.out.println();
		System.out.println();
		System.out.println("\t\t1. 로그인\t2.회원가입\t3.종료");
		                                                                                    
	}
	
	// 유저 회원의 메뉴를 출력하는 메서드
	public static void showUserMain() {
		
		System.out.println();
		
	}
	
	// 직원 회원의 메뉴를 출력하는 메서드
	public static void showEmployeeMain() {
		
	}
	
	// 직원 회원의 메뉴를 출력하는 메서드
	public static void showManageMain() {
		
	}

} // class 
