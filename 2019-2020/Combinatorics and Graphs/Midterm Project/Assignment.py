import sys
import random
random.seed(5180320)

grid = [[0]*9 for i in range(9)]

def checkGrid(grid):
	for row in range(0,9):
		for col in range(0,9):
			if grid[row][col]==0:
				return False
	#We have a complete grid!  
	return True 
  
numberList=[1,2,3,4,5,6,7,8,9]

def fillGrid(grid):
	global counter
	#Find next empty cell
	for i in range(0,81):
		row=i//9
		col=i%9
		if grid[row][col]==0:
			random.shuffle(numberList)	   
			for value in numberList:
				#Check that this value has not already be used on this row
				if not(value in grid[row]):
					#Check that this value has not already be used on this column
					if not value in (grid[0][col],grid[1][col],grid[2][col],grid[3][col],grid[4][col],grid[5][col],grid[6][col],grid[7][col],grid[8][col]):
					#Identify which of the 9 squares we are working on
						square=[]
						if row < 3:
							if col < 3:
								square=[grid[i][0:3] for i in range(0,3)]
							elif col<6:
								square=[grid[i][3:6] for i in range(0,3)]
							else:	 
								square=[grid[i][6:9] for i in range(0,3)]
						elif row<6:
							if col<3:
								square=[grid[i][0:3] for i in range(3,6)]
							elif col<6:
								square=[grid[i][3:6] for i in range(3,6)]
							else:	 
								square=[grid[i][6:9] for i in range(3,6)]
						else:
							if col<3:
								square=[grid[i][0:3] for i in range(6,9)]
							elif col<6:
								square=[grid[i][3:6] for i in range(6,9)]
							else:	 
								square=[grid[i][6:9] for i in range(6,9)]
						#Check that this value has not already be used on this 3x3 square
						if not value in (square[0] + square[1] + square[2]):
							grid[row][col]=value
							if checkGrid(grid):
								return True
							else:
								if fillGrid(grid):
									return True
			break
	grid[row][col]=0			   

def Attempt (grid,cell_holes,i,j):
	attempts = cell_holes
	
	# Dig hole(s) in one cell
	row = random.randint(i,i+2)
	col = random.randint(j,j+2)
	while attempts > 0:
		while grid[row][col]==0:
		#Select a random hole that is not already empty
			row = random.randint(i,i+2)
			col = random.randint(j,j+2)
			 
		grid[row][col]=0
	  
		#Take a full copy of the grid
		copyGrid = []
		for r in range(0,9):
			copyGrid.append([])
			for c in range(0,9):
				copyGrid[r].append(grid[r][c])
		attempts = attempts - 1
		
		
def DiggingHoles(grid,holes):
	cell_holes = int (holes / 9)
	
	i = 0
	j = 0
	while i < 7:
		Attempt(grid,cell_holes,i,j)
		i = i + 3
				
	i = 0
	j = 3
	while j < 7:
		Attempt(grid,cell_holes,i,j)
		j = j + 3
	
	i = 3
	j = 3
	while j < 7:
		Attempt(grid,cell_holes,i,j)
		j = j + 3

	i = 6
	j = 3
	while j < 7:
		Attempt(grid,cell_holes,i,j)
		j = j + 3			
		
def display(holes,output,grid):
	fillGrid(grid)
	DiggingHoles(grid,holes)
	f = open(output,'w')
	for g in grid:
		f.write(str(g)[1:-1]+"\n")
	f.close()

def main():
	parameters = sys.argv
	display(int(parameters[1]),parameters[2],grid)
		
if __name__ == '__main__':
	main()
	
	
	