# Working-with-threads
Java project made for my programming subject which consists of  working and implementing threads using an example of preparation of a typical canarian dish.

## Java classes Explained

The primary objective of this project is to develop skills in creating threads in order to perform it on future projects. 

The main class creates all of the semaphores to be later applied in the thread objects. Then, the threads will start through the .start() method.

As for the thread class it extends a java class called Thread and it includes about 13 semaphores from the Semaphore class (which it is imported previously because it is also a java resource).

The threads that are independent (H1,H3,H5,H6,H7,H9,H11) only has a system out and the initialization of its semaphore.
As for the rest of the threads (which are dependent) it has a try-catch block (sometimes 1, sometimes more than 1) and inside them it has a semaphore method that waits for the semaphore that is called (the one that this thread is depending on) and when it reaches him, it release the semaphore that the thread has. 

This is the activity diagram:

![Image text](https://github.com/JohanSantanaGalvanJob/Working-with-threads/blob/master/README_IMAGES/CherneAlHorno.png)

## Some examples of the execution

As you may have see, the order of the threads varies a bit on every execution of the program and that is because this program is created to execute the threads that are independent and then execute the threads that are need other threads.
To explain this better we need to look at the activity diagram. In this diagram you can see that if you want to execute the thread 2, the thread 1 must be already executed. 
This also applies with the thread 4 that needs both thread 2 and 3 to execute

![Image text](https://github.com/JohanSantanaGalvanJob/Working-with-threads/blob/master/README_IMAGES/POSIBILIDAD%201.PNG)

![Image text](https://github.com/JohanSantanaGalvanJob/Working-with-threads/blob/master/README_IMAGES/POSIBILIDAD%202.PNG)

![Image text](https://github.com/JohanSantanaGalvanJob/Working-with-threads/blob/master/README_IMAGES/POSIBILIDAD%203.PNG)

![Image text](https://github.com/JohanSantanaGalvanJob/Working-with-threads/blob/master/README_IMAGES/POSIBILIDAD%204.PNG)

![Image text](https://github.com/JohanSantanaGalvanJob/Working-with-threads/blob/master/README_IMAGES/5.PNG)


