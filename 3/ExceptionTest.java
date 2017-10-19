class ExceptionTest {
	public static void main(String[] args) {
		//if (args.length < 1) // コマンドライン引数がない場合終了
		//	System.exit(0);
		int x = 3;//Integer.parseInt(args[0]);

		int test[] = new int[10];
		String str = "test";
		String s = null;

		switch(x) {
			case 0:
				System.out.println("ArithmeticExceptionを発生させます．");
				System.out.println(2 / 0);
				break;
			case 1:
				System.out.println("ArrayIndexOutOfBoundsExceptionを発生させます．");
				// write code here
				test[11] = 0;
				break;
			case 2:
				System.out.println("NumberFormatExceptionを発生させます．");
				// write code here
				int i = Integer.parseInt(str);
				break;
			case 3:
				System.out.println("NullPointerExceptionを発生させます．");
				// write code here
				System.out.println(s.length());
				break;
		}
	}
}
