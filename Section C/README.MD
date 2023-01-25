This is a program that takes in numbers without separators and outputs its name



Space Complexity of of the program:

According to Vladimir Roubtsov, 2002, Java Tip 130: Do you know your data size? Available at: https://www.infoworld.com/article/2077496/java-tip-130--do-you-know-your-data-size-.html the following is known

Size of Long = 16 bytes
size of String (largest allowed in program) = (bytes) = 8 * (int) ((((197) * 2) + 45) / 8) = 430 bytes
size of int = 16 bytes

In the main method of the program a string is requested from the user. resulting in 430 bytes being used. That string is then converted into a long variable resulting in 16 bytes being used.

That Long variable is then pushed into the sayTheNumber method using another 16 bytes of memory.

Another string is then created (430 bytes)

long is then passed into numToWords resultin in another (16) bytes based on input another string is generated (430)

The variable int variable unitNameIndex was also created (16)

Taking all this into consideration we're sitting at a max value of (430 + 16 + 16 + 430 + 16 + 430 + 16) = 1354 bytes in total being consumed
