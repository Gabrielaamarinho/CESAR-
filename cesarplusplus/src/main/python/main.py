import subprocess
import os
import sys
import ast

if __name__ == "__main__":
	
	sub_path = sys.argv[1]
	in_path = sys.argv[2]
	out_path = sys.argv[3]

	with open(in_path + ".txt") as f:
		input = ast.literal_eval(f.read())
		
	with open(out_path + ".txt") as f:
		output = ast.literal_eval(f.read())
	

	report = open('report.txt','w')
	report.close()
	report = open('report.txt','a')

	tests = [0] * len(input)

	os.system("gcc /../questions/" + sub_path + ".c -o submission")
	
	if not os.path.isfile("/../questions/submission"):
		report.write(sub_path + ".c fail on compilation\n")

	if os.path.isfile("submission"):
		for index, i in enumerate(input):

			process = subprocess.Popen('./submission', stdout=subprocess.PIPE, stdin=subprocess.PIPE)
			process.stdin.write(i.encode('UTF-8'))
			process.stdin.close()
			usr_out = process.stdout.read().decode('UTF-8')
			process.wait()

			if not (usr_out == output[index]):
				report.write(str(index + 1) + " Expected: " + output[index] + "\n\nnot\n" + usr_out + "\n\n")
			else:
				tests[index] = 1
				report.write(str(index + 1) + " Correct!!\n")

		
		report.write("\ntests: " + " | ".join(str(e) for e in tests))

	report.close()

