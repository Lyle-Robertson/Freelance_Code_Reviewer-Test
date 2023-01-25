Thank you for your submission.

You program unfortunately does not run successfully. This is due to a combination
IndentationErros and TypeErrors.

Python is a language that seperates blocks/sections of code using indentation usage.
That makes it important to make sure that the structure of your program is sound.

The compiler does not know where the code in lines 3 to 10 belong because it's
is position doesn't match any indentation level. To gain a better insight on
indentation you can refer to https://peps.python.org/pep-0008/#indentation.
your function "groupAnagrams" this is not a huge issue in this case but keeping to
pep8 style guide (which can be accessed via the link) is best to insure neatness
as well can proper function when you get to higher level projects.

Once the indentation is fixed. Your program will run into a TypeError at line 10.
This is because you have forgotten to add your argument to the 'sorted()' function.

Your use of whitespace and comments could use some work. Yes, you might want to use as little
lines as possible but the code becomes but coding in a way that makes it easier for
any one else to understand what your code is doing. That means commenting in code properly
and using whitespace appropriately.

You should use more desciptive variable names, variables such as x and i can make it
difficult to decifer what is happening. More importantly, you should make sure all
nameing of functions, classes, variables, etc are within the pep3 style guideline.

The use of a class in this scenario was not neccesary. The function 'groupAnagrams'
could have been made static in which case you would only have to pass your input list
into the function.

Well done on this submission. Your have a good understanding of what your're doing.
It seems however that your are rushing. I strongly recommend you visit the link 
provided above. It will help you improve even further. Also take some time to test your
code in your own capacity to make sure all the requirments are met.

look into all of the things mentioned above and I'd gladly take another look and you submission
