class HomeWork {
    public static void main(String[] args) {
	     printThreeWords();
		 printColor();
		 checkSumSign();
		 Numbers();
		 
	 }
    static void printThreeWords(){
	     System.out.println("Orange");
	     System.out.println("Banana");
	     System.out.println("Apple");
	 }
	static void printColor() {
		 int value = 100;
		 if (value <= 0){
			 System.out.println("Red");
		 }
		 if (value > 0 && value <= 100){
			 System.out.println("Yellow");
		 }
		 if (value > 100) {
			 System.out.println("Green");
		 }
			 
	 }
	 static void checkSumSign() {
		 int a = 3;
		 int b = 5;
		 int e = a + b;
		 System.out.println(e >= 0? "The amount is positive" : "The amount is negative");
	 }
	 static void Numbers() {
		 int a = 3;
		 int b = 4;
		 System.out.println (a >= b? "a >= b" : "a < b");
	 }
}
