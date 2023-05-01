class Variables {
    public static void main(String[] args) {
        int myFirstNumber = 5;
        myFirstNumber = (10 + 5) + (2 * 10);
        System.out.println(myFirstNumber);

        // /var - to list variables in jshell
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
