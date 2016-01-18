# Techgig_brillio
You are given a binary image. Binary image is basically represented by a matrix of 0-1 values. The pixel whose value is 1 is said to be bright pixel and the pixel whose value is 0 is said to be dark pixel. The consecutive bright pixels (here consecutive means upper, lower, left side or right side) form an object.

For example, in the following binary image there are 6 objects 
![alt tag](https://cloud.githubusercontent.com/assets/10424520/12394019/518ea45c-be1f-11e5-85dd-ec692051f505.png)

You will be given an input binary image in matrix form each element of which will be 0 or 1. You have to detect number of objects in the image.

Input/Output Specifications
Input Specification: 
Consider the following matrix which represents an image: 
<br>0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0 <br>0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1 <br>0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1 <br>0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0 <br>0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1 <br>1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1 <br>0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0 <br>1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0

Matrix is 8×9 (i.e. number of rows are 8 and number of columns are 9). Count number of consecutive zeros from left to right (i.e.row wise) and then downwards (i.e. column wise), then count number of consecutive ones and so on. 

Above matrix can be represented using this idea by 11, 0, 2, 1, 2, 0, 3, 1, 7, 0, 2, 1, 10, 0, 17, 1, 3, 0, 4, 1, 2, 0, 3, 1, 6, 0 (11 zeros then 2 ones then 2 zeros and so on).

So there are two inputs in this case

(i)  An integer array of 2 elements depicting number of rows and number of columns of matrix
     For e.g. {8,9}.

(ii) An integer array defining the matrix
     For e.g. {11,0,2,1,2,0,3,1,7,0,2,1,10,0,17,1,3,0,4,1,2,0,3,1,6,0}.


Output Specification: 
Output will be the number of objects in the image.


Examples

Example:
Input1 : {51,101}

Input2 : {191,0,2,1,97,0,4,1,4,0,2,1,92,0,3,1,98,0,3,1,3,0,3,1,92,0,3,1,3,0,3,1,78,0,8,1,11,0,4,1,77,0,9,1,13,0,1,1,78,0,9,1,7,0,4,1,82,0,8,1,7,0,5,1,81,0,8,1,7,0,2,1,1,0,2,1,80,0,8,1,8,0,5,
1,81,0,7,1,7,0,5,1,85,0,1,1,1,0,2,1,99,0,3,1,91,0,9,1,91,0,10,1,93,0,5,1,1,0,2,1,93,0,8,1,93,0,8,1,92,0,9,1,95,0,7,1,94,0,6,1,94,0,7,1,91,0,10,1,92,0,8,1,94,0,1,
1,2,0,3,1,94,0,1,1,2350,0}
