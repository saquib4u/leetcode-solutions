*T.C - O(mn)*
*S.C - O(n)*


We drop the ball at ```grid[0][i]```
and track ball position i1, which initlized as i.

An observation is that,
if the ball wants to move from i1 to i2,
we must have the board direction ```grid[j][i1] == grid[j][i2]```​


Since there is a ball in each column of the first row,
- Go from left to right for each ball ---> see how it can move or fall from top to bottom
- "if the ball wants to move from i1 to i2" ---> Shift right/left in same row given by +1 and -1 which indicate the next or previous column respectively.
- If source and destination have same opening ```grid[j][i1] == grid[j][i2]``` The ball can move, else it is stuck.
- Edge cases will be if we are in the left most position or the right most position for the grid, so these 3 **return -1**
