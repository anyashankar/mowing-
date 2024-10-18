# mowing-
# Lawn Mowing Simulator

This Java program simulates an automated lawn mower navigating and mowing a lawn with obstacles. The simulation is designed to solve a specific algorithmic challenge, likely from a programming competition.

## Problem Description

The program simulates a lawn mower operating on a rectangular lawn with the following characteristics and rules:
- The lawn is represented as a 2D grid.
- Each cell in the grid can be either empty (`"."`) or contain a tree (`"T"`).
- The mower starts at a specified position (`startRow`, `startCol`).
- The mower can move to adjacent cells (up, down, left, right) but cannot move diagonally.
- The mower cannot move onto or through cells containing trees.
- When the mower moves to a cell, it mows that cell and the 8 surrounding cells (3x3 area).
- Mowed cells are marked with `"C"` (for "cut").

## Objective

The goal is to determine the pattern of mowed cells after the mower has exhausted all possible moves.

## Input

The program accepts multiple test cases. For each case, it reads:
- The dimensions of the lawn (rows and columns)
- The starting position of the mower
- The initial state of the lawn (including tree positions)

## Output

For each test case, the program outputs the final state of the lawn after mowing.

## Key Components

- `legalMove`: Checks if a move is legal (no trees in the 3x3 area).
- `moveMower`: Determines possible moves for the mower.
- `centers`: Calculates the cells the mower can reach.
- `mowone`: Mows a 3x3 area around the mower.
- `mow`: Main simulation method that mows the entire reachable lawn.

## Usage

Run the program and follow the prompts to input the number of test cases and the lawn configurations. The program will output the final state of each lawn after mowing.

