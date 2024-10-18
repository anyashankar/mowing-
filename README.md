# mowing-

Lawn Mowing Simulation

The program simulates the process of mowing a lawn with obstacles (trees) and specific constraints. The main components of the problem are:
Lawn Representation
The lawn is represented as a 2D grid (String[][]).
Each cell in the grid can be either empty (".") or contain a tree ("T").
Mower Movement
The mower starts at a specified position (startRow, startCol).
The mower can move to adjacent cells (up, down, left, right) but cannot move diagonally.
The mower cannot move onto or through cells containing trees.
Mowing Process
When the mower moves to a cell, it mows that cell and the 8 surrounding cells (3x3 area).
Mowed cells are marked with "C" (for "cut").
Goal
The objective is to determine the pattern of mowed cells after the mower has exhausted all possible moves.
