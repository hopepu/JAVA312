package study0617.ScoresCard;

import java.util.Scanner;

public class ScoresMainExam {
	private static Scanner input = new Scanner(System.in);
	private static Student[] st = new Student[5];

	public static void main(String[] args) {
		// 주실행 클래스로 메뉴와 클래스 메서드 호출용으로 작업.
		// 객체 : 학생, 성적, 통계
		boolean run = true;

		while (run) {
			System.out.println("=========학생관리프로그램v2(객체)========");
			System.out.println("1.학생관리 | 2. 성적입력 | 3.통계 | 4.종료");
			System.out.println("====================================");
			System.out.print(">>>");

			int select = input.nextInt();
			switch (select) {
			case 1:
				System.out.println("학생관리 클래스로 진입");
				boolean strun = true;
				while (strun) {
					System.out.println("1. 학생등록 | 2. 학생조회 및 수정 | 3. 메인메뉴");
					System.out.print(">>>");
					int stSelect = input.nextInt();
					switch (stSelect) {
					case 1:
						System.out.println("학생등록 메뉴입니다.");
						Student regStudent = new Student();
						System.out.println("이름 : ");
						regStudent.name = input.next();
						System.out.println("학번 : ");
						regStudent.num = input.nextInt();
						System.out.println("성별 : ");
						regStudent.sex = input.next();
						System.out.println("학년 : ");
						regStudent.grade = input.nextInt();
						System.out.println("반 : ");
						regStudent.classroom = input.nextInt();
						System.out.println("========= 객체 생성 -> 입력 완료 ========");
						System.out.println("========== 배열 빈칸을 찾아 저장 =========");
						for (int i = 0; i < st.length; i++) {
							if (st[i] == null) {
								st[i] = regStudent;
								System.out.println("save complete!");
								break;
							} // if close

						} // for close

						break;

					case 2:
						boolean stSearchRun = true;
						while (stSearchRun) {
							System.out.println("학생조회 메뉴입니다.");
							System.out.println("1. 전체 학생 조회 | 2. 학생 검색 조회 및 수정 | 3. 학생 관리로 돌아가기");
							System.out.println(">>>");
							int stSearchSelect = input.nextInt();
							switch (stSearchSelect) {
							case 1:
								System.out.println("전체 학생을 조회합니다.");
								for (int i = 0; i < st.length; i++) {
									if (st[i] != null) {
										System.out.println("=========================");
										System.out.println("이름 : " + st[i].name);
										System.out.println("학번 : " + st[i].num);
										System.out.println("성별 : " + st[i].sex);
										System.out.println("학년 : " + st[i].grade);
										System.out.println("반 : " + st[i].classroom);
									} // if close
								} // for close
								break;
							case 2:
								System.out.println("개별 학생을 조회합니다.");
								System.out.println("학생의 이름을 검색해주세요.");
								System.out.print(">>>");
								String searchName = input.next();
								Student findStudent = find(searchName);
								if (findStudent == null) {
									System.out.println("찾은 학생이 없습니다.");
								} // if close
								else {
									System.out.println("=========================");
									System.out.println("이름 : " + findStudent.name);
									System.out.println("학번 : " + findStudent.num);
									System.out.println("성별 : " + findStudent.sex);
									System.out.println("학년 : " + findStudent.grade);
									System.out.println("반 : " + findStudent.classroom);
								} // else close
								System.out.println(findStudent.name + "학생의 정보를 수정하시겠습니까?");
								System.out.println("1. 수정하기 | 2. 삭제하기 | 3. 아무것도 안하기");
								int stInsert = input.nextInt();
								switch (stInsert) {
								case 1:
									boolean insertCase1 = true;
									while (insertCase1) {
										System.out.println("어떤 항목을 수정할까요?");
										System.out.println("1. 이름 : " + findStudent.name);
										System.out.println("2. 학번 : " + findStudent.num);
										System.out.println("3. 성별 : " + findStudent.sex);
										System.out.println("4. 학년 : " + findStudent.grade);
										System.out.println("5. 반 : " + findStudent.classroom);
										System.out.println("6. 조회메뉴로 돌아가기");

										int insertCaseSwitch = input.nextInt();
										switch (insertCaseSwitch) {
										case 1:
											System.out.println("수정할 이름을 입력해주세요.");
											String insertName = input.next();
											findStudent.name = insertName;
											break;
										case 2:
											System.out.println("수정할 학번을 입력해주세요.");
											int insertNum = input.nextInt();
											findStudent.num = insertNum;
											break;
										case 3:
											System.out.println("수정할 성별을 입력해주세요.");
											String insertSex = input.next();
											findStudent.sex = insertSex;
											break;
										case 4:
											System.out.println("수정할 학년을 입력해주세요.");
											int insertGrade = input.nextInt();
											findStudent.grade = insertGrade;
											break;
										case 5:
											System.out.println("수정할 반을 입력해주세요.");
											int insertClassroom = input.nextInt();
											findStudent.classroom = insertClassroom;
											break;
										case 6:
											insertCase1 = false;
										default:
											System.out.println("1~5 사이를 골라주세요.");

										}// switch close
									} // while close

								case 2:
									for(int i = 0; i<st.length;i++) {
										st[i]=null;
										System.out.println("삭제완료!");
										break;
									}

								case 3:
									break;
								}
								break;
							case 3:
								System.out.println("학생관리 메뉴로 돌아갑니다.");
								stSearchRun = false;
								break;
							default:
								System.out.println("1~3을 입력해주세요");

							}//switch close
						} // while close

						break;
					case 3:
						System.out.println("메인메뉴로 돌아갑니다.");
						strun = false;
						break;
					default:
						System.out.println("1~3을 입력해주세요.");
					}// switch close

				} // while close
				break;
			case 2:
				System.out.println("성적입력 클래스로 진입");
				break;
			case 3:
				System.out.println("통계 클래스로 진입");
				break;
			case 4:
				System.out.println("종료 클래스로 진입");
				break;
			default:
				System.out.println("1~4에서 입력해주세요");

			}// switch close
		} // while close
	}// main close

	private static Student find(String name) {
		Student student = null;
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null) {
				String arrayName = st[i].name;
				if (arrayName.equals(name)) {
					student = st[i];
					break;
				} // if close
			} // if close
		} // for close
		return student;

	}// find method close

}// class close
