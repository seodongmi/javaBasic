package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("나는 금사빠다");
		String select = sc.nextLine();
		if (select.equals("y") || select.equals("Y")) {
			System.out.println("연애할 때 끌려다니는 타입이다");
			select = sc.nextLine();
			if (select.equals("y") || select.equals("Y")) {
				System.out.println("감정표현에 솔직한 편이다");
				select = sc.nextLine();
				if (select.equals("y") || select.equals("Y")) {
					System.out.println("이성친구는 존재할 수 없다");
					select = sc.nextLine();
					if (select.equals("y") || select.equals("Y")) {
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
						select = sc.nextLine();
						if (select.equals("y") || select.equals("Y")) {
							System.out.println("D타입입니다");
						} else if (select.equals("N") || select.equals("n")) {
							System.out.println("C타입입니다");
						}
					} else if (select.equals("N") || select.equals("n")) {
						System.out.println("B타입입니다");
					}
				} else if (select.equals("N") || select.equals("n")) {
					System.out.println("데이트 코스는 미리 짜는 게 편하다");
					select = sc.nextLine();
					if (select.equals("y") || select.equals("Y")) {
						System.out.println("활동적인 데이트가 좋다");
						select = sc.nextLine();
					} else if (select.equals("N") || select.equals("n")) {
						System.out.println("감정표현에 솔직한 편이다.");
						select = sc.nextLine();
						if (select.equals("y") || select.equals("Y")) {
							System.out.println("이성친구는 존재할 수 없다");
							select = sc.nextLine();
							if (select.equals("y") || select.equals("Y")) {
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
								select = sc.nextLine();
								if (select.equals("y") || select.equals("Y")) {
									System.out.println("D타입 입니다.");
								} else if (select.equals("N")
										|| select.equals("n")) {
									System.out.println("C타입입니다.");
								}
							}
						} else if (select.equals("N") || select.equals("n")) {
							System.out.println("활동적인 데이트가 좋다");
							select = sc.nextLine();
							if (select.equals("y") || select.equals("Y")) {
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
								select = sc.nextLine();
								if (select.equals("y") || select.equals("Y")) {
									System.out.println("D타입 입니다.");
								} else if (select.equals("N")
										|| select.equals("n")) {
									System.out.println("C타입입니다.");

								}
							}
						}
					} else if (select.equals("N") || select.equals("n")) {
						System.out.println("데이트 코스는 미리 짜는 게 편하다");
						select = sc.nextLine();
						if (select.equals("y") || select.equals("Y")) {
							System.out.println("활동적인 데이트가 좋다");
							select = sc.nextLine();
							if (select.equals("y") || select.equals("Y")) {
								System.out.println("이성친구는 존재할 수 없다");
								select = sc.nextLine();
								if (select.equals("y") || select.equals("Y")) {
									System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
									select = sc.nextLine();
									if (select.equals("y")|| select.equals("Y")) {
										System.out.println("D타입 입니다.");
									} else if (select.equals("N")|| select.equals("n")) {
										System.out.println("C타입입니다.");
									} else if (select.equals("N")|| select.equals("n")) {
										System.out.println("B타입입니다.");
									}
								} else if (select.equals("N")|| select.equals("n")) {
									System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
									select = sc.nextLine();
								}
							} else if (select.equals("N") || select.equals("n")) {
								System.out.println("감정 표현에 솔직한 편이다");
								select = sc.nextLine();
							}

						} else if (select.equals("N") || select.equals("n")) {
							System.out.println("감정표현에 솔직한 편이다");
							select = sc.nextLine();
							if (select.equals("y") || select.equals("Y")) {
								System.out.println("이성친구는 존재할 수 없다");
								select = sc.nextLine();
								if (select.equals("y") || select.equals("Y")) {
									System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
									select = sc.nextLine();
									if (select.equals("y")|| select.equals("Y")) {
										System.out.println("D타입 입니다");
									}
								} else if (select.equals("N")|| select.equals("n")) {
									System.out.println("B타입 입니다");
								}
							} else if (select.equals("N") || select.equals("n")) {
								System.out.println("활동적인 데이트가 좋다");
								select = sc.nextLine();
								if (select.equals("y") || select.equals("Y")) {
									System.out.println("이성친구는 존재할 수 없다");
									select = sc.nextLine();
									if (select.equals("y")|| select.equals("Y")) {
										System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
										select = sc.nextLine();
										if (select.equals("y")|| select.equals("Y")) {
											System.out.println("D타입입니다.");
										} else if (select.equals("N")|| select.equals("n")) {
											System.out.println("C타입 입니다");
										}
									}
								} else if (select.equals("N")|| select.equals("n")) {
									System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
									select = sc.nextLine();
									if (select.equals("y")|| select.equals("Y")) {
										System.out.println("D타입입니다.");
									} else if (select.equals("N")|| select.equals("n")) {
										System.out.println("C타입 입니다");
									}
								}
							}
						}
					}

				}
			}
		} else if (select.equals("N") || select.equals("n")) {
			System.out.println("감정기복이 크지 않다");
			select = sc.nextLine();
			if (select.equals("y") || select.equals("Y")) {
				System.out.println("연락이 없어도 믿고 기다리는 편이다");
				if (select.equals("y") || select.equals("Y")) {
					System.out.println("A타입입니다");
				} else if (select.equals("N") || select.equals("n")) {
					System.out.println("이성친구는 존재할 수 없다");
					if (select.equals("y") || select.equals("Y")) {
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
						if (select.equals("y") || select.equals("Y")) {
							System.out.println("D타입입니다.");
						} else if (select.equals("N") || select.equals("n")) {
							System.out.println("C타입입니다.");
						} else if (select.equals("N") || select.equals("n")) {
							System.out.println("B타입 입니다.");
						}
					} else if (select.equals("N") || select.equals("n")) {
						System.out.println("감정에 솔직한 편이다.");
					}
				}
			}
				 else if (select.equals("N") || select.equals("n")) {
					System.out.println("감정에 솔직한 편이다.");
					select = sc.nextLine();
					if (select.equals("y") || select.equals("Y")) {
						System.out.println("이성 친구는 존재할 수 없다.");
						select = sc.nextLine();
						if (select.equals("y") || select.equals("Y")) {
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
							select = sc.nextLine();
							if (select.equals("y") || select.equals("Y")) {
								System.out.println("D타입입니다");
							} else if (select.equals("N") || select.equals("n")) {
								System.out.println("C타입입니다.");
							}
						}
					} else if (select.equals("N") || select.equals("n")) {
						System.out.println("활동적인 데이트가 좋다");
						if (select.equals("y") || select.equals("Y")) {
							System.out.println("이성친구는 존재할 수 없다");
							select = sc.nextLine();
							if (select.equals("y") || select.equals("Y")) {
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
								select = sc.nextLine();
								if (select.equals("y") || select.equals("Y")) {
									System.out.println("D타입입니다.");
								} else if (select.equals("N")|| select.equals("n")) {
									System.out.println("C타입입니다");
								}
							} else if (select.equals("N") || select.equals("n")) {
								System.out.println("B타입입니다");
							}
						} else if (select.equals("N") || select.equals("n")) {
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
							if(select.equals("y") || select.equals("Y")) {
								System.out.println("D타입 입니다");
							}else if(select.equals("y") || select.equals("Y")){
								System.out.println("C타입 입니다");
							}
						}
					}
				 }
		}
	}
}
